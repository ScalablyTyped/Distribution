package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsDetectionJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The time that the events detection job completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The input data configuration that you supplied when you created the events detection job.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.InputDataConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the events detection job. It is a unique, fully qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The format of the ARN is as follows:  arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:events-detection-job/&lt;job-id&gt;  The following is an example job ARN:  arn:aws:comprehend:us-west-2:111122223333:events-detection-job/1234abcd12ab34cd56ef1234567890ab 
    */
  var JobArn: js.UndefOr[ComprehendArn] = js.undefined
  
  /**
    * The identifier assigned to the events detection job.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobId] = js.undefined
  
  /**
    * The name you assigned the events detection job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobName] = js.undefined
  
  /**
    * The current status of the events detection job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobStatus] = js.undefined
  
  /**
    * The language code of the input documents.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsComprehendMod.LanguageCode] = js.undefined
  
  /**
    * A description of the status of the events detection job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * The output data configuration that you supplied when you created the events detection job.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.OutputDataConfig] = js.undefined
  
  /**
    * The time that the events detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The types of events that are detected by the job.
    */
  var TargetEventTypes: js.UndefOr[typings.awsSdk.clientsComprehendMod.TargetEventTypes] = js.undefined
}
object EventsDetectionJobProperties {
  
  inline def apply(): EventsDetectionJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsDetectionJobProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventsDetectionJobProperties] (val x: Self) extends AnyVal {
    
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
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
    
    inline def setTargetEventTypes(value: TargetEventTypes): Self = StObject.set(x, "TargetEventTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetEventTypesUndefined: Self = StObject.set(x, "TargetEventTypes", js.undefined)
    
    inline def setTargetEventTypesVarargs(value: EventTypeString*): Self = StObject.set(x, "TargetEventTypes", js.Array(value*))
  }
}
