package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryChannelStatus extends StObject {
  
  /**
    * A list that contains the status of the delivery of the configuration history to the specified Amazon S3 bucket.
    */
  var configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined
  
  /**
    * A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
    */
  var configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined
  
  /**
    * A list containing the status of the delivery of the configuration stream notification to the specified Amazon SNS topic.
    */
  var configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.undefined
  
  /**
    * The name of the delivery channel.
    */
  var name: js.UndefOr[String] = js.undefined
}
object DeliveryChannelStatus {
  
  inline def apply(): DeliveryChannelStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryChannelStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryChannelStatus] (val x: Self) extends AnyVal {
    
    inline def setConfigHistoryDeliveryInfo(value: ConfigExportDeliveryInfo): Self = StObject.set(x, "configHistoryDeliveryInfo", value.asInstanceOf[js.Any])
    
    inline def setConfigHistoryDeliveryInfoUndefined: Self = StObject.set(x, "configHistoryDeliveryInfo", js.undefined)
    
    inline def setConfigSnapshotDeliveryInfo(value: ConfigExportDeliveryInfo): Self = StObject.set(x, "configSnapshotDeliveryInfo", value.asInstanceOf[js.Any])
    
    inline def setConfigSnapshotDeliveryInfoUndefined: Self = StObject.set(x, "configSnapshotDeliveryInfo", js.undefined)
    
    inline def setConfigStreamDeliveryInfo(value: ConfigStreamDeliveryInfo): Self = StObject.set(x, "configStreamDeliveryInfo", value.asInstanceOf[js.Any])
    
    inline def setConfigStreamDeliveryInfoUndefined: Self = StObject.set(x, "configStreamDeliveryInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
