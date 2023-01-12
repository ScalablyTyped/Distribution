package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactFlowModule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN).
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The content of the flow module.
    */
  var Content: js.UndefOr[ContactFlowModuleContent] = js.undefined
  
  /**
    * The description of the flow module.
    */
  var Description: js.UndefOr[ContactFlowModuleDescription] = js.undefined
  
  /**
    * The identifier of the flow module.
    */
  var Id: js.UndefOr[ContactFlowModuleId] = js.undefined
  
  /**
    * The name of the flow module.
    */
  var Name: js.UndefOr[ContactFlowModuleName] = js.undefined
  
  /**
    * The type of flow module.
    */
  var State: js.UndefOr[ContactFlowModuleState] = js.undefined
  
  /**
    * The status of the flow module.
    */
  var Status: js.UndefOr[ContactFlowModuleStatus] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ContactFlowModule {
  
  inline def apply(): ContactFlowModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFlowModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactFlowModule] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setContent(value: ContactFlowModuleContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setDescription(value: ContactFlowModuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: ContactFlowModuleId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ContactFlowModuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: ContactFlowModuleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatus(value: ContactFlowModuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
