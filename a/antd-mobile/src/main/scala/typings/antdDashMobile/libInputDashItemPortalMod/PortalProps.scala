package typings.antdDashMobile.libInputDashItemPortalMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  def getContainer(): Element
}

object PortalProps {
  @scala.inline
  def apply(getContainer: () => Element): PortalProps = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer))
  
    __obj.asInstanceOf[PortalProps]
  }
}

