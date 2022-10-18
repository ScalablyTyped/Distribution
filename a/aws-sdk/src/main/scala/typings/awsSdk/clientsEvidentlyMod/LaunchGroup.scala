package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchGroup extends StObject {
  
  /**
    * A description of the launch group.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The feature variation for this launch group. This is a key-value pair.
    */
  var featureVariations: FeatureToVariationMap
  
  /**
    * The name of the launch group.
    */
  var name: GroupName
}
object LaunchGroup {
  
  inline def apply(featureVariations: FeatureToVariationMap, name: GroupName): LaunchGroup = {
    val __obj = js.Dynamic.literal(featureVariations = featureVariations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchGroup]
  }
  
  extension [Self <: LaunchGroup](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFeatureVariations(value: FeatureToVariationMap): Self = StObject.set(x, "featureVariations", value.asInstanceOf[js.Any])
    
    inline def setName(value: GroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
