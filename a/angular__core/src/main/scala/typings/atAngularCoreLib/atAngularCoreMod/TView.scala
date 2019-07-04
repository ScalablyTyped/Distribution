package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The static data for an LView (shared between all templates of a
  * given type).
  *
  * Stored on the `ComponentDef.tView`.
  */
trait TView extends js.Object {
  /**
    * The binding start index is the index at which the data array
    * starts to store bindings only. Saving this value ensures that we
    * will begin reading bindings at the correct point in the array when
    * we are in update mode.
    */
  var bindingStartIndex: scala.Double
  /**
    * This is a blueprint used to generate LView instances for this TView. Copying this
    * blueprint is faster than creating a new LView from scratch.
    */
  var blueprint: ɵangular_packages_core_core_bm
  /**
    * When a view is destroyed, listeners need to be released and outputs need to be
    * unsubscribed. This cleanup array stores both listener data (in chunks of 4)
    * and output data (in chunks of 2) for a particular view. Combining the arrays
    * saves on memory (70 bytes per array) and on a few bytes of code size (for two
    * separate for loops).
    *
    * If it's a native DOM listener or output subscription being stored:
    * 1st index is: event name  `name = tView.cleanup[i+0]`
    * 2nd index is: index of native element or a function that retrieves global target (window,
    *               document or body) reference based on the native element:
    *    `typeof idxOrTargetGetter === 'function'`: global target getter function
    *    `typeof idxOrTargetGetter === 'number'`: index of native element
    *
    * 3rd index is: index of listener function `listener = lView[CLEANUP][tView.cleanup[i+2]]`
    * 4th index is: `useCaptureOrIndx = tView.cleanup[i+3]`
    *    `typeof useCaptureOrIndx == 'boolean' : useCapture boolean
    *    `typeof useCaptureOrIndx == 'number':
    *         `useCaptureOrIndx >= 0` `removeListener = LView[CLEANUP][useCaptureOrIndx]`
    *         `useCaptureOrIndx <  0` `subscription = LView[CLEANUP][-useCaptureOrIndx]`
    *
    * If it's an output subscription or query list destroy hook:
    * 1st index is: output unsubscribe function / query list destroy function
    * 2nd index is: index of function context in LView.cleanupInstances[]
    *               `tView.cleanup[i+0].call(lView[CLEANUP][tView.cleanup[i+1]])`
    */
  var cleanup: js.Array[_] | scala.Null
  /**
    * A list of element indices for child components that will need to be
    * refreshed when the current view has finished its check. These indices have
    * already been adjusted for the HEADER_OFFSET.
    *
    */
  var components: js.Array[scala.Double] | scala.Null
  /**
    * Array of ngAfterContentChecked hooks that should be executed for this view in update
    * mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var contentCheckHooks: atAngularCoreLib.HookData | scala.Null
  /**
    * Array of ngAfterContentInit and ngAfterContentChecked hooks that should be executed
    * for this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var contentHooks: atAngularCoreLib.HookData | scala.Null
  /**
    * A list of indices for child directives that have content queries.
    */
  var contentQueries: js.Array[scala.Double] | scala.Null
  /** Static data equivalent of LView.data[]. Contains TNodes, PipeDefInternal or TI18n. */
  var data: atAngularCoreLib.TData
  /**
    * Array of ngOnDestroy hooks that should be executed when this view is destroyed.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var destroyHooks: atAngularCoreLib.HookData | scala.Null
  /**
    * Full registry of directives and components that may be found in this view.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var directiveRegistry: atAngularCoreLib.DirectiveDefList | scala.Null
  /**
    * Set of instructions used to process host bindings efficiently.
    *
    * See VIEW_DATA.md for more information.
    */
  var expandoInstructions: ExpandoInstructions | scala.Null
  /**
    * The index where the "expando" section of `LView` begins. The expando
    * section contains injectors, directive instances, and host binding values.
    * Unlike the "consts" and "vars" sections of `LView`, the length of this
    * section cannot be calculated at compile-time because directives are matched
    * at runtime to preserve locality.
    *
    * We store this start index so we know where to start checking host bindings
    * in `setHostBindings`.
    */
  var expandoStartIndex: scala.Double
  /**
    * A reference to the first child node located in the view.
    */
  var firstChild: TNode | scala.Null
  /** Whether or not this template has been processed. */
  var firstTemplatePass: scala.Boolean
  /**
    * ID for inline views to determine whether a view is the same as the previous view
    * in a certain position. If it's not, we know the new view needs to be inserted
    * and the one that exists needs to be removed (e.g. if/else statements)
    *
    * If this is -1, then this is a component view or a dynamically created view.
    */
  val id: scala.Double
  /**
    * Pointer to the host `TNode` (not part of this TView).
    *
    * If this is a `TViewNode` for an `LViewNode`, this is an embedded view of a container.
    * We need this pointer to be able to efficiently find this node when inserting the view
    * into an anchor.
    *
    * If this is a `TElementNode`, this is the view of a root component. It has exactly one
    * root TNode.
    *
    * If this is null, this is the view of a component that is not at root. We do not store
    * the host TNodes for child component views because they can potentially have several
    * different host TNodes, depending on where the component is being used. These host
    * TNodes cannot be shared (due to different indices, etc).
    */
  var node: TViewNode | ɵangular_packages_core_core_bg | scala.Null
  /**
    * Full registry of pipes that may be found in this view.
    *
    * The property is either an array of `PipeDefs`s or a function which returns the array of
    * `PipeDefs`s. The function is necessary to be able to support forward declarations.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var pipeRegistry: atAngularCoreLib.PipeDefList | scala.Null
  /**
    * Array of ngOnChanges and ngDoCheck hooks that should be executed for this view in update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var preOrderCheckHooks: atAngularCoreLib.HookData | scala.Null
  /**
    * Array of ngOnInit, ngOnChanges and ngDoCheck hooks that should be executed for this view in
    * creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var preOrderHooks: atAngularCoreLib.HookData | scala.Null
  /**
    * Set of schemas that declare elements to be allowed inside the view.
    */
  var schemas: js.Array[SchemaMetadata] | scala.Null
  /**
    * Whether or not there are any static content queries tracked on this view.
    *
    * We store this so we know whether or not we should do a content query
    * refresh after creation mode to collect static query results.
    */
  var staticContentQueries: scala.Boolean
  /**
    * Whether or not there are any static view queries tracked on this view.
    *
    * We store this so we know whether or not we should do a view query
    * refresh after creation mode to collect static query results.
    */
  var staticViewQueries: scala.Boolean
  /**
    * The template function used to refresh the view of dynamically created views
    * and components. Will be null for inline views.
    */
  var template: ComponentTemplate[js.Object] | scala.Null
  /**
    * Array of ngAfterViewChecked hooks that should be executed for this view in
    * update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewCheckHooks: atAngularCoreLib.HookData | scala.Null
  /**
    * Array of ngAfterViewInit and ngAfterViewChecked hooks that should be executed for
    * this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewHooks: atAngularCoreLib.HookData | scala.Null
  /**
    * A function containing query-related instructions.
    */
  var viewQuery: ViewQueriesFunction[js.Object] | scala.Null
  /**
    * The index where the viewQueries section of `LView` begins. This section contains
    * view queries defined for a component/directive.
    *
    * We store this start index so we know where the list of view queries starts.
    * This is required when we invoke view queries at runtime. We invoke queries one by one and
    * increment query index after each iteration. This information helps us to reset index back to
    * the beginning of view query list before we invoke view queries again.
    */
  var viewQueryStartIndex: scala.Double
}

