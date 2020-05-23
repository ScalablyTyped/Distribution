package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigInfo extends js.Object {
  var default_language: String
  var max_channels: js.UndefOr[Double] = js.undefined
  var max_load: js.UndefOr[Double] = js.undefined
  var max_open_files: js.UndefOr[Double] = js.undefined
  /* Properties */
  var name: String
  var setid: SetId
}

object ConfigInfo {
  @scala.inline
  def apply(
    default_language: String,
    name: String,
    setid: SetId,
    max_channels: js.UndefOr[Double] = js.undefined,
    max_load: js.UndefOr[Double] = js.undefined,
    max_open_files: js.UndefOr[Double] = js.undefined
  ): ConfigInfo = {
    val __obj = js.Dynamic.literal(default_language = default_language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setid = setid.asInstanceOf[js.Any])
    if (!js.isUndefined(max_channels)) __obj.updateDynamic("max_channels")(max_channels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_load)) __obj.updateDynamic("max_load")(max_load.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_open_files)) __obj.updateDynamic("max_open_files")(max_open_files.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigInfo]
  }
}

