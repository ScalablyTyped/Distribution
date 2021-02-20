package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisassociateUserStackRequest extends StObject {
  
  /**
    * The list of UserStackAssociation objects.
    */
  var UserStackAssociations: UserStackAssociationList = js.native
}
object BatchDisassociateUserStackRequest {
  
  @scala.inline
  def apply(UserStackAssociations: UserStackAssociationList): BatchDisassociateUserStackRequest = {
    val __obj = js.Dynamic.literal(UserStackAssociations = UserStackAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateUserStackRequest]
  }
  
  @scala.inline
  implicit class BatchDisassociateUserStackRequestMutableBuilder[Self <: BatchDisassociateUserStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserStackAssociations(value: UserStackAssociationList): Self = StObject.set(x, "UserStackAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStackAssociationsVarargs(value: UserStackAssociation*): Self = StObject.set(x, "UserStackAssociations", js.Array(value :_*))
  }
}
