package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetResourceTypeRequest extends StObject {
  
  /**
    * The resource type.
    */
  var resourceType: TargetResourceTypeId
}
object GetTargetResourceTypeRequest {
  
  inline def apply(resourceType: TargetResourceTypeId): GetTargetResourceTypeRequest = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetResourceTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTargetResourceTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceType(value: TargetResourceTypeId): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
