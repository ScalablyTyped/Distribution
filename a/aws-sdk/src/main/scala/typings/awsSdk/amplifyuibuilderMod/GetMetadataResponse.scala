package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetadataResponse extends StObject {
  
  /**
    * Represents the configuration settings for the features metadata.
    */
  var features: FeaturesMap
}
object GetMetadataResponse {
  
  inline def apply(features: FeaturesMap): GetMetadataResponse = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetadataResponse]
  }
  
  extension [Self <: GetMetadataResponse](x: Self) {
    
    inline def setFeatures(value: FeaturesMap): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
  }
}
