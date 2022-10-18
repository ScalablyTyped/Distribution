package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisableStandardsRequest extends StObject {
  
  /**
    * The ARNs of the standards subscriptions to disable.
    */
  var StandardsSubscriptionArns: typings.awsSdk.clientsSecurityhubMod.StandardsSubscriptionArns
}
object BatchDisableStandardsRequest {
  
  inline def apply(StandardsSubscriptionArns: StandardsSubscriptionArns): BatchDisableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArns = StandardsSubscriptionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisableStandardsRequest]
  }
  
  extension [Self <: BatchDisableStandardsRequest](x: Self) {
    
    inline def setStandardsSubscriptionArns(value: StandardsSubscriptionArns): Self = StObject.set(x, "StandardsSubscriptionArns", value.asInstanceOf[js.Any])
    
    inline def setStandardsSubscriptionArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "StandardsSubscriptionArns", js.Array(value*))
  }
}
