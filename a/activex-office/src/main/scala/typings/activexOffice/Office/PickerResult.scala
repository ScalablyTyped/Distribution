package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerResult extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  var DisplayName: String
  
  val DuplicateResults: Any
  
  def Fields(Index: Double): PickerField
  @JSName("Fields")
  var Fields_Original: PickerFields
  
  val Id: String
  
  var ItemData: Any
  
  /* private */ @JSName("Office.PickerResult_typekey")
  var OfficeDotPickerResult_typekey: PickerResult
  
  var SIPId: String
  
  var SubItems: Any
  
  var Type: String
}
object PickerResult {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    DisplayName: String,
    DuplicateResults: Any,
    Fields: PickerFields,
    Id: String,
    ItemData: Any,
    OfficeDotPickerResult_typekey: PickerResult,
    SIPId: String,
    SubItems: Any,
    Type: String
  ): PickerResult = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], DuplicateResults = DuplicateResults.asInstanceOf[js.Any], Fields = Fields.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ItemData = ItemData.asInstanceOf[js.Any], SIPId = SIPId.asInstanceOf[js.Any], SubItems = SubItems.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PickerResult_typekey")(OfficeDotPickerResult_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerResult]
  }
  
  extension [Self <: PickerResult](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDuplicateResults(value: Any): Self = StObject.set(x, "DuplicateResults", value.asInstanceOf[js.Any])
    
    inline def setFields(value: PickerFields): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setItemData(value: Any): Self = StObject.set(x, "ItemData", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotPickerResult_typekey(value: PickerResult): Self = StObject.set(x, "Office.PickerResult_typekey", value.asInstanceOf[js.Any])
    
    inline def setSIPId(value: String): Self = StObject.set(x, "SIPId", value.asInstanceOf[js.Any])
    
    inline def setSubItems(value: Any): Self = StObject.set(x, "SubItems", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
