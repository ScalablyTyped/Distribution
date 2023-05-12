package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3RecordingSinkRuntimeConfiguration extends StObject {
  
  /**
    * The URI of the S3 bucket used as the sink.
    */
  var Destination: Arn
  
  /**
    * The file format for the media files sent to the Amazon S3 bucket.
    */
  var RecordingFileFormat: typings.awsSdk.clientsChimesdkmediapipelinesMod.RecordingFileFormat
}
object S3RecordingSinkRuntimeConfiguration {
  
  inline def apply(Destination: Arn, RecordingFileFormat: RecordingFileFormat): S3RecordingSinkRuntimeConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], RecordingFileFormat = RecordingFileFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3RecordingSinkRuntimeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3RecordingSinkRuntimeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: Arn): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setRecordingFileFormat(value: RecordingFileFormat): Self = StObject.set(x, "RecordingFileFormat", value.asInstanceOf[js.Any])
  }
}
