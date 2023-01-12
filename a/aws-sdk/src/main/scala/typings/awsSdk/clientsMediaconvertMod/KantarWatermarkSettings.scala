package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KantarWatermarkSettings extends StObject {
  
  /**
    * Provide an audio channel name from your Kantar audio license.
    */
  var ChannelName: js.UndefOr[stringMin1Max20] = js.undefined
  
  /**
    * Specify a unique identifier for Kantar to use for this piece of content.
    */
  var ContentReference: js.UndefOr[stringMin1Max50PatternAZAZ09] = js.undefined
  
  /**
    * Provide the name of the AWS Secrets Manager secret where your Kantar credentials are stored. Note that your MediaConvert service role must provide access to this secret. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/granting-permissions-for-mediaconvert-to-access-secrets-manager-secret.html. For instructions on creating a secret, see https://docs.aws.amazon.com/secretsmanager/latest/userguide/tutorials_basic.html, in the AWS Secrets Manager User Guide.
    */
  var CredentialsSecretName: js.UndefOr[stringMin1Max512PatternAZAZ09] = js.undefined
  
  /**
    * Optional. Specify an offset, in whole seconds, from the start of your output and the beginning of the watermarking. When you don't specify an offset, Kantar defaults to zero.
    */
  var FileOffset: js.UndefOr[doubleMin0] = js.undefined
  
  /**
    * Provide your Kantar license ID number. You should get this number from Kantar.
    */
  var KantarLicenseId: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Provide the HTTPS endpoint to the Kantar server. You should get this endpoint from Kantar.
    */
  var KantarServerUrl: js.UndefOr[stringPatternHttpsKantarmediaCom] = js.undefined
  
  /**
    * Optional. Specify the Amazon S3 bucket where you want MediaConvert to store your Kantar watermark XML logs. When you don't specify a bucket, MediaConvert doesn't save these logs. Note that your MediaConvert service role must provide access to this location. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
    */
  var LogDestination: js.UndefOr[stringPatternS3] = js.undefined
  
  /**
    * You can optionally use this field to specify the first timestamp that Kantar embeds during watermarking. Kantar suggests that you be very cautious when using this Kantar feature, and that you use it only on channels that are managed specifically for use with this feature by your Audience Measurement Operator. For more information about this feature, contact Kantar technical support.
    */
  var Metadata3: js.UndefOr[stringMin1Max50] = js.undefined
  
  /**
    * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
    */
  var Metadata4: js.UndefOr[stringMin1Max50] = js.undefined
  
  /**
    * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
    */
  var Metadata5: js.UndefOr[stringMin1Max50] = js.undefined
  
  /**
    * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
    */
  var Metadata6: js.UndefOr[stringMin1Max50] = js.undefined
  
  /**
    * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
    */
  var Metadata7: js.UndefOr[stringMin1Max50] = js.undefined
  
  /**
    * Additional metadata that MediaConvert sends to Kantar. Maximum length is 50 characters.
    */
  var Metadata8: js.UndefOr[stringMin1Max50] = js.undefined
}
object KantarWatermarkSettings {
  
  inline def apply(): KantarWatermarkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KantarWatermarkSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KantarWatermarkSettings] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: stringMin1Max20): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
    
    inline def setContentReference(value: stringMin1Max50PatternAZAZ09): Self = StObject.set(x, "ContentReference", value.asInstanceOf[js.Any])
    
    inline def setContentReferenceUndefined: Self = StObject.set(x, "ContentReference", js.undefined)
    
    inline def setCredentialsSecretName(value: stringMin1Max512PatternAZAZ09): Self = StObject.set(x, "CredentialsSecretName", value.asInstanceOf[js.Any])
    
    inline def setCredentialsSecretNameUndefined: Self = StObject.set(x, "CredentialsSecretName", js.undefined)
    
    inline def setFileOffset(value: doubleMin0): Self = StObject.set(x, "FileOffset", value.asInstanceOf[js.Any])
    
    inline def setFileOffsetUndefined: Self = StObject.set(x, "FileOffset", js.undefined)
    
    inline def setKantarLicenseId(value: integerMin0Max2147483647): Self = StObject.set(x, "KantarLicenseId", value.asInstanceOf[js.Any])
    
    inline def setKantarLicenseIdUndefined: Self = StObject.set(x, "KantarLicenseId", js.undefined)
    
    inline def setKantarServerUrl(value: stringPatternHttpsKantarmediaCom): Self = StObject.set(x, "KantarServerUrl", value.asInstanceOf[js.Any])
    
    inline def setKantarServerUrlUndefined: Self = StObject.set(x, "KantarServerUrl", js.undefined)
    
    inline def setLogDestination(value: stringPatternS3): Self = StObject.set(x, "LogDestination", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationUndefined: Self = StObject.set(x, "LogDestination", js.undefined)
    
    inline def setMetadata3(value: stringMin1Max50): Self = StObject.set(x, "Metadata3", value.asInstanceOf[js.Any])
    
    inline def setMetadata3Undefined: Self = StObject.set(x, "Metadata3", js.undefined)
    
    inline def setMetadata4(value: stringMin1Max50): Self = StObject.set(x, "Metadata4", value.asInstanceOf[js.Any])
    
    inline def setMetadata4Undefined: Self = StObject.set(x, "Metadata4", js.undefined)
    
    inline def setMetadata5(value: stringMin1Max50): Self = StObject.set(x, "Metadata5", value.asInstanceOf[js.Any])
    
    inline def setMetadata5Undefined: Self = StObject.set(x, "Metadata5", js.undefined)
    
    inline def setMetadata6(value: stringMin1Max50): Self = StObject.set(x, "Metadata6", value.asInstanceOf[js.Any])
    
    inline def setMetadata6Undefined: Self = StObject.set(x, "Metadata6", js.undefined)
    
    inline def setMetadata7(value: stringMin1Max50): Self = StObject.set(x, "Metadata7", value.asInstanceOf[js.Any])
    
    inline def setMetadata7Undefined: Self = StObject.set(x, "Metadata7", js.undefined)
    
    inline def setMetadata8(value: stringMin1Max50): Self = StObject.set(x, "Metadata8", value.asInstanceOf[js.Any])
    
    inline def setMetadata8Undefined: Self = StObject.set(x, "Metadata8", js.undefined)
  }
}
