package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCidrCollectionRequest extends StObject {
  
  /**
    * The UUID of the collection to delete.
    */
  var Id: UUID
}
object DeleteCidrCollectionRequest {
  
  inline def apply(Id: UUID): DeleteCidrCollectionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCidrCollectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCidrCollectionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: UUID): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
