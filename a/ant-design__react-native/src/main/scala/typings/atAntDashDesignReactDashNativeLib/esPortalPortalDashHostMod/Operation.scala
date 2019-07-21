package typings
package atAntDashDesignReactDashNativeLib.esPortalPortalDashHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var key: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.mount | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.unmount | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.update
  ] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    key: scala.Int | scala.Double = null,
    `type`: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.mount = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Operation]
  }
}

