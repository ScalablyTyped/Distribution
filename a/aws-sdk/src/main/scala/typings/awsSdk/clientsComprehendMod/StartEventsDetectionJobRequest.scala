package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEventsDetectionJobRequest extends StObject {
  
  /**
    * An unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: IamRoleArn
  
  /**
    * Specifies the format and location of the input data for the job.
    */
  var InputDataConfig: typings.awsSdk.clientsComprehendMod.InputDataConfig
  
  /**
    * The identifier of the events detection job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobName] = js.undefined
  
  /**
    * The language code of the input documents.
    */
  var LanguageCode: typings.awsSdk.clientsComprehendMod.LanguageCode
  
  /**
    * Specifies where to send the output files.
    */
  var OutputDataConfig: typings.awsSdk.clientsComprehendMod.OutputDataConfig
  
  /**
    * Tags to be associated with the events detection job. A tag is a key-value pair that adds metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The types of events to detect in the input documents.
    */
  var TargetEventTypes: typings.awsSdk.clientsComprehendMod.TargetEventTypes
}
object StartEventsDetectionJobRequest {
  
  inline def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    LanguageCode: LanguageCode,
    OutputDataConfig: OutputDataConfig,
    TargetEventTypes: TargetEventTypes
  ): StartEventsDetectionJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], TargetEventTypes = TargetEventTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEventsDetectionJobRequest]
  }
  
  extension [Self <: StartEventsDetectionJobRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetEventTypes(value: TargetEventTypes): Self = StObject.set(x, "TargetEventTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetEventTypesVarargs(value: EventTypeString*): Self = StObject.set(x, "TargetEventTypes", js.Array(value*))
  }
}
