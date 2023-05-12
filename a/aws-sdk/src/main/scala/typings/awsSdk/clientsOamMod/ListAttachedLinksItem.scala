package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttachedLinksItem extends StObject {
  
  /**
    * The label that was assigned to this link at creation, with the variables resolved to their actual values.
    */
  var Label: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the link.
    */
  var LinkArn: js.UndefOr[String] = js.undefined
  
  /**
    * The resource types supported by this link.
    */
  var ResourceTypes: js.UndefOr[ResourceTypesOutput] = js.undefined
}
object ListAttachedLinksItem {
  
  inline def apply(): ListAttachedLinksItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttachedLinksItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAttachedLinksItem] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setLinkArn(value: String): Self = StObject.set(x, "LinkArn", value.asInstanceOf[js.Any])
    
    inline def setLinkArnUndefined: Self = StObject.set(x, "LinkArn", js.undefined)
    
    inline def setResourceTypes(value: ResourceTypesOutput): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: String*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
  }
}
