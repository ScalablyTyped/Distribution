package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePatchPropertiesResult extends js.Object {
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of the properties for patches matching the filter request parameters.
    */
  var Properties: js.UndefOr[PatchPropertiesList] = js.undefined
}

object DescribePatchPropertiesResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Properties: PatchPropertiesList = null): DescribePatchPropertiesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Properties != null) __obj.updateDynamic("Properties")(Properties)
    __obj.asInstanceOf[DescribePatchPropertiesResult]
  }
}

