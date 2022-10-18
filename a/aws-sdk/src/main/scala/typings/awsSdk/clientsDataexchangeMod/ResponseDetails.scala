package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseDetails extends StObject {
  
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
  
  extension [Self <: ResponseDetails](x: Self) {
    
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
    
    inline def setImportAssetsFromRedshiftDataShares(value: ImportAssetsFromRedshiftDataSharesResponseDetails): Self = StObject.set(x, "ImportAssetsFromRedshiftDataShares", value.asInstanceOf[js.Any])
    
    inline def setImportAssetsFromRedshiftDataSharesUndefined: Self = StObject.set(x, "ImportAssetsFromRedshiftDataShares", js.undefined)
    
    inline def setImportAssetsFromS3(value: ImportAssetsFromS3ResponseDetails): Self = StObject.set(x, "ImportAssetsFromS3", value.asInstanceOf[js.Any])
    
    inline def setImportAssetsFromS3Undefined: Self = StObject.set(x, "ImportAssetsFromS3", js.undefined)
  }
}
