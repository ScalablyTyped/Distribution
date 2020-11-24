package typings.angularToastr.mod.angularAugmentingMod.toastr

import typings.angular.mod.IRootScopeService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastScope extends IRootScopeService {
  
  var message: String = js.native
  
  var options: IToastConfig = js.native
  
  var title: String = js.native
  
  var toastId: Double = js.native
  
  var toastType: String = js.native
}
