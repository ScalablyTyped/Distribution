package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSamplesResult extends js.Object {
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned, which can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Information about the samples.
    */
  var samples: js.UndefOr[Samples] = js.undefined
}

object ListSamplesResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, samples: Samples = null): ListSamplesResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (samples != null) __obj.updateDynamic("samples")(samples)
    __obj.asInstanceOf[ListSamplesResult]
  }
}

