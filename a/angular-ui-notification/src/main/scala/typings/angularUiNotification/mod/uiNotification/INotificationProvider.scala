package typings.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotificationProvider extends js.Object {
  
  def setOptions(options: IGlobalMessageOptions): Unit = js.native
}
object INotificationProvider {
  
  @scala.inline
  def apply(setOptions: IGlobalMessageOptions => Unit): INotificationProvider = {
    val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[INotificationProvider]
  }
  
  @scala.inline
  implicit class INotificationProviderOps[Self <: INotificationProvider] (val x: Self) extends AnyVal {
    
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
    def setSetOptions(value: IGlobalMessageOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
}
