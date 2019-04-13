package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAssociationStatusResult extends js.Object {
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
}

object UpdateAssociationStatusResult {
  @scala.inline
  def apply(AssociationDescription: AssociationDescription = null): UpdateAssociationStatusResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationDescription != null) __obj.updateDynamic("AssociationDescription")(AssociationDescription)
    __obj.asInstanceOf[UpdateAssociationStatusResult]
  }
}

