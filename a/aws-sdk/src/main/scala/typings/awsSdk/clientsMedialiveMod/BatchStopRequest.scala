package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStopRequest extends StObject {
  
  /**
    * List of channel IDs
    */
  var ChannelIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * List of multiplex IDs
    */
  var MultiplexIds: js.UndefOr[listOfString] = js.undefined
}
object BatchStopRequest {
  
  inline def apply(): BatchStopRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStopRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelIds(value: listOfString): Self = StObject.set(x, "ChannelIds", value.asInstanceOf[js.Any])
    
    inline def setChannelIdsUndefined: Self = StObject.set(x, "ChannelIds", js.undefined)
    
    inline def setChannelIdsVarargs(value: string*): Self = StObject.set(x, "ChannelIds", js.Array(value*))
    
    inline def setMultiplexIds(value: listOfString): Self = StObject.set(x, "MultiplexIds", value.asInstanceOf[js.Any])
    
    inline def setMultiplexIdsUndefined: Self = StObject.set(x, "MultiplexIds", js.undefined)
    
    inline def setMultiplexIdsVarargs(value: string*): Self = StObject.set(x, "MultiplexIds", js.Array(value*))
  }
}
