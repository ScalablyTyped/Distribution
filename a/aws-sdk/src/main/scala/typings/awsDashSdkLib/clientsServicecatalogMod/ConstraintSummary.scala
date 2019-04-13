package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintSummary extends js.Object {
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.undefined
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
    */
  var Type: js.UndefOr[ConstraintType] = js.undefined
}

object ConstraintSummary {
  @scala.inline
  def apply(Description: ConstraintDescription = null, Type: ConstraintType = null): ConstraintSummary = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ConstraintSummary]
  }
}

