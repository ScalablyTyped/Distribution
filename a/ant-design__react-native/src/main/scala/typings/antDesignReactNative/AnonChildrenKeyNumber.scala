package typings.antDesignReactNative

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenKeyNumber extends js.Object {
  var children: ReactNode
  var key: Double
}

object AnonChildrenKeyNumber {
  @scala.inline
  def apply(key: Double, children: ReactNode = null): AnonChildrenKeyNumber = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenKeyNumber]
  }
}

