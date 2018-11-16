package typings
package atAngularCoreLib.srcRender3InterfacesDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DirectiveDef[T] extends BaseDef[T] {
  var afterContentChecked: js.Function0[scala.Unit] | scala.Null
  var afterContentInit: js.Function0[scala.Unit] | scala.Null
  var afterViewChecked: js.Function0[scala.Unit] | scala.Null
  var afterViewInit: js.Function0[scala.Unit] | scala.Null
  /**
       * Static attributes to set on host element.
       *
       * Even indices: attribute name
       * Odd indices: attribute value
       */
  var attributes: js.Array[java.lang.String] | scala.Null
  /**
       * Function to create instances of content queries associated with a given directive.
       */
  var contentQueries: js.Function0[scala.Unit] | scala.Null
  /** Refreshes content queries associated with directives in a given view */
  var contentQueriesRefresh: (js.Function2[/* directiveIndex */ scala.Double, /* queryIndex */ scala.Double, scala.Unit]) | scala.Null
  /** Function that makes a directive public to the DI system. */
  var diPublic: (js.Function1[/* def */ DirectiveDef[T], scala.Unit]) | scala.Null
  var doCheck: js.Function0[scala.Unit] | scala.Null
  /**
       * Name under which the directive is exported (for use with local references in template)
       */
  val exportAs: java.lang.String | scala.Null
  /**
       * The features applied to this directive
       */
  var features: js.Array[DirectiveDefFeature] | scala.Null
  /** Refreshes host bindings on the associated directive. */
  var hostBindings: HostBindingsFunction | scala.Null
  /**
       * The number of host bindings (including pure fn bindings) in this directive/component.
       *
       * Used to calculate the length of the LViewData array for the *parent* component
       * of this directive/component.
       */
  var hostVars: scala.Double
  var onDestroy: js.Function0[scala.Unit] | scala.Null
  var onInit: js.Function0[scala.Unit] | scala.Null
  /** The selectors that will be used to match nodes to this directive. */
  var selectors: atAngularCoreLib.srcRender3InterfacesProjectionMod.CssSelectorList
  /** Token representing the directive. Used by DI. */
  var `type`: atAngularCoreLib.srcTypeMod.Type[T]
  /**
       * Factory function used to create a new directive instance.
       */
  def factory(): T
}

