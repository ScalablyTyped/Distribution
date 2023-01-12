package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkforcesResponse extends StObject {
  
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A list containing information about your workforce.
    */
  var Workforces: typings.awsSdk.clientsSagemakerMod.Workforces
}
object ListWorkforcesResponse {
  
  inline def apply(Workforces: Workforces): ListWorkforcesResponse = {
    val __obj = js.Dynamic.literal(Workforces = Workforces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkforcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkforcesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkforces(value: Workforces): Self = StObject.set(x, "Workforces", value.asInstanceOf[js.Any])
    
    inline def setWorkforcesVarargs(value: Workforce*): Self = StObject.set(x, "Workforces", js.Array(value*))
  }
}
