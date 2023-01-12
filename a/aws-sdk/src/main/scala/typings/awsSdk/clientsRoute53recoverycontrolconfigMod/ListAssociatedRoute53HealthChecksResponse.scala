package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedRoute53HealthChecksResponse extends StObject {
  
  /**
    * Identifiers for the health checks.
    */
  var HealthCheckIds: js.UndefOr[listOfStringMax36PatternS] = js.undefined
  
  /**
    * Next token for listing health checks.
    */
  var NextToken: js.UndefOr[stringMin1Max8096PatternS] = js.undefined
}
object ListAssociatedRoute53HealthChecksResponse {
  
  inline def apply(): ListAssociatedRoute53HealthChecksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedRoute53HealthChecksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssociatedRoute53HealthChecksResponse] (val x: Self) extends AnyVal {
    
    inline def setHealthCheckIds(value: listOfStringMax36PatternS): Self = StObject.set(x, "HealthCheckIds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckIdsUndefined: Self = StObject.set(x, "HealthCheckIds", js.undefined)
    
    inline def setHealthCheckIdsVarargs(value: stringMax36PatternS*): Self = StObject.set(x, "HealthCheckIds", js.Array(value*))
    
    inline def setNextToken(value: stringMin1Max8096PatternS): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
