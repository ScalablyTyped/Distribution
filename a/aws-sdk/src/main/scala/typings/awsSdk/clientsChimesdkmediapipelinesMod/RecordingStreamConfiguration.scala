package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingStreamConfiguration extends StObject {
  
  /**
    * The ARN of the recording stream.
    */
  var StreamArn: js.UndefOr[KinesisVideoStreamArn] = js.undefined
}
object RecordingStreamConfiguration {
  
  inline def apply(): RecordingStreamConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingStreamConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordingStreamConfiguration] (val x: Self) extends AnyVal {
    
    inline def setStreamArn(value: KinesisVideoStreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
  }
}
