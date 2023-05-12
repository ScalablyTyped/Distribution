package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcConnectionRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK VPC connection.
    
    */
  var Arn: string
}
object DeleteVpcConnectionRequest {
  
  inline def apply(Arn: string): DeleteVpcConnectionRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVpcConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
