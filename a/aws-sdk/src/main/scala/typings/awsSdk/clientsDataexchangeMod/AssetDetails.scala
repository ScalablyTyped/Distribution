package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetDetails extends StObject {
  
  /**
    * Information about the API Gateway API asset.
    */
  var ApiGatewayApiAsset: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.ApiGatewayApiAsset] = js.undefined
  
  /**
    * The AWS Lake Formation data permission that is the asset.
    */
  var LakeFormationDataPermissionAsset: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.LakeFormationDataPermissionAsset] = js.undefined
  
  /**
    * The Amazon Redshift datashare that is the asset.
    */
  var RedshiftDataShareAsset: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.RedshiftDataShareAsset] = js.undefined
  
  /**
    * The Amazon S3 data access that is the asset.
    */
  var S3DataAccessAsset: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.S3DataAccessAsset] = js.undefined
  
  /**
    * The Amazon S3 object that is the asset.
    */
  var S3SnapshotAsset: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.S3SnapshotAsset] = js.undefined
}
object AssetDetails {
  
  inline def apply(): AssetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetDetails] (val x: Self) extends AnyVal {
    
    inline def setApiGatewayApiAsset(value: ApiGatewayApiAsset): Self = StObject.set(x, "ApiGatewayApiAsset", value.asInstanceOf[js.Any])
    
    inline def setApiGatewayApiAssetUndefined: Self = StObject.set(x, "ApiGatewayApiAsset", js.undefined)
    
    inline def setLakeFormationDataPermissionAsset(value: LakeFormationDataPermissionAsset): Self = StObject.set(x, "LakeFormationDataPermissionAsset", value.asInstanceOf[js.Any])
    
    inline def setLakeFormationDataPermissionAssetUndefined: Self = StObject.set(x, "LakeFormationDataPermissionAsset", js.undefined)
    
    inline def setRedshiftDataShareAsset(value: RedshiftDataShareAsset): Self = StObject.set(x, "RedshiftDataShareAsset", value.asInstanceOf[js.Any])
    
    inline def setRedshiftDataShareAssetUndefined: Self = StObject.set(x, "RedshiftDataShareAsset", js.undefined)
    
    inline def setS3DataAccessAsset(value: S3DataAccessAsset): Self = StObject.set(x, "S3DataAccessAsset", value.asInstanceOf[js.Any])
    
    inline def setS3DataAccessAssetUndefined: Self = StObject.set(x, "S3DataAccessAsset", js.undefined)
    
    inline def setS3SnapshotAsset(value: S3SnapshotAsset): Self = StObject.set(x, "S3SnapshotAsset", value.asInstanceOf[js.Any])
    
    inline def setS3SnapshotAssetUndefined: Self = StObject.set(x, "S3SnapshotAsset", js.undefined)
  }
}
