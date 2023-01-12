package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulingPolicyListingDetail extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the scheduling policy.
    */
  var arn: String
}
object SchedulingPolicyListingDetail {
  
  inline def apply(arn: String): SchedulingPolicyListingDetail = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulingPolicyListingDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulingPolicyListingDetail] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
