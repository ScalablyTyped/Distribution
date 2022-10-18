package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComprehendMedicalAsyncJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that gives Comprehend Medical; read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The time that the detection job completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that job metadata is deleted from the server. Output files in your S3 bucket will not be deleted. After the metadata is deleted, the job will no longer appear in the results of the ListEntitiesDetectionV2Job or the ListPHIDetectionJobs operation.
    */
  var ExpirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The input data configuration that you supplied when you created the detection job.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.InputDataConfig] = js.undefined
  
  /**
    * The identifier assigned to the detection job.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.JobId] = js.undefined
  
  /**
    * The name that you assigned to the detection job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.JobName] = js.undefined
  
  /**
    * The current status of the detection job. If the status is FAILED, the Message field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.JobStatus] = js.undefined
  
  /**
    * The AWS Key Management Service key, if any, used to encrypt the output files. 
    */
  var KMSKey: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.KMSKey] = js.undefined
  
  /**
    * The language code of the input documents.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.LanguageCode] = js.undefined
  
  /**
    * The path to the file that describes the results of a batch job.
    */
  var ManifestFilePath: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.ManifestFilePath] = js.undefined
  
  /**
    * A description of the status of a job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * The version of the model used to analyze the documents. The version number looks like X.X.X. You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.ModelVersion] = js.undefined
  
  /**
    * The output data configuration that you supplied when you created the detection job.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.OutputDataConfig] = js.undefined
  
  /**
    * The time that the detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.undefined
}
object ComprehendMedicalAsyncJobProperties {
  
  inline def apply(): ComprehendMedicalAsyncJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComprehendMedicalAsyncJobProperties]
  }
  
  extension [Self <: ComprehendMedicalAsyncJobProperties](x: Self) {
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setManifestFilePath(value: ManifestFilePath): Self = StObject.set(x, "ManifestFilePath", value.asInstanceOf[js.Any])
    
    inline def setManifestFilePathUndefined: Self = StObject.set(x, "ManifestFilePath", js.undefined)
    
    inline def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setModelVersion(value: ModelVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
  }
}
