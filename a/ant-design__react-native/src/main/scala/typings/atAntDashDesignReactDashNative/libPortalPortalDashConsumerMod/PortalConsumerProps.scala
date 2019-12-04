package typings.atAntDashDesignReactDashNative.libPortalPortalDashConsumerMod

import typings.atAntDashDesignReactDashNative.libPortalPortalDashHostMod.PortalMethods
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalConsumerProps extends js.Object {
  var children: ReactNode
  var manager: PortalMethods
}

object PortalConsumerProps {
  @scala.inline
  def apply(manager: PortalMethods, children: ReactNode = null): PortalConsumerProps = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalConsumerProps]
  }
}

