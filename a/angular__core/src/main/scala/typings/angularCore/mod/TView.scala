package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The static data for an LView (shared between all templates of a
  * given type).
  *
  * Stored on the `ComponentDef.tView`.
  */
@js.native
trait TView extends StObject {
  
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
  var blueprint: ɵangularPackagesCoreCoreBv = js.native
  
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
    * corresponding query index. Each entry in this array is a tuple of:
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
    * A `TNode` representing the declaration location of this `TView` (not part of this TView).
    */
  var declTNode: TNode | Null = js.native
  
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
    * Stores the OpCodes to be replayed during change-detection to process the `HostBindings`
    *
    * See `HostBindingOpCodes` for encoding details.
    */
  var hostBindingOpCodes: HostBindingOpCodes | Null = js.native
  
  /**
    * Indicates that there was an error before we managed to complete the first create pass of the
    * view. This means that the view is likely corrupted and we should try to recover it.
    */
  var incompleteFirstPass: Boolean = js.native
  
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
    * This array has the same structure as the `preOrderHooks` one.
    */
  var preOrderCheckHooks: HookData | Null = js.native
  
  /**
    * Array of ngOnInit, ngOnChanges and ngDoCheck hooks that should be executed for this view in
    * creation mode.
    *
    * This array has a flat structure and contains TNode indices, directive indices (where an
    * instance can be found in `LView`) and hook functions. TNode index is followed by the directive
    * index and a hook function. If there are multiple hooks for a given TNode, the TNode index is
    * not repeated and the next lifecycle hook information is stored right after the previous hook
    * function. This is done so that at runtime the system can efficiently iterate over all of the
    * functions to invoke without having to make any decisions/lookups.
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
    blueprint: ɵangularPackagesCoreCoreBv,
    data: TData,
    expandoStartIndex: Double,
    firstCreatePass: Boolean,
    firstUpdatePass: Boolean,
    incompleteFirstPass: Boolean,
    staticContentQueries: Boolean,
    staticViewQueries: Boolean,
    `type`: TViewType
  ): TView = {
    val __obj = js.Dynamic.literal(bindingStartIndex = bindingStartIndex.asInstanceOf[js.Any], blueprint = blueprint.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandoStartIndex = expandoStartIndex.asInstanceOf[js.Any], firstCreatePass = firstCreatePass.asInstanceOf[js.Any], firstUpdatePass = firstUpdatePass.asInstanceOf[js.Any], incompleteFirstPass = incompleteFirstPass.asInstanceOf[js.Any], staticContentQueries = staticContentQueries.asInstanceOf[js.Any], staticViewQueries = staticViewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TView]
  }
  
  @scala.inline
  implicit class TViewMutableBuilder[Self <: TView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingStartIndex(value: Double): Self = StObject.set(x, "bindingStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueprint(value: ɵangularPackagesCoreCoreBv): Self = StObject.set(x, "blueprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanup(value: js.Array[_]): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanupNull: Self = StObject.set(x, "cleanup", null)
    
    @scala.inline
    def setCleanupVarargs(value: js.Any*): Self = StObject.set(x, "cleanup", js.Array(value :_*))
    
    @scala.inline
    def setComponents(value: js.Array[Double]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsNull: Self = StObject.set(x, "components", null)
    
    @scala.inline
    def setComponentsVarargs(value: Double*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setConsts(value: TConstants): Self = StObject.set(x, "consts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstsNull: Self = StObject.set(x, "consts", null)
    
    @scala.inline
    def setConstsVarargs(value: (TAttributes | String)*): Self = StObject.set(x, "consts", js.Array(value :_*))
    
    @scala.inline
    def setContentCheckHooks(value: HookData): Self = StObject.set(x, "contentCheckHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCheckHooksNull: Self = StObject.set(x, "contentCheckHooks", null)
    
    @scala.inline
    def setContentCheckHooksVarargs(value: HookEntry*): Self = StObject.set(x, "contentCheckHooks", js.Array(value :_*))
    
    @scala.inline
    def setContentHooks(value: HookData): Self = StObject.set(x, "contentHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHooksNull: Self = StObject.set(x, "contentHooks", null)
    
    @scala.inline
    def setContentHooksVarargs(value: HookEntry*): Self = StObject.set(x, "contentHooks", js.Array(value :_*))
    
    @scala.inline
    def setContentQueries(value: js.Array[Double]): Self = StObject.set(x, "contentQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentQueriesNull: Self = StObject.set(x, "contentQueries", null)
    
    @scala.inline
    def setContentQueriesVarargs(value: Double*): Self = StObject.set(x, "contentQueries", js.Array(value :_*))
    
    @scala.inline
    def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(
      value: (TNode | ɵPipeDef[js.Any] | ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any] | Double | TStylingRange | TStylingKey | typings.angularCore.mod.Type[js.Any] | InjectionToken[js.Any] | TI18n | I18nUpdateOpCodes | TIcu | Null | String)*
    ): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDeclTNode(value: TNode): Self = StObject.set(x, "declTNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclTNodeNull: Self = StObject.set(x, "declTNode", null)
    
    @scala.inline
    def setDestroyHooks(value: DestroyHookData): Self = StObject.set(x, "destroyHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyHooksNull: Self = StObject.set(x, "destroyHooks", null)
    
    @scala.inline
    def setDestroyHooksVarargs(value: (HookEntry | HookData)*): Self = StObject.set(x, "destroyHooks", js.Array(value :_*))
    
    @scala.inline
    def setDirectiveRegistry(value: DirectiveDefList): Self = StObject.set(x, "directiveRegistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectiveRegistryNull: Self = StObject.set(x, "directiveRegistry", null)
    
    @scala.inline
    def setDirectiveRegistryVarargs(value: (ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any])*): Self = StObject.set(x, "directiveRegistry", js.Array(value :_*))
    
    @scala.inline
    def setExpandoStartIndex(value: Double): Self = StObject.set(x, "expandoStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChild(value: TNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
    
    @scala.inline
    def setFirstCreatePass(value: Boolean): Self = StObject.set(x, "firstCreatePass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUpdatePass(value: Boolean): Self = StObject.set(x, "firstUpdatePass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostBindingOpCodes(value: HostBindingOpCodes): Self = StObject.set(x, "hostBindingOpCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostBindingOpCodesNull: Self = StObject.set(x, "hostBindingOpCodes", null)
    
    @scala.inline
    def setIncompleteFirstPass(value: Boolean): Self = StObject.set(x, "incompleteFirstPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipeRegistry(value: PipeDefList): Self = StObject.set(x, "pipeRegistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipeRegistryNull: Self = StObject.set(x, "pipeRegistry", null)
    
    @scala.inline
    def setPipeRegistryVarargs(value: ɵPipeDef[js.Any]*): Self = StObject.set(x, "pipeRegistry", js.Array(value :_*))
    
    @scala.inline
    def setPreOrderCheckHooks(value: HookData): Self = StObject.set(x, "preOrderCheckHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreOrderCheckHooksNull: Self = StObject.set(x, "preOrderCheckHooks", null)
    
    @scala.inline
    def setPreOrderCheckHooksVarargs(value: HookEntry*): Self = StObject.set(x, "preOrderCheckHooks", js.Array(value :_*))
    
    @scala.inline
    def setPreOrderHooks(value: HookData): Self = StObject.set(x, "preOrderHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreOrderHooksNull: Self = StObject.set(x, "preOrderHooks", null)
    
    @scala.inline
    def setPreOrderHooksVarargs(value: HookEntry*): Self = StObject.set(x, "preOrderHooks", js.Array(value :_*))
    
    @scala.inline
    def setQueries(value: TQueries): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesNull: Self = StObject.set(x, "queries", null)
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    @scala.inline
    def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    @scala.inline
    def setStaticContentQueries(value: Boolean): Self = StObject.set(x, "staticContentQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticViewQueries(value: Boolean): Self = StObject.set(x, "staticViewQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: (/* rf */ ɵRenderFlags, js.Object) => Unit): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplateNull: Self = StObject.set(x, "template", null)
    
    @scala.inline
    def setType(value: TViewType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCheckHooks(value: HookData): Self = StObject.set(x, "viewCheckHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCheckHooksNull: Self = StObject.set(x, "viewCheckHooks", null)
    
    @scala.inline
    def setViewCheckHooksVarargs(value: HookEntry*): Self = StObject.set(x, "viewCheckHooks", js.Array(value :_*))
    
    @scala.inline
    def setViewHooks(value: HookData): Self = StObject.set(x, "viewHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewHooksNull: Self = StObject.set(x, "viewHooks", null)
    
    @scala.inline
    def setViewHooksVarargs(value: HookEntry*): Self = StObject.set(x, "viewHooks", js.Array(value :_*))
    
    @scala.inline
    def setViewQuery(value: (/* rf */ ɵRenderFlags, js.Object) => Unit): Self = StObject.set(x, "viewQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def setViewQueryNull: Self = StObject.set(x, "viewQuery", null)
  }
}
