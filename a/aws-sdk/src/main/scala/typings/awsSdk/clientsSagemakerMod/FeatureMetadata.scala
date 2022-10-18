package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureMetadata extends StObject {
  
  /**
    * A timestamp indicating when the feature was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An optional description that you specify to better describe the feature.
    */
  var Description: js.UndefOr[FeatureDescription] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the feature group.
    */
  var FeatureGroupArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureGroupArn] = js.undefined
  
  /**
    * The name of the feature group containing the feature.
    */
  var FeatureGroupName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureGroupName] = js.undefined
  
  /**
    * The name of feature.
    */
  var FeatureName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureName] = js.undefined
  
  /**
    * The data type of the feature.
    */
  var FeatureType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureType] = js.undefined
  
  /**
    * A timestamp indicating when the feature was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Optional key-value pairs that you specify to better describe the feature.
    */
  var Parameters: js.UndefOr[FeatureParameters] = js.undefined
}
object FeatureMetadata {
  
  inline def apply(): FeatureMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureMetadata]
  }
  
  extension [Self <: FeatureMetadata](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: FeatureDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFeatureGroupArn(value: FeatureGroupArn): Self = StObject.set(x, "FeatureGroupArn", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupArnUndefined: Self = StObject.set(x, "FeatureGroupArn", js.undefined)
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupNameUndefined: Self = StObject.set(x, "FeatureGroupName", js.undefined)
    
    inline def setFeatureName(value: FeatureName): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureNameUndefined: Self = StObject.set(x, "FeatureName", js.undefined)
    
    inline def setFeatureType(value: FeatureType): Self = StObject.set(x, "FeatureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "FeatureType", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setParameters(value: FeatureParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: FeatureParameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
