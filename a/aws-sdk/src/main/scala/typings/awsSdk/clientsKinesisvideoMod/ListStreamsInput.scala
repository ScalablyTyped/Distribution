package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsInput extends StObject {
  
  /**
    * The maximum number of streams to return in the response. The default is 10,000.
    */
  var MaxResults: js.UndefOr[ListStreamsInputLimit] = js.undefined
  
  /**
    * If you specify this parameter, when the result of a ListStreams operation is truncated, the call returns the NextToken in the response. To get another batch of streams, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.NextToken] = js.undefined
  
  /**
    * Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the prefix of a stream name as a condition. 
    */
  var StreamNameCondition: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StreamNameCondition] = js.undefined
}
object ListStreamsInput {
  
  inline def apply(): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStreamsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListStreamsInputLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStreamNameCondition(value: StreamNameCondition): Self = StObject.set(x, "StreamNameCondition", value.asInstanceOf[js.Any])
    
    inline def setStreamNameConditionUndefined: Self = StObject.set(x, "StreamNameCondition", js.undefined)
  }
}
