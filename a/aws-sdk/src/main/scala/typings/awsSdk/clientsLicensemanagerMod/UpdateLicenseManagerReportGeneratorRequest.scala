package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLicenseManagerReportGeneratorRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: ClientRequestToken
  
  /**
    * Description of the report generator.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the report generator to update.
    */
  var LicenseManagerReportGeneratorArn: String
  
  /**
    * The report context.
    */
  var ReportContext: typings.awsSdk.clientsLicensemanagerMod.ReportContext
  
  /**
    * Frequency by which reports are generated.
    */
  var ReportFrequency: typings.awsSdk.clientsLicensemanagerMod.ReportFrequency
  
  /**
    * Name of the report generator.
    */
  var ReportGeneratorName: typings.awsSdk.clientsLicensemanagerMod.ReportGeneratorName
  
  /**
    * Type of reports to generate. The following report types are supported:   License configuration report - Reports the number and details of consumed licenses for a license configuration.   Resource report - Reports the tracked licenses and resource consumption for a license configuration.  
    */
  var Type: ReportTypeList
}
object UpdateLicenseManagerReportGeneratorRequest {
  
  inline def apply(
    ClientToken: ClientRequestToken,
    LicenseManagerReportGeneratorArn: String,
    ReportContext: ReportContext,
    ReportFrequency: ReportFrequency,
    ReportGeneratorName: ReportGeneratorName,
    Type: ReportTypeList
  ): UpdateLicenseManagerReportGeneratorRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], LicenseManagerReportGeneratorArn = LicenseManagerReportGeneratorArn.asInstanceOf[js.Any], ReportContext = ReportContext.asInstanceOf[js.Any], ReportFrequency = ReportFrequency.asInstanceOf[js.Any], ReportGeneratorName = ReportGeneratorName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseManagerReportGeneratorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLicenseManagerReportGeneratorRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientRequestToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLicenseManagerReportGeneratorArn(value: String): Self = StObject.set(x, "LicenseManagerReportGeneratorArn", value.asInstanceOf[js.Any])
    
    inline def setReportContext(value: ReportContext): Self = StObject.set(x, "ReportContext", value.asInstanceOf[js.Any])
    
    inline def setReportFrequency(value: ReportFrequency): Self = StObject.set(x, "ReportFrequency", value.asInstanceOf[js.Any])
    
    inline def setReportGeneratorName(value: ReportGeneratorName): Self = StObject.set(x, "ReportGeneratorName", value.asInstanceOf[js.Any])
    
    inline def setType(value: ReportTypeList): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: ReportType*): Self = StObject.set(x, "Type", js.Array(value*))
  }
}
