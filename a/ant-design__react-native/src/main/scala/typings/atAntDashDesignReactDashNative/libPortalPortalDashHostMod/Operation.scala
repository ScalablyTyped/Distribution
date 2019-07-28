package typings.atAntDashDesignReactDashNative.libPortalPortalDashHostMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.mount
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.unmount
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.update
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var key: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[mount | unmount | update] = js.undefined
}

object Operation {
  @scala.inline
  def apply(children: ReactNode = null, key: Int | Double = null, `type`: mount = null): Operation = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Operation]
  }
}

