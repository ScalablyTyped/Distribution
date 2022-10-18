package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkOriginConfiguration extends StObject {
  
  /**
    * The configuration for the Amazon S3 access point or multi-region access point with an Internet origin.
    */
  var internetConfiguration: js.UndefOr[InternetConfiguration] = js.undefined
  
  var vpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
}
object NetworkOriginConfiguration {
  
  inline def apply(): NetworkOriginConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkOriginConfiguration]
  }
  
  extension [Self <: NetworkOriginConfiguration](x: Self) {
    
    inline def setInternetConfiguration(value: InternetConfiguration): Self = StObject.set(x, "internetConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInternetConfigurationUndefined: Self = StObject.set(x, "internetConfiguration", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "vpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "vpcConfiguration", js.undefined)
  }
}
