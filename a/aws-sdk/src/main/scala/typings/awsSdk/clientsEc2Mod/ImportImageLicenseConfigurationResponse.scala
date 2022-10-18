package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportImageLicenseConfigurationResponse extends StObject {
  
  /**
    * The ARN of a license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
}
object ImportImageLicenseConfigurationResponse {
  
  inline def apply(): ImportImageLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageLicenseConfigurationResponse]
  }
  
  extension [Self <: ImportImageLicenseConfigurationResponse](x: Self) {
    
    inline def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "LicenseConfigurationArn", js.undefined)
  }
}
