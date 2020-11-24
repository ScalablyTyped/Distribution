package typings.angularAgility.aa

import typings.angular.mod.IAugmentedJQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidIconStrategy extends js.Object {
  
  def getContainer(element: IAugmentedJQueryStatic): Unit = js.native
  
  var invalidIcon: String = js.native
  
  var validIcon: String = js.native
}
object IValidIconStrategy {
  
  @scala.inline
  def apply(getContainer: IAugmentedJQueryStatic => Unit, invalidIcon: String, validIcon: String): IValidIconStrategy = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction1(getContainer), invalidIcon = invalidIcon.asInstanceOf[js.Any], validIcon = validIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidIconStrategy]
  }
  
  @scala.inline
  implicit class IValidIconStrategyOps[Self <: IValidIconStrategy] (val x: Self) extends AnyVal {
    
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
    def setGetContainer(value: IAugmentedJQueryStatic => Unit): Self = this.set("getContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvalidIcon(value: String): Self = this.set("invalidIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidIcon(value: String): Self = this.set("validIcon", value.asInstanceOf[js.Any])
  }
}
