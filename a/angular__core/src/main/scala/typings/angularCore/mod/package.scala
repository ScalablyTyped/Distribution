package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ComponentInstance = js.Object
  
  /**
    * Definition of what a template rendering function should look like for a component.
    */
  type ComponentTemplate[T] = js.Function2[/* rf */ typings.angularCore.mod.ɵRenderFlags, /* ctx */ T, scala.Unit]
  
  type ContentChild = typings.angularCore.mod.Query
  
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
  
  type HostBindingsFunction[T] = js.Function2[/* rf */ typings.angularCore.mod.ɵRenderFlags, /* ctx */ T, scala.Unit]
  
  /** See CreateComponentOptions.hostFeatures */
  type HostFeature = js.Function2[
    /* component */ js.Any, 
    /* componentDef */ typings.angularCore.mod.ɵComponentDef[js.Any], 
    scala.Unit
  ]
  
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
  
  type NgIterable[T] = js.Array[T] | typings.std.Iterable[T]
  
  /**
    * Function to call console.error at the right source location. This is an indirection
    * via another function as browser will log the location that actually called
    * `console.error`.
    */
  type NodeLogger = js.Function0[js.Function0[scala.Unit]]
  
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
  
  type SimpleChanges = org.scalablytyped.runtime.StringDictionary[typings.angularCore.mod.SimpleChange]
  
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
  
  type TypeProvider = typings.angularCore.mod.Type[js.Any]
  
  type ViewChild = typings.angularCore.mod.Query
  
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
  
  type viewEngineChangeDetectorRefInterface = typings.angularCore.mod.ChangeDetectorRef
  
  type ɵCssSelectorList = js.Array[typings.angularCore.mod.CssSelector]
  
  type ɵGetterFn = js.Function1[/* obj */ js.Any, js.Any]
  
  type ɵMethodFn = js.Function2[/* obj */ js.Any, /* args */ js.Array[js.Any], js.Any]
  
  type ɵSafeHtml = typings.angularCore.mod.ɵSafeValue
  
  type ɵSafeResourceUrl = typings.angularCore.mod.ɵSafeValue
  
  type ɵSafeScript = typings.angularCore.mod.ɵSafeValue
  
  type ɵSafeStyle = typings.angularCore.mod.ɵSafeValue
  
  type ɵSafeUrl = typings.angularCore.mod.ɵSafeValue
  
  type ɵSetterFn = js.Function2[/* obj */ js.Any, /* value */ js.Any, scala.Unit]
  
  type ɵangularPackagesCoreCoreBt = typings.angularCore.angularCoreNumbers.`-1`
  
  type ɵɵComponentDefWithMeta[T, Selector /* <: java.lang.String */, ExportAs /* <: js.Array[java.lang.String] */, InputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, OutputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, QueryFields /* <: js.Array[java.lang.String] */, NgContentSelectors /* <: js.Array[java.lang.String] */] = typings.angularCore.mod.ɵComponentDef[T]
  
  type ɵɵDirectiveDefWithMeta[T, Selector /* <: java.lang.String */, ExportAs /* <: js.Array[java.lang.String] */, InputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, OutputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, QueryFields /* <: js.Array[java.lang.String] */] = typings.angularCore.mod.ɵDirectiveDef[T]
  
  type ɵɵFactoryDef[T, CtorDependencies /* <: js.Array[typings.angularCore.mod.CtorDependency] */] = js.Function0[T]
  
  type ɵɵNgModuleDefWithMeta[T, Declarations, Imports, Exports] = typings.angularCore.mod.ɵNgModuleDef[T]
  
  type ɵɵPipeDefWithMeta[T, Name /* <: java.lang.String */] = typings.angularCore.mod.ɵPipeDef[T]
}
