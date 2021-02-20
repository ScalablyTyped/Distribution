package typings.angularCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def ANALYZE_FOR_ENTRY_COMPONENTS: typings.angularCore.mod.InjectionToken[js.Any] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ANALYZE_FOR_ENTRY_COMPONENTS").asInstanceOf[typings.angularCore.mod.InjectionToken[js.Any]]
  
  @scala.inline
  def APP_BOOTSTRAP_LISTENER: typings.angularCore.mod.InjectionToken[
    js.Array[
      js.Function1[/* compRef */ typings.angularCore.mod.ComponentRef[js.Any], scala.Unit]
    ]
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("APP_BOOTSTRAP_LISTENER").asInstanceOf[typings.angularCore.mod.InjectionToken[
    js.Array[
      js.Function1[/* compRef */ typings.angularCore.mod.ComponentRef[js.Any], scala.Unit]
    ]
  ]]
  
  @scala.inline
  def APP_ID: typings.angularCore.mod.InjectionToken[java.lang.String] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("APP_ID").asInstanceOf[typings.angularCore.mod.InjectionToken[java.lang.String]]
  
  @scala.inline
  def APP_INITIALIZER: typings.angularCore.mod.InjectionToken[js.Array[js.Function0[scala.Unit]]] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("APP_INITIALIZER").asInstanceOf[typings.angularCore.mod.InjectionToken[js.Array[js.Function0[scala.Unit]]]]
  
  @scala.inline
  def COMPILER_OPTIONS: typings.angularCore.mod.InjectionToken[js.Array[typings.angularCore.mod.CompilerOptions]] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("COMPILER_OPTIONS").asInstanceOf[typings.angularCore.mod.InjectionToken[js.Array[typings.angularCore.mod.CompilerOptions]]]
  
  @scala.inline
  def CUSTOM_ELEMENTS_SCHEMA: typings.angularCore.mod.SchemaMetadata = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CUSTOM_ELEMENTS_SCHEMA").asInstanceOf[typings.angularCore.mod.SchemaMetadata]
  
  type ComponentInstance = js.Object
  
  /**
    * Definition of what a template rendering function should look like for a component.
    */
  type ComponentTemplate[T] = js.Function2[/* rf */ typings.angularCore.mod.ɵRenderFlags, /* ctx */ T, scala.Unit]
  
  @scala.inline
  def ContentChild: typings.angularCore.mod.ContentChildDecorator = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ContentChild").asInstanceOf[typings.angularCore.mod.ContentChildDecorator]
  type ContentChild = typings.angularCore.mod.Query
  
  @scala.inline
  def ContentChildren: typings.angularCore.mod.ContentChildrenDecorator = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ContentChildren").asInstanceOf[typings.angularCore.mod.ContentChildrenDecorator]
  type ContentChildren = typings.angularCore.mod.Query
  
  /**
    * Definition of what a content queries function should look like.
    */
  type ContentQueriesFunction[T] = js.Function3[
    /* rf */ typings.angularCore.mod.ɵRenderFlags, 
    /* ctx */ T, 
    /* directiveIndex */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Expresses a single CSS Selector.
    *
    * Beginning of array
    * - First index: element name
    * - Subsequent odd indices: attr keys
    * - Subsequent even indices: attr values
    *
    * After SelectorFlags.CLASS flag
    * - Class name values
    *
    * SelectorFlags.NOT flag
    * - Changes the mode to NOT
    * - Can be combined with other flags to set the element / attr / class mode
    *
    * e.g. SelectorFlags.NOT | SelectorFlags.ELEMENT
    *
    * Example:
    * Original: `div.foo.bar[attr1=val1][attr2]`
    * Parsed: ['div', 'attr1', 'val1', 'attr2', '', SelectorFlags.CLASS, 'foo', 'bar']
    *
    * Original: 'div[attr1]:not(.foo[attr2])
    * Parsed: [
    *  'div', 'attr1', '',
    *  SelectorFlags.NOT | SelectorFlags.ATTRIBUTE 'attr2', '', SelectorFlags.CLASS, 'foo'
    * ]
    *
    * See more examples in node_selector_matcher_spec.ts
    */
  type CssSelector = js.Array[java.lang.String | typings.angularCore.mod.SelectorFlags]
  
  /**
    * An object literal of this type is used to represent the metadata of a constructor dependency.
    * The type itself is never referred to from generated code.
    */
  type CtorDependency = typings.angularCore.anon.Attribute | scala.Null
  
  @scala.inline
  def DEFAULT_CURRENCY_CODE: typings.angularCore.mod.InjectionToken[java.lang.String] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_CURRENCY_CODE").asInstanceOf[typings.angularCore.mod.InjectionToken[java.lang.String]]
  
  /**
    * Factory for ViewDefinitions/NgModuleDefinitions.
    * We use a function so we can reexeute it in case an error happens and use the given logger
    * function to log the error from the definition of the node, which is shown in all browser
    * logs.
    */
  type DefinitionFactory[D /* <: typings.angularCore.mod.Definition[_] */] = js.Function1[/* logger */ typings.angularCore.mod.NodeLogger, D]
  
  /**
    * Array of destroy hooks that should be executed for a view and their directive indices.
    *
    * The array is set up as a series of number/function or number/(number|function)[]:
    * - Even indices represent the context with which hooks should be called.
    * - Odd indices are the hook functions themselves. If a value at an odd index is an array,
    *   it represents the destroy hooks of a `multi` provider where:
    *     - Even indices represent the index of the provider for which we've registered a destroy hook,
    *       inside of the `multi` provider array.
    *     - Odd indices are the destroy hook functions.
    * For example:
    * LView: `[0, 1, 2, AService, 4, [BService, CService, DService]]`
    * destroyHooks: `[3, AService.ngOnDestroy, 5, [0, BService.ngOnDestroy, 2, DService.ngOnDestroy]]`
    *
    * In the example above `AService` is a type provider with an `ngOnDestroy`, whereas `BService`,
    * `CService` and `DService` are part of a `multi` provider where only `BService` and `DService`
    * have an `ngOnDestroy` hook.
    */
  type DestroyHookData = js.Array[typings.angularCore.mod.HookEntry | typings.angularCore.mod.HookData]
  
  type DirectiveDefList = js.Array[
    typings.angularCore.mod.ɵDirectiveDef[js.Any] | typings.angularCore.mod.ɵComponentDef[js.Any]
  ]
  
  /**
    * Type used for directiveDefs on component definition.
    *
    * The function is necessary to be able to support forward declarations.
    */
  type DirectiveDefListOrFactory = js.Function0[typings.angularCore.mod.DirectiveDefList] | typings.angularCore.mod.DirectiveDefList
  
  type DirectiveInstance = js.Object
  
  type DirectiveTypeList = js.Array[
    typings.angularCore.mod.ɵDirectiveType[js.Any] | typings.angularCore.mod.ɵComponentType[js.Any] | typings.angularCore.mod.Type[js.Any]
  ]
  
  type DirectiveTypesOrFactory = js.Function0[typings.angularCore.mod.DirectiveTypeList] | typings.angularCore.mod.DirectiveTypeList
  
  type DisposableFn = js.Function0[scala.Unit]
  
  type ElementHandleEventFn = js.Function3[
    /* view */ typings.angularCore.mod.ViewData, 
    /* eventName */ java.lang.String, 
    /* event */ js.Any, 
    scala.Boolean
  ]
  
  type ForwardRefFn = js.Function0[js.Any]
  
  type GlobalTargetResolver = js.Function1[/* element */ js.Any, typings.angularCore.anon.Name]
  
  /**
    * Array of hooks that should be executed for a view and their directive indices.
    *
    * For each node of the view, the following data is stored:
    * 1) Node index (optional)
    * 2) A series of number/function pairs where:
    *  - even indices are directive indices
    *  - odd indices are hook functions
    *
    * Special cases:
    *  - a negative directive index flags an init hook (ngOnInit, ngAfterContentInit, ngAfterViewInit)
    */
  type HookData = js.Array[typings.angularCore.mod.HookEntry]
  
  /**
    * Information necessary to call a hook. E.g. the callback that
    * needs to invoked and the index at which to find its context.
    */
  type HookEntry = scala.Double | typings.angularCore.mod.HookFn
  
  /** Single hook callback function. */
  type HookFn = js.Function0[scala.Unit]
  
  @scala.inline
  def Host: typings.angularCore.mod.HostDecorator = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Host").asInstanceOf[typings.angularCore.mod.HostDecorator]
  
  type HostBindingsFunction[T] = js.Function2[/* rf */ typings.angularCore.mod.ɵRenderFlags, /* ctx */ T, scala.Unit]
  
  /** See CreateComponentOptions.hostFeatures */
  type HostFeature = js.Function2[
    /* component */ js.Any, 
    /* componentDef */ typings.angularCore.mod.ɵComponentDef[js.Any], 
    scala.Unit
  ]
  
  @scala.inline
  def INJECTOR_ : typings.angularCore.mod.InjectionToken[typings.angularCore.mod.Injector] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("INJECTOR").asInstanceOf[typings.angularCore.mod.InjectionToken[typings.angularCore.mod.Injector]]
  
  /**
    * This array contains information about input properties that
    * need to be set once from attribute data. It's ordered by
    * directive index (relative to element) so it's simple to
    * look up a specific directive's initial input data.
    *
    * Within each sub-array:
    *
    * i+0: attribute name
    * i+1: minified/internal input name
    * i+2: initial value
    *
    * If a directive on a node does not have any input properties
    * that should be set from attributes, its index is set to null
    * to avoid a sparse array.
    *
    * e.g. [null, ['role-min', 'minified-input', 'button']]
    */
  type InitialInputData = js.Array[typings.angularCore.mod.InitialInputs | scala.Null]
  
  /**
    * Used by InitialInputData to store input properties
    * that should be set once from attributes.
    *
    * i+0: attribute name
    * i+1: minified/internal input name
    * i+2: initial value
    *
    * e.g. ['role-min', 'minified-input', 'button']
    */
  type InitialInputs = js.Array[java.lang.String]
  
  /**
    * See `TNode.insertBeforeIndex`
    */
  type InsertBeforeIndex = scala.Null | scala.Double | js.Array[scala.Double]
  
  @scala.inline
  def LOCALE_ID: typings.angularCore.mod.InjectionToken[java.lang.String] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LOCALE_ID").asInstanceOf[typings.angularCore.mod.InjectionToken[java.lang.String]]
  
  /**
    * Type for a function that extracts a value for a local refs.
    * Example:
    * - `<div #nativeDivEl>` - `nativeDivEl` should point to the native `<div>` element;
    * - `<ng-template #tplRef>` - `tplRef` should point to the `TemplateRef` instance;
    */
  type LocalRefExtractor = js.Function2[
    /* tNode */ typings.angularCore.mod.TNodeWithLocalRefs, 
    /* currentView */ typings.angularCore.mod.ɵangularPackagesCoreCoreBv, 
    js.Any
  ]
  
  @scala.inline
  def NO_ERRORS_SCHEMA: typings.angularCore.mod.SchemaMetadata = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NO_ERRORS_SCHEMA").asInstanceOf[typings.angularCore.mod.SchemaMetadata]
  
  type NgIterable[T] = js.Array[T] | typings.std.Iterable[T]
  
  /**
    * Function to call console.error at the right source location. This is an indirection
    * via another function as browser will log the location that actually called
    * `console.error`.
    */
  type NodeLogger = js.Function0[js.Function0[scala.Unit]]
  
  @scala.inline
  def Optional: typings.angularCore.mod.OptionalDecorator = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Optional").asInstanceOf[typings.angularCore.mod.OptionalDecorator]
  
  @scala.inline
  def PACKAGE_ROOT_URL: typings.angularCore.mod.InjectionToken[java.lang.String] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PACKAGE_ROOT_URL").asInstanceOf[typings.angularCore.mod.InjectionToken[java.lang.String]]
  
  @scala.inline
  def PLATFORM_ID: typings.angularCore.mod.InjectionToken[js.Object] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PLATFORM_ID").asInstanceOf[typings.angularCore.mod.InjectionToken[js.Object]]
  
  @scala.inline
  def PLATFORM_INITIALIZER: typings.angularCore.mod.InjectionToken[js.Array[js.Function0[scala.Unit]]] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PLATFORM_INITIALIZER").asInstanceOf[typings.angularCore.mod.InjectionToken[js.Array[js.Function0[scala.Unit]]]]
  
  type PipeDefList = js.Array[typings.angularCore.mod.ɵPipeDef[js.Any]]
  
  /**
    * Type used for PipeDefs on component definition.
    *
    * The function is necessary to be able to support forward declarations.
    */
  type PipeDefListOrFactory = js.Function0[typings.angularCore.mod.PipeDefList] | typings.angularCore.mod.PipeDefList
  
  type PipeTypeList = js.Array[typings.angularCore.mod.PipeType[js.Any] | typings.angularCore.mod.Type[js.Any]]
  
  type PipeTypesOrFactory = js.Function0[typings.angularCore.mod.PipeTypeList] | typings.angularCore.mod.PipeTypeList
  
  type Predicate[T] = js.Function1[/* value */ T, scala.Boolean]
  
  /**
    * Describes a function that is used to process provider lists (such as provider
    * overrides).
    */
  type ProcessProvidersFunction = js.Function1[
    /* providers */ js.Array[typings.angularCore.mod.Provider], 
    js.Array[typings.angularCore.mod.Provider]
  ]
  
  /**
    * List of slots for a projection. A slot can be either based on a parsed CSS selector
    * which will be used to determine nodes which are projected into that slot.
    *
    * When set to "*", the slot is reserved and can be used for multi-slot projection
    * using {@link ViewContainerRef#createComponent}. The last slot that specifies the
    * wildcard selector will retrieve all projectable nodes which do not match any selector.
    */
  type ProjectionSlots = js.Array[
    typings.angularCore.mod.ɵCssSelectorList | typings.angularCore.angularCoreStrings.Asterisk
  ]
  
  /**
    * Store the runtime input or output names for all the directives.
    *
    * i+0: directive instance index
    * i+1: privateName
    *
    * e.g. [0, 'change-minified']
    */
  type PropertyAliasValue = js.Array[scala.Double | java.lang.String]
  
  /**
    * This mapping is necessary so we can set input properties and output listeners
    * properly at runtime when property names are minified or aliased.
    *
    * Key: unminified / public input or output name
    * Value: array containing minified / internal name and related directive index
    *
    * The value must be an array to support inputs and outputs with the same name
    * on the same node.
    */
  type PropertyAliases = org.scalablytyped.runtime.StringDictionary[typings.angularCore.mod.PropertyAliasValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCore.mod.TypeProvider
    - typings.angularCore.mod.ValueProvider
    - typings.angularCore.mod.ClassProvider
    - typings.angularCore.mod.ConstructorProvider
    - typings.angularCore.mod.ExistingProvider
    - typings.angularCore.mod.FactoryProvider
    - js.Array[js.Any]
  */
  type Provider = typings.angularCore.mod._Provider | js.Array[js.Any] | typings.angularCore.mod.TypeProvider
  
  /**
    * Function used to sanitize the value before writing it into the renderer.
    */
  type SanitizerFn = js.Function3[
    /* value */ js.Any, 
    /* tagName */ js.UndefOr[java.lang.String], 
    /* propName */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  @scala.inline
  def Self: typings.angularCore.mod.SelfDecorator = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Self").asInstanceOf[typings.angularCore.mod.SelfDecorator]
  
  type SimpleChanges = org.scalablytyped.runtime.StringDictionary[typings.angularCore.mod.SimpleChange]
  
  @scala.inline
  def SkipSelf: typings.angularCore.mod.SkipSelfDecorator = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SkipSelf").asInstanceOf[typings.angularCore.mod.SkipSelfDecorator]
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCore.mod.ValueProvider
    - typings.angularCore.mod.ExistingProvider
    - typings.angularCore.mod.StaticClassProvider
    - typings.angularCore.mod.ConstructorProvider
    - typings.angularCore.mod.FactoryProvider
    - js.Array[js.Any]
  */
  type StaticProvider = typings.angularCore.mod._StaticProvider | js.Array[js.Any]
  
  /**
    * A combination of:
    * - Attribute names and values.
    * - Special markers acting as flags to alter attributes processing.
    * - Parsed ngProjectAs selectors.
    */
  type TAttributes = js.Array[
    java.lang.String | typings.angularCore.mod.ɵAttributeMarker | typings.angularCore.mod.CssSelector
  ]
  
  /**
    * Constants that are associated with a view. Includes:
    * - Attribute arrays.
    * - Local definition arrays.
    * - Translated messages (i18n).
    */
  type TConstants = js.Array[typings.angularCore.mod.TAttributes | java.lang.String]
  
  /**
    * Factory function that returns an array of consts. Consts can be represented as a function in
    * case any additional statements are required to define consts in the list. An example is i18n
    * where additional i18n calls are generated, which should be executed when consts are requested
    * for the first time.
    */
  type TConstantsFactory = js.Function0[typings.angularCore.mod.TConstants]
  
  /**
    * TConstants type that describes how the `consts` field is generated on ComponentDef: it can be
    * either an array or a factory function that returns that array.
    */
  type TConstantsOrFactory = typings.angularCore.mod.TConstants | typings.angularCore.mod.TConstantsFactory
  
  /**
    * Static data that corresponds to the instance-specific data array on an LView.
    *
    * Each node's static data is stored in tData at the same index that it's stored
    * in the data array.  Any nodes that do not have static data store a null value in
    * tData to avoid a sparse array.
    *
    * Each pipe's definition is stored here at the same index as its pipe instance in
    * the data array.
    *
    * Each host property's name is stored here at the same index as its value in the
    * data array.
    *
    * Each property binding name is stored here at the same index as its value in
    * the data array. If the binding is an interpolation, the static string values
    * are stored parallel to the dynamic values. Example:
    *
    * id="prefix {{ v0 }} a {{ v1 }} b {{ v2 }} suffix"
    *
    * LView       |   TView.data
    *------------------------
    *  v0 value   |   'a'
    *  v1 value   |   'b'
    *  v2 value   |   id � prefix � suffix
    *
    * Injector bloom filters are also stored here.
    */
  type TData = js.Array[
    typings.angularCore.mod.TNode | typings.angularCore.mod.ɵPipeDef[js.Any] | typings.angularCore.mod.ɵDirectiveDef[js.Any] | typings.angularCore.mod.ɵComponentDef[js.Any] | scala.Double | typings.angularCore.mod.TStylingRange | typings.angularCore.mod.TStylingKey | typings.angularCore.mod.Type[js.Any] | typings.angularCore.mod.InjectionToken[js.Any] | typings.angularCore.mod.TI18n | typings.angularCore.mod.I18nUpdateOpCodes | typings.angularCore.mod.TIcu | scala.Null | java.lang.String
  ]
  
  @scala.inline
  def TRANSLATIONS: typings.angularCore.mod.InjectionToken[java.lang.String] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TRANSLATIONS").asInstanceOf[typings.angularCore.mod.InjectionToken[java.lang.String]]
  
  @scala.inline
  def TRANSLATIONS_FORMAT: typings.angularCore.mod.InjectionToken[java.lang.String] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TRANSLATIONS_FORMAT").asInstanceOf[typings.angularCore.mod.InjectionToken[java.lang.String]]
  
  /**
    * Value stored in the `TData` which is needed to re-concatenate the styling.
    *
    * See: `TStylingKeyPrimitive` and `TStylingStatic`
    */
  type TStylingKey = typings.angularCore.mod.TStylingKeyPrimitive | typings.angularCore.mod.TStylingStatic
  
  /**
    * The primitive portion (`TStylingStatic` removed) of the value stored in the `TData` which is
    * needed to re-concatenate the styling.
    *
    * - `string`: Stores the property name. Used with `ɵɵstyleProp`/`ɵɵclassProp` instruction.
    * - `null`: Represents map, so there is no name. Used with `ɵɵstyleMap`/`ɵɵclassMap`.
    * - `false`: Represents an ignore case. This happens when `ɵɵstyleProp`/`ɵɵclassProp` instruction
    *   is combined with directive which shadows its input `@Input('class')`. That way the binding
    *   should not participate in the styling resolution.
    */
  type TStylingKeyPrimitive = java.lang.String | scala.Null | typings.angularCore.angularCoreBooleans.`false`
  
  /**
    * Store the static values for the styling binding.
    *
    * The `TStylingStatic` is just `KeyValueArray` where key `""` (stored at location 0) contains the
    * `TStylingKey` (stored at location 1). In other words this wraps the `TStylingKey` such that the
    * `""` contains the wrapped value.
    *
    * When instructions are resolving styling they may need to look forward or backwards in the linked
    * list to resolve the value. For this reason we have to make sure that he linked list also contains
    * the static values. However the list only has space for one item per styling instruction. For this
    * reason we store the static values here as part of the `TStylingKey`. This means that the
    * resolution function when looking for a value needs to first look at the binding value, and than
    * at `TStylingKey` (if it exists).
    *
    * Imagine we have:
    *
    * ```
    * <div class="TEMPLATE" my-dir>
    *
    * @Directive({
    *   host: {
    *     class: 'DIR',
    *     '[class.dynamic]': 'exp' // ɵɵclassProp('dynamic', ctx.exp);
    *   }
    * })
    * ```
    *
    * In the above case the linked list will contain one item:
    *
    * ```
    *   // assume binding location: 10 for `ɵɵclassProp('dynamic', ctx.exp);`
    *   tData[10] = <TStylingStatic>[
    *     '': 'dynamic', // This is the wrapped value of `TStylingKey`
    *     'DIR': true,   // This is the default static value of directive binding.
    *   ];
    *   tData[10 + 1] = 0; // We don't have prev/next.
    *
    *   lView[10] = undefined;     // assume `ctx.exp` is `undefined`
    *   lView[10 + 1] = undefined; // Just normalized `lView[10]`
    * ```
    *
    * So when the function is resolving styling value, it first needs to look into the linked list
    * (there is none) and than into the static `TStylingStatic` too see if there is a default value for
    * `dynamic` (there is not). Therefore it is safe to remove it.
    *
    * If setting `true` case:
    * ```
    *   lView[10] = true;     // assume `ctx.exp` is `true`
    *   lView[10 + 1] = true; // Just normalized `lView[10]`
    * ```
    * So when the function is resolving styling value, it first needs to look into the linked list
    * (there is none) and than into `TNode.residualClass` (TNode.residualStyle) which contains
    * ```
    *   tNode.residualClass = [
    *     'TEMPLATE': true,
    *   ];
    * ```
    *
    * This means that it is safe to add class.
    */
  type TStylingStatic = typings.angularCore.mod.KeyValueArray[js.Any]
  
  type TrackByFunction[T] = js.Function2[/* index */ scala.Double, /* item */ T, js.Any]
  
  @scala.inline
  def Type: typings.std.FunctionConstructor = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Type").asInstanceOf[typings.std.FunctionConstructor]
  
  type TypeProvider = typings.angularCore.mod.Type[js.Any]
  
  @scala.inline
  def VERSION_ : typings.angularCore.mod.Version = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[typings.angularCore.mod.Version]
  
  @scala.inline
  def ViewChild: typings.angularCore.mod.ViewChildDecorator = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ViewChild").asInstanceOf[typings.angularCore.mod.ViewChildDecorator]
  type ViewChild = typings.angularCore.mod.Query
  
  @scala.inline
  def ViewChildren: typings.angularCore.mod.ViewChildrenDecorator = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ViewChildren").asInstanceOf[typings.angularCore.mod.ViewChildrenDecorator]
  type ViewChildren = typings.angularCore.mod.Query
  
  type ViewHandleEventFn = js.Function4[
    /* view */ typings.angularCore.mod.ViewData, 
    /* nodeIndex */ scala.Double, 
    /* eventName */ java.lang.String, 
    /* event */ js.Any, 
    scala.Boolean
  ]
  
  /**
    * Definition of what a view queries function should look like.
    */
  type ViewQueriesFunction[T] = js.Function2[/* rf */ typings.angularCore.mod.ɵRenderFlags, /* ctx */ T, scala.Unit]
  
  type ViewUpdateFn = js.Function2[
    /* check */ typings.angularCore.mod.NodeCheckFn, 
    /* view */ typings.angularCore.mod.ViewData, 
    scala.Unit
  ]
  
  @scala.inline
  def asNativeElements(debugEls: js.Array[typings.angularCore.mod.DebugElement]): js.Any = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("asNativeElements")(debugEls.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def assertPlatform(requiredToken: js.Any): typings.angularCore.mod.PlatformRef = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assertPlatform")(requiredToken.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.PlatformRef]
  
  @scala.inline
  def createPlatform(injector: typings.angularCore.mod.Injector): typings.angularCore.mod.PlatformRef = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatform")(injector.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.PlatformRef]
  
  @scala.inline
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[
      /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
      typings.angularCore.mod.PlatformRef
    ],
    name: java.lang.String
  ): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
    typings.angularCore.mod.PlatformRef
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
    typings.angularCore.mod.PlatformRef
  ]]
  @scala.inline
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[
      /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
      typings.angularCore.mod.PlatformRef
    ],
    name: java.lang.String,
    providers: js.Array[typings.angularCore.mod.StaticProvider]
  ): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
    typings.angularCore.mod.PlatformRef
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any], providers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
    typings.angularCore.mod.PlatformRef
  ]]
  @scala.inline
  def createPlatformFactory(parentPlatformFactory: scala.Null, name: java.lang.String): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
    typings.angularCore.mod.PlatformRef
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
    typings.angularCore.mod.PlatformRef
  ]]
  @scala.inline
  def createPlatformFactory(
    parentPlatformFactory: scala.Null,
    name: java.lang.String,
    providers: js.Array[typings.angularCore.mod.StaticProvider]
  ): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
    typings.angularCore.mod.PlatformRef
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any], providers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typings.angularCore.mod.StaticProvider]], 
    typings.angularCore.mod.PlatformRef
  ]]
  
  @scala.inline
  def defineInjectable[T](opts: typings.angularCore.anon.Factory[T]): scala.Nothing = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineInjectable")(opts.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def destroyPlatform(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("destroyPlatform")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def enableProdMode(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enableProdMode")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def forwardRef(forwardRefFn: typings.angularCore.mod.ForwardRefFn): typings.angularCore.mod.Type[_] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(forwardRefFn.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.Type[_]]
  
  @scala.inline
  def getDebugNode(nativeNode: js.Any): typings.angularCore.mod.DebugNode | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDebugNode")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.DebugNode | scala.Null]
  
  @scala.inline
  def getModuleFactory(id: java.lang.String): typings.angularCore.mod.NgModuleFactory[_] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getModuleFactory")(id.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.NgModuleFactory[_]]
  
  @scala.inline
  def getPlatform(): typings.angularCore.mod.PlatformRef | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPlatform")().asInstanceOf[typings.angularCore.mod.PlatformRef | scala.Null]
  
  @scala.inline
  def inject[T](token: typings.angularCore.mod.InjectionToken[T]): T | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def inject[T](token: typings.angularCore.mod.InjectionToken[T], flags: typings.angularCore.mod.InjectFlags): T | scala.Null = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  @scala.inline
  def inject[T](token: typings.angularCore.mod.Type[T]): T | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def inject[T](token: typings.angularCore.mod.Type[T], flags: typings.angularCore.mod.InjectFlags): T | scala.Null = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  
  @scala.inline
  def inject_T_T[T](token: typings.angularCore.mod.InjectionToken[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def inject_T_T[T](token: typings.angularCore.mod.Type[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def isDevMode(): scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDevMode")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def platformCore(): typings.angularCore.mod.PlatformRef = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("platformCore")().asInstanceOf[typings.angularCore.mod.PlatformRef]
  @scala.inline
  def platformCore(extraProviders: js.Array[typings.angularCore.mod.StaticProvider]): typings.angularCore.mod.PlatformRef = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("platformCore")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.PlatformRef]
  
  @scala.inline
  def resolveForwardRef[T](`type`: T): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveForwardRef")(`type`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def setTestabilityGetter(getter: typings.angularCore.mod.GetTestability): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTestabilityGetter")(getter.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  type viewEngineChangeDetectorRefInterface = typings.angularCore.mod.ChangeDetectorRef
  
  @scala.inline
  def ɵALLOWMULTIPLEPLATFORMS: typings.angularCore.mod.InjectionToken[scala.Boolean] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ALLOW_MULTIPLE_PLATFORMS").asInstanceOf[typings.angularCore.mod.InjectionToken[scala.Boolean]]
  
  @scala.inline
  def ɵCompilerCompileModuleAndAllComponentsAsyncPOSTR3[T](moduleType: typings.angularCore.mod.Type[T]): js.Promise[typings.angularCore.mod.ModuleWithComponentFactories[T]] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275Compiler_compileModuleAndAllComponentsAsync__POST_R3__")(moduleType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.angularCore.mod.ModuleWithComponentFactories[T]]]
  
  @scala.inline
  def ɵCompilerCompileModuleAndAllComponentsSyncPOSTR3[T](moduleType: typings.angularCore.mod.Type[T]): typings.angularCore.mod.ModuleWithComponentFactories[T] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275Compiler_compileModuleAndAllComponentsSync__POST_R3__")(moduleType.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ModuleWithComponentFactories[T]]
  
  @scala.inline
  def ɵCompilerCompileModuleAsyncPOSTR3[T](moduleType: typings.angularCore.mod.Type[T]): js.Promise[typings.angularCore.mod.NgModuleFactory[T]] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275Compiler_compileModuleAsync__POST_R3__")(moduleType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.angularCore.mod.NgModuleFactory[T]]]
  
  @scala.inline
  def ɵCompilerCompileModuleSyncPOSTR3[T](moduleType: typings.angularCore.mod.Type[T]): typings.angularCore.mod.NgModuleFactory[T] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275Compiler_compileModuleSync__POST_R3__")(moduleType.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.NgModuleFactory[T]]
  
  type ɵCssSelectorList = js.Array[typings.angularCore.mod.CssSelector]
  
  @scala.inline
  def ɵDEFAULTLOCALEID: /* "en-US" */ java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275DEFAULT_LOCALE_ID").asInstanceOf[/* "en-US" */ java.lang.String]
  
  @scala.inline
  def ɵEMPTYARRAY: js.Array[js.Any] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275EMPTY_ARRAY").asInstanceOf[js.Array[js.Any]]
  
  type ɵGetterFn = js.Function1[/* obj */ js.Any, js.Any]
  
  @scala.inline
  def ɵINJECTORIMPLPOSTR3(
    providers: js.Array[typings.angularCore.mod.StaticProvider],
    parent: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275INJECTOR_IMPL__POST_R3__")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵINJECTORIMPLPOSTR3(
    providers: js.Array[typings.angularCore.mod.StaticProvider],
    parent: typings.angularCore.mod.Injector,
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275INJECTOR_IMPL__POST_R3__")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  
  @scala.inline
  def ɵINJECTORSCOPE: typings.angularCore.mod.InjectionToken[
    typings.angularCore.angularCoreStrings.root | typings.angularCore.angularCoreStrings.platform | scala.Null
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275INJECTOR_SCOPE").asInstanceOf[typings.angularCore.mod.InjectionToken[
    typings.angularCore.angularCoreStrings.root | typings.angularCore.angularCoreStrings.platform | scala.Null
  ]]
  
  @scala.inline
  def ɵLifecycleHooksFeature(component: js.Any, `def`: typings.angularCore.mod.ɵComponentDef[_]): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275LifecycleHooksFeature")(component.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  type ɵMethodFn = js.Function2[/* obj */ js.Any, /* args */ js.Array[js.Any], js.Any]
  
  @scala.inline
  def ɵNGCOMPDEF: java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_COMP_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGDIRDEF: java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_DIR_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGELEMENTID: java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_ELEMENT_ID").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGINJDEF: java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_INJ_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGMODDEF: java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_MOD_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGPIPEDEF: java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_PIPE_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGPROVDEF: java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_PROV_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵSWITCHCHANGEDETECTORREFFACTORYPOSTR3: js.Function1[/* isPipe */ js.UndefOr[scala.Boolean], typings.angularCore.mod.ChangeDetectorRef] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_CHANGE_DETECTOR_REF_FACTORY__POST_R3__").asInstanceOf[js.Function1[/* isPipe */ js.UndefOr[scala.Boolean], typings.angularCore.mod.ChangeDetectorRef]]
  
  @scala.inline
  def ɵSWITCHCOMPILECOMPONENTPOSTR3: js.Function2[
    /* type */ typings.angularCore.mod.Type[js.Any], 
    /* metadata */ typings.angularCore.mod.Component, 
    scala.Unit
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_COMPONENT__POST_R3__").asInstanceOf[js.Function2[
    /* type */ typings.angularCore.mod.Type[js.Any], 
    /* metadata */ typings.angularCore.mod.Component, 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHCOMPILEDIRECTIVEPOSTR3: js.Function2[
    /* type */ typings.angularCore.mod.Type[js.Any], 
    /* directive */ typings.angularCore.mod.Directive | scala.Null, 
    scala.Unit
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_DIRECTIVE__POST_R3__").asInstanceOf[js.Function2[
    /* type */ typings.angularCore.mod.Type[js.Any], 
    /* directive */ typings.angularCore.mod.Directive | scala.Null, 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHCOMPILEINJECTABLEPOSTR3: js.Function2[
    /* type */ typings.angularCore.mod.Type[js.Any], 
    /* srcMeta */ js.UndefOr[typings.angularCore.mod.Injectable], 
    scala.Unit
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_INJECTABLE__POST_R3__").asInstanceOf[js.Function2[
    /* type */ typings.angularCore.mod.Type[js.Any], 
    /* srcMeta */ js.UndefOr[typings.angularCore.mod.Injectable], 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHCOMPILENGMODULEPOSTR3: js.Function2[
    /* moduleType */ typings.angularCore.mod.Type[js.Any], 
    /* ngModule */ js.UndefOr[typings.angularCore.mod.NgModule], 
    scala.Unit
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_NGMODULE__POST_R3__").asInstanceOf[js.Function2[
    /* moduleType */ typings.angularCore.mod.Type[js.Any], 
    /* ngModule */ js.UndefOr[typings.angularCore.mod.NgModule], 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHCOMPILEPIPEPOSTR3: js.Function2[
    /* type */ typings.angularCore.mod.Type[js.Any], 
    /* meta */ typings.angularCore.mod.Pipe, 
    scala.Unit
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_PIPE__POST_R3__").asInstanceOf[js.Function2[
    /* type */ typings.angularCore.mod.Type[js.Any], 
    /* meta */ typings.angularCore.mod.Pipe, 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHELEMENTREFFACTORYPOSTR3: js.Function0[typings.angularCore.mod.ElementRef[js.Any]] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_ELEMENT_REF_FACTORY__POST_R3__").asInstanceOf[js.Function0[typings.angularCore.mod.ElementRef[js.Any]]]
  
  @scala.inline
  def ɵSWITCHIVYENABLEDPOSTR3: /* true */ scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_IVY_ENABLED__POST_R3__").asInstanceOf[/* true */ scala.Boolean]
  
  @scala.inline
  def ɵSWITCHRENDERER2FACTORYPOSTR3: js.Function0[typings.angularCore.mod.Renderer2] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_RENDERER2_FACTORY__POST_R3__").asInstanceOf[js.Function0[typings.angularCore.mod.Renderer2]]
  
  @scala.inline
  def ɵSWITCHTEMPLATEREFFACTORYPOSTR3[T](): typings.angularCore.mod.TemplateRef[T] | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275SWITCH_TEMPLATE_REF_FACTORY__POST_R3__")().asInstanceOf[typings.angularCore.mod.TemplateRef[T] | scala.Null]
  
  @scala.inline
  def ɵSWITCHVIEWCONTAINERREFFACTORYPOSTR3: js.Function0[typings.angularCore.mod.ViewContainerRef] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_VIEW_CONTAINER_REF_FACTORY__POST_R3__").asInstanceOf[js.Function0[typings.angularCore.mod.ViewContainerRef]]
  
  type ɵSafeHtml = typings.angularCore.mod.ɵSafeValue
  
  type ɵSafeResourceUrl = typings.angularCore.mod.ɵSafeValue
  
  type ɵSafeScript = typings.angularCore.mod.ɵSafeValue
  
  type ɵSafeStyle = typings.angularCore.mod.ɵSafeValue
  
  type ɵSafeUrl = typings.angularCore.mod.ɵSafeValue
  
  @scala.inline
  def ɵSanitizeHtml(defaultDoc: js.Any, unsafeHtmlInput: java.lang.String): java.lang.String = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275_sanitizeHtml")(defaultDoc.asInstanceOf[js.Any], unsafeHtmlInput.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵSanitizeUrl(url: java.lang.String): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275_sanitizeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  type ɵSetterFn = js.Function2[/* obj */ js.Any, /* value */ js.Any, scala.Unit]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow(value: js.Any, `type`: typings.angularCore.mod.ɵBypassType): scala.Boolean = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_HTML(value: js.Any, `type`: typings.angularCore.angularCoreStrings.HTML): /* is @angular/core.@angular/core.ɵSafeHtml */ scala.Boolean = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeHtml */ scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_ResourceURL(value: js.Any, `type`: typings.angularCore.angularCoreStrings.ResourceURL): /* is @angular/core.@angular/core.ɵSafeResourceUrl */ scala.Boolean = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeResourceUrl */ scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_Script(value: js.Any, `type`: typings.angularCore.angularCoreStrings.Script): /* is @angular/core.@angular/core.ɵSafeScript */ scala.Boolean = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeScript */ scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_Style(value: js.Any, `type`: typings.angularCore.angularCoreStrings.Style): /* is @angular/core.@angular/core.ɵSafeStyle */ scala.Boolean = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeStyle */ scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_URL(value: js.Any, `type`: typings.angularCore.angularCoreStrings.URL): /* is @angular/core.@angular/core.ɵSafeUrl */ scala.Boolean = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeUrl */ scala.Boolean]
  
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[scala.Double | java.lang.String, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: js.UndefOr[scala.Nothing],
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: typings.angularCore.mod.ElementHandleEventFn
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: typings.angularCore.mod.ElementHandleEventFn,
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[scala.Double | java.lang.String, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: js.UndefOr[scala.Nothing],
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: typings.angularCore.mod.ElementHandleEventFn
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: typings.angularCore.mod.ElementHandleEventFn,
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: js.UndefOr[scala.Nothing],
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: typings.angularCore.mod.ElementHandleEventFn
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: typings.angularCore.mod.ElementHandleEventFn,
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: js.UndefOr[scala.Nothing],
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: typings.angularCore.mod.ElementHandleEventFn
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: typings.angularCore.mod.ElementHandleEventFn,
    templateFactory: typings.angularCore.mod.ViewDefinitionFactory
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵangularPackagesCoreCoreA(fn: js.Any): scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_a")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵangularPackagesCoreCoreB[T](token: typings.angularCore.mod.InjectionToken[T]): T | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵangularPackagesCoreCoreB[T](token: typings.angularCore.mod.InjectionToken[T], flags: typings.angularCore.mod.InjectFlags): T | scala.Null = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵangularPackagesCoreCoreB[T](token: typings.angularCore.mod.Type[T]): T | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵangularPackagesCoreCoreB[T](token: typings.angularCore.mod.Type[T], flags: typings.angularCore.mod.InjectFlags): T | scala.Null = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreB_T_T[T](token: typings.angularCore.mod.InjectionToken[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵangularPackagesCoreCoreB_T_T[T](token: typings.angularCore.mod.Type[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBb[T](definition: typings.angularCore.mod.ɵDirectiveDef[T]): js.ThisFunction0[/* this */ typings.angularCore.mod.OnChanges, scala.Unit] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bb")(definition.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction0[/* this */ typings.angularCore.mod.OnChanges, scala.Unit]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBc: typings.angularCore.mod.InjectionToken[js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_core_core_bc").asInstanceOf[typings.angularCore.mod.InjectionToken[js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBd(tNode: typings.angularCore.mod.TNode, attrNameToInject: java.lang.String): java.lang.String | scala.Null = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bd")(tNode.asInstanceOf[js.Any], attrNameToInject.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBe(): typings.angularCore.mod.ɵangularPackagesCoreCoreBv = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_be")().asInstanceOf[typings.angularCore.mod.ɵangularPackagesCoreCoreBv]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBf(): scala.Double = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bf")().asInstanceOf[scala.Double]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBg[T](level: scala.Double): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bg")(level.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBi(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function1[/* v */ js.Any, _],
    exp: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bi")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBi(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function1[/* v */ js.Any, _],
    exp: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bi")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBj(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bj")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBj(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bj")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBk(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bk")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBk(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bk")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBl(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bl")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBl(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bl")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBm(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function1[/* repeated */ js.Any, _],
    exps: js.Array[_]
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bm")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBm(
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function1[/* repeated */ js.Any, _],
    exps: js.Array[_],
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bm")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBn(tag: java.lang.String, prop: java.lang.String): js.Function1[/* unsafeResourceUrl */ js.Any, java.lang.String] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bn")(tag.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* unsafeResourceUrl */ js.Any, java.lang.String]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBo(name: java.lang.String): js.Any = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBo(name: java.lang.String, props: js.UndefOr[scala.Nothing], parentClass: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bo")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBo(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bo")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBo(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bo")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBp(name: java.lang.String): js.Any = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(name: java.lang.String, props: js.UndefOr[scala.Nothing], parentClass: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.Any,
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBq[T](objWithPropertyToExtract: T): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bq")(objWithPropertyToExtract.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBs(): js.UndefOr[
    js.Function2[
      /* token */ typings.angularCore.mod.Type[_] | typings.angularCore.mod.InjectionToken[_], 
      /* flags */ js.UndefOr[typings.angularCore.mod.InjectFlags], 
      _ | scala.Null
    ]
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bs")().asInstanceOf[js.UndefOr[
    js.Function2[
      /* token */ typings.angularCore.mod.Type[_] | typings.angularCore.mod.InjectionToken[_], 
      /* flags */ js.UndefOr[typings.angularCore.mod.InjectFlags], 
      _ | scala.Null
    ]
  ]]
  
  type ɵangularPackagesCoreCoreBt = typings.angularCore.angularCoreNumbers.`-1`
  
  @scala.inline
  def ɵangularPackagesCoreCoreBu(tNode: typings.angularCore.mod.TNode, lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv): typings.angularCore.mod.RNode = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bu")(tNode.asInstanceOf[js.Any], lView.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.RNode]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBw(viewOrComponent: js.Object): typings.angularCore.mod.RootContext = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bw")(viewOrComponent.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.RootContext]
  @scala.inline
  def ɵangularPackagesCoreCoreBw(viewOrComponent: typings.angularCore.mod.ɵangularPackagesCoreCoreBv): typings.angularCore.mod.RootContext = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bw")(viewOrComponent.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.RootContext]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBx(message: java.lang.String): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bx")(message.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def ɵangularPackagesCoreCoreBx(
    message: java.lang.String,
    replacements: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): java.lang.String = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bx")(message.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBy(html: java.lang.String): typings.angularCore.mod.TrustedHTML | java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_by")(html.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.TrustedHTML | java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBz(url: java.lang.String): typings.angularCore.mod.TrustedScriptURL | java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bz")(url.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.TrustedScriptURL | java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreCa(script: java.lang.String): typings.angularCore.mod.TrustedScript | java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_ca")(script.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.TrustedScript | java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreE(providers: js.Array[typings.angularCore.mod.Provider]): js.Array[typings.angularCore.mod.ResolvedReflectiveProvider] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_e")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.angularCore.mod.ResolvedReflectiveProvider]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreF(): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_f")().asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreG(): typings.angularCore.mod.Renderer2 = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_g")().asInstanceOf[typings.angularCore.mod.Renderer2]
  
  @scala.inline
  def ɵangularPackagesCoreCoreH(): typings.angularCore.mod.ElementRef[_] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_h")().asInstanceOf[typings.angularCore.mod.ElementRef[_]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreI(tNode: typings.angularCore.mod.TNode, lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv): typings.angularCore.mod.ElementRef[_] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_i")(tNode.asInstanceOf[js.Any], lView.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.ElementRef[_]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreJ(id: java.lang.String): typings.angularCore.mod.NgModuleFactory[_] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_j")(id.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.NgModuleFactory[_]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreK[T](): typings.angularCore.mod.TemplateRef[T] | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_k")().asInstanceOf[typings.angularCore.mod.TemplateRef[T] | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreL[T](
    hostTNode: typings.angularCore.mod.TNode,
    hostLView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv
  ): typings.angularCore.mod.TemplateRef[T] | scala.Null = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_l")(hostTNode.asInstanceOf[js.Any], hostLView.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.TemplateRef[T] | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreM(): typings.angularCore.mod.ViewContainerRef = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_m")().asInstanceOf[typings.angularCore.mod.ViewContainerRef]
  
  @scala.inline
  def ɵangularPackagesCoreCoreP(nativeNode: js.Any): typings.angularCore.mod.DebugNode | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_p")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.DebugNode | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreQ(): typings.angularCore.mod.ChangeDetectorRef = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_q")().asInstanceOf[typings.angularCore.mod.ChangeDetectorRef]
  @scala.inline
  def ɵangularPackagesCoreCoreQ(isPipe: scala.Boolean): typings.angularCore.mod.ChangeDetectorRef = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_q")(isPipe.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ChangeDetectorRef]
  
  @scala.inline
  def ɵangularPackagesCoreCoreT(): typings.angularCore.mod.IterableDiffers = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_t")().asInstanceOf[typings.angularCore.mod.IterableDiffers]
  
  @scala.inline
  def ɵangularPackagesCoreCoreU(): typings.angularCore.mod.KeyValueDiffers = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_u")().asInstanceOf[typings.angularCore.mod.KeyValueDiffers]
  
  @scala.inline
  def ɵangularPackagesCoreCoreV(): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_v")().asInstanceOf[java.lang.String]
  @scala.inline
  def ɵangularPackagesCoreCoreV(locale: java.lang.String): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_v")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreW: js.Array[typings.angularCore.mod.StaticProvider] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_core_core_w").asInstanceOf[js.Array[typings.angularCore.mod.StaticProvider]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreX(ngZone: typings.angularCore.mod.NgZone): js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_x")(ngZone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreY: /* "USD" */ java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_core_core_y").asInstanceOf[/* "USD" */ java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.UndefOr[scala.Nothing],
    outputs: js.Array[typings.angularCore.mod.OutputDef]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.Array[typings.angularCore.mod.BindingDef]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.Array[typings.angularCore.mod.BindingDef],
    outputs: js.Array[typings.angularCore.mod.OutputDef]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.UndefOr[scala.Nothing],
    outputs: js.Array[typings.angularCore.mod.OutputDef]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.Array[typings.angularCore.mod.BindingDef]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.Array[typings.angularCore.mod.BindingDef],
    outputs: js.Array[typings.angularCore.mod.OutputDef]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵbypassSanitizationTrustHtml(trustedHtml: java.lang.String): typings.angularCore.mod.ɵSafeHtml = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustHtml")(trustedHtml.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ɵSafeHtml]
  
  @scala.inline
  def ɵbypassSanitizationTrustResourceUrl(trustedResourceUrl: java.lang.String): typings.angularCore.mod.ɵSafeResourceUrl = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustResourceUrl")(trustedResourceUrl.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ɵSafeResourceUrl]
  
  @scala.inline
  def ɵbypassSanitizationTrustScript(trustedScript: java.lang.String): typings.angularCore.mod.ɵSafeScript = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustScript")(trustedScript.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ɵSafeScript]
  
  @scala.inline
  def ɵbypassSanitizationTrustStyle(trustedStyle: java.lang.String): typings.angularCore.mod.ɵSafeStyle = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustStyle")(trustedStyle.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ɵSafeStyle]
  
  @scala.inline
  def ɵbypassSanitizationTrustUrl(trustedUrl: java.lang.String): typings.angularCore.mod.ɵSafeUrl = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustUrl")(trustedUrl.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ɵSafeUrl]
  
  @scala.inline
  def ɵccf(
    selector: java.lang.String,
    componentType: typings.angularCore.mod.Type[_],
    viewDefFactory: typings.angularCore.mod.ViewDefinitionFactory,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ngContentSelectors: js.Array[java.lang.String]
  ): typings.angularCore.mod.ComponentFactory[_] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ccf")(selector.asInstanceOf[js.Any], componentType.asInstanceOf[js.Any], viewDefFactory.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], ngContentSelectors.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.ComponentFactory[_]]
  @scala.inline
  def ɵccf(
    selector: java.lang.String,
    componentType: typings.angularCore.mod.Type[_],
    viewDefFactory: typings.angularCore.mod.ViewDefinitionFactory,
    inputs: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ngContentSelectors: js.Array[java.lang.String]
  ): typings.angularCore.mod.ComponentFactory[_] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ccf")(selector.asInstanceOf[js.Any], componentType.asInstanceOf[js.Any], viewDefFactory.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], ngContentSelectors.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.ComponentFactory[_]]
  
  @scala.inline
  def ɵclearOverrides(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275clearOverrides")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵclearResolutionOfComponentResourcesQueue(): typings.std.Map[typings.angularCore.mod.Type[_], typings.angularCore.mod.Component] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275clearResolutionOfComponentResourcesQueue")().asInstanceOf[typings.std.Map[typings.angularCore.mod.Type[_], typings.angularCore.mod.Component]]
  
  @scala.inline
  def ɵcmf(
    ngModuleType: typings.angularCore.mod.Type[_],
    bootstrapComponents: js.Array[typings.angularCore.mod.Type[_]],
    defFactory: typings.angularCore.mod.NgModuleDefinitionFactory
  ): typings.angularCore.mod.NgModuleFactory[_] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275cmf")(ngModuleType.asInstanceOf[js.Any], bootstrapComponents.asInstanceOf[js.Any], defFactory.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NgModuleFactory[_]]
  
  @scala.inline
  def ɵcompileComponent(`type`: typings.angularCore.mod.Type[_], metadata: typings.angularCore.mod.Component): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileComponent")(`type`.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcompileDirective(`type`: typings.angularCore.mod.Type[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileDirective")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵcompileDirective(`type`: typings.angularCore.mod.Type[_], directive: typings.angularCore.mod.Directive): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileDirective")(`type`.asInstanceOf[js.Any], directive.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcompileNgModule(moduleType: typings.angularCore.mod.Type[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModule")(moduleType.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵcompileNgModule(moduleType: typings.angularCore.mod.Type[_], ngModule: typings.angularCore.mod.NgModule): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModule")(moduleType.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcompileNgModuleDefs(moduleType: typings.angularCore.mod.ɵNgModuleType[_], ngModule: typings.angularCore.mod.NgModule): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModuleDefs")(moduleType.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵcompileNgModuleDefs(
    moduleType: typings.angularCore.mod.ɵNgModuleType[_],
    ngModule: typings.angularCore.mod.NgModule,
    allowDuplicateDeclarationsInRoot: scala.Boolean
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModuleDefs")(moduleType.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any], allowDuplicateDeclarationsInRoot.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcompileNgModuleFactoryPOSTR3[M](
    injector: typings.angularCore.mod.Injector,
    options: typings.angularCore.mod.CompilerOptions,
    moduleType: typings.angularCore.mod.Type[M]
  ): js.Promise[typings.angularCore.mod.NgModuleFactory[M]] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModuleFactory__POST_R3__")(injector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], moduleType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.angularCore.mod.NgModuleFactory[M]]]
  
  @scala.inline
  def ɵcompilePipe(`type`: typings.angularCore.mod.Type[_], meta: typings.angularCore.mod.Pipe): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compilePipe")(`type`.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcreateInjector(defType: js.Any): typings.angularCore.mod.Injector = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: js.UndefOr[scala.Nothing],
    additionalProviders: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: js.UndefOr[scala.Nothing],
    additionalProviders: js.Array[typings.angularCore.mod.StaticProvider]
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: js.UndefOr[scala.Nothing],
    additionalProviders: js.Array[typings.angularCore.mod.StaticProvider],
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: js.UndefOr[scala.Nothing],
    additionalProviders: scala.Null,
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.Array[typings.angularCore.mod.StaticProvider]
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.Array[typings.angularCore.mod.StaticProvider],
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(defType: js.Any, parent: scala.Null, additionalProviders: scala.Null, name: java.lang.String): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(defType: js.Any, parent: typings.angularCore.mod.Injector): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: typings.angularCore.mod.Injector,
    additionalProviders: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: typings.angularCore.mod.Injector,
    additionalProviders: js.Array[typings.angularCore.mod.StaticProvider]
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: typings.angularCore.mod.Injector,
    additionalProviders: js.Array[typings.angularCore.mod.StaticProvider],
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: typings.angularCore.mod.Injector,
    additionalProviders: scala.Null,
    name: java.lang.String
  ): typings.angularCore.mod.Injector = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.Injector]
  
  @scala.inline
  def ɵcrt(values: typings.angularCore.anon.Data): typings.angularCore.mod.RendererType2 = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275crt")(values.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.RendererType2]
  
  @scala.inline
  def ɵdefaultIterableDiffers: typings.angularCore.mod.IterableDiffers = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275defaultIterableDiffers").asInstanceOf[typings.angularCore.mod.IterableDiffers]
  
  @scala.inline
  def ɵdefaultKeyValueDiffers: typings.angularCore.mod.KeyValueDiffers = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275defaultKeyValueDiffers").asInstanceOf[typings.angularCore.mod.KeyValueDiffers]
  
  @scala.inline
  def ɵdetectChanges(component: js.Object): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275detectChanges")(component.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵdevModeEqual(a: js.Any, b: js.Any): scala.Boolean = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275devModeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[scala.Double | java.lang.String, typings.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[typings.angularCore.mod.ɵDepFlags, _])]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    props: js.UndefOr[scala.Nothing],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[scala.Double | java.lang.String, typings.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[typings.angularCore.mod.ɵDepFlags, _])],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    props: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[typings.angularCore.mod.ɵDepFlags, _])]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    props: js.UndefOr[scala.Nothing],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[typings.angularCore.mod.ɵDepFlags, _])],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _],
    props: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵeld(
    checkIndex: scala.Double,
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null | (js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ]),
    ngContentIndex: scala.Null | scala.Double,
    childCount: scala.Double,
    namespaceAndName: java.lang.String | scala.Null,
    fixedAttrs: js.UndefOr[scala.Null | (js.Array[js.Tuple2[java.lang.String, java.lang.String]])],
    bindings: js.UndefOr[
      scala.Null | (js.Array[
        js.Tuple3[
          typings.angularCore.mod.ɵBindingFlags, 
          java.lang.String, 
          java.lang.String | typings.angularCore.mod.SecurityContext | scala.Null
        ]
      ])
    ],
    outputs: js.UndefOr[scala.Null | (js.Array[js.Tuple2[java.lang.String, java.lang.String]])],
    handleEvent: js.UndefOr[scala.Null | typings.angularCore.mod.ElementHandleEventFn],
    componentView: js.UndefOr[scala.Null | typings.angularCore.mod.ViewDefinitionFactory],
    componentRendererType: js.UndefOr[typings.angularCore.mod.RendererType2 | scala.Null]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275eld")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], namespaceAndName.asInstanceOf[js.Any], fixedAttrs.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], componentView.asInstanceOf[js.Any], componentRendererType.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵfindLocaleData(locale: java.lang.String): js.Any = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275findLocaleData")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵflushModuleScopingQueueAsMuchAsPossible(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275flushModuleScopingQueueAsMuchAsPossible")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵgetComponentViewDefinitionFactory(componentFactory: typings.angularCore.mod.ComponentFactory[_]): typings.angularCore.mod.ViewDefinitionFactory = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getComponentViewDefinitionFactory")(componentFactory.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ViewDefinitionFactory]
  
  @scala.inline
  def ɵgetDebugNodePOSTR3(nativeNode: scala.Null): scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDebugNode__POST_R3__")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[scala.Null]
  @scala.inline
  def ɵgetDebugNodePOSTR3(nativeNode: typings.std.Element): typings.angularCore.mod.DebugElementPOSTR3 = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDebugNode__POST_R3__")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.DebugElementPOSTR3]
  @scala.inline
  def ɵgetDebugNodePOSTR3(nativeNode: typings.std.Node): typings.angularCore.mod.DebugNodePOSTR3 = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDebugNode__POST_R3__")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.DebugNodePOSTR3]
  
  @scala.inline
  def ɵgetDebugNodeR2(nativeNode: js.Any): typings.angularCore.mod.DebugNode | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDebugNodeR2")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.DebugNode | scala.Null]
  
  @scala.inline
  def ɵgetDirectives(element: typings.std.Element): js.Array[js.Object] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDirectives")(element.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  
  @scala.inline
  def ɵgetHostElement(componentOrDirective: js.Object): typings.std.Element = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getHostElement")(componentOrDirective.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]
  
  @scala.inline
  def ɵgetInjectableDef[T](`type`: js.Any): typings.angularCore.mod.ɵɵInjectableDef[T] | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getInjectableDef")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ɵɵInjectableDef[T] | scala.Null]
  
  @scala.inline
  def ɵgetLContext(target: js.Any): typings.angularCore.mod.ɵLContext | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getLContext")(target.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ɵLContext | scala.Null]
  
  @scala.inline
  def ɵgetLocaleCurrencyCode(locale: java.lang.String): java.lang.String | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getLocaleCurrencyCode")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def ɵgetLocalePluralCase(locale: java.lang.String): js.Function1[/* value */ scala.Double, scala.Double] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getLocalePluralCase")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ scala.Double, scala.Double]]
  
  @scala.inline
  def ɵgetModuleFactoryPOSTR3(id: java.lang.String): typings.angularCore.mod.NgModuleFactory[_] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getModuleFactory__POST_R3__")(id.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.NgModuleFactory[_]]
  
  @scala.inline
  def ɵgetSanitizationBypassType(value: js.Any): typings.angularCore.mod.ɵBypassType | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getSanitizationBypassType")(value.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ɵBypassType | scala.Null]
  
  @scala.inline
  def ɵglobal: js.Any = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275global").asInstanceOf[js.Any]
  
  @scala.inline
  def ɵinitServicesIfNeeded(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275initServicesIfNeeded")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵinlineInterpolate(
    valueCount: scala.Double,
    c0: java.lang.String,
    a1: js.Any,
    c1: java.lang.String,
    a2: js.UndefOr[js.Any],
    c2: js.UndefOr[java.lang.String],
    a3: js.UndefOr[js.Any],
    c3: js.UndefOr[java.lang.String],
    a4: js.UndefOr[js.Any],
    c4: js.UndefOr[java.lang.String],
    a5: js.UndefOr[js.Any],
    c5: js.UndefOr[java.lang.String],
    a6: js.UndefOr[js.Any],
    c6: js.UndefOr[java.lang.String],
    a7: js.UndefOr[js.Any],
    c7: js.UndefOr[java.lang.String],
    a8: js.UndefOr[js.Any],
    c8: js.UndefOr[java.lang.String],
    a9: js.UndefOr[js.Any],
    c9: js.UndefOr[java.lang.String]
  ): java.lang.String = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275inlineInterpolate")(valueCount.asInstanceOf[js.Any], c0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], c1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], c2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], c3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], c4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], c5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], c6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any], c7.asInstanceOf[js.Any], a8.asInstanceOf[js.Any], c8.asInstanceOf[js.Any], a9.asInstanceOf[js.Any], c9.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵinterpolate(valueCount: scala.Double, constAndInterp: js.Array[java.lang.String]): java.lang.String = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275interpolate")(valueCount.asInstanceOf[js.Any], constAndInterp.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵisBoundToModulePOSTR3[C](cf: typings.angularCore.mod.ComponentFactory[C]): scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isBoundToModule__POST_R3__")(cf.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵisDefaultChangeDetectionStrategy(changeDetectionStrategy: typings.angularCore.mod.ChangeDetectionStrategy): scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isDefaultChangeDetectionStrategy")(changeDetectionStrategy.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵisListLikeIterable(obj: js.Any): scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isListLikeIterable")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵisObservable(obj: js.Any): /* is rxjs.rxjs.Observable<any> */ scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs.Observable<any> */ scala.Boolean]
  @scala.inline
  def ɵisObservable(obj: typings.rxjs.mod.Observable_[_]): /* is rxjs.rxjs.Observable<any> */ scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs.Observable<any> */ scala.Boolean]
  
  @scala.inline
  def ɵisPromise[T](obj: js.Any): /* is std.Promise<T> */ scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ scala.Boolean]
  
  @scala.inline
  def ɵivyEnabled: /* false */ scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ivyEnabled").asInstanceOf[/* false */ scala.Boolean]
  
  @scala.inline
  def ɵmakeDecorator[T](name: java.lang.String): typings.angularCore.anon.Call = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.UndefOr[scala.Nothing],
    typeFn: js.Function2[/* type */ typings.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function1[/* type */ typings.angularCore.mod.Type[T], scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function1[/* type */ typings.angularCore.mod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ typings.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](name: java.lang.String, props: js.UndefOr[scala.Nothing], parentClass: js.Any): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.Any,
    additionalProcessing: js.UndefOr[scala.Nothing],
    typeFn: js.Function2[/* type */ typings.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typings.angularCore.mod.Type[T], scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typings.angularCore.mod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ typings.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.UndefOr[scala.Nothing],
    typeFn: js.Function2[/* type */ typings.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function1[/* type */ typings.angularCore.mod.Type[T], scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function1[/* type */ typings.angularCore.mod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ typings.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.UndefOr[scala.Nothing],
    typeFn: js.Function2[/* type */ typings.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typings.angularCore.mod.Type[T], scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typings.angularCore.mod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ typings.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typings.angularCore.anon.Call = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Call]
  
  @scala.inline
  def ɵmarkDirty(component: js.Object): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275markDirty")(component.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵmod(providers: js.Array[typings.angularCore.mod.NgModuleProviderDef]): typings.angularCore.mod.NgModuleDefinition = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275mod")(providers.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.NgModuleDefinition]
  
  @scala.inline
  def ɵmpd(
    flags: typings.angularCore.mod.ɵNodeFlags,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _]
  ): typings.angularCore.mod.NgModuleProviderDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275mpd")(flags.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NgModuleProviderDef]
  
  @scala.inline
  def ɵncd(ngContentIndex: scala.Double, index: scala.Double): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ncd")(ngContentIndex.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵncd(ngContentIndex: scala.Null, index: scala.Double): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ncd")(ngContentIndex.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵnoSideEffects[T](fn: js.Function0[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275noSideEffects")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵnov(view: typings.angularCore.mod.ViewData, index: scala.Double): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275nov")(view.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵoverrideComponentView(
    comp: typings.angularCore.mod.Type[_],
    componentFactory: typings.angularCore.mod.ComponentFactory[_]
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275overrideComponentView")(comp.asInstanceOf[js.Any], componentFactory.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵoverrideProvider(`override`: typings.angularCore.mod.ProviderOverride): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275overrideProvider")(`override`.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵpad(checkIndex: scala.Double, argCount: scala.Double): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275pad")(checkIndex.asInstanceOf[js.Any], argCount.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵpatchComponentDefWithScope[C](
    componentDef: typings.angularCore.mod.ɵComponentDef[C],
    transitiveScopes: typings.angularCore.mod.ɵNgModuleTransitiveScopes
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275patchComponentDefWithScope")(componentDef.asInstanceOf[js.Any], transitiveScopes.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵpid(
    flags: typings.angularCore.mod.ɵNodeFlags,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275pid")(flags.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵpod(checkIndex: scala.Double, propToIndex: org.scalablytyped.runtime.StringDictionary[scala.Double]): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275pod")(checkIndex.asInstanceOf[js.Any], propToIndex.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵppd(checkIndex: scala.Double, argCount: scala.Double): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ppd")(checkIndex.asInstanceOf[js.Any], argCount.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵprd(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typings.angularCore.mod.ɵQueryValueType]
    ],
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275prd")(flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵprd(
    flags: typings.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typings.angularCore.mod.ɵDepFlags, _]) | _]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275prd")(flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵpublishDefaultGlobalUtils(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275publishDefaultGlobalUtils")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵpublishGlobalUtil(name: java.lang.String, fn: js.Function): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275publishGlobalUtil")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵqud(
    flags: typings.angularCore.mod.ɵNodeFlags,
    id: scala.Double,
    bindings: org.scalablytyped.runtime.StringDictionary[typings.angularCore.mod.ɵQueryBindingType]
  ): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275qud")(flags.asInstanceOf[js.Any], id.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵregisterLocaleData(data: js.Any): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: js.UndefOr[scala.Nothing], extraData: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: java.lang.String): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: java.lang.String, extraData: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵregisterModuleFactory(id: java.lang.String, factory: typings.angularCore.mod.NgModuleFactory[_]): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerModuleFactory")(id.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵregisterNgModuleType(ngModuleType: typings.angularCore.mod.ɵNgModuleType[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerNgModuleType")(ngModuleType.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵrenderComponent[T](componentType: typings.angularCore.mod.Type[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275renderComponent")(componentType.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵrenderComponent[T](
    componentType: typings.angularCore.mod.Type[T],
    opts: typings.angularCore.mod.CreateComponentOptions
  ): T = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275renderComponent")(componentType.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def ɵrenderComponent[T](componentType: typings.angularCore.mod.ɵComponentType[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275renderComponent")(componentType.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵrenderComponent[T](
    componentType: typings.angularCore.mod.ɵComponentType[T],
    opts: typings.angularCore.mod.CreateComponentOptions
  ): T = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275renderComponent")(componentType.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def ɵresetCompiledComponents(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275resetCompiledComponents")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵresetJitOptions(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275resetJitOptions")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵresolveComponentResources(
    resourceResolver: js.Function1[
      /* url */ java.lang.String, 
      js.Promise[java.lang.String | typings.angularCore.anon.Text]
    ]
  ): js.Promise[scala.Unit] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275resolveComponentResources")(resourceResolver.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def ɵsetClassMetadata(`type`: typings.angularCore.mod.Type[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(`type`: typings.angularCore.mod.Type[_], decorators: js.Array[_]): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typings.angularCore.mod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]]
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typings.angularCore.mod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typings.angularCore.mod.Type[_],
    decorators: js.Array[_],
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typings.angularCore.mod.Type[_],
    decorators: scala.Null,
    ctorParameters: js.Function0[js.Array[_]]
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typings.angularCore.mod.Type[_],
    decorators: scala.Null,
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typings.angularCore.mod.Type[_],
    decorators: scala.Null,
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵsetCurrentInjector(): js.UndefOr[typings.angularCore.mod.Injector | scala.Null] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setCurrentInjector")().asInstanceOf[js.UndefOr[typings.angularCore.mod.Injector | scala.Null]]
  @scala.inline
  def ɵsetCurrentInjector(injector: typings.angularCore.mod.Injector): js.UndefOr[typings.angularCore.mod.Injector | scala.Null] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setCurrentInjector")(injector.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.angularCore.mod.Injector | scala.Null]]
  
  @scala.inline
  def ɵsetDocument(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setDocument")().asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetDocument(document: typings.std.Document): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setDocument")(document.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵsetLocaleId(localeId: java.lang.String): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setLocaleId")(localeId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵstore[T](
    tView: typings.angularCore.mod.TView,
    lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv,
    index: scala.Double,
    value: T
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275store")(tView.asInstanceOf[js.Any], lView.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵstringify(token: js.Any): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275stringify")(token.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵted(checkIndex: scala.Double, ngContentIndex: scala.Double, staticText: js.Array[java.lang.String]): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ted")(checkIndex.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], staticText.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  @scala.inline
  def ɵted(checkIndex: scala.Double, ngContentIndex: scala.Null, staticText: js.Array[java.lang.String]): typings.angularCore.mod.NodeDef = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ted")(checkIndex.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], staticText.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵtransitiveScopesFor[T](moduleType: typings.angularCore.mod.Type[T]): typings.angularCore.mod.ɵNgModuleTransitiveScopes = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275transitiveScopesFor")(moduleType.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ɵNgModuleTransitiveScopes]
  
  @scala.inline
  def ɵunregisterLocaleData(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unregisterLocaleData")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵunv(
    view: typings.angularCore.mod.ViewData,
    nodeIdx: scala.Double,
    bindingIdx: scala.Double,
    value: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unv")(view.asInstanceOf[js.Any], nodeIdx.asInstanceOf[js.Any], bindingIdx.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵunwrapSafeValue(value: typings.angularCore.mod.ɵSafeValue): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unwrapSafeValue")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def ɵunwrapSafeValue[T](value: T): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unwrapSafeValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵvid(flags: typings.angularCore.mod.ɵViewFlags, nodes: js.Array[typings.angularCore.mod.NodeDef]): typings.angularCore.mod.ɵViewDefinition = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.ɵViewDefinition]
  @scala.inline
  def ɵvid(
    flags: typings.angularCore.mod.ɵViewFlags,
    nodes: js.Array[typings.angularCore.mod.NodeDef],
    updateDirectives: js.UndefOr[scala.Nothing],
    updateRenderer: typings.angularCore.mod.ViewUpdateFn
  ): typings.angularCore.mod.ɵViewDefinition = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], updateDirectives.asInstanceOf[js.Any], updateRenderer.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.ɵViewDefinition]
  @scala.inline
  def ɵvid(
    flags: typings.angularCore.mod.ɵViewFlags,
    nodes: js.Array[typings.angularCore.mod.NodeDef],
    updateDirectives: scala.Null,
    updateRenderer: typings.angularCore.mod.ViewUpdateFn
  ): typings.angularCore.mod.ɵViewDefinition = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], updateDirectives.asInstanceOf[js.Any], updateRenderer.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.ɵViewDefinition]
  @scala.inline
  def ɵvid(
    flags: typings.angularCore.mod.ɵViewFlags,
    nodes: js.Array[typings.angularCore.mod.NodeDef],
    updateDirectives: typings.angularCore.mod.ViewUpdateFn
  ): typings.angularCore.mod.ɵViewDefinition = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], updateDirectives.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.ɵViewDefinition]
  @scala.inline
  def ɵvid(
    flags: typings.angularCore.mod.ɵViewFlags,
    nodes: js.Array[typings.angularCore.mod.NodeDef],
    updateDirectives: typings.angularCore.mod.ViewUpdateFn,
    updateRenderer: typings.angularCore.mod.ViewUpdateFn
  ): typings.angularCore.mod.ɵViewDefinition = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], updateDirectives.asInstanceOf[js.Any], updateRenderer.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.ɵViewDefinition]
  
  @scala.inline
  def ɵwhenRendered(component: js.Any): js.Promise[scala.Null] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275whenRendered")(component.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Null]]
  
  type ɵɵComponentDefWithMeta[T, Selector /* <: java.lang.String */, ExportAs /* <: js.Array[java.lang.String] */, InputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, OutputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, QueryFields /* <: js.Array[java.lang.String] */, NgContentSelectors /* <: js.Array[java.lang.String] */] = typings.angularCore.mod.ɵComponentDef[T]
  
  @scala.inline
  def ɵɵCopyDefinitionFeature(definition: typings.angularCore.mod.ɵComponentDef[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275CopyDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵCopyDefinitionFeature(definition: typings.angularCore.mod.ɵDirectiveDef[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275CopyDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  type ɵɵDirectiveDefWithMeta[T, Selector /* <: java.lang.String */, ExportAs /* <: js.Array[java.lang.String] */, InputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, OutputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, QueryFields /* <: js.Array[java.lang.String] */] = typings.angularCore.mod.ɵDirectiveDef[T]
  
  type ɵɵFactoryDef[T, CtorDependencies /* <: js.Array[typings.angularCore.mod.CtorDependency] */] = js.Function0[T]
  
  @scala.inline
  def ɵɵInheritDefinitionFeature(definition: typings.angularCore.mod.ɵComponentDef[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275InheritDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵInheritDefinitionFeature(definition: typings.angularCore.mod.ɵDirectiveDef[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275InheritDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  type ɵɵNgModuleDefWithMeta[T, Declarations, Imports, Exports] = typings.angularCore.mod.ɵNgModuleDef[T]
  
  @scala.inline
  def ɵɵNgOnChangesFeature[T](): typings.angularCore.mod.DirectiveDefFeature = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275NgOnChangesFeature")().asInstanceOf[typings.angularCore.mod.DirectiveDefFeature]
  
  type ɵɵPipeDefWithMeta[T, Name /* <: java.lang.String */] = typings.angularCore.mod.ɵPipeDef[T]
  
  @scala.inline
  def ɵɵProvidersFeature[T](providers: js.Array[typings.angularCore.mod.Provider]): js.Function1[/* definition */ typings.angularCore.mod.ɵDirectiveDef[T], scala.Unit] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ProvidersFeature")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* definition */ typings.angularCore.mod.ɵDirectiveDef[T], scala.Unit]]
  @scala.inline
  def ɵɵProvidersFeature[T](
    providers: js.Array[typings.angularCore.mod.Provider],
    viewProviders: js.Array[typings.angularCore.mod.Provider]
  ): js.Function1[/* definition */ typings.angularCore.mod.ɵDirectiveDef[T], scala.Unit] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ProvidersFeature")(providers.asInstanceOf[js.Any], viewProviders.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* definition */ typings.angularCore.mod.ɵDirectiveDef[T], scala.Unit]]
  
  @scala.inline
  def ɵɵadvance(delta: scala.Double): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275advance")(delta.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵattribute(name: java.lang.String, value: js.Any): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  @scala.inline
  def ɵɵattribute(
    name: java.lang.String,
    value: js.Any,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  @scala.inline
  def ɵɵattribute(name: java.lang.String, value: js.Any, sanitizer: scala.Null, namespace: java.lang.String): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  @scala.inline
  def ɵɵattribute(name: java.lang.String, value: js.Any, sanitizer: typings.angularCore.mod.SanitizerFn): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  @scala.inline
  def ɵɵattribute(
    name: java.lang.String,
    value: js.Any,
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate1(attrName: java.lang.String, prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate1(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate1(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate1(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate2(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String
  ): js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate2(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate2(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate2(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate3(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate3(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate3(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate3(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate4(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate4(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate4(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate4(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate5(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate5(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate5(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate5(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate6(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate6(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate6(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate6(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate7(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate7(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate7(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate7(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate8(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate8(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate8(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate8(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolateV(attrName: java.lang.String, values: js.Array[_]): js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolateV(
    attrName: java.lang.String,
    values: js.Array[_],
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolateV(attrName: java.lang.String, values: js.Array[_], sanitizer: typings.angularCore.mod.SanitizerFn): js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolateV(
    attrName: java.lang.String,
    values: js.Array[_],
    sanitizer: typings.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ]]
  
  @scala.inline
  def ɵɵclassMap(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMap")().asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵclassMap(classes: java.lang.String): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMap")(classes.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵclassMap(classes: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean | scala.Null]]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMap")(classes.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate1(prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate1")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate2(prefix: java.lang.String, v0: js.Any, i0: java.lang.String, v1: js.Any, suffix: java.lang.String): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate2")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate3(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate3")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate4(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate4")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate5(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate5")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate6(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate6")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate7(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate7")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate8(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate8")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolateV(values: js.Array[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolateV")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassProp(className: java.lang.String): js.Function2[
    /* className */ java.lang.String, 
    /* value */ js.UndefOr[scala.Boolean | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classProp")(className.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* className */ java.lang.String, 
    /* value */ js.UndefOr[scala.Boolean | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any
  ]]
  @scala.inline
  def ɵɵclassProp(className: java.lang.String, value: scala.Boolean): js.Function2[
    /* className */ java.lang.String, 
    /* value */ js.UndefOr[scala.Boolean | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classProp")(className.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* className */ java.lang.String, 
    /* value */ js.UndefOr[scala.Boolean | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any
  ]]
  
  @scala.inline
  def ɵɵcontentQuery[T](directiveIndex: scala.Double, predicate: js.Array[java.lang.String], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: typings.angularCore.mod.InjectionToken[_],
    descend: scala.Boolean
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: typings.angularCore.mod.InjectionToken[_],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](directiveIndex: scala.Double, predicate: typings.angularCore.mod.Type[_], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: typings.angularCore.mod.Type[_],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵdefineComponent[T](componentDefinition: typings.angularCore.anon.ChangeDetection[T]): scala.Nothing = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineComponent")(componentDefinition.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineDirective[T](directiveDefinition: typings.angularCore.anon.ContentQueries[T]): scala.Nothing = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineDirective")(directiveDefinition.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineInjectable[T](opts: typings.angularCore.anon.Factory[T]): scala.Nothing = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineInjectable")(opts.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineInjector(options: typings.angularCore.anon.Imports): scala.Nothing = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineInjector")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineNgModule[T](`def`: typings.angularCore.anon.Bootstrap[T]): scala.Nothing = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineNgModule")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefinePipe[T](pipeDef: typings.angularCore.anon.Pure[T]): scala.Nothing = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275definePipe")(pipeDef.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdirectiveInject[T](token: typings.angularCore.mod.InjectionToken[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵɵdirectiveInject[T](token: typings.angularCore.mod.InjectionToken[T], flags: typings.angularCore.mod.InjectFlags): T = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def ɵɵdirectiveInject[T](token: typings.angularCore.mod.Type[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵɵdirectiveInject[T](token: typings.angularCore.mod.Type[T], flags: typings.angularCore.mod.InjectFlags): T = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def ɵɵdisableBindings(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275disableBindings")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelement(index: scala.Double, name: java.lang.String): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelement(
    index: scala.Double,
    name: java.lang.String,
    attrsIndex: js.UndefOr[scala.Nothing],
    localRefsIndex: scala.Double
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelement(index: scala.Double, name: java.lang.String, attrsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelement(
    index: scala.Double,
    name: java.lang.String,
    attrsIndex: scala.Double,
    localRefsIndex: scala.Double
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelement(index: scala.Double, name: java.lang.String, attrsIndex: scala.Null, localRefsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementContainer(index: scala.Double): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainer(index: scala.Double, attrsIndex: js.UndefOr[scala.Nothing], localRefsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainer(index: scala.Double, attrsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainer(index: scala.Double, attrsIndex: scala.Double, localRefsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainer(index: scala.Double, attrsIndex: scala.Null, localRefsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementContainerEnd(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerEnd")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double, attrsIndex: js.UndefOr[scala.Nothing], localRefsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double, attrsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double, attrsIndex: scala.Double, localRefsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double, attrsIndex: scala.Null, localRefsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementEnd(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementEnd")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementStart(index: scala.Double, name: java.lang.String): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementStart(
    index: scala.Double,
    name: java.lang.String,
    attrsIndex: js.UndefOr[scala.Nothing],
    localRefsIndex: scala.Double
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementStart(index: scala.Double, name: java.lang.String, attrsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementStart(
    index: scala.Double,
    name: java.lang.String,
    attrsIndex: scala.Double,
    localRefsIndex: scala.Double
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementStart(index: scala.Double, name: java.lang.String, attrsIndex: scala.Null, localRefsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵenableBindings(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275enableBindings")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵgetCurrentView(): typings.angularCore.mod.OpaqueViewState = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275getCurrentView")().asInstanceOf[typings.angularCore.mod.OpaqueViewState]
  
  @scala.inline
  def ɵɵgetFactoryOf[T](`type`: typings.angularCore.mod.Type[_]): typings.angularCore.mod.FactoryFn[T] | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275getFactoryOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.FactoryFn[T] | scala.Null]
  
  @scala.inline
  def ɵɵgetInheritedFactory[T](`type`: typings.angularCore.mod.Type[_]): js.Function1[/* type */ typings.angularCore.mod.Type[T], T] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275getInheritedFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* type */ typings.angularCore.mod.Type[T], T]]
  
  @scala.inline
  def ɵɵhostProperty[T](propName: java.lang.String, value: T): typings.angularCore.anon.FnCall = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275hostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.FnCall]
  @scala.inline
  def ɵɵhostProperty[T](propName: java.lang.String, value: T, sanitizer: typings.angularCore.mod.SanitizerFn): typings.angularCore.anon.FnCall = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275hostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.FnCall]
  
  @scala.inline
  def ɵɵi18n(index: scala.Double, messageIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18n")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵi18n(index: scala.Double, messageIndex: scala.Double, subTemplateIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18n")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any], subTemplateIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵi18nApply(index: scala.Double): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nApply")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵi18nAttributes(index: scala.Double, attrsIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nAttributes")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵi18nEnd(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nEnd")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵi18nExp[T](value: T): typings.angularCore.anon.FnCallValue = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nExp")(value.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.anon.FnCallValue]
  
  @scala.inline
  def ɵɵi18nPostprocess(message: java.lang.String): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nPostprocess")(message.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def ɵɵi18nPostprocess(
    message: java.lang.String,
    replacements: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): java.lang.String = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nPostprocess")(message.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵi18nStart(index: scala.Double, messageIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nStart")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵi18nStart(index: scala.Double, messageIndex: scala.Double, subTemplateIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nStart")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any], subTemplateIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵinject[T](token: typings.angularCore.mod.InjectionToken[T]): T | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵɵinject[T](token: typings.angularCore.mod.InjectionToken[T], flags: typings.angularCore.mod.InjectFlags): T | scala.Null = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵɵinject[T](token: typings.angularCore.mod.Type[T]): T | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵɵinject[T](token: typings.angularCore.mod.Type[T], flags: typings.angularCore.mod.InjectFlags): T | scala.Null = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  
  @scala.inline
  def ɵɵinjectAttribute(attrNameToInject: java.lang.String): java.lang.String | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275injectAttribute")(attrNameToInject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def ɵɵinjectPipeChangeDetectorRef(): typings.angularCore.mod.ChangeDetectorRef | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275injectPipeChangeDetectorRef")().asInstanceOf[typings.angularCore.mod.ChangeDetectorRef | scala.Null]
  @scala.inline
  def ɵɵinjectPipeChangeDetectorRef(flags: typings.angularCore.mod.InjectFlags): typings.angularCore.mod.ChangeDetectorRef | scala.Null = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275injectPipeChangeDetectorRef")(flags.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.ChangeDetectorRef | scala.Null]
  
  @scala.inline
  def ɵɵinject_T_T[T](token: typings.angularCore.mod.InjectionToken[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵɵinject_T_T[T](token: typings.angularCore.mod.Type[T]): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵɵinvalidFactory(): scala.Nothing = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275invalidFactory")().asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵinvalidFactoryDep(index: scala.Double): scala.Nothing = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275invalidFactoryDep")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵlistener(eventName: java.lang.String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ]]
  @scala.inline
  def ɵɵlistener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: js.UndefOr[scala.Nothing],
    eventTargetResolver: typings.angularCore.mod.GlobalTargetResolver
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ]]
  @scala.inline
  def ɵɵlistener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ]]
  @scala.inline
  def ɵɵlistener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean,
    eventTargetResolver: typings.angularCore.mod.GlobalTargetResolver
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ]]
  
  @scala.inline
  def ɵɵloadQuery[T](): typings.angularCore.mod.QueryList[T] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275loadQuery")().asInstanceOf[typings.angularCore.mod.QueryList[T]]
  
  @scala.inline
  def ɵɵnamespaceHTML(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275namespaceHTML")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵnamespaceMathML(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275namespaceMathML")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵnamespaceSVG(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275namespaceSVG")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵnextContext[T](): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275nextContext")().asInstanceOf[T]
  @scala.inline
  def ɵɵnextContext[T](level: scala.Double): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275nextContext")(level.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵɵpipe(index: scala.Double, pipeName: java.lang.String): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipe")(index.asInstanceOf[js.Any], pipeName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBind1(index: scala.Double, slotOffset: scala.Double, v1: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind1")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBind2(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind2")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBind3(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any, v3: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind3")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBind4(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any, v3: js.Any, v4: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind4")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBindV(index: scala.Double, slotOffset: scala.Double, values: Array[js.Any]): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBindV")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵprojection(nodeIndex: scala.Double): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵprojection(
    nodeIndex: scala.Double,
    selectorIndex: js.UndefOr[scala.Nothing],
    attrs: typings.angularCore.mod.TAttributes
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any], selectorIndex.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵprojection(nodeIndex: scala.Double, selectorIndex: scala.Double): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any], selectorIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵprojection(nodeIndex: scala.Double, selectorIndex: scala.Double, attrs: typings.angularCore.mod.TAttributes): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any], selectorIndex.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵprojectionDef(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projectionDef")().asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵprojectionDef(projectionSlots: typings.angularCore.mod.ProjectionSlots): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projectionDef")(projectionSlots.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵproperty[T](propName: java.lang.String, value: T): typings.angularCore.anon.FnCallPropNameValueSanitizer = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275property")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.FnCallPropNameValueSanitizer]
  @scala.inline
  def ɵɵproperty[T](propName: java.lang.String, value: T, sanitizer: typings.angularCore.mod.SanitizerFn): typings.angularCore.anon.FnCallPropNameValueSanitizer = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275property")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.FnCallPropNameValueSanitizer]
  
  @scala.inline
  def ɵɵpropertyInterpolate(propName: java.lang.String, v0: js.Any): js.Function3[
    /* propName */ java.lang.String, 
    /* v0 */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate")(propName.asInstanceOf[js.Any], v0.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* propName */ java.lang.String, 
    /* v0 */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate(propName: java.lang.String, v0: js.Any, sanitizer: typings.angularCore.mod.SanitizerFn): js.Function3[
    /* propName */ java.lang.String, 
    /* v0 */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate")(propName.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* propName */ java.lang.String, 
    /* v0 */ js.Any, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate1(propName: java.lang.String, prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): js.Function5[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate1")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate1(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function5[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate1")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate2(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String
  ): js.Function7[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate2")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate2(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function7[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate2")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate3(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): js.Function9[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate3")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate3(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function9[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate3")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate4(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): js.Function11[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate4")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate4(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function11[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate4")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate5(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): js.Function13[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate5")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate5(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function13[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate5")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate6(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): js.Function15[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate6")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate6(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function15[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate6")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate7(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): js.Function17[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate7")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate7(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function17[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate7")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate8(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): js.Function19[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate8")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate8(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): js.Function19[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate8")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolateV(propName: java.lang.String, values: js.Array[_]): js.Function3[
    /* propName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolateV")(propName.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* propName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolateV(propName: java.lang.String, values: js.Array[_], sanitizer: typings.angularCore.mod.SanitizerFn): js.Function3[
    /* propName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolateV")(propName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* propName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typings.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpureFunction0[T](slotOffset: scala.Double, pureFn: js.Function0[T]): T = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction0")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def ɵɵpureFunction0[T](slotOffset: scala.Double, pureFn: js.Function0[T], thisArg: js.Any): T = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction0")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def ɵɵpureFunction1(slotOffset: scala.Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction1")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction1(slotOffset: scala.Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any, thisArg: js.Any): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction1")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction2(
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction2")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction2(
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction2")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction3(
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction3")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction3(
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction3")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction4(
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction4")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction4(
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction4")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction5(
    slotOffset: scala.Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction5")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction5(
    slotOffset: scala.Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction5")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction6(
    slotOffset: scala.Double,
    pureFn: js.Function6[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction6")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction6(
    slotOffset: scala.Double,
    pureFn: js.Function6[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction6")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction7(
    slotOffset: scala.Double,
    pureFn: js.Function7[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction7")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction7(
    slotOffset: scala.Double,
    pureFn: js.Function7[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction7")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction8(
    slotOffset: scala.Double,
    pureFn: js.Function8[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      /* v8 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    exp8: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction8")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any], exp8.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction8(
    slotOffset: scala.Double,
    pureFn: js.Function8[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      /* v8 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    exp8: js.Any,
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction8")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any], exp8.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunctionV(slotOffset: scala.Double, pureFn: js.Function1[/* repeated */ js.Any, _], exps: js.Array[_]): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunctionV")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunctionV(
    slotOffset: scala.Double,
    pureFn: js.Function1[/* repeated */ js.Any, _],
    exps: js.Array[_],
    thisArg: js.Any
  ): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunctionV")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵqueryRefresh(queryList: typings.angularCore.mod.QueryList[_]): scala.Boolean = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275queryRefresh")(queryList.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵɵreference[T](index: scala.Double): T = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275reference")(index.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵɵresolveBody(element: typings.angularCore.anon.RElementownerDocumentDocu): typings.angularCore.anon.Target = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resolveBody")(element.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.anon.Target]
  
  @scala.inline
  def ɵɵresolveDocument(element: typings.angularCore.anon.RElementownerDocumentDocu): typings.angularCore.anon.NameTarget = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resolveDocument")(element.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.anon.NameTarget]
  
  @scala.inline
  def ɵɵresolveWindow(element: typings.angularCore.anon.RElementownerDocumentDocu): typings.angularCore.anon.NameString = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resolveWindow")(element.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.anon.NameString]
  
  @scala.inline
  def ɵɵrestoreView(viewToRestore: typings.angularCore.mod.OpaqueViewState): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275restoreView")(viewToRestore.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵsanitizeHtml(unsafeHtml: js.Any): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeHtml")(unsafeHtml.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeResourceUrl(unsafeResourceUrl: js.Any): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeResourceUrl")(unsafeResourceUrl.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeScript(unsafeScript: js.Any): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeScript")(unsafeScript.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeStyle(unsafeStyle: js.Any): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeStyle")(unsafeStyle.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeUrl(unsafeUrl: js.Any): java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeUrl")(unsafeUrl.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeUrlOrResourceUrl(unsafeUrl: js.Any, tag: java.lang.String, prop: java.lang.String): js.Any = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeUrlOrResourceUrl")(unsafeUrl.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵsetComponentScope(
    `type`: typings.angularCore.mod.ɵComponentType[_],
    directives: js.Array[typings.angularCore.mod.Type[_]],
    pipes: js.Array[typings.angularCore.mod.Type[_]]
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275setComponentScope")(`type`.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], pipes.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵsetNgModuleScope(`type`: js.Any, scope: typings.angularCore.anon.Declarations): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275setNgModuleScope")(`type`.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstaticContentQuery[T](directiveIndex: scala.Double, predicate: js.Array[java.lang.String], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: typings.angularCore.mod.InjectionToken[_],
    descend: scala.Boolean
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: typings.angularCore.mod.InjectionToken[_],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](directiveIndex: scala.Double, predicate: typings.angularCore.mod.Type[_], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: typings.angularCore.mod.Type[_],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean, read: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: typings.angularCore.mod.InjectionToken[_], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: typings.angularCore.mod.InjectionToken[_], descend: scala.Boolean, read: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: typings.angularCore.mod.Type[_], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: typings.angularCore.mod.Type[_], descend: scala.Boolean, read: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMap(): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMap")().asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstyleMap(styles: java.lang.String): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMap")(styles.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstyleMap(styles: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMap")(styles.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate1(prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate1")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate2(prefix: java.lang.String, v0: js.Any, i0: java.lang.String, v1: js.Any, suffix: java.lang.String): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate2")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate3(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate3")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate4(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate4")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate5(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate5")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate6(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate6")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate7(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate7")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate8(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate8")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolateV(values: js.Array[_]): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolateV")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: js.UndefOr[scala.Nothing], suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: java.lang.String, suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: scala.Double): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: scala.Double, suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: scala.Null, suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: typings.angularCore.mod.ɵSafeValue): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: typings.angularCore.mod.ɵSafeValue, suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typings.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate1(prop: java.lang.String, prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): js.Function5[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate1")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate1(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function5[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate1")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate2(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String
  ): js.Function7[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate2")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate2(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function7[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate2")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate3(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): js.Function9[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate3")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate3(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function9[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate3")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate4(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): js.Function11[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate4")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate4(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function11[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate4")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate5(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): js.Function13[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate5")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate5(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function13[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate5")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate6(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): js.Function15[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate6")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate6(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function15[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate6")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate7(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): js.Function17[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate7")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate7(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function17[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate7")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate8(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): js.Function19[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate8")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate8(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function19[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate8")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolateV(prop: java.lang.String, values: js.Array[_]): js.Function3[
    /* prop */ java.lang.String, 
    /* values */ js.Array[_], 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolateV")(prop.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* values */ js.Array[_], 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolateV(prop: java.lang.String, values: js.Array[_], valueSuffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* values */ js.Array[_], 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolateV")(prop.asInstanceOf[js.Any], values.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* values */ js.Array[_], 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any
  ]]
  
  @scala.inline
  def ɵɵsyntheticHostListener(eventName: java.lang.String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostListener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ]]
  @scala.inline
  def ɵɵsyntheticHostListener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: js.UndefOr[scala.Nothing],
    eventTargetResolver: typings.angularCore.mod.GlobalTargetResolver
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostListener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ]]
  @scala.inline
  def ɵɵsyntheticHostListener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostListener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ]]
  @scala.inline
  def ɵɵsyntheticHostListener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean,
    eventTargetResolver: typings.angularCore.mod.GlobalTargetResolver
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostListener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typings.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ]]
  
  @scala.inline
  def ɵɵsyntheticHostProperty[T](propName: java.lang.String, value: T): typings.angularCore.anon.Fn0 = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Fn0]
  @scala.inline
  def ɵɵsyntheticHostProperty[T](propName: java.lang.String, value: T, sanitizer: typings.angularCore.mod.SanitizerFn): typings.angularCore.anon.Fn0 = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Fn0]
  @scala.inline
  def ɵɵsyntheticHostProperty[T](propName: java.lang.String, value: typings.angularCore.mod.ɵNOCHANGE): typings.angularCore.anon.Fn0 = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Fn0]
  @scala.inline
  def ɵɵsyntheticHostProperty[T](
    propName: java.lang.String,
    value: typings.angularCore.mod.ɵNOCHANGE,
    sanitizer: typings.angularCore.mod.SanitizerFn
  ): typings.angularCore.anon.Fn0 = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.anon.Fn0]
  
  @scala.inline
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: typings.angularCore.mod.ComponentTemplate[_] | scala.Null,
    decls: scala.Double,
    vars: scala.Double,
    tagName: js.UndefOr[java.lang.String | scala.Null],
    attrsIndex: js.UndefOr[scala.Double | scala.Null],
    localRefsIndex: js.UndefOr[scala.Double | scala.Null],
    localRefExtractor: js.UndefOr[typings.angularCore.mod.LocalRefExtractor]
  ): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275template")(index.asInstanceOf[js.Any], templateFn.asInstanceOf[js.Any], decls.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any], localRefExtractor.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵtemplateRefExtractor(tNode: typings.angularCore.mod.TNode, lView: typings.angularCore.mod.ɵangularPackagesCoreCoreBv): typings.angularCore.mod.TemplateRef[_] | scala.Null = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275templateRefExtractor")(tNode.asInstanceOf[js.Any], lView.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.mod.TemplateRef[_] | scala.Null]
  
  @scala.inline
  def ɵɵtext(index: scala.Double): scala.Unit = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275text")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵtext(index: scala.Double, value: java.lang.String): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275text")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵtextInterpolate(v0: js.Any): js.Function1[
    /* v0 */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate */ js.Any
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate")(v0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* v0 */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate1(prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): js.Function3[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate1 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate1")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate1 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate2(prefix: java.lang.String, v0: js.Any, i0: java.lang.String, v1: js.Any, suffix: java.lang.String): js.Function5[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate2 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate2")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate2 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate3(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): js.Function7[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate3 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate3")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate3 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate4(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): js.Function9[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate4 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate4")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate4 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate5(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): js.Function11[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate5 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate5")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate5 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate6(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): js.Function13[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate6 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate6")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate6 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate7(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): js.Function15[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate7 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate7")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate7 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate8(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): js.Function17[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate8 */ js.Any
  ] = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate8")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate8 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolateV(values: js.Array[_]): js.Function1[
    /* values */ js.Array[_], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolateV */ js.Any
  ] = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolateV")(values.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* values */ js.Array[_], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolateV */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtrustConstantHtml(html: java.lang.String): typings.angularCore.mod.TrustedHTML | java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275trustConstantHtml")(html.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.TrustedHTML | java.lang.String]
  
  @scala.inline
  def ɵɵtrustConstantResourceUrl(url: java.lang.String): typings.angularCore.mod.TrustedScriptURL | java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275trustConstantResourceUrl")(url.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.TrustedScriptURL | java.lang.String]
  
  @scala.inline
  def ɵɵtrustConstantScript(script: java.lang.String): typings.angularCore.mod.TrustedScript | java.lang.String = typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275trustConstantScript")(script.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.TrustedScript | java.lang.String]
  
  @scala.inline
  def ɵɵviewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean, read: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: typings.angularCore.mod.InjectionToken[_], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: typings.angularCore.mod.InjectionToken[_], descend: scala.Boolean, read: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: typings.angularCore.mod.Type[_], descend: scala.Boolean): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: typings.angularCore.mod.Type[_], descend: scala.Boolean, read: js.Any): scala.Unit = (typings.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
