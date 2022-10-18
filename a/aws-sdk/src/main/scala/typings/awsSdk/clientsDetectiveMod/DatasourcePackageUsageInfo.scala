package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasourcePackageUsageInfo extends StObject {
  
  /**
    * Total volume of data in bytes per day ingested for a given data source package.
    */
  var VolumeUsageInBytes: js.UndefOr[ByteValue] = js.undefined
  
  /**
    * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string. For example, 2021-08-18T16:35:56.284Z.
    */
  var VolumeUsageUpdateTime: js.UndefOr[js.Date] = js.undefined
}
object DatasourcePackageUsageInfo {
  
  inline def apply(): DatasourcePackageUsageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasourcePackageUsageInfo]
  }
  
  extension [Self <: DatasourcePackageUsageInfo](x: Self) {
    
    inline def setVolumeUsageInBytes(value: ByteValue): Self = StObject.set(x, "VolumeUsageInBytes", value.asInstanceOf[js.Any])
    
    inline def setVolumeUsageInBytesUndefined: Self = StObject.set(x, "VolumeUsageInBytes", js.undefined)
    
    inline def setVolumeUsageUpdateTime(value: js.Date): Self = StObject.set(x, "VolumeUsageUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setVolumeUsageUpdateTimeUndefined: Self = StObject.set(x, "VolumeUsageUpdateTime", js.undefined)
  }
}
