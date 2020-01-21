package typings.antDesignReactNative.portalHostMod

import typings.antDesignReactNative.antDesignReactNativeStrings.mount
import typings.antDesignReactNative.antDesignReactNativeStrings.unmount
import typings.antDesignReactNative.antDesignReactNativeStrings.update
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antDesignReactNative.AnonChildrenKey
  - typings.antDesignReactNative.AnonChildrenKeyType
  - typings.antDesignReactNative.AnonKeyType
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  def AnonChildrenKey(key: Double, `type`: mount, children: ReactNode = null): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def AnonChildrenKeyType(key: Double, `type`: update, children: ReactNode = null): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def AnonKeyType(key: Double, `type`: unmount): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

