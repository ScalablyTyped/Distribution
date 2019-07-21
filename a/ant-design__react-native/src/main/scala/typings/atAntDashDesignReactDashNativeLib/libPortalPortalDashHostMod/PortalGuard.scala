package typings
package atAntDashDesignReactDashNativeLib.libPortalPortalDashHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalGuard extends js.Object {
  var nextKey: js.Any
  def add(e: reactLib.reactMod.ReactNode): scala.Double
  def remove(key: scala.Double): scala.Unit
}

object PortalGuard {
  @scala.inline
  def apply(
    add: reactLib.reactMod.ReactNode => scala.Double,
    nextKey: js.Any,
    remove: scala.Double => scala.Unit
  ): PortalGuard = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), nextKey = nextKey, remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[PortalGuard]
  }
}

