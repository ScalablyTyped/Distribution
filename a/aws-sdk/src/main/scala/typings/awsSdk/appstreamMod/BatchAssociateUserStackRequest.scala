package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateUserStackRequest extends StObject {
  
  /**
    * The list of UserStackAssociation objects.
    */
  var UserStackAssociations: UserStackAssociationList = js.native
}
object BatchAssociateUserStackRequest {
  
  @scala.inline
  def apply(UserStackAssociations: UserStackAssociationList): BatchAssociateUserStackRequest = {
    val __obj = js.Dynamic.literal(UserStackAssociations = UserStackAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateUserStackRequest]
  }
  
  @scala.inline
  implicit class BatchAssociateUserStackRequestMutableBuilder[Self <: BatchAssociateUserStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserStackAssociations(value: UserStackAssociationList): Self = StObject.set(x, "UserStackAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStackAssociationsVarargs(value: UserStackAssociation*): Self = StObject.set(x, "UserStackAssociations", js.Array(value :_*))
  }
}
