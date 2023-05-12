package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLinkOutput extends StObject {
  
  /**
    * The ARN of the link that is newly created.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The random ID string that Amazon Web Services generated as part of the link ARN.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The label that you assigned to this link. If the labelTemplate includes variables, this field displays the variables resolved to their actual values.
    */
  var Label: js.UndefOr[String] = js.undefined
  
  /**
    * The exact label template that you specified, with the variables not resolved.
    */
  var LabelTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * The resource types supported by this link.
    */
  var ResourceTypes: js.UndefOr[ResourceTypesOutput] = js.undefined
  
  /**
    * The ARN of the sink that is used for this link.
    */
  var SinkArn: js.UndefOr[String] = js.undefined
  
  /**
    * The tags assigned to the link.
    */
  var Tags: js.UndefOr[TagMapOutput] = js.undefined
}
object CreateLinkOutput {
  
  inline def apply(): CreateLinkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLinkOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLinkOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelTemplate(value: String): Self = StObject.set(x, "LabelTemplate", value.asInstanceOf[js.Any])
    
    inline def setLabelTemplateUndefined: Self = StObject.set(x, "LabelTemplate", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setResourceTypes(value: ResourceTypesOutput): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: String*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
    
    inline def setSinkArn(value: String): Self = StObject.set(x, "SinkArn", value.asInstanceOf[js.Any])
    
    inline def setSinkArnUndefined: Self = StObject.set(x, "SinkArn", js.undefined)
    
    inline def setTags(value: TagMapOutput): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
