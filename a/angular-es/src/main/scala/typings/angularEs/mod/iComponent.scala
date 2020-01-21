package typings.angularEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component interface
  * @see https://docs.angularjs.org/guide/component
  */
trait iComponent extends js.Object {
  var bindings: js.UndefOr[js.Object] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
  var require: js.UndefOr[String] = js.undefined
  var selector: String
  var template: String
  var templateUrl: js.UndefOr[String] = js.undefined
  var transclude: js.UndefOr[String] = js.undefined
}

object iComponent {
  @scala.inline
  def apply(
    selector: String,
    template: String,
    bindings: js.Object = null,
    controllerAs: String = null,
    require: String = null,
    templateUrl: String = null,
    transclude: String = null
  ): iComponent = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (transclude != null) __obj.updateDynamic("transclude")(transclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[iComponent]
  }
}

