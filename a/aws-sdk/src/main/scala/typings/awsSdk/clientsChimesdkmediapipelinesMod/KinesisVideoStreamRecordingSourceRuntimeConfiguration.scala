package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisVideoStreamRecordingSourceRuntimeConfiguration extends StObject {
  
  /**
    * Describes the timestamp range and timestamp origin of a range of fragments in the Kinesis video stream.
    */
  var FragmentSelector: typings.awsSdk.clientsChimesdkmediapipelinesMod.FragmentSelector
  
  /**
    * The stream or streams to be recorded.
    */
  var Streams: RecordingStreamList
}
object KinesisVideoStreamRecordingSourceRuntimeConfiguration {
  
  inline def apply(FragmentSelector: FragmentSelector, Streams: RecordingStreamList): KinesisVideoStreamRecordingSourceRuntimeConfiguration = {
    val __obj = js.Dynamic.literal(FragmentSelector = FragmentSelector.asInstanceOf[js.Any], Streams = Streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisVideoStreamRecordingSourceRuntimeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisVideoStreamRecordingSourceRuntimeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFragmentSelector(value: FragmentSelector): Self = StObject.set(x, "FragmentSelector", value.asInstanceOf[js.Any])
    
    inline def setStreams(value: RecordingStreamList): Self = StObject.set(x, "Streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: RecordingStreamConfiguration*): Self = StObject.set(x, "Streams", js.Array(value*))
  }
}
