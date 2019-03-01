package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRtmpUrlOptions extends js.Object {
  var expires: js.UndefOr[scala.Double] = js.undefined
   // the expire time in seconds of the url
  var params: js.UndefOr[js.Object] = js.undefined
   // the additional parameters for url, e.g.: {playlistName: 'play.m3u8'}
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object GetRtmpUrlOptions {
  @scala.inline
  def apply(
    expires: scala.Int | scala.Double = null,
    params: js.Object = null,
    timeout: scala.Int | scala.Double = null
  ): GetRtmpUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRtmpUrlOptions]
  }
}

