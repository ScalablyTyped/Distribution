package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartArtColor extends StObject {
  
  val Application: Any
  
  val Category: String
  
  val Creator: Double
  
  val Description: String
  
  val Id: String
  
  val Name: String
  
  /* private */ @JSName("Office.SmartArtColor_typekey")
  var OfficeDotSmartArtColor_typekey: SmartArtColor
  
  val Parent: Any
}
object SmartArtColor {
  
  inline def apply(
    Application: Any,
    Category: String,
    Creator: Double,
    Description: String,
    Id: String,
    Name: String,
    OfficeDotSmartArtColor_typekey: SmartArtColor,
    Parent: Any
  ): SmartArtColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SmartArtColor_typekey")(OfficeDotSmartArtColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartArtColor]
  }
  
  extension [Self <: SmartArtColor](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSmartArtColor_typekey(value: SmartArtColor): Self = StObject.set(x, "Office.SmartArtColor_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
