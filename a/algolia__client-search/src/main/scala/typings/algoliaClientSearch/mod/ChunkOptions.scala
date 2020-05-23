package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkOptions extends js.Object {
  /**
    * The number of objects per batch.
    */
  val batchSize: js.UndefOr[Double] = js.undefined
}

object ChunkOptions {
  @scala.inline
  def apply(batchSize: js.UndefOr[Double] = js.undefined): ChunkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkOptions]
  }
}

