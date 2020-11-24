package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateUserStackRequest extends js.Object {
  
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
  implicit class BatchAssociateUserStackRequestOps[Self <: BatchAssociateUserStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUserStackAssociationsVarargs(value: UserStackAssociation*): Self = this.set("UserStackAssociations", js.Array(value :_*))
    
    @scala.inline
    def setUserStackAssociations(value: UserStackAssociationList): Self = this.set("UserStackAssociations", value.asInstanceOf[js.Any])
  }
}
