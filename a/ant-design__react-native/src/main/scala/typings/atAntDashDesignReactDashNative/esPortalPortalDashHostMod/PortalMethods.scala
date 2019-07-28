package typings.atAntDashDesignReactDashNative.esPortalPortalDashHostMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalMethods extends js.Object {
  def mount(children: ReactNode): Double
  def unmount(key: Double): Unit
  def update(key: Double, children: ReactNode): Unit
}

object PortalMethods {
  @scala.inline
  def apply(mount: ReactNode => Double, unmount: Double => Unit, update: (Double, ReactNode) => Unit): PortalMethods = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[PortalMethods]
  }
}

