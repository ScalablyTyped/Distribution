package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportImageLicenseConfigurationRequest extends StObject {
  
  /**
    * The ARN of a license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
}
object ImportImageLicenseConfigurationRequest {
  
  inline def apply(): ImportImageLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageLicenseConfigurationRequest]
  }
  
  extension [Self <: ImportImageLicenseConfigurationRequest](x: Self) {
    
    inline def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "LicenseConfigurationArn", js.undefined)
  }
}
