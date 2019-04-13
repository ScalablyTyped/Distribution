package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTemplatesRequest extends js.Object {
  /**
    * The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If you do not specify a value, or if you specify a value less than 1 or greater than 10, the operation will return up to 10 results.
    */
  var MaxItems: js.UndefOr[MaxItems] = js.undefined
  /**
    * A token returned from a previous call to ListTemplates to indicate the position in the list of email templates.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListTemplatesRequest {
  @scala.inline
  def apply(MaxItems: js.UndefOr[MaxItems] = js.undefined, NextToken: NextToken = null): ListTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTemplatesRequest]
  }
}

