package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamProcessorResponse extends StObject {
  
  /**
    * Amazon Resource Number for the newly created stream processor.
    */
  var StreamProcessorArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.StreamProcessorArn] = js.undefined
}
object CreateStreamProcessorResponse {
  
  inline def apply(): CreateStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamProcessorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStreamProcessorResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamProcessorArn(value: StreamProcessorArn): Self = StObject.set(x, "StreamProcessorArn", value.asInstanceOf[js.Any])
    
    inline def setStreamProcessorArnUndefined: Self = StObject.set(x, "StreamProcessorArn", js.undefined)
  }
}
