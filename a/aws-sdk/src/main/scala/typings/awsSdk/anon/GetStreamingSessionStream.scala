package typings.awsSdk.anon

import typings.awsSdk.clientsNimbleMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/nimble.GetStreamingSessionStreamRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetStreamingSessionStream extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The streaming session ID.
    */
  var sessionId: String
  
  /**
    * The streaming session stream ID.
    */
  var streamId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStreamingSessionStream {
  
  inline def apply(sessionId: String, streamId: String, studioId: String): GetStreamingSessionStream = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingSessionStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamingSessionStream] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
