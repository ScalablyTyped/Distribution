package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListExportsOutput extends js.Object {
  /**
    * The output for the ListExports action.
    */
  var Exports: js.UndefOr[Exports] = js.undefined
  /**
    * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListExportsOutput {
  @scala.inline
  def apply(Exports: Exports = null, NextToken: NextToken = null): ListExportsOutput = {
    val __obj = js.Dynamic.literal()
    if (Exports != null) __obj.updateDynamic("Exports")(Exports)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListExportsOutput]
  }
}

