package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAssociateUserStackRequest extends js.Object {
  /**
    * The list of UserStackAssociation objects.
    */
  var UserStackAssociations: UserStackAssociationList
}

object BatchAssociateUserStackRequest {
  @scala.inline
  def apply(UserStackAssociations: UserStackAssociationList): BatchAssociateUserStackRequest = {
    val __obj = js.Dynamic.literal(UserStackAssociations = UserStackAssociations)
  
    __obj.asInstanceOf[BatchAssociateUserStackRequest]
  }
}

