package typings.angular.mod

import typings.angular.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// ControllerService
// see http://docs.angularjs.org/api/ng/service/$controller
// see http://docs.angularjs.org/api/ng/provider/$controllerProvider
///////////////////////////////////////////////////////////////////////////
/**
  * The minimal local definitions required by $controller(ctrl, locals) calls.
  */
@js.native
trait IControllerLocals extends StObject {
  
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
  implicit class IControllerLocalsMutableBuilder[Self <: IControllerLocals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$element(value: JQuery): Self = StObject.set(x, "$element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$scope(value: IScope): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
  }
}
