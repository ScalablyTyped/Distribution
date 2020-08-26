package typings.angular.mod

import typings.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// ControllerService
// see http://docs.angularjs.org/api/ng/service/$controller
// see http://docs.angularjs.org/api/ng/provider/$controllerProvider
///////////////////////////////////////////////////////////////////////////
/**
  * The minimal local definitions required by $controller(ctrl, locals) calls.
  */
@js.native
trait IControllerLocals extends js.Object {
  @JSName("$element")
  var $element: JQuery = js.native
  @JSName("$scope")
  var $scope: IScope = js.native
}

object IControllerLocals {
  @scala.inline
  def apply($element: JQuery, $scope: IScope): IControllerLocals = {
    val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $scope = $scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControllerLocals]
  }
  @scala.inline
  implicit class IControllerLocalsOps[Self <: IControllerLocals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$element(value: JQuery): Self = this.set("$element", value.asInstanceOf[js.Any])
    @scala.inline
    def set$scope(value: IScope): Self = this.set("$scope", value.asInstanceOf[js.Any])
  }
  
}

