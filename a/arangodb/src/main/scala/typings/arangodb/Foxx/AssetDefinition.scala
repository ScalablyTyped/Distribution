package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetDefinition extends js.Object {
  var gzip: js.UndefOr[Boolean] = js.undefined
  var path: String
  var `type`: js.UndefOr[String] = js.undefined
}

object AssetDefinition {
  @scala.inline
  def apply(path: String, gzip: js.UndefOr[Boolean] = js.undefined, `type`: String = null): AssetDefinition = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDefinition]
  }
}

