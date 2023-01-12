package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobTemplateResponse extends StObject {
  
  /**
    * This output display the ARN of the created job template.
    */
  var arn: js.UndefOr[JobTemplateArn] = js.undefined
  
  /**
    * This output displays the date and time when the job template was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This output display the created job template ID.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * This output displays the name of the created job template.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
}
object CreateJobTemplateResponse {
  
  inline def apply(): CreateJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateJobTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: JobTemplateArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
