package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportEBSVolumeRecommendationsRequest extends StObject {
  
  /**
    * The IDs of the Amazon Web Services accounts for which to export Amazon EBS volume recommendations. If your account is the management account of an organization, use this parameter to specify the member account for which you want to export recommendations. This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive. Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted. You can specify multiple account IDs per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.undefined
  
  /**
    * The recommendations data to include in the export file. For more information about the fields that can be exported, see Exported files in the Compute Optimizer User Guide.
    */
  var fieldsToExport: js.UndefOr[ExportableVolumeFields] = js.undefined
  
  /**
    * The format of the export file. The only export file format currently supported is Csv.
    */
  var fileFormat: js.UndefOr[FileFormat] = js.undefined
  
  /**
    * An array of objects to specify a filter that exports a more specific set of Amazon EBS volume recommendations.
    */
  var filters: js.UndefOr[EBSFilters] = js.undefined
  
  /**
    * Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the management account of an organization. The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer must be enabled in the organization account. For more information, see Compute Optimizer and Amazon Web Services Organizations trusted access in the Compute Optimizer User Guide. Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted. This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive. Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.
    */
  var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined
  
  var s3DestinationConfig: S3DestinationConfig
}
object ExportEBSVolumeRecommendationsRequest {
  
  inline def apply(s3DestinationConfig: S3DestinationConfig): ExportEBSVolumeRecommendationsRequest = {
    val __obj = js.Dynamic.literal(s3DestinationConfig = s3DestinationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportEBSVolumeRecommendationsRequest]
  }
  
  extension [Self <: ExportEBSVolumeRecommendationsRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setFieldsToExport(value: ExportableVolumeFields): Self = StObject.set(x, "fieldsToExport", value.asInstanceOf[js.Any])
    
    inline def setFieldsToExportUndefined: Self = StObject.set(x, "fieldsToExport", js.undefined)
    
    inline def setFieldsToExportVarargs(value: ExportableVolumeField*): Self = StObject.set(x, "fieldsToExport", js.Array(value*))
    
    inline def setFileFormat(value: FileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
    
    inline def setFilters(value: EBSFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: EBSFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setIncludeMemberAccounts(value: IncludeMemberAccounts): Self = StObject.set(x, "includeMemberAccounts", value.asInstanceOf[js.Any])
    
    inline def setIncludeMemberAccountsUndefined: Self = StObject.set(x, "includeMemberAccounts", js.undefined)
    
    inline def setS3DestinationConfig(value: S3DestinationConfig): Self = StObject.set(x, "s3DestinationConfig", value.asInstanceOf[js.Any])
  }
}
