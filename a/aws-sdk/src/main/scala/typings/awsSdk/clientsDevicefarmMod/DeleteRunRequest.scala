package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRunRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the run to delete.
    */
  var arn: AmazonResourceName
}
object DeleteRunRequest {
  
  inline def apply(arn: AmazonResourceName): DeleteRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRunRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
