package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEffectiveInstanceAssociationsResult extends js.Object {
  /**
    * The associations for the requested instance.
    */
  var Associations: js.UndefOr[InstanceAssociationList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object DescribeEffectiveInstanceAssociationsResult {
  @scala.inline
  def apply(Associations: InstanceAssociationList = null, NextToken: NextToken = null): DescribeEffectiveInstanceAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (Associations != null) __obj.updateDynamic("Associations")(Associations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEffectiveInstanceAssociationsResult]
  }
}

