package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStop extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  var Position: Double = js.native
  
  @JSName("PowerPoint.TabStop_typekey")
  var PowerPointDotTabStop_typekey: TabStop = js.native
  
  var Type: PpTabStopType = js.native
}
object TabStop {
  
  @scala.inline
  def apply(
    Application: Application,
    Clear: () => Unit,
    Parent: js.Any,
    Position: Double,
    PowerPointDotTabStop_typekey: TabStop,
    Type: PpTabStopType
  ): TabStop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TabStop_typekey")(PowerPointDotTabStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
  
  @scala.inline
  implicit class TabStopOps[Self <: TabStop] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTabStop_typekey(value: TabStop): Self = this.set("PowerPoint.TabStop_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PpTabStopType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
