package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateUserStackRequest extends StObject {
  
  /**
    * The list of UserStackAssociation objects.
    */
  var UserStackAssociations: UserStackAssociationList
}
object BatchDisassociateUserStackRequest {
  
  inline def apply(UserStackAssociations: UserStackAssociationList): BatchDisassociateUserStackRequest = {
    val __obj = js.Dynamic.literal(UserStackAssociations = UserStackAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateUserStackRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDisassociateUserStackRequest] (val x: Self) extends AnyVal {
    
    inline def setUserStackAssociations(value: UserStackAssociationList): Self = StObject.set(x, "UserStackAssociations", value.asInstanceOf[js.Any])
    
    inline def setUserStackAssociationsVarargs(value: UserStackAssociation*): Self = StObject.set(x, "UserStackAssociations", js.Array(value*))
  }
}
