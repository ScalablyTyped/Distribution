package typings.antDesignReactNative.portalHostMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalGuard extends js.Object {
  var nextKey: js.Any
  def add(e: ReactNode): Double
  def remove(key: Double): Unit
}

object PortalGuard {
  @scala.inline
  def apply(add: ReactNode => Double, nextKey: js.Any, remove: Double => Unit): PortalGuard = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), nextKey = nextKey.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[PortalGuard]
  }
}

