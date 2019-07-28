package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssociationResult extends js.Object {
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationDescription] = js.undefined
}

object DescribeAssociationResult {
  @scala.inline
  def apply(AssociationDescription: AssociationDescription = null): DescribeAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationDescription != null) __obj.updateDynamic("AssociationDescription")(AssociationDescription)
    __obj.asInstanceOf[DescribeAssociationResult]
  }
}

