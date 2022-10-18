package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobTemplateResponse extends StObject {
  
  /**
    * The ARN of the job template.
    */
  var jobTemplateArn: js.UndefOr[JobTemplateArn] = js.undefined
  
  /**
    * The unique identifier of the job template.
    */
  var jobTemplateId: js.UndefOr[JobTemplateId] = js.undefined
}
object CreateJobTemplateResponse {
  
  inline def apply(): CreateJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobTemplateResponse]
  }
  
  extension [Self <: CreateJobTemplateResponse](x: Self) {
    
    inline def setJobTemplateArn(value: JobTemplateArn): Self = StObject.set(x, "jobTemplateArn", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateArnUndefined: Self = StObject.set(x, "jobTemplateArn", js.undefined)
    
    inline def setJobTemplateId(value: JobTemplateId): Self = StObject.set(x, "jobTemplateId", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateIdUndefined: Self = StObject.set(x, "jobTemplateId", js.undefined)
  }
}
