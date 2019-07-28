package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostListener extends js.Object {
  /**
    * A set of arguments to pass to the handler method when the event occurs.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The DOM event to listen for.
    */
  var eventName: js.UndefOr[String] = js.undefined
}

object HostListener {
  @scala.inline
  def apply(args: js.Array[String] = null, eventName: String = null): HostListener = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    __obj.asInstanceOf[HostListener]
  }
}

