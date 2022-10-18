package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketTranscriptSource extends StObject {
  
  /**
    * The ARN of the KMS key that customer use to encrypt their Amazon S3 bucket. Only use this field if your bucket is encrypted using a customer managed KMS key.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * The object that contains a path format that will be applied when Amazon Lex reads the transcript file in the bucket you provide. Specify this object if you only want Lex to read a subset of files in your Amazon S3 bucket.
    */
  var pathFormat: js.UndefOr[PathFormat] = js.undefined
  
  /**
    * The name of the bucket containing the transcript and the associated metadata.
    */
  var s3BucketName: S3BucketName
  
  /**
    * The object that contains the filter which will be applied when Amazon Lex reads through the Amazon S3 bucket. Specify this object if you want Amazon Lex to read only a subset of the Amazon S3 bucket based on the filter you provide.
    */
  var transcriptFilter: js.UndefOr[TranscriptFilter] = js.undefined
  
  /**
    * The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
    */
  var transcriptFormat: TranscriptFormat
}
object S3BucketTranscriptSource {
  
  inline def apply(s3BucketName: S3BucketName, transcriptFormat: TranscriptFormat): S3BucketTranscriptSource = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any], transcriptFormat = transcriptFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketTranscriptSource]
  }
  
  extension [Self <: S3BucketTranscriptSource](x: Self) {
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setPathFormat(value: PathFormat): Self = StObject.set(x, "pathFormat", value.asInstanceOf[js.Any])
    
    inline def setPathFormatUndefined: Self = StObject.set(x, "pathFormat", js.undefined)
    
    inline def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    inline def setTranscriptFilter(value: TranscriptFilter): Self = StObject.set(x, "transcriptFilter", value.asInstanceOf[js.Any])
    
    inline def setTranscriptFilterUndefined: Self = StObject.set(x, "transcriptFilter", js.undefined)
    
    inline def setTranscriptFormat(value: TranscriptFormat): Self = StObject.set(x, "transcriptFormat", value.asInstanceOf[js.Any])
  }
}
