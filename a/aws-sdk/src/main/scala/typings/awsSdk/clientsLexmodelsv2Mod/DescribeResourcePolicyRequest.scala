package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
    */
  var resourceArn: AmazonResourceName
}
object DescribeResourcePolicyRequest {
  
  inline def apply(resourceArn: AmazonResourceName): DescribeResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourcePolicyRequest]
  }
  
  extension [Self <: DescribeResourcePolicyRequest](x: Self) {
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
