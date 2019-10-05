package typings.atAntDashDesignReactDashNative

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: ReactNode
  var key: Double
}

object Anon_Children {
  @scala.inline
  def apply(key: Double, children: ReactNode = null): Anon_Children = {
    val __obj = js.Dynamic.literal(key = key)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

