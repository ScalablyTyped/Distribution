package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartArtLayout extends StObject {
  
  val Application: Any
  
  val Category: String
  
  val Creator: Double
  
  val Description: String
  
  val Id: String
  
  val Name: String
  
  /* private */ @JSName("Office.SmartArtLayout_typekey")
  var OfficeDotSmartArtLayout_typekey: SmartArtLayout
  
  val Parent: Any
}
object SmartArtLayout {
  
  inline def apply(
    Application: Any,
    Category: String,
    Creator: Double,
    Description: String,
    Id: String,
    Name: String,
    OfficeDotSmartArtLayout_typekey: SmartArtLayout,
    Parent: Any
  ): SmartArtLayout = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SmartArtLayout_typekey")(OfficeDotSmartArtLayout_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartArtLayout]
  }
  
  extension [Self <: SmartArtLayout](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSmartArtLayout_typekey(value: SmartArtLayout): Self = StObject.set(x, "Office.SmartArtLayout_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
