package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PiiEntitiesDetectionJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The time that the PII entities detection job completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The input properties for a PII entities detection job.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.InputDataConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the PII entities detection job. It is a unique, fully qualified identifier for the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:  arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:pii-entities-detection-job/&lt;job-id&gt;  The following is an example job ARN:  arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab 
    */
  var JobArn: js.UndefOr[ComprehendArn] = js.undefined
  
  /**
    * The identifier assigned to the PII entities detection job.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobId] = js.undefined
  
  /**
    * The name that you assigned the PII entities detection job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobName] = js.undefined
  
  /**
    * The current status of the PII entities detection job. If the status is FAILED, the Message field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobStatus] = js.undefined
  
  /**
    * The language code of the input documents
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsComprehendMod.LanguageCode] = js.undefined
  
  /**
    * A description of the status of a job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII entities are redacted.
    */
  var Mode: js.UndefOr[PiiEntitiesDetectionMode] = js.undefined
  
  /**
    * The output data configuration that you supplied when you created the PII entities detection job.
    */
  var OutputDataConfig: js.UndefOr[PiiOutputDataConfig] = js.undefined
  
  /**
    * Provides configuration parameters for PII entity redaction. This parameter is required if you set the Mode parameter to ONLY_REDACTION. In that case, you must provide a RedactionConfig definition that includes the PiiEntityTypes parameter.
    */
  var RedactionConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.RedactionConfig] = js.undefined
  
  /**
    * The time that the PII entities detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.undefined
}
object PiiEntitiesDetectionJobProperties {
  
  inline def apply(): PiiEntitiesDetectionJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PiiEntitiesDetectionJobProperties]
  }
  
  extension [Self <: PiiEntitiesDetectionJobProperties](x: Self) {
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setJobArn(value: ComprehendArn): Self = StObject.set(x, "JobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "JobArn", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setMode(value: PiiEntitiesDetectionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setOutputDataConfig(value: PiiOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    inline def setRedactionConfig(value: RedactionConfig): Self = StObject.set(x, "RedactionConfig", value.asInstanceOf[js.Any])
    
    inline def setRedactionConfigUndefined: Self = StObject.set(x, "RedactionConfig", js.undefined)
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
  }
}
