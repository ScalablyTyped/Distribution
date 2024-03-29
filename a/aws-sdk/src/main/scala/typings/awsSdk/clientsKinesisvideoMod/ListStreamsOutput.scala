package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsOutput extends StObject {
  
  /**
    * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.NextToken] = js.undefined
  
  /**
    * An array of StreamInfo objects.
    */
  var StreamInfoList: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StreamInfoList] = js.undefined
}
object ListStreamsOutput {
  
  inline def apply(): ListStreamsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStreamsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStreamInfoList(value: StreamInfoList): Self = StObject.set(x, "StreamInfoList", value.asInstanceOf[js.Any])
    
    inline def setStreamInfoListUndefined: Self = StObject.set(x, "StreamInfoList", js.undefined)
    
    inline def setStreamInfoListVarargs(value: StreamInfo*): Self = StObject.set(x, "StreamInfoList", js.Array(value*))
  }
}
