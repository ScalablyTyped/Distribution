package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetModelResponse extends StObject {
  
  /**
    * The ARN of the asset model, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId} 
    */
  var assetModelArn: ARN
  
  /**
    * The list of composite asset models for the asset model.
    */
  var assetModelCompositeModels: js.UndefOr[AssetModelCompositeModels] = js.undefined
  
  /**
    * The date the asset model was created, in Unix epoch time.
    */
  var assetModelCreationDate: js.Date
  
  /**
    * The asset model's description.
    */
  var assetModelDescription: Description
  
  /**
    * A list of asset model hierarchies that each contain a childAssetModelId and a hierarchyId (named id). A hierarchy specifies allowed parent/child asset relationships for an asset model.
    */
  var assetModelHierarchies: AssetModelHierarchies
  
  /**
    * The ID of the asset model.
    */
  var assetModelId: ID
  
  /**
    * The date the asset model was last updated, in Unix epoch time.
    */
  var assetModelLastUpdateDate: js.Date
  
  /**
    * The name of the asset model.
    */
  var assetModelName: Name
  
  /**
    * The list of asset properties for the asset model. This object doesn't include properties that you define in composite models. You can find composite model properties in the assetModelCompositeModels object.
    */
  var assetModelProperties: AssetModelProperties
  
  /**
    * The current status of the asset model, which contains a state and any error message.
    */
  var assetModelStatus: AssetModelStatus
}
object DescribeAssetModelResponse {
  
  inline def apply(
    assetModelArn: ARN,
    assetModelCreationDate: js.Date,
    assetModelDescription: Description,
    assetModelHierarchies: AssetModelHierarchies,
    assetModelId: ID,
    assetModelLastUpdateDate: js.Date,
    assetModelName: Name,
    assetModelProperties: AssetModelProperties,
    assetModelStatus: AssetModelStatus
  ): DescribeAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelArn = assetModelArn.asInstanceOf[js.Any], assetModelCreationDate = assetModelCreationDate.asInstanceOf[js.Any], assetModelDescription = assetModelDescription.asInstanceOf[js.Any], assetModelHierarchies = assetModelHierarchies.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], assetModelLastUpdateDate = assetModelLastUpdateDate.asInstanceOf[js.Any], assetModelName = assetModelName.asInstanceOf[js.Any], assetModelProperties = assetModelProperties.asInstanceOf[js.Any], assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAssetModelResponse] (val x: Self) extends AnyVal {
    
    inline def setAssetModelArn(value: ARN): Self = StObject.set(x, "assetModelArn", value.asInstanceOf[js.Any])
    
    inline def setAssetModelCompositeModels(value: AssetModelCompositeModels): Self = StObject.set(x, "assetModelCompositeModels", value.asInstanceOf[js.Any])
    
    inline def setAssetModelCompositeModelsUndefined: Self = StObject.set(x, "assetModelCompositeModels", js.undefined)
    
    inline def setAssetModelCompositeModelsVarargs(value: AssetModelCompositeModel*): Self = StObject.set(x, "assetModelCompositeModels", js.Array(value*))
    
    inline def setAssetModelCreationDate(value: js.Date): Self = StObject.set(x, "assetModelCreationDate", value.asInstanceOf[js.Any])
    
    inline def setAssetModelDescription(value: Description): Self = StObject.set(x, "assetModelDescription", value.asInstanceOf[js.Any])
    
    inline def setAssetModelHierarchies(value: AssetModelHierarchies): Self = StObject.set(x, "assetModelHierarchies", value.asInstanceOf[js.Any])
    
    inline def setAssetModelHierarchiesVarargs(value: AssetModelHierarchy*): Self = StObject.set(x, "assetModelHierarchies", js.Array(value*))
    
    inline def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setAssetModelLastUpdateDate(value: js.Date): Self = StObject.set(x, "assetModelLastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setAssetModelName(value: Name): Self = StObject.set(x, "assetModelName", value.asInstanceOf[js.Any])
    
    inline def setAssetModelProperties(value: AssetModelProperties): Self = StObject.set(x, "assetModelProperties", value.asInstanceOf[js.Any])
    
    inline def setAssetModelPropertiesVarargs(value: AssetModelProperty*): Self = StObject.set(x, "assetModelProperties", js.Array(value*))
    
    inline def setAssetModelStatus(value: AssetModelStatus): Self = StObject.set(x, "assetModelStatus", value.asInstanceOf[js.Any])
  }
}
