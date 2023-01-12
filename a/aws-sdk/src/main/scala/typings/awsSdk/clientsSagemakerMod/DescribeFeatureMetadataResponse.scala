package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeatureMetadataResponse extends StObject {
  
  /**
    * A timestamp indicating when the feature was created.
    */
  var CreationTime: js.Date
  
  /**
    * The description you added to describe the feature.
    */
  var Description: js.UndefOr[FeatureDescription] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the feature group that contains the feature.
    */
  var FeatureGroupArn: typings.awsSdk.clientsSagemakerMod.FeatureGroupArn
  
  /**
    * The name of the feature group that you've specified.
    */
  var FeatureGroupName: typings.awsSdk.clientsSagemakerMod.FeatureGroupName
  
  /**
    * The name of the feature that you've specified.
    */
  var FeatureName: typings.awsSdk.clientsSagemakerMod.FeatureName
  
  /**
    * The data type of the feature.
    */
  var FeatureType: typings.awsSdk.clientsSagemakerMod.FeatureType
  
  /**
    * A timestamp indicating when the metadata for the feature group was modified. For example, if you add a parameter describing the feature, the timestamp changes to reflect the last time you 
    */
  var LastModifiedTime: js.Date
  
  /**
    * The key-value pairs that you added to describe the feature.
    */
  var Parameters: js.UndefOr[FeatureParameters] = js.undefined
}
object DescribeFeatureMetadataResponse {
  
  inline def apply(
    CreationTime: js.Date,
    FeatureGroupArn: FeatureGroupArn,
    FeatureGroupName: FeatureGroupName,
    FeatureName: FeatureName,
    FeatureType: FeatureType,
    LastModifiedTime: js.Date
  ): DescribeFeatureMetadataResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FeatureGroupArn = FeatureGroupArn.asInstanceOf[js.Any], FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], FeatureName = FeatureName.asInstanceOf[js.Any], FeatureType = FeatureType.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFeatureMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFeatureMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: FeatureDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFeatureGroupArn(value: FeatureGroupArn): Self = StObject.set(x, "FeatureGroupArn", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
    
    inline def setFeatureName(value: FeatureName): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureType(value: FeatureType): Self = StObject.set(x, "FeatureType", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: FeatureParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: FeatureParameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
