package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLicenseRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the license.
    */
  var LicenseArn: Arn
  
  /**
    * Current version of the license.
    */
  var SourceVersion: String
}
object DeleteLicenseRequest {
  
  inline def apply(LicenseArn: Arn, SourceVersion: String): DeleteLicenseRequest = {
    val __obj = js.Dynamic.literal(LicenseArn = LicenseArn.asInstanceOf[js.Any], SourceVersion = SourceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLicenseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLicenseRequest] (val x: Self) extends AnyVal {
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "SourceVersion", value.asInstanceOf[js.Any])
  }
}
