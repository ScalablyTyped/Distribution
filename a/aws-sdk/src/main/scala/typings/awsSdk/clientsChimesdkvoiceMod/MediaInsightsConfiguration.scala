package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaInsightsConfiguration extends StObject {
  
  /**
    * The configuration's ARN.
    */
  var ConfigurationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Denotes the configration as enabled or disabled.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
}
object MediaInsightsConfiguration {
  
  inline def apply(): MediaInsightsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInsightsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaInsightsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setConfigurationArn(value: Arn): Self = StObject.set(x, "ConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationArnUndefined: Self = StObject.set(x, "ConfigurationArn", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
  }
}
