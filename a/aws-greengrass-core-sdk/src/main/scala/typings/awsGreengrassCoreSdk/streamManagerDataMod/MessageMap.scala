package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageMap extends StObject {
  
  var ingestTime: js.UndefOr[Double | Null] = js.undefined
  
  var payload: js.UndefOr[Buffer | Null] = js.undefined
  
  var sequenceNumber: js.UndefOr[Double | Null] = js.undefined
  
  var streamName: js.UndefOr[String | Null] = js.undefined
}
object MessageMap {
  
  inline def apply(): MessageMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageMap] (val x: Self) extends AnyVal {
    
    inline def setIngestTime(value: Double): Self = StObject.set(x, "ingestTime", value.asInstanceOf[js.Any])
    
    inline def setIngestTimeNull: Self = StObject.set(x, "ingestTime", null)
    
    inline def setIngestTimeUndefined: Self = StObject.set(x, "ingestTime", js.undefined)
    
    inline def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberNull: Self = StObject.set(x, "sequenceNumber", null)
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
    
    inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameNull: Self = StObject.set(x, "streamName", null)
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
