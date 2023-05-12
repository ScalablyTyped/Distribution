package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPAddressBasedRemoteInfo extends StObject {
  
  /**
    * The type of authorization.
    */
  var authType: js.UndefOr[AuthType] = js.undefined
  
  /**
    * The time stamp of the configuration.
    */
  var ipAddressConfigurationTimeStamp: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the operating system.
    */
  var osType: js.UndefOr[OSType] = js.undefined
}
object IPAddressBasedRemoteInfo {
  
  inline def apply(): IPAddressBasedRemoteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPAddressBasedRemoteInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPAddressBasedRemoteInfo] (val x: Self) extends AnyVal {
    
    inline def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setIpAddressConfigurationTimeStamp(value: String): Self = StObject.set(x, "ipAddressConfigurationTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setIpAddressConfigurationTimeStampUndefined: Self = StObject.set(x, "ipAddressConfigurationTimeStamp", js.undefined)
    
    inline def setOsType(value: OSType): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
    
    inline def setOsTypeUndefined: Self = StObject.set(x, "osType", js.undefined)
  }
}
