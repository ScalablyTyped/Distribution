package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the license.
    */
  var LicenseArn: Arn
  
  /**
    * License version.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object GetLicenseRequest {
  
  inline def apply(LicenseArn: Arn): GetLicenseRequest = {
    val __obj = js.Dynamic.literal(LicenseArn = LicenseArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLicenseRequest]
  }
  
  extension [Self <: GetLicenseRequest](x: Self) {
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
