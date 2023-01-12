package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscribedWorkteamsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of work teams, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * An array of Workteam objects, each describing a work team.
    */
  var SubscribedWorkteams: typings.awsSdk.clientsSagemakerMod.SubscribedWorkteams
}
object ListSubscribedWorkteamsResponse {
  
  inline def apply(SubscribedWorkteams: SubscribedWorkteams): ListSubscribedWorkteamsResponse = {
    val __obj = js.Dynamic.literal(SubscribedWorkteams = SubscribedWorkteams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscribedWorkteamsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSubscribedWorkteamsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubscribedWorkteams(value: SubscribedWorkteams): Self = StObject.set(x, "SubscribedWorkteams", value.asInstanceOf[js.Any])
    
    inline def setSubscribedWorkteamsVarargs(value: SubscribedWorkteam*): Self = StObject.set(x, "SubscribedWorkteams", js.Array(value*))
  }
}
