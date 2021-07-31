package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerResult extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  var DisplayName: String
  
  val DuplicateResults: js.Any
  
  def Fields(Index: Double): PickerField
  @JSName("Fields")
  var Fields_Original: PickerFields
  
  val Id: String
  
  var ItemData: js.Any
  
  @JSName("Office.PickerResult_typekey")
  var OfficeDotPickerResult_typekey: PickerResult
  
  var SIPId: String
  
  var SubItems: js.Any
  
  var Type: String
}
object PickerResult {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    DisplayName: String,
    DuplicateResults: js.Any,
    Fields: PickerFields,
    Id: String,
    ItemData: js.Any,
    OfficeDotPickerResult_typekey: PickerResult,
    SIPId: String,
    SubItems: js.Any,
    Type: String
  ): PickerResult = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], DuplicateResults = DuplicateResults.asInstanceOf[js.Any], Fields = Fields.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ItemData = ItemData.asInstanceOf[js.Any], SIPId = SIPId.asInstanceOf[js.Any], SubItems = SubItems.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PickerResult_typekey")(OfficeDotPickerResult_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerResult]
  }
  
  @scala.inline
  implicit class PickerResultMutableBuilder[Self <: PickerResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateResults(value: js.Any): Self = StObject.set(x, "DuplicateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: PickerFields): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: js.Any): Self = StObject.set(x, "ItemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotPickerResult_typekey(value: PickerResult): Self = StObject.set(x, "Office.PickerResult_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIPId(value: String): Self = StObject.set(x, "SIPId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubItems(value: js.Any): Self = StObject.set(x, "SubItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
