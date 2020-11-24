package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStop2 extends js.Object {
  
  val Application: js.Any = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.TabStop2_typekey")
  var OfficeDotTabStop2_typekey: TabStop2 = js.native
  
  val Parent: js.Any = js.native
  
  var Position: Double = js.native
  
  var Type: MsoTabStopType = js.native
}
object TabStop2 {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Clear: () => Unit,
    Creator: Double,
    OfficeDotTabStop2_typekey: TabStop2,
    Parent: js.Any,
    Position: Double,
    Type: MsoTabStopType
  ): TabStop2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TabStop2_typekey")(OfficeDotTabStop2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop2]
  }
  
  @scala.inline
  implicit class TabStop2Ops[Self <: TabStop2] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotTabStop2_typekey(value: TabStop2): Self = this.set("Office.TabStop2_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoTabStopType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
