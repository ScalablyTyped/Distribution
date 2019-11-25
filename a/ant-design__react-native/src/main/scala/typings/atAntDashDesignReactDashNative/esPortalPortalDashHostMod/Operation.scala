package typings.atAntDashDesignReactDashNative.esPortalPortalDashHostMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.mount
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.unmount
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.update
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAntDashDesignReactDashNative.Anon_Children
  - typings.atAntDashDesignReactDashNative.Anon_ChildrenKey
  - typings.atAntDashDesignReactDashNative.Anon_Key
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  def Anon_Children(key: Double, `type`: mount, children: ReactNode = null): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def Anon_ChildrenKey(key: Double, `type`: update, children: ReactNode = null): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def Anon_Key(key: Double, `type`: unmount): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

