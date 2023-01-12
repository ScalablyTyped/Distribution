package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetResponse extends StObject {
  
  /**
    * The ARN of the asset, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId} 
    */
  var assetArn: ARN
  
  /**
    * The composite models for the asset.
    */
  var assetCompositeModels: js.UndefOr[AssetCompositeModels] = js.undefined
  
  /**
    * The date the asset was created, in Unix epoch time.
    */
  var assetCreationDate: js.Date
  
  /**
    * A description for the asset.
    */
  var assetDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * A list of asset hierarchies that each contain a hierarchyId. A hierarchy specifies allowed parent/child asset relationships.
    */
  var assetHierarchies: AssetHierarchies
  
  /**
    * The ID of the asset.
    */
  var assetId: ID
  
  /**
    * The date the asset was last updated, in Unix epoch time.
    */
  var assetLastUpdateDate: js.Date
  
  /**
    * The ID of the asset model that was used to create the asset.
    */
  var assetModelId: ID
  
  /**
    * The name of the asset.
    */
  var assetName: Name
  
  /**
    * The list of asset properties for the asset. This object doesn't include properties that you define in composite models. You can find composite model properties in the assetCompositeModels object.
    */
  var assetProperties: AssetProperties
  
  /**
    * The current status of the asset, which contains a state and any error message.
    */
  var assetStatus: AssetStatus
}
object DescribeAssetResponse {
  
  inline def apply(
    assetArn: ARN,
    assetCreationDate: js.Date,
    assetHierarchies: AssetHierarchies,
    assetId: ID,
    assetLastUpdateDate: js.Date,
    assetModelId: ID,
    assetName: Name,
    assetProperties: AssetProperties,
    assetStatus: AssetStatus
  ): DescribeAssetResponse = {
    val __obj = js.Dynamic.literal(assetArn = assetArn.asInstanceOf[js.Any], assetCreationDate = assetCreationDate.asInstanceOf[js.Any], assetHierarchies = assetHierarchies.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], assetLastUpdateDate = assetLastUpdateDate.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any], assetProperties = assetProperties.asInstanceOf[js.Any], assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAssetResponse] (val x: Self) extends AnyVal {
    
    inline def setAssetArn(value: ARN): Self = StObject.set(x, "assetArn", value.asInstanceOf[js.Any])
    
    inline def setAssetCompositeModels(value: AssetCompositeModels): Self = StObject.set(x, "assetCompositeModels", value.asInstanceOf[js.Any])
    
    inline def setAssetCompositeModelsUndefined: Self = StObject.set(x, "assetCompositeModels", js.undefined)
    
    inline def setAssetCompositeModelsVarargs(value: AssetCompositeModel*): Self = StObject.set(x, "assetCompositeModels", js.Array(value*))
    
    inline def setAssetCreationDate(value: js.Date): Self = StObject.set(x, "assetCreationDate", value.asInstanceOf[js.Any])
    
    inline def setAssetDescription(value: Description): Self = StObject.set(x, "assetDescription", value.asInstanceOf[js.Any])
    
    inline def setAssetDescriptionUndefined: Self = StObject.set(x, "assetDescription", js.undefined)
    
    inline def setAssetHierarchies(value: AssetHierarchies): Self = StObject.set(x, "assetHierarchies", value.asInstanceOf[js.Any])
    
    inline def setAssetHierarchiesVarargs(value: AssetHierarchy*): Self = StObject.set(x, "assetHierarchies", js.Array(value*))
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetLastUpdateDate(value: js.Date): Self = StObject.set(x, "assetLastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setAssetName(value: Name): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    inline def setAssetProperties(value: AssetProperties): Self = StObject.set(x, "assetProperties", value.asInstanceOf[js.Any])
    
    inline def setAssetPropertiesVarargs(value: AssetProperty*): Self = StObject.set(x, "assetProperties", js.Array(value*))
    
    inline def setAssetStatus(value: AssetStatus): Self = StObject.set(x, "assetStatus", value.asInstanceOf[js.Any])
  }
}
