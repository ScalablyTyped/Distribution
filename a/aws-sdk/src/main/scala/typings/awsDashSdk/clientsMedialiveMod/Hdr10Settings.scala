package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hdr10Settings extends js.Object {
  /**
    * Maximum Content Light Level
  An integer metadata value defining the maximum light level, in nits,
  of any single pixel within an encoded HDR video stream or file.
    */
  var MaxCll: js.UndefOr[__integerMin0Max32768] = js.undefined
  /**
    * Maximum Frame Average Light Level
  An integer metadata value defining the maximum average light level, in nits,
  for any single frame within an encoded HDR video stream or file.
    */
  var MaxFall: js.UndefOr[__integerMin0Max32768] = js.undefined
}

object Hdr10Settings {
  @scala.inline
  def apply(
    MaxCll: js.UndefOr[__integerMin0Max32768] = js.undefined,
    MaxFall: js.UndefOr[__integerMin0Max32768] = js.undefined
  ): Hdr10Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxCll)) __obj.updateDynamic("MaxCll")(MaxCll)
    if (!js.isUndefined(MaxFall)) __obj.updateDynamic("MaxFall")(MaxFall)
    __obj.asInstanceOf[Hdr10Settings]
  }
}

