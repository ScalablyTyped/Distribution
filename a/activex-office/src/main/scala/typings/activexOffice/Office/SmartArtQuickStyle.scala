package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartArtQuickStyle extends StObject {
  
  val Application: js.Any
  
  val Category: String
  
  val Creator: Double
  
  val Description: String
  
  val Id: String
  
  val Name: String
  
  @JSName("Office.SmartArtQuickStyle_typekey")
  var OfficeDotSmartArtQuickStyle_typekey: SmartArtQuickStyle
  
  val Parent: js.Any
}
object SmartArtQuickStyle {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Category: String,
    Creator: Double,
    Description: String,
    Id: String,
    Name: String,
    OfficeDotSmartArtQuickStyle_typekey: SmartArtQuickStyle,
    Parent: js.Any
  ): SmartArtQuickStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SmartArtQuickStyle_typekey")(OfficeDotSmartArtQuickStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartArtQuickStyle]
  }
  
  @scala.inline
  implicit class SmartArtQuickStyleMutableBuilder[Self <: SmartArtQuickStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotSmartArtQuickStyle_typekey(value: SmartArtQuickStyle): Self = StObject.set(x, "Office.SmartArtQuickStyle_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
