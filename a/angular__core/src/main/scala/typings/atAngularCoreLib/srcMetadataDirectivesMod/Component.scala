package typings
package atAngularCoreLib.srcMetadataDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends Directive {
  /**
    * One or more animation `trigger()` calls, containing
    * `state()` and `transition()` definitions.
    * See the [Animations guide](/guide/animations) and animations API documentation.
    *
    */
  var animations: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The change-detection strategy to use for this component.
    *
    * When a component is instantiated, Angular creates a change detector,
    * which is responsible for propagating the component's bindings.
    * The strategy is one of:
    * - `ChangeDetectionStrategy#OnPush` sets the strategy to `CheckOnce` (on demand).
    * - `ChangeDetectionStrategy#Default` sets the strategy to `CheckAlways`.
    */
  var changeDetection: js.UndefOr[
    atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectionStrategy
  ] = js.undefined
  /**
    * An encapsulation policy for the template and CSS styles. One of:
    * - `ViewEncapsulation.Native`: Deprecated. Use `ViewEncapsulation.ShadowDom` instead.
    * - `ViewEncapsulation.Emulated`: Use shimmed CSS that
    * emulates the native behavior.
    * - `ViewEncapsulation.None`: Use global CSS without any
    * encapsulation.
    * - `ViewEncapsulation.ShadowDom`: Use Shadow DOM v1 to encapsulate styles.
    *
    * If not supplied, the value is taken from `CompilerOptions`. The default compiler option is
    * `ViewEncapsulation.Emulated`.
    *
    * If the policy is set to `ViewEncapsulation.Emulated` and the component has no `styles`
    * or `styleUrls` specified, the policy is automatically switched to `ViewEncapsulation.None`.
    */
  var encapsulation: js.UndefOr[atAngularCoreLib.srcMetadataViewMod.ViewEncapsulation] = js.undefined
  /**
    * A set of components that should be compiled along with
    * this component. For each component listed here,
    * Angular creates a {@link ComponentFactory} and stores it in the
    * {@link ComponentFactoryResolver}.
    */
  var entryComponents: js.UndefOr[js.Array[atAngularCoreLib.srcTypeMod.Type[_] | js.Array[_]]] = js.undefined
  /**
    * Overrides the default encapsulation start and end delimiters (`{{` and `}}`)
    */
  var interpolation: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  /**
    * The module ID of the module that contains the component.
    * The component must be able to resolve relative URLs for templates and styles.
    * SystemJS exposes the `__moduleName` variable within each module.
    * In CommonJS, this can  be set to `module.id`.
    *
    */
  var moduleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True to preserve or false to remove potentially superfluous whitespace characters
    * from the compiled template. Whitespace characters are those matching the `\s`
    * character class in JavaScript regular expressions. Default is false, unless
    * overridden in compiler options.
    */
  var preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * One or more relative paths or absolute URLs for files containing CSS stylesheets to use
    * in this component.
    */
  var styleUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * One or more inline CSS stylesheets to use
    * in this component.
    */
  var styles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An inline template for an Angular component. If provided,
    * do not supply a template file using `templateUrl`.
    *
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The relative path or absolute URL of a template file for an Angular component.
    * If provided, do not supply an inline template using `template`.
    *
    */
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the set of injectable objects that are visible to its view DOM children.
    * See [example](#injecting-a-class-with-a-view-provider).
    *
    */
  var viewProviders: js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.Provider]] = js.undefined
}

@JSImport("@angular/core/src/metadata/directives", "Component")
@js.native
class ComponentCls protected () extends Component {
  /**
    * See the `Component` decorator.
    */
  def this(obj: Component) = this()
}

object Component {
  @scala.inline
  def apply(
    animations: js.Array[_] = null,
    changeDetection: atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectionStrategy = null,
    encapsulation: atAngularCoreLib.srcMetadataViewMod.ViewEncapsulation = null,
    entryComponents: js.Array[atAngularCoreLib.srcTypeMod.Type[_] | js.Array[_]] = null,
    exportAs: java.lang.String = null,
    host: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    inputs: js.Array[java.lang.String] = null,
    interpolation: js.Tuple2[java.lang.String, java.lang.String] = null,
    jit: atAngularCoreLib.atAngularCoreLibNumbers.`true` = null,
    moduleId: java.lang.String = null,
    outputs: js.Array[java.lang.String] = null,
    preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined,
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = null,
    queries: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    selector: java.lang.String = null,
    styleUrls: js.Array[java.lang.String] = null,
    styles: js.Array[java.lang.String] = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null,
    viewProviders: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = null
  ): Component = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations)
    if (changeDetection != null) __obj.updateDynamic("changeDetection")(changeDetection)
    if (encapsulation != null) __obj.updateDynamic("encapsulation")(encapsulation)
    if (entryComponents != null) __obj.updateDynamic("entryComponents")(entryComponents)
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (host != null) __obj.updateDynamic("host")(host)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (jit != null) __obj.updateDynamic("jit")(jit)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (styleUrls != null) __obj.updateDynamic("styleUrls")(styleUrls)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (viewProviders != null) __obj.updateDynamic("viewProviders")(viewProviders)
    __obj.asInstanceOf[Component]
  }
}

