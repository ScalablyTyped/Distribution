package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAngularCoreLib {
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
  type CssSelector = js.Array[
    java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SelectorFlags */ js.Any)
  ]
  type DirectiveDefList = js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ɵDirectiveDef<any> */ js.Any
  ]
  type DirectiveTypeList = js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ɵDirectiveDef<any> */ js.Any
  ]
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
  type HookData = js.Array[scala.Double | js.Function0[scala.Unit]]
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
  type InitialInputData = js.Array[InitialInputs | scala.Null]
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
  type PipeDefList = js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ɵPipeDef<any> */ js.Any
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
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ɵCssSelectorList */ js.Any) | atAngularCoreLib.atAngularCoreLibStrings.`*`
  ]
  /**
    * Store the runtime input or output names for all the directives.
    *
    * i+0: directive instance index
    * i+1: publicName
    * i+2: privateName
    *
    * e.g. [0, 'change', 'change-minified']
    */
  type PropertyAliasValue = js.Array[scala.Double | java.lang.String]
  /**
    * A combination of:
    * - Attribute names and values.
    * - Special markers acting as flags to alter attributes processing.
    * - Parsed ngProjectAs selectors.
    */
  type TAttributes = js.Array[
    java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ɵAttributeMarker */ js.Any) | CssSelector
  ]
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
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TNode */ js.Any) | scala.Double | scala.Null | java.lang.String
  ]
  /**
    * Tsickle has a bug where it creates an infinite loop for a function returning itself.
    * This is a temporary type that will be removed when the issue is resolved.
    * https://github.com/angular/tsickle/issues/1009)
    */
  type TsickleIssue1009 = js.Any
}
