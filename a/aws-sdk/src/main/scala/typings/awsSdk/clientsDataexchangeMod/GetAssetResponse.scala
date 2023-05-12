package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssetResponse extends StObject {
  
  /**
    * The ARN for the asset.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.Arn] = js.undefined
  
  /**
    * Details about the asset.
    */
  var AssetDetails: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.AssetDetails] = js.undefined
  
  /**
    * The type of asset that is added to a data set.
    */
  var AssetType: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.AssetType] = js.undefined
  
  /**
    * The date and time that the asset was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier for the data set associated with this asset.
    */
  var DataSetId: js.UndefOr[Id] = js.undefined
  
  /**
    * The unique identifier for the asset.
    */
  var Id: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.Id] = js.undefined
  
  /**
    * The name of the asset. When importing from Amazon S3, the Amazon S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target Amazon S3 object key. When importing from Amazon API Gateway API, the API name is used as the asset name. When importing from Amazon Redshift, the datashare name is used as the asset name. When importing from AWS Lake Formation, the static values of "Database(s) included in the LF-tag policy" or "Table(s) included in the LF-tag policy" are used as the asset name.
    */
  var Name: js.UndefOr[AssetName] = js.undefined
  
  /**
    * The unique identifier for the revision associated with this asset.
    */
  var RevisionId: js.UndefOr[Id] = js.undefined
  
  /**
    * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when an asset owner is viewing the entitled copy of its owned asset.
    */
  var SourceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The date and time that the asset was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object GetAssetResponse {
  
  inline def apply(): GetAssetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssetResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAssetDetails(value: AssetDetails): Self = StObject.set(x, "AssetDetails", value.asInstanceOf[js.Any])
    
    inline def setAssetDetailsUndefined: Self = StObject.set(x, "AssetDetails", js.undefined)
    
    inline def setAssetType(value: AssetType): Self = StObject.set(x, "AssetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "AssetType", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: AssetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setSourceId(value: Id): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
