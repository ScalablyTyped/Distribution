package typings
package atAntDashDesignReactDashNativeLib.libPortalPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  /**
    * Content of the `Portal`.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode = null): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

