package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDifferencesOutput extends js.Object {
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCodecommitMod.NextToken] = js.undefined
  /**
    * A differences data type object that contains information about the differences, including whether the difference is added, modified, or deleted (A, D, M).
    */
  var differences: js.UndefOr[DifferenceList] = js.undefined
}

object GetDifferencesOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, differences: DifferenceList = null): GetDifferencesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (differences != null) __obj.updateDynamic("differences")(differences)
    __obj.asInstanceOf[GetDifferencesOutput]
  }
}

