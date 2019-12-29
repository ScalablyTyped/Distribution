package typings.atAngularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAngularCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atAngularCore.Anon_NameTargetEventTarget
  import typings.atAngularCore.atAngularCoreStrings.Asterisk
  import typings.std.Iterable

  type CollectionChangeRecord[V] = IterableChangeRecord[V]
  type ComponentInstance = js.Object
  /**
    * Definition of what a template rendering function should look like for a component.
    */
  type ComponentTemplate[T] = js.Function2[/* rf */ ɵRenderFlags, /* ctx */ T, Unit]
  type ContentChild = Query
  type ContentChildren = Query
  /**
    * Definition of what a content queries function should look like.
    */
  type ContentQueriesFunction[T] = js.Function3[/* rf */ ɵRenderFlags, /* ctx */ T, /* directiveIndex */ Double, Unit]
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
  type CssSelector = js.Array[String | SelectorFlags]
  /**
    * Factory for ViewDefinitions/NgModuleDefinitions.
    * We use a function so we can reexeute it in case an error happens and use the given logger
    * function to log the error from the definition of the node, which is shown in all browser
    * logs.
    */
  type DefinitionFactory[D /* <: Definition[_] */] = js.Function1[/* logger */ NodeLogger, D]
  type DirectiveDefList = js.Array[ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any]]
  /**
    * Type used for directiveDefs on component definition.
    *
    * The function is necessary to be able to support forward declarations.
    */
  type DirectiveDefListOrFactory = js.Function0[DirectiveDefList] | DirectiveDefList
  type DirectiveInstance = js.Object
  type DirectiveTypeList = js.Array[ɵDirectiveType[js.Any] | ɵComponentType[js.Any] | Type[js.Any]]
  type DirectiveTypesOrFactory = js.Function0[DirectiveTypeList] | DirectiveTypeList
  type DisposableFn = js.Function0[Unit]
  type ElementHandleEventFn = js.Function3[/* view */ ViewData, /* eventName */ String, /* event */ js.Any, Boolean]
  /**
    * Set of instructions used to process host bindings efficiently.
    *
    * See VIEW_DATA.md for more information.
    */
  type ExpandoInstructions = js.Array[Double | HostBindingsFunction[js.Any] | Null]
  type ForwardRefFn = js.Function0[js.Any]
  type GlobalTargetResolver = js.Function1[/* element */ js.Any, Anon_NameTargetEventTarget]
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
  type HookData = js.Array[Double | js.Function0[Unit]]
  type HostBindingsFunction[T] = js.Function3[/* rf */ ɵRenderFlags, /* ctx */ T, /* elementIndex */ Double, Unit]
  /** See CreateComponentOptions.hostFeatures */
  type HostFeature = js.Function2[/* component */ js.Any, /* componentDef */ ɵComponentDef[js.Any], Unit]
  /**
    * Array storing OpCode for dynamically creating `i18n` blocks.
    *
    * Example:
    * ```ts
    * <I18nCreateOpCode>[
    *   // For adding text nodes
    *   // ---------------------
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createTextNode('abc');
    *   //   lView[1].insertBefore(node, lView[2]);
    *   'abc', 1 << SHIFT_PARENT | 2 << SHIFT_REF | InsertBefore,
    *
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createTextNode('xyz');
    *   //   lView[1].appendChild(node);
    *   'xyz', 1 << SHIFT_PARENT | AppendChild,
    *
    *   // For adding element nodes
    *   // ---------------------
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createElement('div');
    *   //   lView[1].insertBefore(node, lView[2]);
    *   ELEMENT_MARKER, 'div', 1 << SHIFT_PARENT | 2 << SHIFT_REF | InsertBefore,
    *
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createElement('div');
    *   //   lView[1].appendChild(node);
    *   ELEMENT_MARKER, 'div', 1 << SHIFT_PARENT | AppendChild,
    *
    *   // For adding comment nodes
    *   // ---------------------
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createComment('');
    *   //   lView[1].insertBefore(node, lView[2]);
    *   COMMENT_MARKER, '', 1 << SHIFT_PARENT | 2 << SHIFT_REF | InsertBefore,
    *
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createComment('');
    *   //   lView[1].appendChild(node);
    *   COMMENT_MARKER, '', 1 << SHIFT_PARENT | AppendChild,
    *
    *   // For moving existing nodes to a different location
    *   // --------------------------------------------------
    *   // Equivalent to:
    *   //   const node = lView[1];
    *   //   lView[2].insertBefore(node, lView[3]);
    *   1 << SHIFT_REF | Select, 2 << SHIFT_PARENT | 3 << SHIFT_REF | InsertBefore,
    *
    *   // Equivalent to:
    *   //   const node = lView[1];
    *   //   lView[2].appendChild(node);
    *   1 << SHIFT_REF | Select, 2 << SHIFT_PARENT | AppendChild,
    *
    *   // For removing existing nodes
    *   // --------------------------------------------------
    *   //   const node = lView[1];
    *   //   removeChild(tView.data(1), node, lView);
    *   1 << SHIFT_REF | Remove,
    *
    *   // For writing attributes
    *   // --------------------------------------------------
    *   //   const node = lView[1];
    *   //   node.setAttribute('attr', 'value');
    *   1 << SHIFT_REF | Select, 'attr', 'value'
    *            // NOTE: Select followed by two string (vs select followed by OpCode)
    * ];
    * ```
    * NOTE:
    *   - `index` is initial location where the extra nodes should be stored in the EXPANDO section of
    * `LVIewData`.
    *
    * See: `applyI18nCreateOpCodes`;
    */
  type I18nMutateOpCodes = js.Array[Double | String | ELEMENT_MARKER | COMMENT_MARKER | Null]
  /**
    * Stores DOM operations which need to be applied to update DOM render tree due to changes in
    * expressions.
    *
    * The basic idea is that `i18nExp` OpCodes capture expression changes and update a change
    * mask bit. (Bit 1 for expression 1, bit 2 for expression 2 etc..., bit 32 for expression 32 and
    * higher.) The OpCodes then compare its own change mask against the expression change mask to
    * determine if the OpCodes should execute.
    *
    * These OpCodes can be used by both the i18n block as well as ICU sub-block.
    *
    * ## Example
    *
    * Assume
    * ```ts
    *   if (rf & RenderFlags.Update) {
    *    i18nExp(bind(ctx.exp1)); // If changed set mask bit 1
    *    i18nExp(bind(ctx.exp2)); // If changed set mask bit 2
    *    i18nExp(bind(ctx.exp3)); // If changed set mask bit 3
    *    i18nExp(bind(ctx.exp4)); // If changed set mask bit 4
    *    i18nApply(0);            // Apply all changes by executing the OpCodes.
    *  }
    * ```
    * We can assume that each call to `i18nExp` sets an internal `changeMask` bit depending on the
    * index of `i18nExp`.
    *
    * ### OpCodes
    * ```ts
    * <I18nUpdateOpCodes>[
    *   // The following OpCodes represent: `<div i18n-title="pre{{exp1}}in{{exp2}}post">`
    *   // If `changeMask & 0b11`
    *   //        has changed then execute update OpCodes.
    *   //        has NOT changed then skip `7` values and start processing next OpCodes.
    *   0b11, 7,
    *   // Concatenate `newValue = 'pre'+lView[bindIndex-4]+'in'+lView[bindIndex-3]+'post';`.
    *   'pre', -4, 'in', -3, 'post',
    *   // Update attribute: `elementAttribute(1, 'title', sanitizerFn(newValue));`
    *   1 << SHIFT_REF | Attr, 'title', sanitizerFn,
    *
    *   // The following OpCodes represent: `<div i18n>Hello {{exp3}}!">`
    *   // If `changeMask & 0b100`
    *   //        has changed then execute update OpCodes.
    *   //        has NOT changed then skip `4` values and start processing next OpCodes.
    *   0b100, 4,
    *   // Concatenate `newValue = 'Hello ' + lView[bindIndex -2] + '!';`.
    *   'Hello ', -2, '!',
    *   // Update text: `lView[1].textContent = newValue;`
    *   1 << SHIFT_REF | Text,
    *
    *   // The following OpCodes represent: `<div i18n>{exp4, plural, ... }">`
    *   // If `changeMask & 0b1000`
    *   //        has changed then execute update OpCodes.
    *   //        has NOT changed then skip `4` values and start processing next OpCodes.
    *   0b1000, 4,
    *   // Concatenate `newValue = lView[bindIndex -1];`.
    *   -1,
    *   // Switch ICU: `icuSwitchCase(lView[1], 0, newValue);`
    *   0 << SHIFT_ICU | 1 << SHIFT_REF | IcuSwitch,
    *
    *   // Note `changeMask & -1` is always true, so the IcuUpdate will always execute.
    *   -1, 1,
    *   // Update ICU: `icuUpdateCase(lView[1], 0);`
    *   0 << SHIFT_ICU | 1 << SHIFT_REF | IcuUpdate,
    *
    * ];
    * ```
    *
    */
  type I18nUpdateOpCodes = js.Array[String | Double | SanitizerFn | Null]
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
  type InitialInputData = js.Array[InitialInputs | Null]
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
  type InitialInputs = js.Array[String]
  /**
    * Type for a function that extracts a value for a local refs.
    * Example:
    * - `<div #nativeDivEl>` - `nativeDivEl` should point to the native `<div>` element;
    * - `<ng-template #tplRef>` - `tplRef` should point to the `TemplateRef` instance;
    */
  type LocalRefExtractor = js.Function2[
    /* tNode */ TNodeWithLocalRefs, 
    /* currentView */ ɵangular_packages_core_core_bj, 
    js.Any
  ]
  type NgIterable[T] = js.Array[T] | Iterable[T]
  /**
    * Function to call console.error at the right source location. This is an indirection
    * via another function as browser will log the location that actually called
    * `console.error`.
    */
  type NodeLogger = js.Function0[js.Function0[Unit]]
  type PipeDefList = js.Array[ɵPipeDef[js.Any]]
  /**
    * Type used for PipeDefs on component definition.
    *
    * The function is necessary to be able to support forward declarations.
    */
  type PipeDefListOrFactory = js.Function0[PipeDefList] | PipeDefList
  type PipeTypeList = js.Array[PipeType[js.Any] | Type[js.Any]]
  type PipeTypesOrFactory = js.Function0[PipeTypeList] | PipeTypeList
  type Predicate[T] = js.Function1[/* value */ T, Boolean]
  /**
    * Describes a function that is used to process provider lists (such as provider
    * overrides).
    */
  type ProcessProvidersFunction = js.Function1[/* providers */ js.Array[Provider], js.Array[Provider]]
  /**
    * List of slots for a projection. A slot can be either based on a parsed CSS selector
    * which will be used to determine nodes which are projected into that slot.
    *
    * When set to "*", the slot is reserved and can be used for multi-slot projection
    * using {@link ViewContainerRef#createComponent}. The last slot that specifies the
    * wildcard selector will retrieve all projectable nodes which do not match any selector.
    */
  type ProjectionSlots = js.Array[ɵCssSelectorList | Asterisk]
  /**
    * Store the runtime input or output names for all the directives.
    *
    * i+0: directive instance index
    * i+1: publicName
    * i+2: privateName
    *
    * e.g. [0, 'change', 'change-minified']
    */
  type PropertyAliasValue = js.Array[Double | String]
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
  type PropertyAliases = StringDictionary[PropertyAliasValue]
  /* Rewritten from type alias, can be one of: 
    - typings.atAngularCore.atAngularCoreMod.TypeProvider
    - typings.atAngularCore.atAngularCoreMod.ValueProvider
    - typings.atAngularCore.atAngularCoreMod.ClassProvider
    - typings.atAngularCore.atAngularCoreMod.ConstructorProvider
    - typings.atAngularCore.atAngularCoreMod.ExistingProvider
    - typings.atAngularCore.atAngularCoreMod.FactoryProvider
    - js.Array[js.Any]
  */
  type Provider = _Provider | js.Array[js.Any] | TypeProvider
  /**
    * Function used to sanitize the value before writing it into the renderer.
    */
  type SanitizerFn = js.Function3[
    /* value */ js.Any, 
    /* tagName */ js.UndefOr[String], 
    /* propName */ js.UndefOr[String], 
    String
  ]
  type Scope = js.Function1[/* repeated */ js.Any, js.Any]
  type SimpleChanges = StringDictionary[SimpleChange]
  /* Rewritten from type alias, can be one of: 
    - typings.atAngularCore.atAngularCoreMod.ValueProvider
    - typings.atAngularCore.atAngularCoreMod.ExistingProvider
    - typings.atAngularCore.atAngularCoreMod.StaticClassProvider
    - typings.atAngularCore.atAngularCoreMod.ConstructorProvider
    - typings.atAngularCore.atAngularCoreMod.FactoryProvider
    - js.Array[js.Any]
  */
  type StaticProvider = _StaticProvider | js.Array[js.Any]
  /**
    * Used to intercept and sanitize style values before they are written to the renderer.
    *
    * This function is designed to be called in two modes. When a value is not provided
    * then the function will return a boolean whether a property will be sanitized later.
    * If a value is provided then the sanitized version of that will be returned.
    */
  type StyleSanitizeFn = js.Function3[
    /* prop */ String, 
    /* value */ String | Null, 
    /* mode */ js.UndefOr[StyleSanitizeMode], 
    js.Any
  ]
  /**
    * A combination of:
    * - Attribute names and values.
    * - Special markers acting as flags to alter attributes processing.
    * - Parsed ngProjectAs selectors.
    */
  type TAttributes = js.Array[String | ɵAttributeMarker | CssSelector]
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
    TNode | ɵPipeDef[js.Any] | ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any] | Double | Type[js.Any] | InjectionToken[js.Any] | TI18n | I18nUpdateOpCodes | Null | String
  ]
  type TrackByFunction[T] = js.Function2[/* index */ Double, /* item */ T, js.Any]
  /**
    * Tsickle has a bug where it creates an infinite loop for a function returning itself.
    * This is a temporary type that will be removed when the issue is resolved.
    * https://github.com/angular/tsickle/issues/1009)
    */
  type TsickleIssue1009 = js.Any
  type TypeProvider = Type[js.Any]
  type ViewChild = Query
  type ViewChildren = Query
  type ViewHandleEventFn = js.Function4[
    /* view */ ViewData, 
    /* nodeIndex */ Double, 
    /* eventName */ String, 
    /* event */ js.Any, 
    Boolean
  ]
  /**
    * Definition of what a view queries function should look like.
    */
  type ViewQueriesFunction[T] = js.Function2[/* rf */ ɵRenderFlags, /* ctx */ T, Unit]
  type ViewUpdateFn = js.Function2[/* check */ NodeCheckFn, /* view */ ViewData, Unit]
  type WtfScopeFn = js.Function2[/* arg0 */ js.UndefOr[js.Any], /* arg1 */ js.UndefOr[js.Any], js.Any]
  type viewEngine_ChangeDetectorRef_interface = ChangeDetectorRef
  type ɵCssSelectorList = js.Array[CssSelector]
  type ɵGetterFn = js.Function1[/* obj */ js.Any, js.Any]
  type ɵMethodFn = js.Function2[/* obj */ js.Any, /* args */ js.Array[js.Any], js.Any]
  type ɵSetterFn = js.Function2[/* obj */ js.Any, /* value */ js.Any, Unit]
  type ɵɵComponentDefWithMeta[T, Selector /* <: String */, ExportAs /* <: js.Array[String] */, InputMap /* <: StringDictionary[String] */, OutputMap /* <: StringDictionary[String] */, QueryFields /* <: js.Array[String] */] = ɵComponentDef[T]
  type ɵɵDirectiveDefWithMeta[T, Selector /* <: String */, ExportAs /* <: js.Array[String] */, InputMap /* <: StringDictionary[String] */, OutputMap /* <: StringDictionary[String] */, QueryFields /* <: js.Array[String] */] = ɵDirectiveDef[T]
  type ɵɵNgModuleDefWithMeta[T, Declarations, Imports, Exports] = ɵNgModuleDef[T]
  type ɵɵPipeDefWithMeta[T, Name /* <: String */] = ɵPipeDef[T]
}
