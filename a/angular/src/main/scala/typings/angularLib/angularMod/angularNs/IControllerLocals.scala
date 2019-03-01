package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// ControllerService
// see http://docs.angularjs.org/api/ng.$controller
// see http://docs.angularjs.org/api/ng.$controllerProvider
///////////////////////////////////////////////////////////////////////////
/**
  * The minimal local definitions required by $controller(ctrl, locals) calls.
  */
trait IControllerLocals extends js.Object {
  @JSName("$element")
  var $element: angularLib.JQuery
  @JSName("$scope")
  var $scope: IScope
}

object IControllerLocals {
  @scala.inline
  def apply($element: angularLib.JQuery, $scope: IScope): IControllerLocals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$element")($element)
    __obj.updateDynamic("$scope")($scope)
    __obj.asInstanceOf[IControllerLocals]
  }
}

