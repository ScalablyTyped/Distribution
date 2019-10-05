package typings.atAntDashDesignReactDashNative.esPortalPortalDashHostMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalHostProps extends js.Object {
  var children: ReactNode
}

object PortalHostProps {
  @scala.inline
  def apply(children: ReactNode = null): PortalHostProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalHostProps]
  }
}

