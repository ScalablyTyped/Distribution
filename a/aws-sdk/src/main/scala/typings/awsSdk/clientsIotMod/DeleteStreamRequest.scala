package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStreamRequest extends StObject {
  
  /**
    * The stream ID.
    */
  var streamId: StreamId
}
object DeleteStreamRequest {
  
  inline def apply(streamId: StreamId): DeleteStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
  }
}
