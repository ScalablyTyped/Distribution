package typings.angularCore.mod

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
    *
    * -1 means that it has not been initialized.
    */
  var bindingStartIndex: Double
  /**
    * This is a blueprint used to generate LView instances for this TView. Copying this
    * blueprint is faster than creating a new LView from scratch.
    */
  var blueprint: ɵangularPackagesCoreCoreBo
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
  var cleanup: js.Array[_] | Null
  /**
    * A list of element indices for child components that will need to be
    * refreshed when the current view has finished its check. These indices have
    * already been adjusted for the HEADER_OFFSET.
    *
    */
  var components: js.Array[Double] | Null
  /**
    * Array of constants for the view. Includes attribute arrays, local definition arrays etc.
    * Used for directive matching, attribute bindings, local definitions and more.
    */
  var consts: TConstants | Null
  /**
    * Array of ngAfterContentChecked hooks that should be executed for this view in update
    * mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var contentCheckHooks: HookData | Null
  /**
    * Array of ngAfterContentInit and ngAfterContentChecked hooks that should be executed
    * for this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var contentHooks: HookData | Null
  /**
    * An array of indices pointing to directives with content queries alongside with the
    * corresponding
    * query index. Each entry in this array is a tuple of:
    * - index of the first content query index declared by a given directive;
    * - index of a directive.
    *
    * We are storing those indexes so we can refresh content queries as part of a view refresh
    * process.
    */
  var contentQueries: js.Array[Double] | Null
  /** Static data equivalent of LView.data[]. Contains TNodes, PipeDefInternal or TI18n. */
  var data: TData
  /**
    * Array of ngOnDestroy hooks that should be executed when this view is destroyed.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var destroyHooks: DestroyHookData | Null
  /**
    * Full registry of directives and components that may be found in this view.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var directiveRegistry: DirectiveDefList | Null
  /**
    * Set of instructions used to process host bindings efficiently.
    *
    * See VIEW_DATA.md for more information.
    */
  var expandoInstructions: ExpandoInstructions | Null
  /**
    * The index where the "expando" section of `LView` begins. The expando
    * section contains injectors, directive instances, and host binding values.
    * Unlike the "decls" and "vars" sections of `LView`, the length of this
    * section cannot be calculated at compile-time because directives are matched
    * at runtime to preserve locality.
    *
    * We store this start index so we know where to start checking host bindings
    * in `setHostBindings`.
    */
  var expandoStartIndex: Double
  /**
    * A reference to the first child node located in the view.
    */
  var firstChild: TNode | Null
  /** Whether or not this template has been processed in creation mode. */
  var firstCreatePass: Boolean
  /**
    *  Whether or not this template has been processed in update mode (e.g. change detected)
    *
    * `firstUpdatePass` is used by styling to set up `TData` to contain metadata about the styling
    * instructions. (Mainly to build up a linked list of styling priority order.)
    *
    * Typically this function gets cleared after first execution. If exception is thrown then this
    * flag can remain turned un until there is first successful (no exception) pass. This means that
    * individual styling instructions keep track of if they have already been added to the linked
    * list to prevent double adding.
    */
  var firstUpdatePass: Boolean
  /**
    * ID for inline views to determine whether a view is the same as the previous view
    * in a certain position. If it's not, we know the new view needs to be inserted
    * and the one that exists needs to be removed (e.g. if/else statements)
    *
    * If this is -1, then this is a component view or a dynamically created view.
    */
  val id: Double
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
  var node: TViewNode | ɵangularPackagesCoreCoreBe | Null
  /**
    * Full registry of pipes that may be found in this view.
    *
    * The property is either an array of `PipeDefs`s or a function which returns the array of
    * `PipeDefs`s. The function is necessary to be able to support forward declarations.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var pipeRegistry: PipeDefList | Null
  /**
    * Array of ngOnChanges and ngDoCheck hooks that should be executed for this view in update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var preOrderCheckHooks: HookData | Null
  /**
    * Array of ngOnInit, ngOnChanges and ngDoCheck hooks that should be executed for this view in
    * creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var preOrderHooks: HookData | Null
  /**
    * A collection of queries tracked in a given view.
    */
  var queries: TQueries | Null
  /**
    * Set of schemas that declare elements to be allowed inside the view.
    */
  var schemas: js.Array[SchemaMetadata] | Null
  /**
    * Whether or not there are any static content queries tracked on this view.
    *
    * We store this so we know whether or not we should do a content query
    * refresh after creation mode to collect static query results.
    */
  var staticContentQueries: Boolean
  /**
    * Whether or not there are any static view queries tracked on this view.
    *
    * We store this so we know whether or not we should do a view query
    * refresh after creation mode to collect static query results.
    */
  var staticViewQueries: Boolean
  /**
    * The template function used to refresh the view of dynamically created views
    * and components. Will be null for inline views.
    */
  var template: ComponentTemplate[js.Object] | Null
  /**
    * Type of `TView` (`Root`|`Component`|`Embedded`).
    */
  var `type`: TViewType
  /**
    * Array of ngAfterViewChecked hooks that should be executed for this view in
    * update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewCheckHooks: HookData | Null
  /**
    * Array of ngAfterViewInit and ngAfterViewChecked hooks that should be executed for
    * this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewHooks: HookData | Null
  /**
    * A function containing query-related instructions.
    */
  var viewQuery: ViewQueriesFunction[js.Object] | Null
}

