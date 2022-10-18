package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDetails extends StObject {
  
  /**
    * Details about the export to signed URL request.
    */
  var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlRequestDetails] = js.undefined
  
  /**
    * Details about the export to Amazon S3 request.
    */
  var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3RequestDetails] = js.undefined
  
  /**
    * Details about the export to Amazon S3 request.
    */
  var ExportRevisionsToS3: js.UndefOr[ExportRevisionsToS3RequestDetails] = js.undefined
  
  /**
    * Details about the import from signed URL request.
    */
  var ImportAssetFromApiGatewayApi: js.UndefOr[ImportAssetFromApiGatewayApiRequestDetails] = js.undefined
  
  /**
    * Details about the import from Amazon S3 request.
    */
  var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlRequestDetails] = js.undefined
  
  /**
    * Details from an import from Amazon Redshift datashare request.
    */
  var ImportAssetsFromRedshiftDataShares: js.UndefOr[ImportAssetsFromRedshiftDataSharesRequestDetails] = js.undefined
  
  /**
    * Information about the import asset from API Gateway API request.
    */
  var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3RequestDetails] = js.undefined
}
object RequestDetails {
  
  inline def apply(): RequestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestDetails]
  }
  
  extension [Self <: RequestDetails](x: Self) {
    
    inline def setExportAssetToSignedUrl(value: ExportAssetToSignedUrlRequestDetails): Self = StObject.set(x, "ExportAssetToSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setExportAssetToSignedUrlUndefined: Self = StObject.set(x, "ExportAssetToSignedUrl", js.undefined)
    
    inline def setExportAssetsToS3(value: ExportAssetsToS3RequestDetails): Self = StObject.set(x, "ExportAssetsToS3", value.asInstanceOf[js.Any])
    
    inline def setExportAssetsToS3Undefined: Self = StObject.set(x, "ExportAssetsToS3", js.undefined)
    
    inline def setExportRevisionsToS3(value: ExportRevisionsToS3RequestDetails): Self = StObject.set(x, "ExportRevisionsToS3", value.asInstanceOf[js.Any])
    
    inline def setExportRevisionsToS3Undefined: Self = StObject.set(x, "ExportRevisionsToS3", js.undefined)
    
    inline def setImportAssetFromApiGatewayApi(value: ImportAssetFromApiGatewayApiRequestDetails): Self = StObject.set(x, "ImportAssetFromApiGatewayApi", value.asInstanceOf[js.Any])
    
    inline def setImportAssetFromApiGatewayApiUndefined: Self = StObject.set(x, "ImportAssetFromApiGatewayApi", js.undefined)
    
    inline def setImportAssetFromSignedUrl(value: ImportAssetFromSignedUrlRequestDetails): Self = StObject.set(x, "ImportAssetFromSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setImportAssetFromSignedUrlUndefined: Self = StObject.set(x, "ImportAssetFromSignedUrl", js.undefined)
    
    inline def setImportAssetsFromRedshiftDataShares(value: ImportAssetsFromRedshiftDataSharesRequestDetails): Self = StObject.set(x, "ImportAssetsFromRedshiftDataShares", value.asInstanceOf[js.Any])
    
    inline def setImportAssetsFromRedshiftDataSharesUndefined: Self = StObject.set(x, "ImportAssetsFromRedshiftDataShares", js.undefined)
    
    inline def setImportAssetsFromS3(value: ImportAssetsFromS3RequestDetails): Self = StObject.set(x, "ImportAssetsFromS3", value.asInstanceOf[js.Any])
    
    inline def setImportAssetsFromS3Undefined: Self = StObject.set(x, "ImportAssetsFromS3", js.undefined)
  }
}
