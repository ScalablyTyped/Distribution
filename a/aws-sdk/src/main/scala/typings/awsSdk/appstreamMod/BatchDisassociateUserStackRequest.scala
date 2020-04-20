package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisassociateUserStackRequest extends js.Object {
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
}

