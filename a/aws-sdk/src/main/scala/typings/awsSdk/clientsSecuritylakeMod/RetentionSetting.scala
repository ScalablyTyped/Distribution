package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionSetting extends StObject {
  
  /**
    * The retention period specifies a fixed period of time during which the Security Lake object remains locked. You can specify the retention period in days for one or more sources. 
    */
  var retentionPeriod: js.UndefOr[RetentionSettingRetentionPeriodInteger] = js.undefined
  
  /**
    * The range of storage classes that you can choose from based on the data access, resiliency, and cost requirements of your workloads.
    */
  var storageClass: js.UndefOr[StorageClass] = js.undefined
}
object RetentionSetting {
  
  inline def apply(): RetentionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetentionSetting] (val x: Self) extends AnyVal {
    
    inline def setRetentionPeriod(value: RetentionSettingRetentionPeriodInteger): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
  }
}
