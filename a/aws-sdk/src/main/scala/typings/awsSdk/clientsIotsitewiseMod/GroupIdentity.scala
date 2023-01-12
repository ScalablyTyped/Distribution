package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupIdentity extends StObject {
  
  /**
    * The IAM Identity Center ID of the group.
    */
  var id: IdentityId
}
object GroupIdentity {
  
  inline def apply(id: IdentityId): GroupIdentity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupIdentity] (val x: Self) extends AnyVal {
    
    inline def setId(value: IdentityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
