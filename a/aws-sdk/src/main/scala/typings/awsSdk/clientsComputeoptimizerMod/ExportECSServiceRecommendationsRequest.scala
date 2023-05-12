package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportECSServiceRecommendationsRequest extends StObject {
  
  /**
    *  The Amazon Web Services account IDs for the export Amazon ECS service recommendations.  If your account is the management account or the delegated administrator of an organization, use this parameter to specify the member account you want to export recommendations to. This parameter can't be specified together with the include member accounts parameter. The parameters are mutually exclusive. If this parameter or the include member accounts parameter is omitted, the recommendations for member accounts aren't included in the export. You can specify multiple account IDs per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.undefined
  
  /**
    * The recommendations data to include in the export file. For more information about the fields that can be exported, see Exported files in the Compute Optimizer User Guide.
    */
  var fieldsToExport: js.UndefOr[ExportableECSServiceFields] = js.undefined
  
  /**
    *  The format of the export file.  The CSV file is the only export file format currently supported.
    */
  var fileFormat: js.UndefOr[FileFormat] = js.undefined
  
  /**
    *  An array of objects to specify a filter that exports a more specific set of Amazon ECS service recommendations. 
    */
  var filters: js.UndefOr[ECSServiceRecommendationFilters] = js.undefined
  
  /**
    * If your account is the management account or the delegated administrator of an organization, this parameter indicates whether to include recommendations for resources in all member accounts of the organization. The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer must be enabled in the organization account. For more information, see Compute Optimizer and Amazon Web Services Organizations trusted access in the Compute Optimizer User Guide. If this parameter is omitted, recommendations for member accounts of the organization aren't included in the export file. If this parameter or the account ID parameter is omitted, recommendations for member accounts aren't included in the export.
    */
  var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined
  
  var s3DestinationConfig: S3DestinationConfig
}
object ExportECSServiceRecommendationsRequest {
  
  inline def apply(s3DestinationConfig: S3DestinationConfig): ExportECSServiceRecommendationsRequest = {
    val __obj = js.Dynamic.literal(s3DestinationConfig = s3DestinationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportECSServiceRecommendationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportECSServiceRecommendationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setFieldsToExport(value: ExportableECSServiceFields): Self = StObject.set(x, "fieldsToExport", value.asInstanceOf[js.Any])
    
    inline def setFieldsToExportUndefined: Self = StObject.set(x, "fieldsToExport", js.undefined)
    
    inline def setFieldsToExportVarargs(value: ExportableECSServiceField*): Self = StObject.set(x, "fieldsToExport", js.Array(value*))
    
    inline def setFileFormat(value: FileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
    
    inline def setFilters(value: ECSServiceRecommendationFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ECSServiceRecommendationFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setIncludeMemberAccounts(value: IncludeMemberAccounts): Self = StObject.set(x, "includeMemberAccounts", value.asInstanceOf[js.Any])
    
    inline def setIncludeMemberAccountsUndefined: Self = StObject.set(x, "includeMemberAccounts", js.undefined)
    
    inline def setS3DestinationConfig(value: S3DestinationConfig): Self = StObject.set(x, "s3DestinationConfig", value.asInstanceOf[js.Any])
  }
}
