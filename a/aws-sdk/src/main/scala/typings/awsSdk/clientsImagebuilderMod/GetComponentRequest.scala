package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component that you want to get. Regex requires the suffix /\d+$.
    */
  var componentBuildVersionArn: ComponentVersionArnOrBuildVersionArn
}
object GetComponentRequest {
  
  inline def apply(componentBuildVersionArn: ComponentVersionArnOrBuildVersionArn): GetComponentRequest = {
    val __obj = js.Dynamic.literal(componentBuildVersionArn = componentBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComponentRequest] (val x: Self) extends AnyVal {
    
    inline def setComponentBuildVersionArn(value: ComponentVersionArnOrBuildVersionArn): Self = StObject.set(x, "componentBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
