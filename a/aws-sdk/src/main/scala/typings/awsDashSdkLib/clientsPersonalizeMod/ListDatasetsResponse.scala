package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetsResponse extends js.Object {
  /**
    * An array of Dataset objects. Each object provides metadata information.
    */
  var datasets: js.UndefOr[Datasets] = js.undefined
  /**
    * A token for getting the next set of datasets (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDatasetsResponse {
  @scala.inline
  def apply(datasets: Datasets = null, nextToken: NextToken = null): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDatasetsResponse]
  }
}

