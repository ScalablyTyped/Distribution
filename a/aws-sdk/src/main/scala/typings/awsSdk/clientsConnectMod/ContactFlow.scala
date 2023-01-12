package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactFlow extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the flow.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The content of the flow.
    */
  var Content: js.UndefOr[ContactFlowContent] = js.undefined
  
  /**
    * The description of the flow.
    */
  var Description: js.UndefOr[ContactFlowDescription] = js.undefined
  
  /**
    * The identifier of the flow.
    */
  var Id: js.UndefOr[ContactFlowId] = js.undefined
  
  /**
    * The name of the flow.
    */
  var Name: js.UndefOr[ContactFlowName] = js.undefined
  
  /**
    * The type of flow.
    */
  var State: js.UndefOr[ContactFlowState] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of the flow. For descriptions of the available types, see Choose a flow type in the Amazon Connect Administrator Guide.
    */
  var Type: js.UndefOr[ContactFlowType] = js.undefined
}
object ContactFlow {
  
  inline def apply(): ContactFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFlow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactFlow] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setContent(value: ContactFlowContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setDescription(value: ContactFlowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: ContactFlowId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ContactFlowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: ContactFlowState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: ContactFlowType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
