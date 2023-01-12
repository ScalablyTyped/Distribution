package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobTemplateRequest extends StObject {
  
  /**
    * The client token of the job template.
    */
  var clientToken: ClientToken
  
  /**
    * The job template data which holds values of StartJobRun API request.
    */
  var jobTemplateData: JobTemplateData
  
  /**
    * The KMS key ARN used to encrypt the job template.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * The specified name of the job template.
    */
  var name: ResourceNameString
  
  /**
    * The tags that are associated with the job template.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateJobTemplateRequest {
  
  inline def apply(clientToken: ClientToken, jobTemplateData: JobTemplateData, name: ResourceNameString): CreateJobTemplateRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], jobTemplateData = jobTemplateData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateJobTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateData(value: JobTemplateData): Self = StObject.set(x, "jobTemplateData", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
