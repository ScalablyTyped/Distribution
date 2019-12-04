package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.update
import typings.atAntDashDesignReactDashNative.libPortalPortalDashHostMod.Operation
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenKeyType extends Operation {
  var children: ReactNode
  var key: Double
  var `type`: update
}

object Anon_ChildrenKeyType {
  @scala.inline
  def apply(key: Double, `type`: update, children: ReactNode = null): Anon_ChildrenKeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenKeyType]
  }
}

