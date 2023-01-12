package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFeatureGroupRequest extends StObject {
  
  /**
    * The name of the FeatureGroup you want to delete. The name must be unique within an Amazon Web Services Region in an Amazon Web Services account. 
    */
  var FeatureGroupName: typings.awsSdk.clientsSagemakerMod.FeatureGroupName
}
object DeleteFeatureGroupRequest {
  
  inline def apply(FeatureGroupName: FeatureGroupName): DeleteFeatureGroupRequest = {
    val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFeatureGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFeatureGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
  }
}
