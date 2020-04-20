package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵDirectiveDef[T] extends js.Object {
  val afterContentChecked: js.Function0[Unit] | Null
  val afterContentInit: js.Function0[Unit] | Null
  val afterViewChecked: js.Function0[Unit] | Null
  val afterViewInit: js.Function0[Unit] | Null
  /**
    * Function to create and refresh content queries associated with a given directive.
    */
  var contentQueries: ContentQueriesFunction[T] | Null
  /**
    * @deprecated This is only here because `NgOnChanges` incorrectly uses declared name instead of
    * public or minified name.
    */
  val declaredInputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any]
  val doCheck: js.Function0[Unit] | Null
  /**
    * Name under which the directive is exported (for use with local references in template)
    */
  val exportAs: js.Array[String] | Null
  /**
    * Factory function used to create a new directive instance. Will be null initially.
    * Populated when the factory is first requested by directive instantiation logic.
    */
  val factory: FactoryFn[T] | Null
  /**
    * The features applied to this directive
    */
  val features: js.Array[DirectiveDefFeature] | Null
  /**
    * Assign static attribute values to a host element.
    *
    * This property will assign static attribute values as well as class and style
    * values to a host element. Since attribute values can consist of different types of values, the
    * `hostAttrs` array must include the values in the following format:
    *
    * attrs = [
    *   // static attributes (like `title`, `name`, `id`...)
    *   attr1, value1, attr2, value,
    *
    *   // a single namespace value (like `x:id`)
    *   NAMESPACE_MARKER, namespaceUri1, name1, value1,
    *
    *   // another single namespace value (like `x:name`)
    *   NAMESPACE_MARKER, namespaceUri2, name2, value2,
    *
    *   // a series of CSS classes that will be applied to the element (no spaces)
    *   CLASSES_MARKER, class1, class2, class3,
    *
    *   // a series of CSS styles (property + value) that will be applied to the element
    *   STYLES_MARKER, prop1, value1, prop2, value2
    * ]
    *
    * All non-class and non-style attributes must be defined at the start of the list
    * first before all class and style values are set. When there is a change in value
    * type (like when classes and styles are introduced) a marker must be used to separate
    * the entries. The marker values themselves are set via entries found in the
    * [AttributeMarker] enum.
    */
  val hostAttrs: TAttributes | Null
  /**
    * Refreshes host bindings on the associated directive.
    */
  val hostBindings: HostBindingsFunction[T] | Null
  /**
    * The number of bindings in this directive `hostBindings` (including pure fn bindings).
    *
    * Used to calculate the length of the component's LView array, so we
    * can pre-fill the array and set the host binding start index.
    */
  val hostVars: Double
  /**
    * A dictionary mapping the inputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Input('alias') propertyName: any;`).
    */
  val inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any]
  val onChanges: js.Function0[Unit] | Null
  val onDestroy: js.Function0[Unit] | Null
  val onInit: js.Function0[Unit] | Null
  /**
    * A dictionary mapping the outputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Output('alias') propertyName: any;`).
    */
  val outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any]
  /** Function that resolves providers and publishes them into the DI system. */
  var providersResolver: (js.Function2[
    /* def */ ɵDirectiveDef[T], 
    /* processProvidersFn */ js.UndefOr[ProcessProvidersFunction], 
    Unit
  ]) | Null
  /** The selectors that will be used to match nodes to this directive. */
  val selectors: ɵCssSelectorList
  var setInput: (js.ThisFunction4[
    /* this */ ɵDirectiveDef[T], 
    /* instance */ T, 
    /* value */ js.Any, 
    /* publicName */ String, 
    /* privateName */ String, 
    Unit
  ]) | Null
  /** Token representing the directive. Used by DI. */
  val `type`: Type[T]
  /**
    * Query-related instructions for a directive. Note that while directives don't have a
    * view and as such view queries won't necessarily do anything, there might be
    * components that extend the directive.
    */
  var viewQuery: ViewQueriesFunction[T] | Null
}

object ɵDirectiveDef {
  @scala.inline
  def apply[T](
    declaredInputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any],
    hostVars: Double,
    inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any],
    outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any],
    selectors: ɵCssSelectorList,
    `type`: Type[T],
    afterContentChecked: () => Unit = null,
    afterContentInit: () => Unit = null,
    afterViewChecked: () => Unit = null,
    afterViewInit: () => Unit = null,
    contentQueries: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit = null,
    doCheck: () => Unit = null,
    exportAs: js.Array[String] = null,
    factory: FactoryFn[T] = null,
    features: js.Array[DirectiveDefFeature] = null,
    hostAttrs: TAttributes = null,
    hostBindings: (/* rf */ ɵRenderFlags, T) => Unit = null,
    onChanges: () => Unit = null,
    onDestroy: () => Unit = null,
    onInit: () => Unit = null,
    providersResolver: (/* def */ ɵDirectiveDef[T], /* processProvidersFn */ js.UndefOr[ProcessProvidersFunction]) => Unit = null,
    setInput: js.ThisFunction4[
      /* this */ ɵDirectiveDef[T], 
      /* instance */ T, 
      /* value */ js.Any, 
      /* publicName */ String, 
      /* privateName */ String, 
      Unit
    ] = null,
    viewQuery: (/* rf */ ɵRenderFlags, T) => Unit = null
  ): ɵDirectiveDef[T] = {
    val __obj = js.Dynamic.literal(declaredInputs = declaredInputs.asInstanceOf[js.Any], hostVars = hostVars.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (afterContentChecked != null) __obj.updateDynamic("afterContentChecked")(js.Any.fromFunction0(afterContentChecked))
    if (afterContentInit != null) __obj.updateDynamic("afterContentInit")(js.Any.fromFunction0(afterContentInit))
    if (afterViewChecked != null) __obj.updateDynamic("afterViewChecked")(js.Any.fromFunction0(afterViewChecked))
    if (afterViewInit != null) __obj.updateDynamic("afterViewInit")(js.Any.fromFunction0(afterViewInit))
    if (contentQueries != null) __obj.updateDynamic("contentQueries")(js.Any.fromFunction3(contentQueries))
    if (doCheck != null) __obj.updateDynamic("doCheck")(js.Any.fromFunction0(doCheck))
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (hostAttrs != null) __obj.updateDynamic("hostAttrs")(hostAttrs.asInstanceOf[js.Any])
    if (hostBindings != null) __obj.updateDynamic("hostBindings")(js.Any.fromFunction2(hostBindings))
    if (onChanges != null) __obj.updateDynamic("onChanges")(js.Any.fromFunction0(onChanges))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (providersResolver != null) __obj.updateDynamic("providersResolver")(js.Any.fromFunction2(providersResolver))
    if (setInput != null) __obj.updateDynamic("setInput")(setInput.asInstanceOf[js.Any])
    if (viewQuery != null) __obj.updateDynamic("viewQuery")(js.Any.fromFunction2(viewQuery))
    __obj.asInstanceOf[ɵDirectiveDef[T]]
  }
}

