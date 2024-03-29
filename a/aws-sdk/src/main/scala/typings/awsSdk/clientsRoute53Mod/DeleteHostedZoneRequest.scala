package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHostedZoneRequest extends StObject {
  
  /**
    * The ID of the hosted zone you want to delete.
    */
  var Id: ResourceId
}
object DeleteHostedZoneRequest {
  
  inline def apply(Id: ResourceId): DeleteHostedZoneRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostedZoneRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteHostedZoneRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
