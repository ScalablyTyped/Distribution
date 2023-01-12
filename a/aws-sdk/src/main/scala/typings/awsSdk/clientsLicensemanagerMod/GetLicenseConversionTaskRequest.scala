package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseConversionTaskRequest extends StObject {
  
  /**
    * ID of the license type conversion task to retrieve information on.
    */
  var LicenseConversionTaskId: typings.awsSdk.clientsLicensemanagerMod.LicenseConversionTaskId
}
object GetLicenseConversionTaskRequest {
  
  inline def apply(LicenseConversionTaskId: LicenseConversionTaskId): GetLicenseConversionTaskRequest = {
    val __obj = js.Dynamic.literal(LicenseConversionTaskId = LicenseConversionTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLicenseConversionTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLicenseConversionTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setLicenseConversionTaskId(value: LicenseConversionTaskId): Self = StObject.set(x, "LicenseConversionTaskId", value.asInstanceOf[js.Any])
  }
}
