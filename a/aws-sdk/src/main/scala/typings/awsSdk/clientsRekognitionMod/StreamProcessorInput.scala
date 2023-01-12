package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessorInput extends StObject {
  
  /**
    * The Kinesis video stream input stream for the source streaming video.
    */
  var KinesisVideoStream: js.UndefOr[typings.awsSdk.clientsRekognitionMod.KinesisVideoStream] = js.undefined
}
object StreamProcessorInput {
  
  inline def apply(): StreamProcessorInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamProcessorInput] (val x: Self) extends AnyVal {
    
    inline def setKinesisVideoStream(value: KinesisVideoStream): Self = StObject.set(x, "KinesisVideoStream", value.asInstanceOf[js.Any])
    
    inline def setKinesisVideoStreamUndefined: Self = StObject.set(x, "KinesisVideoStream", js.undefined)
  }
}
