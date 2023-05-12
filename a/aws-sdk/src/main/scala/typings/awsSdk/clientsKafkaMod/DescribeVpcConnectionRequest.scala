package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcConnectionRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies a MSK VPC connection.
    
    */
  var Arn: string
}
object DescribeVpcConnectionRequest {
  
  inline def apply(Arn: string): DescribeVpcConnectionRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
