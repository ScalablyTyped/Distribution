package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTemplate extends StObject {
  
  /**
    * The ARN of the job template.
    */
  var arn: js.UndefOr[JobTemplateArn] = js.undefined
  
  /**
    *  The date and time when the job template was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The user who created the job template.
    */
  var createdBy: js.UndefOr[RequestIdentityUserArn] = js.undefined
  
  /**
    * The error message in case the decryption of job template fails.
    */
  var decryptionError: js.UndefOr[String2048] = js.undefined
  
  /**
    * The ID of the job template.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The job template data which holds values of StartJobRun API request.
    */
  var jobTemplateData: JobTemplateData
  
  /**
    *  The KMS key ARN used to encrypt the job template.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * The name of the job template.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
  
  /**
    * The tags assigned to the job template.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object JobTemplate {
  
  inline def apply(jobTemplateData: JobTemplateData): JobTemplate = {
    val __obj = js.Dynamic.literal(jobTemplateData = jobTemplateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobTemplate] (val x: Self) extends AnyVal {
    
    inline def setArn(value: JobTemplateArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: RequestIdentityUserArn): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDecryptionError(value: String2048): Self = StObject.set(x, "decryptionError", value.asInstanceOf[js.Any])
    
    inline def setDecryptionErrorUndefined: Self = StObject.set(x, "decryptionError", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJobTemplateData(value: JobTemplateData): Self = StObject.set(x, "jobTemplateData", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
