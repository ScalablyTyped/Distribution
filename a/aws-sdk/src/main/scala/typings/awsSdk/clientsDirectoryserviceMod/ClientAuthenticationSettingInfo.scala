package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAuthenticationSettingInfo extends StObject {
  
  /**
    * The date and time when the status of the client authentication type was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Whether the client authentication type is enabled or disabled for the specified directory.
    */
  var Status: js.UndefOr[ClientAuthenticationStatus] = js.undefined
  
  /**
    * The type of client authentication for the specified directory. If no type is specified, a list of all client authentication types that are supported for the directory is retrieved. 
    */
  var Type: js.UndefOr[ClientAuthenticationType] = js.undefined
}
object ClientAuthenticationSettingInfo {
  
  inline def apply(): ClientAuthenticationSettingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientAuthenticationSettingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientAuthenticationSettingInfo] (val x: Self) extends AnyVal {
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
    
    inline def setStatus(value: ClientAuthenticationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: ClientAuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
