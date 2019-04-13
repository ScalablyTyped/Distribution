package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDisassociateUserStackResult extends js.Object {
  /**
    * The list of UserStackAssociationError objects.
    */
  var errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined
}

object BatchDisassociateUserStackResult {
  @scala.inline
  def apply(errors: UserStackAssociationErrorList = null): BatchDisassociateUserStackResult = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[BatchDisassociateUserStackResult]
  }
}

