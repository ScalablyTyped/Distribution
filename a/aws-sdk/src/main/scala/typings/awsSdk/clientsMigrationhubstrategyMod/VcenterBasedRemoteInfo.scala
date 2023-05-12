package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VcenterBasedRemoteInfo extends StObject {
  
  /**
    * The type of the operating system.
    */
  var osType: js.UndefOr[OSType] = js.undefined
  
  /**
    * The time when the remote server based on vCenter was last configured.
    */
  var vcenterConfigurationTimeStamp: js.UndefOr[String] = js.undefined
}
object VcenterBasedRemoteInfo {
  
  inline def apply(): VcenterBasedRemoteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VcenterBasedRemoteInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VcenterBasedRemoteInfo] (val x: Self) extends AnyVal {
    
    inline def setOsType(value: OSType): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
    
    inline def setOsTypeUndefined: Self = StObject.set(x, "osType", js.undefined)
    
    inline def setVcenterConfigurationTimeStamp(value: String): Self = StObject.set(x, "vcenterConfigurationTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setVcenterConfigurationTimeStampUndefined: Self = StObject.set(x, "vcenterConfigurationTimeStamp", js.undefined)
  }
}
