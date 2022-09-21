package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSchedulingPolicyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the scheduling policy. The format is aws:Partition:batch:Region:Account:scheduling-policy/Name . For example, aws:aws:batch:us-west-2:012345678910:scheduling-policy/MySchedulingPolicy.
    */
  var arn: String
  
  /**
    * The name of the scheduling policy.
    */
  var name: String
}
object CreateSchedulingPolicyResponse {
  
  inline def apply(arn: String, name: String): CreateSchedulingPolicyResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchedulingPolicyResponse]
  }
  
  extension [Self <: CreateSchedulingPolicyResponse](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
