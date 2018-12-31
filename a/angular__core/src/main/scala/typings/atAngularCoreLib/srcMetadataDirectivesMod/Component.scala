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
    * - `ViewEncapsulation.Native`: Use shadow roots. This works
    * only if natively available on the platform.
    * - `ViewEncapsulation.Emulated`: Use shimmed CSS that
    * emulates the native behavior.
    * - `ViewEncapsulation.None`: Use global CSS without any
    * encapsulation.
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
    * One or more URLs for files containing CSS stylesheets to use
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
    * The URL of a template file for an Angular component. If provided,
    * do not supply an inline template using `template`.
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

