package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the auto show information of a {@link DataPilotField} .
  *
  * If enabled, only a number of items with the highest or lowest result values are shown. The other items are hidden automatically.
  * @see com.sun.star.sheet.DataPilotField
  */
trait DataPilotFieldAutoShowInfo extends StObject {
  
  /** specifies the field where the values to show and select are taken from. */
  var DataField: String
  
  /** specifies whether the AutoShow feature is enabled or not. */
  var IsEnabled: Boolean
  
  /** specifies the number of the items to show. */
  var ItemCount: Double
  
  /**
    * specifies the mode which items have to be shown.
    * @see com.sun.star.sheet.DataPilotFieldShowItemsMode
    */
  var ShowItemsMode: Double
}
object DataPilotFieldAutoShowInfo {
  
  inline def apply(DataField: String, IsEnabled: Boolean, ItemCount: Double, ShowItemsMode: Double): DataPilotFieldAutoShowInfo = {
    val __obj = js.Dynamic.literal(DataField = DataField.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], ShowItemsMode = ShowItemsMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldAutoShowInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPilotFieldAutoShowInfo] (val x: Self) extends AnyVal {
    
    inline def setDataField(value: String): Self = StObject.set(x, "DataField", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setShowItemsMode(value: Double): Self = StObject.set(x, "ShowItemsMode", value.asInstanceOf[js.Any])
  }
}
