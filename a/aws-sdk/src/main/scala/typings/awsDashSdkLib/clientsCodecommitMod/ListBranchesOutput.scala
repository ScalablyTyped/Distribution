package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBranchesOutput extends js.Object {
  /**
    * The list of branch names.
    */
  var branches: js.UndefOr[BranchNameList] = js.undefined
  /**
    * An enumeration token that returns the batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListBranchesOutput {
  @scala.inline
  def apply(branches: BranchNameList = null, nextToken: NextToken = null): ListBranchesOutput = {
    val __obj = js.Dynamic.literal()
    if (branches != null) __obj.updateDynamic("branches")(branches)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListBranchesOutput]
  }
}