object TView {
  @scala.inline
  def apply(
    bindingStartIndex: Double,
    blueprint: ɵangularPackagesCoreCoreBo,
    data: TData,
    expandoStartIndex: Double,
    firstCreatePass: Boolean,
    firstUpdatePass: Boolean,
    id: Double,
    staticContentQueries: Boolean,
    staticViewQueries: Boolean,
    `type`: TViewType,
    cleanup: js.Array[_] = null,
    components: js.Array[Double] = null,
    consts: TConstants = null,
    contentCheckHooks: HookData = null,
    contentHooks: HookData = null,
    contentQueries: js.Array[Double] = null,
    destroyHooks: DestroyHookData = null,
    directiveRegistry: DirectiveDefList = null,
    expandoInstructions: ExpandoInstructions = null,
    firstChild: TNode = null,
    node: TViewNode | ɵangularPackagesCoreCoreBe = null,
    pipeRegistry: PipeDefList = null,
    preOrderCheckHooks: HookData = null,
    preOrderHooks: HookData = null,
    queries: TQueries = null,
    schemas: js.Array[SchemaMetadata] = null,
    template: (/* rf */ ɵRenderFlags, js.Object) => Unit = null,
    viewCheckHooks: HookData = null,
    viewHooks: HookData = null,
    viewQuery: (/* rf */ ɵRenderFlags, js.Object) => Unit = null
  ): TView = {
    val __obj = js.Dynamic.literal(bindingStartIndex = bindingStartIndex.asInstanceOf[js.Any], blueprint = blueprint.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandoStartIndex = expandoStartIndex.asInstanceOf[js.Any], firstCreatePass = firstCreatePass.asInstanceOf[js.Any], firstUpdatePass = firstUpdatePass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], staticContentQueries = staticContentQueries.asInstanceOf[js.Any], staticViewQueries = staticViewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cleanup != null) __obj.updateDynamic("cleanup")(cleanup.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (consts != null) __obj.updateDynamic("consts")(consts.asInstanceOf[js.Any])
    if (contentCheckHooks != null) __obj.updateDynamic("contentCheckHooks")(contentCheckHooks.asInstanceOf[js.Any])
    if (contentHooks != null) __obj.updateDynamic("contentHooks")(contentHooks.asInstanceOf[js.Any])
    if (contentQueries != null) __obj.updateDynamic("contentQueries")(contentQueries.asInstanceOf[js.Any])
    if (destroyHooks != null) __obj.updateDynamic("destroyHooks")(destroyHooks.asInstanceOf[js.Any])
    if (directiveRegistry != null) __obj.updateDynamic("directiveRegistry")(directiveRegistry.asInstanceOf[js.Any])
    if (expandoInstructions != null) __obj.updateDynamic("expandoInstructions")(expandoInstructions.asInstanceOf[js.Any])
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (pipeRegistry != null) __obj.updateDynamic("pipeRegistry")(pipeRegistry.asInstanceOf[js.Any])
    if (preOrderCheckHooks != null) __obj.updateDynamic("preOrderCheckHooks")(preOrderCheckHooks.asInstanceOf[js.Any])
    if (preOrderHooks != null) __obj.updateDynamic("preOrderHooks")(preOrderHooks.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction2(template))
    if (viewCheckHooks != null) __obj.updateDynamic("viewCheckHooks")(viewCheckHooks.asInstanceOf[js.Any])
    if (viewHooks != null) __obj.updateDynamic("viewHooks")(viewHooks.asInstanceOf[js.Any])
    if (viewQuery != null) __obj.updateDynamic("viewQuery")(js.Any.fromFunction2(viewQuery))
    __obj.asInstanceOf[TView]
  }
}

