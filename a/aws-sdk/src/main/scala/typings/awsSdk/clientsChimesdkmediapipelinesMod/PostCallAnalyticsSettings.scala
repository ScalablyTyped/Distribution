package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostCallAnalyticsSettings extends StObject {
  
  /**
    * The content redaction output settings for a post-call analysis task.
    */
  var ContentRedactionOutput: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ContentRedactionOutput] = js.undefined
  
  /**
    * The ARN of the role used by Amazon Web Services Transcribe to upload your post call analysis. For more information, see Post-call analytics with real-time transcriptions in the Amazon Transcribe Developer Guide.
    */
  var DataAccessRoleArn: String
  
  /**
    * The ID of the KMS (Key Management Service) key used to encrypt the output.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the Amazon S3 bucket that contains the post-call data.
    */
  var OutputLocation: String
}
object PostCallAnalyticsSettings {
  
  inline def apply(DataAccessRoleArn: String, OutputLocation: String): PostCallAnalyticsSettings = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], OutputLocation = OutputLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCallAnalyticsSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostCallAnalyticsSettings] (val x: Self) extends AnyVal {
    
    inline def setContentRedactionOutput(value: ContentRedactionOutput): Self = StObject.set(x, "ContentRedactionOutput", value.asInstanceOf[js.Any])
    
    inline def setContentRedactionOutputUndefined: Self = StObject.set(x, "ContentRedactionOutput", js.undefined)
    
    inline def setDataAccessRoleArn(value: String): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setOutputEncryptionKMSKeyId(value: String): Self = StObject.set(x, "OutputEncryptionKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setOutputEncryptionKMSKeyIdUndefined: Self = StObject.set(x, "OutputEncryptionKMSKeyId", js.undefined)
    
    inline def setOutputLocation(value: String): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
  }
}
