package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsInput extends StObject {
  
  /**
    * The name of the stream to start the list with.
    */
  var ExclusiveStartStreamName: js.UndefOr[StreamName] = js.undefined
  
  /**
    * The maximum number of streams to list. The default value is 100. If you specify a value greater than 100, at most 100 results are returned.
    */
  var Limit: js.UndefOr[ListStreamsInputLimit] = js.undefined
  
  /**
    * 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisMod.NextToken] = js.undefined
}
object ListStreamsInput {
  
  inline def apply(): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStreamsInput] (val x: Self) extends AnyVal {
    
    inline def setExclusiveStartStreamName(value: StreamName): Self = StObject.set(x, "ExclusiveStartStreamName", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartStreamNameUndefined: Self = StObject.set(x, "ExclusiveStartStreamName", js.undefined)
    
    inline def setLimit(value: ListStreamsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
