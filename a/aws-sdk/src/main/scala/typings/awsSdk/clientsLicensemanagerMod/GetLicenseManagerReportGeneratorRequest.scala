package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseManagerReportGeneratorRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the report generator.
    */
  var LicenseManagerReportGeneratorArn: String
}
object GetLicenseManagerReportGeneratorRequest {
  
  inline def apply(LicenseManagerReportGeneratorArn: String): GetLicenseManagerReportGeneratorRequest = {
    val __obj = js.Dynamic.literal(LicenseManagerReportGeneratorArn = LicenseManagerReportGeneratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLicenseManagerReportGeneratorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLicenseManagerReportGeneratorRequest] (val x: Self) extends AnyVal {
    
    inline def setLicenseManagerReportGeneratorArn(value: String): Self = StObject.set(x, "LicenseManagerReportGeneratorArn", value.asInstanceOf[js.Any])
  }
}
