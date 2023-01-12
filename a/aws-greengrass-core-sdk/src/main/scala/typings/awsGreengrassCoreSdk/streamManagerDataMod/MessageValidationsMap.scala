package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: aws-greengrass-core-sdk.aws-greengrass-core-sdk/stream-manager/data.ValidationDef} */ trait MessageValidationsMap extends StObject {
  
  var ingestTime: ValidationDef
  
  var payload: ValidationDef
  
  var sequenceNumber: ValidationDef
  
  var streamName: ValidationDef
}
object MessageValidationsMap {
  
  inline def apply(
    ingestTime: ValidationDef,
    payload: ValidationDef,
    sequenceNumber: ValidationDef,
    streamName: ValidationDef
  ): MessageValidationsMap = {
    val __obj = js.Dynamic.literal(ingestTime = ingestTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageValidationsMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageValidationsMap] (val x: Self) extends AnyVal {
    
    inline def setIngestTime(value: ValidationDef): Self = StObject.set(x, "ingestTime", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: ValidationDef): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: ValidationDef): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: ValidationDef): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
  }
}
