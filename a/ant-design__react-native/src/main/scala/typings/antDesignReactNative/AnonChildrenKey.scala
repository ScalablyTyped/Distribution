package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.mount
import typings.antDesignReactNative.portalHostMod.Operation
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenKey extends Operation {
  var children: ReactNode
  var key: Double
  var `type`: mount
}

object AnonChildrenKey {
  @scala.inline
  def apply(key: Double, `type`: mount, children: ReactNode = null): AnonChildrenKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenKey]
  }
}

