package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListImportsOutput extends js.Object {
  /**
    * A list of stack names that are importing the specified exported output value. 
    */
  var Imports: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Imports] = js.undefined
  /**
    * A string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
}

object ListImportsOutput {
  @scala.inline
  def apply(Imports: Imports = null, NextToken: NextToken = null): ListImportsOutput = {
    val __obj = js.Dynamic.literal()
    if (Imports != null) __obj.updateDynamic("Imports")(Imports)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListImportsOutput]
  }
}

