package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseVersionResponse extends StObject {
  
  /**
    * License ARN.
    */
  var LicenseArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * License status.
    */
  var Status: js.UndefOr[LicenseStatus] = js.undefined
  
  /**
    * New version of the license.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object CreateLicenseVersionResponse {
  
  inline def apply(): CreateLicenseVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLicenseVersionResponse]
  }
  
  extension [Self <: CreateLicenseVersionResponse](x: Self) {
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseArnUndefined: Self = StObject.set(x, "LicenseArn", js.undefined)
    
    inline def setStatus(value: LicenseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
