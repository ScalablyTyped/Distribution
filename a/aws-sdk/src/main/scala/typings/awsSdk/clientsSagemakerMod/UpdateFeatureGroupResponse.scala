package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFeatureGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the feature group that you're updating.
    */
  var FeatureGroupArn: typings.awsSdk.clientsSagemakerMod.FeatureGroupArn
}
object UpdateFeatureGroupResponse {
  
  inline def apply(FeatureGroupArn: FeatureGroupArn): UpdateFeatureGroupResponse = {
    val __obj = js.Dynamic.literal(FeatureGroupArn = FeatureGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFeatureGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFeatureGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setFeatureGroupArn(value: FeatureGroupArn): Self = StObject.set(x, "FeatureGroupArn", value.asInstanceOf[js.Any])
  }
}
