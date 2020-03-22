package typings.antDesignReactNative

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenReactNode extends js.Object {
  var children: ReactNode
  var key: Double
}

object AnonChildrenReactNode {
  @scala.inline
  def apply(key: Double, children: ReactNode = null): AnonChildrenReactNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenReactNode]
  }
}

