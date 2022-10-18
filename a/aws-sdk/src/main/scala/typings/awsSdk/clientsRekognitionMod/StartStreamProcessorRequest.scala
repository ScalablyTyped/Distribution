package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartStreamProcessorRequest extends StObject {
  
  /**
    * The name of the stream processor to start processing.
    */
  var Name: StreamProcessorName
  
  /**
    *  Specifies the starting point in the Kinesis stream to start processing. You can use the producer timestamp or the fragment number. For more information, see Fragment.  This is a required parameter for label detection stream processors and should not be used to start a face search stream processor.
    */
  var StartSelector: js.UndefOr[StreamProcessingStartSelector] = js.undefined
  
  /**
    *  Specifies when to stop processing the stream. You can specify a maximum amount of time to process the video.  This is a required parameter for label detection stream processors and should not be used to start a face search stream processor.
    */
  var StopSelector: js.UndefOr[StreamProcessingStopSelector] = js.undefined
}
object StartStreamProcessorRequest {
  
  inline def apply(Name: StreamProcessorName): StartStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartStreamProcessorRequest]
  }
  
  extension [Self <: StartStreamProcessorRequest](x: Self) {
    
    inline def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStartSelector(value: StreamProcessingStartSelector): Self = StObject.set(x, "StartSelector", value.asInstanceOf[js.Any])
    
    inline def setStartSelectorUndefined: Self = StObject.set(x, "StartSelector", js.undefined)
    
    inline def setStopSelector(value: StreamProcessingStopSelector): Self = StObject.set(x, "StopSelector", value.asInstanceOf[js.Any])
    
    inline def setStopSelectorUndefined: Self = StObject.set(x, "StopSelector", js.undefined)
  }
}
