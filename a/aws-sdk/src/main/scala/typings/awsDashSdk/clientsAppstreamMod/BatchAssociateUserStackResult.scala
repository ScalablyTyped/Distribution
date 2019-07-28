package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAssociateUserStackResult extends js.Object {
  /**
    * The list of UserStackAssociationError objects.
    */
  var errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined
}

object BatchAssociateUserStackResult {
  @scala.inline
  def apply(errors: UserStackAssociationErrorList = null): BatchAssociateUserStackResult = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[BatchAssociateUserStackResult]
  }
}

