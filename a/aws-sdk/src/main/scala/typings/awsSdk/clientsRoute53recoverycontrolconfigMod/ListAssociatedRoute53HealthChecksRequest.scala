package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedRoute53HealthChecksRequest extends StObject {
  
  /**
    * The number of objects that you want to return with this call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.MaxResults] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the routing control.
    */
  var RoutingControlArn: string
}
object ListAssociatedRoute53HealthChecksRequest {
  
  inline def apply(RoutingControlArn: string): ListAssociatedRoute53HealthChecksRequest = {
    val __obj = js.Dynamic.literal(RoutingControlArn = RoutingControlArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedRoute53HealthChecksRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssociatedRoute53HealthChecksRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRoutingControlArn(value: string): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
  }
}
