package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoCorners extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Name: String
  
  /* private */ @JSName("Office.IMsoCorners_typekey")
  var OfficeDotIMsoCorners_typekey: IMsoCorners
  
  val Parent: Any
  
  def Select(): Any
}
object IMsoCorners {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Name: String,
    OfficeDotIMsoCorners_typekey: IMsoCorners,
    Parent: Any,
    Select: () => Any
  ): IMsoCorners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoCorners_typekey")(OfficeDotIMsoCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoCorners]
  }
  
  extension [Self <: IMsoCorners](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoCorners_typekey(value: IMsoCorners): Self = StObject.set(x, "Office.IMsoCorners_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
