package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskTemplateMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task template.
    */
  var Arn: js.UndefOr[TaskTemplateArn] = js.undefined
  
  /**
    * The timestamp when the task template was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the task template.
    */
  var Description: js.UndefOr[TaskTemplateDescription] = js.undefined
  
  /**
    * A unique identifier for the task template.
    */
  var Id: js.UndefOr[TaskTemplateId] = js.undefined
  
  /**
    * The timestamp when the task template was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the task template.
    */
  var Name: js.UndefOr[TaskTemplateName] = js.undefined
  
  /**
    * Marks a template as ACTIVE or INACTIVE for a task to refer to it. Tasks can only be created from ACTIVE templates. If a template is marked as INACTIVE, then a task that refers to this template cannot be created.
    */
  var Status: js.UndefOr[TaskTemplateStatus] = js.undefined
}
object TaskTemplateMetadata {
  
  inline def apply(): TaskTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskTemplateMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskTemplateMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TaskTemplateArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: TaskTemplateDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: TaskTemplateId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: TaskTemplateName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: TaskTemplateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
