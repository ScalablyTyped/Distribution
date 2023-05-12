package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseDetails extends StObject {
  
  /**
    * Response details from the CreateS3DataAccessFromS3Bucket job.
    */
  var CreateS3DataAccessFromS3Bucket: js.UndefOr[CreateS3DataAccessFromS3BucketResponseDetails] = js.undefined
  
  /**
    * Details for the export to signed URL response.
    */
  var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails] = js.undefined
  
  /**
    * Details for the export to Amazon S3 response.
    */
  var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails] = js.undefined
  
  /**
    * Details for the export revisions to Amazon S3 response.
    */
  var ExportRevisionsToS3: js.UndefOr[ExportRevisionsToS3ResponseDetails] = js.undefined
  
  /**
    * The response details.
    */
  var ImportAssetFromApiGatewayApi: js.UndefOr[ImportAssetFromApiGatewayApiResponseDetails] = js.undefined
  
  /**
    * Details for the import from signed URL response.
    */
  var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails] = js.undefined
  
  /**
    * Response details from the ImportAssetsFromLakeFormationTagPolicy job.
    */
  var ImportAssetsFromLakeFormationTagPolicy: js.UndefOr[ImportAssetsFromLakeFormationTagPolicyResponseDetails] = js.undefined
  
  /**
    * Details from an import from Amazon Redshift datashare response.
    */
  var ImportAssetsFromRedshiftDataShares: js.UndefOr[ImportAssetsFromRedshiftDataSharesResponseDetails] = js.undefined
  
  /**
    * Details for the import from Amazon S3 response.
    */
  var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails] = js.undefined
}
object ResponseDetails {
  
  inline def apply(): ResponseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setCreateS3DataAccessFromS3Bucket(value: CreateS3DataAccessFromS3BucketResponseDetails): Self = StObject.set(x, "CreateS3DataAccessFromS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setCreateS3DataAccessFromS3BucketUndefined: Self = StObject.set(x, "CreateS3DataAccessFromS3Bucket", js.undefined)
    
    inline def setExportAssetToSignedUrl(value: ExportAssetToSignedUrlResponseDetails): Self = StObject.set(x, "ExportAssetToSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setExportAssetToSignedUrlUndefined: Self = StObject.set(x, "ExportAssetToSignedUrl", js.undefined)
    
    inline def setExportAssetsToS3(value: ExportAssetsToS3ResponseDetails): Self = StObject.set(x, "ExportAssetsToS3", value.asInstanceOf[js.Any])
    
    inline def setExportAssetsToS3Undefined: Self = StObject.set(x, "ExportAssetsToS3", js.undefined)
    
    inline def setExportRevisionsToS3(value: ExportRevisionsToS3ResponseDetails): Self = StObject.set(x, "ExportRevisionsToS3", value.asInstanceOf[js.Any])
    
    inline def setExportRevisionsToS3Undefined: Self = StObject.set(x, "ExportRevisionsToS3", js.undefined)
    
    inline def setImportAssetFromApiGatewayApi(value: ImportAssetFromApiGatewayApiResponseDetails): Self = StObject.set(x, "ImportAssetFromApiGatewayApi", value.asInstanceOf[js.Any])
    
    inline def setImportAssetFromApiGatewayApiUndefined: Self = StObject.set(x, "ImportAssetFromApiGatewayApi", js.undefined)
    
    inline def setImportAssetFromSignedUrl(value: ImportAssetFromSignedUrlResponseDetails): Self = StObject.set(x, "ImportAssetFromSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setImportAssetFromSignedUrlUndefined: Self = StObject.set(x, "ImportAssetFromSignedUrl", js.undefined)
    
    inline def setImportAssetsFromLakeFormationTagPolicy(value: ImportAssetsFromLakeFormationTagPolicyResponseDetails): Self = StObject.set(x, "ImportAssetsFromLakeFormationTagPolicy", value.asInstanceOf[js.Any])
    
    inline def setImportAssetsFromLakeFormationTagPolicyUndefined: Self = StObject.set(x, "ImportAssetsFromLakeFormationTagPolicy", js.undefined)
    
    inline def setImportAssetsFromRedshiftDataShares(value: ImportAssetsFromRedshiftDataSharesResponseDetails): Self = StObject.set(x, "ImportAssetsFromRedshiftDataShares", value.asInstanceOf[js.Any])
    
    inline def setImportAssetsFromRedshiftDataSharesUndefined: Self = StObject.set(x, "ImportAssetsFromRedshiftDataShares", js.undefined)
    
    inline def setImportAssetsFromS3(value: ImportAssetsFromS3ResponseDetails): Self = StObject.set(x, "ImportAssetsFromS3", value.asInstanceOf[js.Any])
    
    inline def setImportAssetsFromS3Undefined: Self = StObject.set(x, "ImportAssetsFromS3", js.undefined)
  }
}
