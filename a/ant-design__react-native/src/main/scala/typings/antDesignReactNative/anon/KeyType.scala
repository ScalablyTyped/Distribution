package typings.antDesignReactNative.anon

import typings.antDesignReactNative.antDesignReactNativeStrings.update
import typings.antDesignReactNative.portalHostMod.Operation
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyType extends Operation {
  var children: ReactNode
  var key: Double
  var `type`: update
}

object KeyType {
  @scala.inline
  def apply(key: Double, `type`: update, children: ReactNode = null): KeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyType]
  }
}

