package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostListener extends js.Object {
  /**
    * A set of arguments to pass to the handler method when the event occurs.
    */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The CSS event to listen for.
    */
  var eventName: js.UndefOr[java.lang.String] = js.undefined
}

object HostListener {
  @scala.inline
  def apply(args: js.Array[java.lang.String] = null, eventName: java.lang.String = null): HostListener = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    __obj.asInstanceOf[HostListener]
  }
}

