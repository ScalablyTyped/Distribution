package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends Directive {
  /**
    * One or more animation `trigger()` calls, containing
    * `state()` and `transition()` definitions.
    * See the [Animations guide](/guide/animations) and animations API documentation.
    *
    */
  var animations: js.UndefOr[js.Array[_]] = js.native
  /**
    * The change-detection strategy to use for this component.
    *
    * When a component is instantiated, Angular creates a change detector,
    * which is responsible for propagating the component's bindings.
    * The strategy is one of:
    * - `ChangeDetectionStrategy#OnPush` sets the strategy to `CheckOnce` (on demand).
    * - `ChangeDetectionStrategy#Default` sets the strategy to `CheckAlways`.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.native
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
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.native
  /**
    * A set of components that should be compiled along with
    * this component. For each component listed here,
    * Angular creates a {@link ComponentFactory} and stores it in the
    * {@link ComponentFactoryResolver}.
    * @deprecated Since 9.0.0. With Ivy, this property is no longer necessary.
    */
  var entryComponents: js.UndefOr[js.Array[Type[_] | js.Array[_]]] = js.native
  /**
    * Overrides the default encapsulation start and end delimiters (`{{` and `}}`)
    */
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.native
  /**
    * The module ID of the module that contains the component.
    * The component must be able to resolve relative URLs for templates and styles.
    * SystemJS exposes the `__moduleName` variable within each module.
    * In CommonJS, this can  be set to `module.id`.
    *
    */
  var moduleId: js.UndefOr[String] = js.native
  /**
    * True to preserve or false to remove potentially superfluous whitespace characters
    * from the compiled template. Whitespace characters are those matching the `\s`
    * character class in JavaScript regular expressions. Default is false, unless
    * overridden in compiler options.
    */
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  /**
    * One or more relative paths or absolute URLs for files containing CSS stylesheets to use
    * in this component.
    */
  var styleUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * One or more inline CSS stylesheets to use
    * in this component.
    */
  var styles: js.UndefOr[js.Array[String]] = js.native
  /**
    * An inline template for an Angular component. If provided,
    * do not supply a template file using `templateUrl`.
    *
    */
  var template: js.UndefOr[String] = js.native
  /**
    * The relative path or absolute URL of a template file for an Angular component.
    * If provided, do not supply an inline template using `template`.
    *
    */
  var templateUrl: js.UndefOr[String] = js.native
  /**
    * Defines the set of injectable objects that are visible to its view DOM children.
    * See [example](#injecting-a-class-with-a-view-provider).
    *
    */
  var viewProviders: js.UndefOr[js.Array[Provider]] = js.native
}

@JSImport("@angular/core", "Component")
@js.native
object Component extends TopLevel[ComponentDecorator]

