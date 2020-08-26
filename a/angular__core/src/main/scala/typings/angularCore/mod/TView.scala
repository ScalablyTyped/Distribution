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
@js.native
trait TView extends js.Object {
  /**
    * The binding start index is the index at which the data array
    * starts to store bindings only. Saving this value ensures that we
    * will begin reading bindings at the correct point in the array when
    * we are in update mode.
    *
    * -1 means that it has not been initialized.
    */
  var bindingStartIndex: Double = js.native
  /**
    * This is a blueprint used to generate LView instances for this TView. Copying this
    * blueprint is faster than creating a new LView from scratch.
    */
  var blueprint: ɵangularPackagesCoreCoreBp = js.native
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
  var cleanup: js.Array[_] | Null = js.native
  /**
    * A list of element indices for child components that will need to be
    * refreshed when the current view has finished its check. These indices have
    * already been adjusted for the HEADER_OFFSET.
    *
    */
  var components: js.Array[Double] | Null = js.native
  /**
    * Array of constants for the view. Includes attribute arrays, local definition arrays etc.
    * Used for directive matching, attribute bindings, local definitions and more.
    */
  var consts: TConstants | Null = js.native
  /**
    * Array of ngAfterContentChecked hooks that should be executed for this view in update
    * mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var contentCheckHooks: HookData | Null = js.native
  /**
    * Array of ngAfterContentInit and ngAfterContentChecked hooks that should be executed
    * for this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var contentHooks: HookData | Null = js.native
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
  var contentQueries: js.Array[Double] | Null = js.native
  /** Static data equivalent of LView.data[]. Contains TNodes, PipeDefInternal or TI18n. */
  var data: TData = js.native
  /**
    * Array of ngOnDestroy hooks that should be executed when this view is destroyed.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var destroyHooks: DestroyHookData | Null = js.native
  /**
    * Full registry of directives and components that may be found in this view.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var directiveRegistry: DirectiveDefList | Null = js.native
  /**
    * Set of instructions used to process host bindings efficiently.
    *
    * See VIEW_DATA.md for more information.
    */
  var expandoInstructions: ExpandoInstructions | Null = js.native
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
  var expandoStartIndex: Double = js.native
  /**
    * A reference to the first child node located in the view.
    */
  var firstChild: TNode | Null = js.native
  /** Whether or not this template has been processed in creation mode. */
  var firstCreatePass: Boolean = js.native
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
  var firstUpdatePass: Boolean = js.native
  /**
    * ID for inline views to determine whether a view is the same as the previous view
    * in a certain position. If it's not, we know the new view needs to be inserted
    * and the one that exists needs to be removed (e.g. if/else statements)
    *
    * If this is -1, then this is a component view or a dynamically created view.
    */
  val id: Double = js.native
  /**
    * Indicates that there was an error before we managed to complete the first create pass of the
    * view. This means that the view is likely corrupted and we should try to recover it.
    */
  var incompleteFirstPass: Boolean = js.native
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
  var node: TViewNode | ɵangularPackagesCoreCoreBf | Null = js.native
  /**
    * Full registry of pipes that may be found in this view.
    *
    * The property is either an array of `PipeDefs`s or a function which returns the array of
    * `PipeDefs`s. The function is necessary to be able to support forward declarations.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var pipeRegistry: PipeDefList | Null = js.native
  /**
    * Array of ngOnChanges and ngDoCheck hooks that should be executed for this view in update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var preOrderCheckHooks: HookData | Null = js.native
  /**
    * Array of ngOnInit, ngOnChanges and ngDoCheck hooks that should be executed for this view in
    * creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var preOrderHooks: HookData | Null = js.native
  /**
    * A collection of queries tracked in a given view.
    */
  var queries: TQueries | Null = js.native
  /**
    * Set of schemas that declare elements to be allowed inside the view.
    */
  var schemas: js.Array[SchemaMetadata] | Null = js.native
  /**
    * Whether or not there are any static content queries tracked on this view.
    *
    * We store this so we know whether or not we should do a content query
    * refresh after creation mode to collect static query results.
    */
  var staticContentQueries: Boolean = js.native
  /**
    * Whether or not there are any static view queries tracked on this view.
    *
    * We store this so we know whether or not we should do a view query
    * refresh after creation mode to collect static query results.
    */
  var staticViewQueries: Boolean = js.native
  /**
    * The template function used to refresh the view of dynamically created views
    * and components. Will be null for inline views.
    */
  var template: ComponentTemplate[js.Object] | Null = js.native
  /**
    * Type of `TView` (`Root`|`Component`|`Embedded`).
    */
  var `type`: TViewType = js.native
  /**
    * Array of ngAfterViewChecked hooks that should be executed for this view in
    * update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewCheckHooks: HookData | Null = js.native
  /**
    * Array of ngAfterViewInit and ngAfterViewChecked hooks that should be executed for
    * this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewHooks: HookData | Null = js.native
  /**
    * A function containing query-related instructions.
    */
  var viewQuery: ViewQueriesFunction[js.Object] | Null = js.native
}

