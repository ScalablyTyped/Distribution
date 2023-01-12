package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an instance profile.
    */
  var arn: AmazonResourceName
}
object GetInstanceProfileRequest {
  
  inline def apply(arn: AmazonResourceName): GetInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
