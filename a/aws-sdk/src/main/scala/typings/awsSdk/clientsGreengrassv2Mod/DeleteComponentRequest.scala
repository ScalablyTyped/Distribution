package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteComponentRequest extends StObject {
  
  /**
    * The ARN of the component version.
    */
  var arn: ComponentVersionARN
}
object DeleteComponentRequest {
  
  inline def apply(arn: ComponentVersionARN): DeleteComponentRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComponentRequest]
  }
  
  extension [Self <: DeleteComponentRequest](x: Self) {
    
    inline def setArn(value: ComponentVersionARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
