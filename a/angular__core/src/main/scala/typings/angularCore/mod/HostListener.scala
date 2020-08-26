package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostListener extends js.Object {
  /**
    * A set of arguments to pass to the handler method when the event occurs.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * The DOM event to listen for.
    */
  var eventName: js.UndefOr[String] = js.native
}

@JSImport("@angular/core", "HostListener")
@js.native
object HostListener extends TopLevel[HostListenerDecorator]

