package typings.antDesignReactNative.portalPortalMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  /**
    * Content of the `Portal`.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(children: ReactNode = null): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

