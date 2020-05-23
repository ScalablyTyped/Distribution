package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRtmpUrlOptions extends js.Object {
  var expires: js.UndefOr[Double] = js.undefined
   // the expire time in seconds of the url
  var params: js.UndefOr[js.Object] = js.undefined
   // the additional parameters for url, e.g.: {playlistName: 'play.m3u8'}
  var timeout: js.UndefOr[Double] = js.undefined
}

object GetRtmpUrlOptions {
  @scala.inline
  def apply(
    expires: js.UndefOr[Double] = js.undefined,
    params: js.Object = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): GetRtmpUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRtmpUrlOptions]
  }
}

