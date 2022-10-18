package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRxNormInferenceJobRequest extends StObject {
  
  /**
    * A unique identifier for the request. If you don't set the client request token, Comprehend Medical; generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Comprehend Medical; read access to your input data. For more information, see  Role-Based Permissions Required for Asynchronous Operations.
    */
  var DataAccessRoleArn: IamRoleArn
  
  /**
    * Specifies the format and location of the input data for the job.
    */
  var InputDataConfig: typings.awsSdk.clientsComprehendmedicalMod.InputDataConfig
  
  /**
    * The identifier of the job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.JobName] = js.undefined
  
  /**
    * An AWS Key Management Service key to encrypt your output files. If you do not specify a key, the files are written in plain text.
    */
  var KMSKey: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.KMSKey] = js.undefined
  
  /**
    * The language of the input documents. All documents must be in the same language.
    */
  var LanguageCode: typings.awsSdk.clientsComprehendmedicalMod.LanguageCode
  
  /**
    * Specifies where to send the output files.
    */
  var OutputDataConfig: typings.awsSdk.clientsComprehendmedicalMod.OutputDataConfig
}
object StartRxNormInferenceJobRequest {
  
  inline def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    LanguageCode: LanguageCode,
    OutputDataConfig: OutputDataConfig
  ): StartRxNormInferenceJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRxNormInferenceJobRequest]
  }
  
  extension [Self <: StartRxNormInferenceJobRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
  }
}
