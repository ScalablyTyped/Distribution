package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentTypeSummary extends StObject {
  
  /**
    * The ARN of the component type.
    */
  var arn: TwinMakerArn
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: ComponentTypeId
  
  /**
    * The date and time when the component type was created.
    */
  var creationDateTime: js.Date
  
  /**
    * The description of the component type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The current status of the component type.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The date and time when the component type was last updated.
    */
  var updateDateTime: js.Date
}
object ComponentTypeSummary {
  
  inline def apply(
    arn: TwinMakerArn,
    componentTypeId: ComponentTypeId,
    creationDateTime: js.Date,
    updateDateTime: js.Date
  ): ComponentTypeSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], componentTypeId = componentTypeId.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentTypeSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentTypeSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
  }
}
