package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOptions extends js.Object {
  /**
    * Clone recursively
    *
    * `true` by default
    */
  var deep: js.UndefOr[Boolean] = js.undefined
  /**
    * Clone non-plain object, they will be plain objects
    *
    * `false` by default
    */
  var nonPlainObjects: js.UndefOr[Boolean] = js.undefined
  /**
    * Clone only enumerable properties
    *
    * `true` by default
    */
  var onlyEnumerable: js.UndefOr[Boolean] = js.undefined
}

object CloneOptions {
  @scala.inline
  def apply(
    deep: js.UndefOr[Boolean] = js.undefined,
    nonPlainObjects: js.UndefOr[Boolean] = js.undefined,
    onlyEnumerable: js.UndefOr[Boolean] = js.undefined
  ): CloneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (!js.isUndefined(nonPlainObjects)) __obj.updateDynamic("nonPlainObjects")(nonPlainObjects)
    if (!js.isUndefined(onlyEnumerable)) __obj.updateDynamic("onlyEnumerable")(onlyEnumerable)
    __obj.asInstanceOf[CloneOptions]
  }
}

