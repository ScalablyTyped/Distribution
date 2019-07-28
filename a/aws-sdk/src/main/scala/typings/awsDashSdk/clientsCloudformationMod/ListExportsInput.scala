package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListExportsInput extends js.Object {
  /**
    * A string (provided by the ListExports response output) that identifies the next page of exported output values that you asked to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
}

object ListExportsInput {
  @scala.inline
  def apply(NextToken: NextToken = null): ListExportsInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListExportsInput]
  }
}

