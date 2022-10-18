package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  /**
    * The last modified date of the client device.
    */
  var DeviceLastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The key for the record.
    */
  var Key: js.UndefOr[RecordKey] = js.undefined
  
  /**
    * The user/device that made the last change to this record.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The date on which the record was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The server sync count for this record.
    */
  var SyncCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The value for the record.
    */
  var Value: js.UndefOr[RecordValue] = js.undefined
}
object Record {
  
  inline def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  extension [Self <: Record](x: Self) {
    
    inline def setDeviceLastModifiedDate(value: js.Date): Self = StObject.set(x, "DeviceLastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setDeviceLastModifiedDateUndefined: Self = StObject.set(x, "DeviceLastModifiedDate", js.undefined)
    
    inline def setKey(value: RecordKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setSyncCount(value: Long): Self = StObject.set(x, "SyncCount", value.asInstanceOf[js.Any])
    
    inline def setSyncCountUndefined: Self = StObject.set(x, "SyncCount", js.undefined)
    
    inline def setValue(value: RecordValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
