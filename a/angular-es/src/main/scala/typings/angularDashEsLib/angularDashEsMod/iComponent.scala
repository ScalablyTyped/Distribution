package typings
package angularDashEsLib.angularDashEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component interface
  * @see https://docs.angularjs.org/guide/component
  */
trait iComponent extends js.Object {
  var bindings: js.UndefOr[js.Object] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
  var require: js.UndefOr[java.lang.String] = js.undefined
  var selector: java.lang.String
  var template: java.lang.String
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var transclude: js.UndefOr[java.lang.String] = js.undefined
}

object iComponent {
  @scala.inline
  def apply(
    selector: java.lang.String,
    template: java.lang.String,
    bindings: js.Object = null,
    controllerAs: java.lang.String = null,
    require: java.lang.String = null,
    templateUrl: java.lang.String = null,
    transclude: java.lang.String = null
  ): iComponent = {
    val __obj = js.Dynamic.literal(selector = selector, template = template)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (require != null) __obj.updateDynamic("require")(require)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (transclude != null) __obj.updateDynamic("transclude")(transclude)
    __obj.asInstanceOf[iComponent]
  }
}

