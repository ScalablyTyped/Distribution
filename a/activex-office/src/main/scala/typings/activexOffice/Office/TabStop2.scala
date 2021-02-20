package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStop2 extends StObject {
  
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
  implicit class TabStop2MutableBuilder[Self <: TabStop2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotTabStop2_typekey(value: TabStop2): Self = StObject.set(x, "Office.TabStop2_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoTabStopType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
