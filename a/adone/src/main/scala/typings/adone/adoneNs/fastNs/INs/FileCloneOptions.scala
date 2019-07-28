package typings.adone.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCloneOptions extends js.Object {
  var contents: js.UndefOr[Boolean] = js.undefined
  var deep: js.UndefOr[Boolean] = js.undefined
}

object FileCloneOptions {
  @scala.inline
  def apply(contents: js.UndefOr[Boolean] = js.undefined, deep: js.UndefOr[Boolean] = js.undefined): FileCloneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contents)) __obj.updateDynamic("contents")(contents)
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[FileCloneOptions]
  }
}

