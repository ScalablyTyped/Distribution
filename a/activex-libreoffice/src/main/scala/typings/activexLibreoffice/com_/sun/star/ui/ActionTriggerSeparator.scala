package typings.activexLibreoffice.com_.sun.star.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes a separator entry. Such entries are of interest for components rendering an {@link ActionTriggerContainer} . */
@js.native
trait ActionTriggerSeparator extends js.Object {
  
  /** determines the type of the separator using constants from {@link ActionTriggerSeparatorType} . */
  var SeparatorType: Double = js.native
}
object ActionTriggerSeparator {
  
  @scala.inline
  def apply(SeparatorType: Double): ActionTriggerSeparator = {
    val __obj = js.Dynamic.literal(SeparatorType = SeparatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTriggerSeparator]
  }
  
  @scala.inline
  implicit class ActionTriggerSeparatorOps[Self <: ActionTriggerSeparator] (val x: Self) extends AnyVal {
    
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
    def setSeparatorType(value: Double): Self = this.set("SeparatorType", value.asInstanceOf[js.Any])
  }
}
