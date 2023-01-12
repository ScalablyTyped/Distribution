package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTypesMap extends StObject {
  
  var ingestTime: TypeDef
  
  var payload: TypeDef
  
  var sequenceNumber: TypeDef
  
  var streamName: TypeDef
}
object MessageTypesMap {
  
  inline def apply(ingestTime: TypeDef, payload: TypeDef, sequenceNumber: TypeDef, streamName: TypeDef): MessageTypesMap = {
    val __obj = js.Dynamic.literal(ingestTime = ingestTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTypesMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageTypesMap] (val x: Self) extends AnyVal {
    
    inline def setIngestTime(value: TypeDef): Self = StObject.set(x, "ingestTime", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: TypeDef): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: TypeDef): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: TypeDef): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
  }
}
