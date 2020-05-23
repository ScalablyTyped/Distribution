package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveObjectsOptions extends js.Object {
  /**
    * If the object id should be generated when does not exists.
    */
  val autoGenerateObjectIDIfNotExist: js.UndefOr[Boolean] = js.undefined
}

object SaveObjectsOptions {
  @scala.inline
  def apply(autoGenerateObjectIDIfNotExist: js.UndefOr[Boolean] = js.undefined): SaveObjectsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoGenerateObjectIDIfNotExist)) __obj.updateDynamic("autoGenerateObjectIDIfNotExist")(autoGenerateObjectIDIfNotExist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveObjectsOptions]
  }
}

