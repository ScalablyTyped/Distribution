package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchGroupConfig extends StObject {
  
  /**
    * A description of the launch group.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The feature that this launch is using.
    */
  var feature: FeatureName
  
  /**
    * A name for this launch group.
    */
  var name: GroupName
  
  /**
    * The feature variation to use for this launch group.
    */
  var variation: VariationName
}
object LaunchGroupConfig {
  
  inline def apply(feature: FeatureName, name: GroupName, variation: VariationName): LaunchGroupConfig = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchGroupConfig]
  }
  
  extension [Self <: LaunchGroupConfig](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFeature(value: FeatureName): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setName(value: GroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVariation(value: VariationName): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
  }
}
