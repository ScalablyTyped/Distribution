package typings
package atAngularCoreLib.srcRender3InterfacesDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveDef[T] extends BaseDef[T] {
  var afterContentChecked: js.Function0[scala.Unit] | scala.Null = js.native
  var afterContentInit: js.Function0[scala.Unit] | scala.Null = js.native
  var afterViewChecked: js.Function0[scala.Unit] | scala.Null = js.native
  var afterViewInit: js.Function0[scala.Unit] | scala.Null = js.native
  /**
    * Static attributes to set on host element.
    *
    * Even indices: attribute name
    * Odd indices: attribute value
    */
  val attributes: js.Array[java.lang.String] | scala.Null = js.native
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: (js.Function1[/* directiveIndex */ scala.Double, scala.Unit]) | scala.Null = js.native
  /** Refreshes content queries associated with directives in a given view */
  var contentQueriesRefresh: (js.Function2[/* directiveIndex */ scala.Double, /* queryIndex */ scala.Double, scala.Unit]) | scala.Null = js.native
  var doCheck: js.Function0[scala.Unit] | scala.Null = js.native
  /**
    * Name under which the directive is exported (for use with local references in template)
    */
  val exportAs: java.lang.String | scala.Null = js.native
  /**
    * The features applied to this directive
    */
  val features: js.Array[DirectiveDefFeature] | scala.Null = js.native
  /** Refreshes host bindings on the associated directive. */
  var hostBindings: HostBindingsFunction | scala.Null = js.native
  /**
    * The number of host bindings (including pure fn bindings) in this directive/component.
    *
    * Used to calculate the length of the LViewData array for the *parent* component
    * of this directive/component.
    */
  val hostVars: scala.Double = js.native
  var onDestroy: js.Function0[scala.Unit] | scala.Null = js.native
  var onInit: js.Function0[scala.Unit] | scala.Null = js.native
  /** Function that resolves providers and publishes them into the DI system. */
  var providersResolver: (js.Function1[/* def */ DirectiveDef[T], scala.Unit]) | scala.Null = js.native
  /** The selectors that will be used to match nodes to this directive. */
  val selectors: atAngularCoreLib.srcRender3InterfacesProjectionMod.CssSelectorList = js.native
  /** Token representing the directive. Used by DI. */
  var `type`: atAngularCoreLib.srcTypeMod.Type[T] = js.native
  def factory(): T = js.native
  /**
    * Factory function used to create a new directive instance.
    */
  def factory(t: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
}