object TView {
  @scala.inline
  def apply(
    bindingStartIndex: Double,
    blueprint: ɵangularPackagesCoreCoreBp,
    data: TData,
    expandoStartIndex: Double,
    firstCreatePass: Boolean,
    firstUpdatePass: Boolean,
    id: Double,
    incompleteFirstPass: Boolean,
    staticContentQueries: Boolean,
    staticViewQueries: Boolean,
    `type`: TViewType
  ): TView = {
    val __obj = js.Dynamic.literal(bindingStartIndex = bindingStartIndex.asInstanceOf[js.Any], blueprint = blueprint.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandoStartIndex = expandoStartIndex.asInstanceOf[js.Any], firstCreatePass = firstCreatePass.asInstanceOf[js.Any], firstUpdatePass = firstUpdatePass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incompleteFirstPass = incompleteFirstPass.asInstanceOf[js.Any], staticContentQueries = staticContentQueries.asInstanceOf[js.Any], staticViewQueries = staticViewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TView]
  }
  @scala.inline
  implicit class TViewOps[Self <: TView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindingStartIndex(value: Double): Self = this.set("bindingStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlueprint(value: ɵangularPackagesCoreCoreBp): Self = this.set("blueprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(
      value: (TNode | ɵPipeDef[js.Any] | ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any] | Double | TStylingRange | TStylingKey | Type[js.Any] | InjectionToken[js.Any] | TI18n | I18nUpdateOpCodes | Null | String)*
    ): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandoStartIndex(value: Double): Self = this.set("expandoStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstCreatePass(value: Boolean): Self = this.set("firstCreatePass", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstUpdatePass(value: Boolean): Self = this.set("firstUpdatePass", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncompleteFirstPass(value: Boolean): Self = this.set("incompleteFirstPass", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticContentQueries(value: Boolean): Self = this.set("staticContentQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticViewQueries(value: Boolean): Self = this.set("staticViewQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TViewType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCleanupVarargs(value: js.Any*): Self = this.set("cleanup", js.Array(value :_*))
    @scala.inline
    def setCleanup(value: js.Array[_]): Self = this.set("cleanup", value.asInstanceOf[js.Any])
    @scala.inline
    def setCleanupNull: Self = this.set("cleanup", null)
    @scala.inline
    def setComponentsVarargs(value: Double*): Self = this.set("components", js.Array(value :_*))
    @scala.inline
    def setComponents(value: js.Array[Double]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentsNull: Self = this.set("components", null)
    @scala.inline
    def setConstsVarargs(value: (TAttributes | String)*): Self = this.set("consts", js.Array(value :_*))
    @scala.inline
    def setConsts(value: TConstants): Self = this.set("consts", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstsNull: Self = this.set("consts", null)
    @scala.inline
    def setContentCheckHooksVarargs(value: HookEntry*): Self = this.set("contentCheckHooks", js.Array(value :_*))
    @scala.inline
    def setContentCheckHooks(value: HookData): Self = this.set("contentCheckHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentCheckHooksNull: Self = this.set("contentCheckHooks", null)
    @scala.inline
    def setContentHooksVarargs(value: HookEntry*): Self = this.set("contentHooks", js.Array(value :_*))
    @scala.inline
    def setContentHooks(value: HookData): Self = this.set("contentHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentHooksNull: Self = this.set("contentHooks", null)
    @scala.inline
    def setContentQueriesVarargs(value: Double*): Self = this.set("contentQueries", js.Array(value :_*))
    @scala.inline
    def setContentQueries(value: js.Array[Double]): Self = this.set("contentQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentQueriesNull: Self = this.set("contentQueries", null)
    @scala.inline
    def setDestroyHooksVarargs(value: (HookEntry | HookData)*): Self = this.set("destroyHooks", js.Array(value :_*))
    @scala.inline
    def setDestroyHooks(value: DestroyHookData): Self = this.set("destroyHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroyHooksNull: Self = this.set("destroyHooks", null)
    @scala.inline
    def setDirectiveRegistryVarargs(value: (ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any])*): Self = this.set("directiveRegistry", js.Array(value :_*))
    @scala.inline
    def setDirectiveRegistry(value: DirectiveDefList): Self = this.set("directiveRegistry", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectiveRegistryNull: Self = this.set("directiveRegistry", null)
    @scala.inline
    def setExpandoInstructionsVarargs(value: (Double | HostBindingsFunction[js.Any] | Null)*): Self = this.set("expandoInstructions", js.Array(value :_*))
    @scala.inline
    def setExpandoInstructions(value: ExpandoInstructions): Self = this.set("expandoInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandoInstructionsNull: Self = this.set("expandoInstructions", null)
    @scala.inline
    def setFirstChild(value: TNode): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChildNull: Self = this.set("firstChild", null)
    @scala.inline
    def setNode(value: TViewNode | ɵangularPackagesCoreCoreBf): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
    @scala.inline
    def setPipeRegistryVarargs(value: ɵPipeDef[js.Any]*): Self = this.set("pipeRegistry", js.Array(value :_*))
    @scala.inline
    def setPipeRegistry(value: PipeDefList): Self = this.set("pipeRegistry", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipeRegistryNull: Self = this.set("pipeRegistry", null)
    @scala.inline
    def setPreOrderCheckHooksVarargs(value: HookEntry*): Self = this.set("preOrderCheckHooks", js.Array(value :_*))
    @scala.inline
    def setPreOrderCheckHooks(value: HookData): Self = this.set("preOrderCheckHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreOrderCheckHooksNull: Self = this.set("preOrderCheckHooks", null)
    @scala.inline
    def setPreOrderHooksVarargs(value: HookEntry*): Self = this.set("preOrderHooks", js.Array(value :_*))
    @scala.inline
    def setPreOrderHooks(value: HookData): Self = this.set("preOrderHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreOrderHooksNull: Self = this.set("preOrderHooks", null)
    @scala.inline
    def setQueries(value: TQueries): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueriesNull: Self = this.set("queries", null)
    @scala.inline
    def setSchemasVarargs(value: SchemaMetadata*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemasNull: Self = this.set("schemas", null)
    @scala.inline
    def setTemplate(value: (/* rf */ ɵRenderFlags, js.Object) => Unit): Self = this.set("template", js.Any.fromFunction2(value))
    @scala.inline
    def setTemplateNull: Self = this.set("template", null)
    @scala.inline
    def setViewCheckHooksVarargs(value: HookEntry*): Self = this.set("viewCheckHooks", js.Array(value :_*))
    @scala.inline
    def setViewCheckHooks(value: HookData): Self = this.set("viewCheckHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewCheckHooksNull: Self = this.set("viewCheckHooks", null)
    @scala.inline
    def setViewHooksVarargs(value: HookEntry*): Self = this.set("viewHooks", js.Array(value :_*))
    @scala.inline
    def setViewHooks(value: HookData): Self = this.set("viewHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewHooksNull: Self = this.set("viewHooks", null)
    @scala.inline
    def setViewQuery(value: (/* rf */ ɵRenderFlags, js.Object) => Unit): Self = this.set("viewQuery", js.Any.fromFunction2(value))
    @scala.inline
    def setViewQueryNull: Self = this.set("viewQuery", null)
  }
  
}