object TView {
  @scala.inline
  def apply(
    bindingStartIndex: scala.Double,
    blueprint: ɵangular_packages_core_core_bm,
    data: atAngularCoreLib.TData,
    expandoStartIndex: scala.Double,
    firstTemplatePass: scala.Boolean,
    id: scala.Double,
    staticContentQueries: scala.Boolean,
    staticViewQueries: scala.Boolean,
    viewQueryStartIndex: scala.Double,
    cleanup: js.Array[_] = null,
    components: js.Array[scala.Double] = null,
    contentCheckHooks: atAngularCoreLib.HookData = null,
    contentHooks: atAngularCoreLib.HookData = null,
    contentQueries: js.Array[scala.Double] = null,
    destroyHooks: atAngularCoreLib.HookData = null,
    directiveRegistry: atAngularCoreLib.DirectiveDefList = null,
    expandoInstructions: ExpandoInstructions = null,
    firstChild: TNode = null,
    node: TViewNode | ɵangular_packages_core_core_bg = null,
    pipeRegistry: atAngularCoreLib.PipeDefList = null,
    preOrderCheckHooks: atAngularCoreLib.HookData = null,
    preOrderHooks: atAngularCoreLib.HookData = null,
    schemas: js.Array[SchemaMetadata] = null,
    template: ComponentTemplate[js.Object] = null,
    viewCheckHooks: atAngularCoreLib.HookData = null,
    viewHooks: atAngularCoreLib.HookData = null,
    viewQuery: ViewQueriesFunction[js.Object] = null
  ): TView = {
    val __obj = js.Dynamic.literal(bindingStartIndex = bindingStartIndex, blueprint = blueprint, data = data, expandoStartIndex = expandoStartIndex, firstTemplatePass = firstTemplatePass, id = id, staticContentQueries = staticContentQueries, staticViewQueries = staticViewQueries, viewQueryStartIndex = viewQueryStartIndex)
    if (cleanup != null) __obj.updateDynamic("cleanup")(cleanup)
    if (components != null) __obj.updateDynamic("components")(components)
    if (contentCheckHooks != null) __obj.updateDynamic("contentCheckHooks")(contentCheckHooks)
    if (contentHooks != null) __obj.updateDynamic("contentHooks")(contentHooks)
    if (contentQueries != null) __obj.updateDynamic("contentQueries")(contentQueries)
    if (destroyHooks != null) __obj.updateDynamic("destroyHooks")(destroyHooks)
    if (directiveRegistry != null) __obj.updateDynamic("directiveRegistry")(directiveRegistry)
    if (expandoInstructions != null) __obj.updateDynamic("expandoInstructions")(expandoInstructions)
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild)
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (pipeRegistry != null) __obj.updateDynamic("pipeRegistry")(pipeRegistry)
    if (preOrderCheckHooks != null) __obj.updateDynamic("preOrderCheckHooks")(preOrderCheckHooks)
    if (preOrderHooks != null) __obj.updateDynamic("preOrderHooks")(preOrderHooks)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    if (template != null) __obj.updateDynamic("template")(template)
    if (viewCheckHooks != null) __obj.updateDynamic("viewCheckHooks")(viewCheckHooks)
    if (viewHooks != null) __obj.updateDynamic("viewHooks")(viewHooks)
    if (viewQuery != null) __obj.updateDynamic("viewQuery")(viewQuery)
    __obj.asInstanceOf[TView]
  }
}

