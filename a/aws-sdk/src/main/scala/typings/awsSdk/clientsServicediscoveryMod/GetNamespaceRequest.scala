package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNamespaceRequest extends StObject {
  
  /**
    * The ID of the namespace that you want to get information about.
    */
  var Id: ResourceId
}
object GetNamespaceRequest {
  
  inline def apply(Id: ResourceId): GetNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamespaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNamespaceRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
