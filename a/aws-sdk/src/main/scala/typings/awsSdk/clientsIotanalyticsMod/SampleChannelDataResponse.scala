package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleChannelDataResponse extends StObject {
  
  /**
    * The list of message samples. Each sample message is returned as a base64-encoded string.
    */
  var payloads: js.UndefOr[MessagePayloads] = js.undefined
}
object SampleChannelDataResponse {
  
  inline def apply(): SampleChannelDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SampleChannelDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SampleChannelDataResponse] (val x: Self) extends AnyVal {
    
    inline def setPayloads(value: MessagePayloads): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
    
    inline def setPayloadsUndefined: Self = StObject.set(x, "payloads", js.undefined)
    
    inline def setPayloadsVarargs(value: MessagePayload*): Self = StObject.set(x, "payloads", js.Array(value*))
  }
}
