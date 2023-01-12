package typings.awsSdk.clientsIotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRetainedMessagesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A summary list the account's retained messages. The information returned doesn't include the message payloads of the retained messages.
    */
  var retainedTopics: js.UndefOr[RetainedMessageList] = js.undefined
}
object ListRetainedMessagesResponse {
  
  inline def apply(): ListRetainedMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRetainedMessagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRetainedMessagesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRetainedTopics(value: RetainedMessageList): Self = StObject.set(x, "retainedTopics", value.asInstanceOf[js.Any])
    
    inline def setRetainedTopicsUndefined: Self = StObject.set(x, "retainedTopics", js.undefined)
    
    inline def setRetainedTopicsVarargs(value: RetainedMessageSummary*): Self = StObject.set(x, "retainedTopics", js.Array(value*))
  }
}
