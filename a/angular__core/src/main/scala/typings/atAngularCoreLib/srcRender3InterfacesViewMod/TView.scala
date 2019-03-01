package typings
package atAngularCoreLib.srcRender3InterfacesViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var blueprint: LView
  /**
    * Array of ngDoCheck hooks that should be executed for this view in update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var checkHooks: HookData | scala.Null
  /**
    * Index of the host node of the first LView or LContainer beneath this LView in
    * the hierarchy.
    *
    * Necessary to store this so views can traverse through their nested views
    * to remove listeners and call onDestroy callbacks.
    *
    * For embedded views, we store the index of an LContainer's host rather than the first
    * LView to avoid managing splicing when views are added/removed.
    */
  var childIndex: scala.Double
  /**
    * When a view is destroyed, listeners need to be released and outputs need to be
    * unsubscribed. This cleanup array stores both listener data (in chunks of 4)
    * and output data (in chunks of 2) for a particular view. Combining the arrays
    * saves on memory (70 bytes per array) and on a few bytes of code size (for two
    * separate for loops).
    *
    * If it's a native DOM listener or output subscription being stored:
    * 1st index is: event name  `name = tView.cleanup[i+0]`
    * 2nd index is: index of native element `element = lView[tView.cleanup[i+1]]`
    * 3rd index is: index of listener function `listener = lView[CLEANUP][tView.cleanup[i+2]]`
    * 4th index is: `useCaptureOrIndx = tView.cleanup[i+3]`
    *    `typeof useCaptureOrIndx == 'boolean' : useCapture boolean
    *    `typeof useCaptureOrIndx == 'number':
    *         `useCaptureOrIndx >= 0` `removeListener = LView[CLEANUP][useCaptureOrIndx]`
    *         `useCaptureOrIndx <  0` `subscription = LView[CLEANUP][-useCaptureOrIndx]`
    *
    * If it's a renderer2 style listener or ViewRef destroy hook being stored:
    * 1st index is: index of the cleanup function in LView.cleanupInstances[]
    * 2nd index is: `null`
    *               `lView[CLEANUP][tView.cleanup[i+0]]()`
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
  var contentCheckHooks: HookData | scala.Null
  /**
    * Array of ngAfterContentInit and ngAfterContentChecked hooks that should be executed
    * for this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var contentHooks: HookData | scala.Null
  /**
    * A list of indices for child directives that have content queries.
    *
    * Even indices: Directive indices
    * Odd indices: Starting index of content queries (stored in CONTENT_QUERIES) for this directive
    */
  var contentQueries: js.Array[scala.Double] | scala.Null
  /** Static data equivalent of LView.data[]. Contains TNodes, PipeDefInternal or TI18n. */
  var data: TData
  /**
    * Array of ngOnDestroy hooks that should be executed when this view is destroyed.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var destroyHooks: HookData | scala.Null
  /**
    * Full registry of directives and components that may be found in this view.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var directiveRegistry: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefList | scala.Null
  /**
    * Set of instructions used to process host bindings efficiently.
    *
    * See VIEW_DATA.md for more information.
    */
  var expandoInstructions: (js.Array[
    scala.Double | atAngularCoreLib.srcRender3InterfacesDefinitionMod.HostBindingsFunction[_] | scala.Null
  ]) | scala.Null
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
  var firstChild: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode | scala.Null
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
    * Array of ngOnInit and ngDoCheck hooks that should be executed for this view in
    * creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var initHooks: HookData | scala.Null
  /**
    * Pointer to the `TNode` that represents the root of the view.
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
  var node: atAngularCoreLib.srcRender3InterfacesNodeMod.TViewNode | atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode | scala.Null
  /**
    * Array of pipe ngOnDestroy hooks that should be executed when this view is destroyed.
    *
    * Even indices: Index of pipe in data
    * Odd indices: Hook function
    *
    * These must be stored separately from directive destroy hooks because their contexts
    * are stored in data.
    */
  var pipeDestroyHooks: HookData | scala.Null
  /**
    * Full registry of pipes that may be found in this view.
    *
    * The property is either an array of `PipeDefs`s or a function which returns the array of
    * `PipeDefs`s. The function is necessary to be able to support forward declarations.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var pipeRegistry: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefList | scala.Null
  /**
    * The template function used to refresh the view of dynamically created views
    * and components. Will be null for inline views.
    */
  var template: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[js.Object] | scala.Null
  /**
    * Array of ngAfterViewChecked hooks that should be executed for this view in
    * update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewCheckHooks: HookData | scala.Null
  /**
    * Array of ngAfterViewInit and ngAfterViewChecked hooks that should be executed for
    * this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewHooks: HookData | scala.Null
  /**
    * A function containing query-related instructions.
    */
  var viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[js.Object] | scala.Null
}

