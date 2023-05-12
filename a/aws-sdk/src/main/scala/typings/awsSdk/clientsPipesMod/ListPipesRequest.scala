package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipesRequest extends StObject {
  
  /**
    * The state the pipe is in.
    */
  var CurrentState: js.UndefOr[PipeState] = js.undefined
  
  /**
    * The state the pipe should be in.
    */
  var DesiredState: js.UndefOr[RequestedPipeState] = js.undefined
  
  /**
    * The maximum number of pipes to include in the response.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * A value that will return a subset of the pipes associated with this account. For example, "NamePrefix": "ABC" will return all endpoints with "ABC" in the name.
    */
  var NamePrefix: js.UndefOr[PipeName] = js.undefined
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPipesMod.NextToken] = js.undefined
  
  /**
    * The prefix matching the pipe source.
    */
  var SourcePrefix: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The prefix matching the pipe target.
    */
  var TargetPrefix: js.UndefOr[ResourceArn] = js.undefined
}
object ListPipesRequest {
  
  inline def apply(): ListPipesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPipesRequest] (val x: Self) extends AnyVal {
    
    inline def setCurrentState(value: PipeState): Self = StObject.set(x, "CurrentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "CurrentState", js.undefined)
    
    inline def setDesiredState(value: RequestedPipeState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNamePrefix(value: PipeName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSourcePrefix(value: ResourceArn): Self = StObject.set(x, "SourcePrefix", value.asInstanceOf[js.Any])
    
    inline def setSourcePrefixUndefined: Self = StObject.set(x, "SourcePrefix", js.undefined)
    
    inline def setTargetPrefix(value: ResourceArn): Self = StObject.set(x, "TargetPrefix", value.asInstanceOf[js.Any])
    
    inline def setTargetPrefixUndefined: Self = StObject.set(x, "TargetPrefix", js.undefined)
  }
}
