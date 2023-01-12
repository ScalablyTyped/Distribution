package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseResponse extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the license.
    */
  var LicenseArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * License status.
    */
  var Status: js.UndefOr[LicenseStatus] = js.undefined
  
  /**
    * License version.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object CreateLicenseResponse {
  
  inline def apply(): CreateLicenseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLicenseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLicenseResponse] (val x: Self) extends AnyVal {
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseArnUndefined: Self = StObject.set(x, "LicenseArn", js.undefined)
    
    inline def setStatus(value: LicenseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
