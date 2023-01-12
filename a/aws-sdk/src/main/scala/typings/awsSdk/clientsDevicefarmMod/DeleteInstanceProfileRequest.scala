package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile you are requesting to delete.
    */
  var arn: AmazonResourceName
}
object DeleteInstanceProfileRequest {
  
  inline def apply(arn: AmazonResourceName): DeleteInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInstanceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
