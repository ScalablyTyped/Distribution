package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDisassociateUserStackRequest extends js.Object {
  /**
    * The list of UserStackAssociation objects.
    */
  var UserStackAssociations: UserStackAssociationList
}

object BatchDisassociateUserStackRequest {
  @scala.inline
  def apply(UserStackAssociations: UserStackAssociationList): BatchDisassociateUserStackRequest = {
    val __obj = js.Dynamic.literal(UserStackAssociations = UserStackAssociations)
  
    __obj.asInstanceOf[BatchDisassociateUserStackRequest]
  }
}

