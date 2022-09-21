package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStop2 extends StObject {
  
  val Application: Any
  
  def Clear(): Unit
  
  val Creator: Double
  
  /* private */ @JSName("Office.TabStop2_typekey")
  var OfficeDotTabStop2_typekey: TabStop2
  
  val Parent: Any
  
  var Position: Double
  
  var Type: MsoTabStopType
}
object TabStop2 {
  
  inline def apply(
    Application: Any,
    Clear: () => Unit,
    Creator: Double,
    OfficeDotTabStop2_typekey: TabStop2,
    Parent: Any,
    Position: Double,
    Type: MsoTabStopType
  ): TabStop2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TabStop2_typekey")(OfficeDotTabStop2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop2]
  }
  
  extension [Self <: TabStop2](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotTabStop2_typekey(value: TabStop2): Self = StObject.set(x, "Office.TabStop2_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoTabStopType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
