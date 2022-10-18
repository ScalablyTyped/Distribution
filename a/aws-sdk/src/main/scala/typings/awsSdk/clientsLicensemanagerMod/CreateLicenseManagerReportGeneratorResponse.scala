package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseManagerReportGeneratorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new report generator.
    */
  var LicenseManagerReportGeneratorArn: js.UndefOr[String] = js.undefined
}
object CreateLicenseManagerReportGeneratorResponse {
  
  inline def apply(): CreateLicenseManagerReportGeneratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLicenseManagerReportGeneratorResponse]
  }
  
  extension [Self <: CreateLicenseManagerReportGeneratorResponse](x: Self) {
    
    inline def setLicenseManagerReportGeneratorArn(value: String): Self = StObject.set(x, "LicenseManagerReportGeneratorArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseManagerReportGeneratorArnUndefined: Self = StObject.set(x, "LicenseManagerReportGeneratorArn", js.undefined)
  }
}
