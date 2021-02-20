package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartArtQuickStyle extends StObject {
  
  val Application: js.Any = js.native
  
  val Category: String = js.native
  
  val Creator: Double = js.native
  
  val Description: String = js.native
  
  val Id: String = js.native
  
  val Name: String = js.native
  
  @JSName("Office.SmartArtQuickStyle_typekey")
  var OfficeDotSmartArtQuickStyle_typekey: SmartArtQuickStyle = js.native
  
  val Parent: js.Any = js.native
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
