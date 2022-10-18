package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeatureTransformationResponse extends StObject {
  
  /**
    * A listing of the FeatureTransformation properties.
    */
  var featureTransformation: js.UndefOr[FeatureTransformation] = js.undefined
}
object DescribeFeatureTransformationResponse {
  
  inline def apply(): DescribeFeatureTransformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFeatureTransformationResponse]
  }
  
  extension [Self <: DescribeFeatureTransformationResponse](x: Self) {
    
    inline def setFeatureTransformation(value: FeatureTransformation): Self = StObject.set(x, "featureTransformation", value.asInstanceOf[js.Any])
    
    inline def setFeatureTransformationUndefined: Self = StObject.set(x, "featureTransformation", js.undefined)
  }
}
