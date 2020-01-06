package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintDetail extends js.Object {
  /**
    * The identifier of the constraint.
    */
  var ConstraintId: js.UndefOr[Id] = js.native
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.native
  /**
    * The owner of the constraint.
    */
  var Owner: js.UndefOr[AccountId] = js.native
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
    */
  var Type: js.UndefOr[ConstraintType] = js.native
}

object ConstraintDetail {
  @scala.inline
  def apply(
    ConstraintId: Id = null,
    Description: ConstraintDescription = null,
    Owner: AccountId = null,
    Type: ConstraintType = null
  ): ConstraintDetail = {
    val __obj = js.Dynamic.literal()
    if (ConstraintId != null) __obj.updateDynamic("ConstraintId")(ConstraintId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintDetail]
  }
}

