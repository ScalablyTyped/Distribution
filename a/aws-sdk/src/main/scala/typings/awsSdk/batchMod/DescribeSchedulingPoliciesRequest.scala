package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSchedulingPoliciesRequest extends StObject {
  
  /**
    * A list of up to 100 scheduling policy Amazon Resource Name (ARN) entries.
    */
  var arns: StringList
}
object DescribeSchedulingPoliciesRequest {
  
  inline def apply(arns: StringList): DescribeSchedulingPoliciesRequest = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSchedulingPoliciesRequest]
  }
  
  extension [Self <: DescribeSchedulingPoliciesRequest](x: Self) {
    
    inline def setArns(value: StringList): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
    
    inline def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value*))
  }
}
