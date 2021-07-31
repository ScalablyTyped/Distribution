package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoCorners extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  val Name: String
  
  @JSName("Office.IMsoCorners_typekey")
  var OfficeDotIMsoCorners_typekey: IMsoCorners
  
  val Parent: js.Any
  
  def Select(): js.Any
}
object IMsoCorners {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Name: String,
    OfficeDotIMsoCorners_typekey: IMsoCorners,
    Parent: js.Any,
    Select: () => js.Any
  ): IMsoCorners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoCorners_typekey")(OfficeDotIMsoCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoCorners]
  }
  
  @scala.inline
  implicit class IMsoCornersMutableBuilder[Self <: IMsoCorners] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoCorners_typekey(value: IMsoCorners): Self = StObject.set(x, "Office.IMsoCorners_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
