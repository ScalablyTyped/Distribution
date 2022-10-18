package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFeatureResponse extends StObject {
  
  /**
    * A structure that contains information about the new feature.
    */
  var feature: js.UndefOr[Feature] = js.undefined
}
object CreateFeatureResponse {
  
  inline def apply(): CreateFeatureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFeatureResponse]
  }
  
  extension [Self <: CreateFeatureResponse](x: Self) {
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
  }
}
