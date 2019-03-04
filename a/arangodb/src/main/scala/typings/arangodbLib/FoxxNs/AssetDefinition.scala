package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetDefinition extends js.Object {
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  var path: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AssetDefinition {
  @scala.inline
  def apply(
    path: java.lang.String,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): AssetDefinition = {
    val __obj = js.Dynamic.literal(path = path)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AssetDefinition]
  }
}

