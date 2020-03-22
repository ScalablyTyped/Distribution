package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialUpdateObjectsOptions extends js.Object {
  /**
    * If the object should be created when does not exist.
    */
  val createIfNotExists: js.UndefOr[Boolean] = js.undefined
}

object PartialUpdateObjectsOptions {
  @scala.inline
  def apply(createIfNotExists: js.UndefOr[Boolean] = js.undefined): PartialUpdateObjectsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(createIfNotExists)) __obj.updateDynamic("createIfNotExists")(createIfNotExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUpdateObjectsOptions]
  }
}

