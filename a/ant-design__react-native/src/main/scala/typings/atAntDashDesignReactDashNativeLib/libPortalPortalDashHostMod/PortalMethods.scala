package typings
package atAntDashDesignReactDashNativeLib.libPortalPortalDashHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalMethods extends js.Object {
  def mount(children: reactLib.reactMod.ReactNode): scala.Double
  def unmount(key: scala.Double): scala.Unit
  def update(key: scala.Double, children: reactLib.reactMod.ReactNode): scala.Unit
}

object PortalMethods {
  @scala.inline
  def apply(
    mount: reactLib.reactMod.ReactNode => scala.Double,
    unmount: scala.Double => scala.Unit,
    update: (scala.Double, reactLib.reactMod.ReactNode) => scala.Unit
  ): PortalMethods = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[PortalMethods]
  }
}

