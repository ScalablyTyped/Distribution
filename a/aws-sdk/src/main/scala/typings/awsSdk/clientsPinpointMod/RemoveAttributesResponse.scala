package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAttributesResponse extends StObject {
  
  var AttributesResource: typings.awsSdk.clientsPinpointMod.AttributesResource
}
object RemoveAttributesResponse {
  
  inline def apply(AttributesResource: AttributesResource): RemoveAttributesResponse = {
    val __obj = js.Dynamic.literal(AttributesResource = AttributesResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributesResource(value: AttributesResource): Self = StObject.set(x, "AttributesResource", value.asInstanceOf[js.Any])
  }
}
