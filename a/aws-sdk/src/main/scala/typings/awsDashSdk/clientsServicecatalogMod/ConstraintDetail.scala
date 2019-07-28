package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintDetail extends js.Object {
  /**
    * The identifier of the constraint.
    */
  var ConstraintId: js.UndefOr[Id] = js.undefined
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.undefined
  /**
    * The owner of the constraint.
    */
  var Owner: js.UndefOr[AccountId] = js.undefined
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
    */
  var Type: js.UndefOr[ConstraintType] = js.undefined
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
    if (ConstraintId != null) __obj.updateDynamic("ConstraintId")(ConstraintId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ConstraintDetail]
  }
}

