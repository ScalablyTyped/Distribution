package typings.angular.angularMod

import typings.angular.JQuery
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
  var $element: JQuery
  @JSName("$scope")
  var $scope: IScope
}

object IControllerLocals {
  @scala.inline
  def apply($element: JQuery, $scope: IScope): IControllerLocals = {
    val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $scope = $scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IControllerLocals]
  }
}

