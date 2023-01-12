package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessor extends StObject {
  
  /**
    * Name of the Amazon Rekognition stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.undefined
  
  /**
    * Current status of the Amazon Rekognition stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.undefined
}
object StreamProcessor {
  
  inline def apply(): StreamProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamProcessor] (val x: Self) extends AnyVal {
    
    inline def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: StreamProcessorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
