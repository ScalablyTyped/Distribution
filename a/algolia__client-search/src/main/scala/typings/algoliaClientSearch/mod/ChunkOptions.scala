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
  def apply(batchSize: Int | Double = null): ChunkOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkOptions]
  }
}