object TView {
  @scala.inline
  def apply(
    bindingStartIndex: scala.Double,
    blueprint: LView,
    childIndex: scala.Double,
    data: TData,
    expandoStartIndex: scala.Double,
    firstTemplatePass: scala.Boolean,
    id: scala.Double,
    checkHooks: HookData = null,
    cleanup: js.Array[_] = null,
    components: js.Array[scala.Double] = null,
    contentCheckHooks: HookData = null,
    contentHooks: HookData = null,
    contentQueries: js.Array[scala.Double] = null,
    destroyHooks: HookData = null,
    directiveRegistry: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefList = null,
    expandoInstructions: js.Array[
      scala.Double | atAngularCoreLib.srcRender3InterfacesDefinitionMod.HostBindingsFunction[_] | scala.Null
    ] = null,
    firstChild: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = null,
    initHooks: HookData = null,
    node: atAngularCoreLib.srcRender3InterfacesNodeMod.TViewNode | atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode = null,
    pipeDestroyHooks: HookData = null,
    pipeRegistry: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDefList = null,
    template: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[js.Object] = null,
    viewCheckHooks: HookData = null,
    viewHooks: HookData = null,
    viewQuery: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[js.Object] = null
  ): TView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindingStartIndex")(bindingStartIndex)
    __obj.updateDynamic("blueprint")(blueprint)
    __obj.updateDynamic("childIndex")(childIndex)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("expandoStartIndex")(expandoStartIndex)
    __obj.updateDynamic("firstTemplatePass")(firstTemplatePass)
    __obj.updateDynamic("id")(id)
    if (checkHooks != null) __obj.updateDynamic("checkHooks")(checkHooks)
    if (cleanup != null) __obj.updateDynamic("cleanup")(cleanup)
    if (components != null) __obj.updateDynamic("components")(components)
    if (contentCheckHooks != null) __obj.updateDynamic("contentCheckHooks")(contentCheckHooks)
    if (contentHooks != null) __obj.updateDynamic("contentHooks")(contentHooks)
    if (contentQueries != null) __obj.updateDynamic("contentQueries")(contentQueries)
    if (destroyHooks != null) __obj.updateDynamic("destroyHooks")(destroyHooks)
    if (directiveRegistry != null) __obj.updateDynamic("directiveRegistry")(directiveRegistry)
    if (expandoInstructions != null) __obj.updateDynamic("expandoInstructions")(expandoInstructions)
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild)
    if (initHooks != null) __obj.updateDynamic("initHooks")(initHooks)
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (pipeDestroyHooks != null) __obj.updateDynamic("pipeDestroyHooks")(pipeDestroyHooks)
    if (pipeRegistry != null) __obj.updateDynamic("pipeRegistry")(pipeRegistry)
    if (template != null) __obj.updateDynamic("template")(template)
    if (viewCheckHooks != null) __obj.updateDynamic("viewCheckHooks")(viewCheckHooks)
    if (viewHooks != null) __obj.updateDynamic("viewHooks")(viewHooks)
    if (viewQuery != null) __obj.updateDynamic("viewQuery")(viewQuery)
    __obj.asInstanceOf[TView]
  }
}

