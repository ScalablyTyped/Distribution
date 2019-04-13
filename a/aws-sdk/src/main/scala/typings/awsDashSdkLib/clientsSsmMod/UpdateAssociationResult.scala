package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAssociationResult extends js.Object {
  /**
    * The description of the association that was updated.
    */
  var AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
}

object UpdateAssociationResult {
  @scala.inline
  def apply(AssociationDescription: AssociationDescription = null): UpdateAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationDescription != null) __obj.updateDynamic("AssociationDescription")(AssociationDescription)
    __obj.asInstanceOf[UpdateAssociationResult]
  }
}

