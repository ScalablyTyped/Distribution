package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
    */
  var resourceArn: string
}
object GetResourceProfileRequest {
  
  inline def apply(resourceArn: string): GetResourceProfileRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
