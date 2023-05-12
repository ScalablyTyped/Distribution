package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSpaceRequest extends StObject {
  
  /**
    * The ID of the associated Domain.
    */
  var DomainId: typings.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * The name of the space.
    */
  var SpaceName: typings.awsSdk.clientsSagemakerMod.SpaceName
}
object DeleteSpaceRequest {
  
  inline def apply(DomainId: DomainId, SpaceName: SpaceName): DeleteSpaceRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], SpaceName = SpaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSpaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSpaceRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: SpaceName): Self = StObject.set(x, "SpaceName", value.asInstanceOf[js.Any])
  }
}
