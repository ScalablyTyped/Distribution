package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetsResponse extends js.Object {
  /**
    * An array of Dataset objects. Each object provides metadata information.
    */
  var datasets: js.UndefOr[Datasets] = js.native
  /**
    * A token for getting the next set of datasets (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetsResponse {
  @scala.inline
  def apply(datasets: Datasets = null, nextToken: NextToken = null): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetsResponse]
  }
}

