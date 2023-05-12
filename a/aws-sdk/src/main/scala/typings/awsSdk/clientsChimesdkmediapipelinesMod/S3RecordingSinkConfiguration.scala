package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3RecordingSinkConfiguration extends StObject {
  
  /**
    * The default URI of the Amazon S3 bucket used as the recording sink.
    */
  var Destination: js.UndefOr[Arn] = js.undefined
  
  /**
    * The default file format for the media files sent to the Amazon S3 bucket.
    */
  var RecordingFileFormat: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.RecordingFileFormat] = js.undefined
}
object S3RecordingSinkConfiguration {
  
  inline def apply(): S3RecordingSinkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3RecordingSinkConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3RecordingSinkConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: Arn): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setRecordingFileFormat(value: RecordingFileFormat): Self = StObject.set(x, "RecordingFileFormat", value.asInstanceOf[js.Any])
    
    inline def setRecordingFileFormatUndefined: Self = StObject.set(x, "RecordingFileFormat", js.undefined)
  }
}
