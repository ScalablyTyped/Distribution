package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetsResponse extends js.Object {
  /**
    * Number of datasets returned.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  /**
    * A set of datasets.
    */
  var Datasets: js.UndefOr[DatasetList] = js.undefined
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListDatasetsResponse {
  @scala.inline
  def apply(Count: js.UndefOr[Integer] = js.undefined, Datasets: DatasetList = null, NextToken: String = null): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count)
    if (Datasets != null) __obj.updateDynamic("Datasets")(Datasets)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDatasetsResponse]
  }
}

