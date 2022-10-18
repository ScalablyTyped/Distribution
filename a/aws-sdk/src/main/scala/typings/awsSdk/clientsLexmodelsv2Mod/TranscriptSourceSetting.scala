package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptSourceSetting extends StObject {
  
  /**
    * Indicates the setting of the Amazon S3 bucket where the transcript is stored.
    */
  var s3BucketTranscriptSource: js.UndefOr[S3BucketTranscriptSource] = js.undefined
}
object TranscriptSourceSetting {
  
  inline def apply(): TranscriptSourceSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptSourceSetting]
  }
  
  extension [Self <: TranscriptSourceSetting](x: Self) {
    
    inline def setS3BucketTranscriptSource(value: S3BucketTranscriptSource): Self = StObject.set(x, "s3BucketTranscriptSource", value.asInstanceOf[js.Any])
    
    inline def setS3BucketTranscriptSourceUndefined: Self = StObject.set(x, "s3BucketTranscriptSource", js.undefined)
  }
}
