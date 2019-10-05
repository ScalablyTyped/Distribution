package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePatchPropertiesRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * The operating system type for which to list patches.
    */
  var OperatingSystem: typings.awsDashSdk.clientsSsmMod.OperatingSystem
  /**
    * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.
    */
  var PatchSet: js.UndefOr[typings.awsDashSdk.clientsSsmMod.PatchSet] = js.undefined
  /**
    * The patch property for which you want to view patch details. 
    */
  var Property: PatchProperty
}

object DescribePatchPropertiesRequest {
  @scala.inline
  def apply(
    OperatingSystem: OperatingSystem,
    Property: PatchProperty,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    PatchSet: PatchSet = null
  ): DescribePatchPropertiesRequest = {
    val __obj = js.Dynamic.literal(OperatingSystem = OperatingSystem.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PatchSet != null) __obj.updateDynamic("PatchSet")(PatchSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchPropertiesRequest]
  }
}

