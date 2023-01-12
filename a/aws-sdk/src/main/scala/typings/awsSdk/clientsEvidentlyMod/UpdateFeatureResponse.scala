package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFeatureResponse extends StObject {
  
  /**
    * A structure that contains information about the updated feature.
    */
  var feature: Feature
}
object UpdateFeatureResponse {
  
  inline def apply(feature: Feature): UpdateFeatureResponse = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFeatureResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFeatureResponse] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
