package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationSetTrackingOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to add a custom tracking domain to.
    */
  var ConfigurationSetName: typings.awsSdk.clientsPinpointemailMod.ConfigurationSetName
  
  /**
    * The domain that you want to use to track open and click events.
    */
  var CustomRedirectDomain: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.CustomRedirectDomain] = js.undefined
}
object PutConfigurationSetTrackingOptionsRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetTrackingOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutConfigurationSetTrackingOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setCustomRedirectDomain(value: CustomRedirectDomain): Self = StObject.set(x, "CustomRedirectDomain", value.asInstanceOf[js.Any])
    
    inline def setCustomRedirectDomainUndefined: Self = StObject.set(x, "CustomRedirectDomain", js.undefined)
  }
}
