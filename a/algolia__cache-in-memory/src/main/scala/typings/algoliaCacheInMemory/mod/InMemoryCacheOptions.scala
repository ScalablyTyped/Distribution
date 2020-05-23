package typings.algoliaCacheInMemory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InMemoryCacheOptions extends js.Object {
  /**
    * If keys and values should be serialized using `JSON.stringify`.
    */
  val serializable: js.UndefOr[Boolean] = js.undefined
}

object InMemoryCacheOptions {
  @scala.inline
  def apply(serializable: js.UndefOr[Boolean] = js.undefined): InMemoryCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(serializable)) __obj.updateDynamic("serializable")(serializable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InMemoryCacheOptions]
  }
}

