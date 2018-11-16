package typings
package angularDashFullscreenLib.angularMod.fullscreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Prefixing interface name with "I" is not recommended: http://www.typescriptlang.org/Handbook#writing-dts-files
     * However, we let it here to keep consistency with all the other Angular-related definitions
     */
@js.native
trait IFullscreen extends js.Object {
  // enable document fullscreen
  def all(): scala.Unit = js.native
  // disable fullscreen
  def cancel(): scala.Unit = js.native
  // enable fullscreen to a specific element
  def enable(element: stdLib.Element): scala.Unit = js.native
  // enable fullscreen to a specific element
  def enable(element: stdLib.HTMLElement): scala.Unit = js.native
  // return true if fullscreen is enabled, otherwise false
  def isEnabled(): scala.Boolean = js.native
  // return true if fullscreen API is supported by your browser
  def isSupported(): scala.Boolean = js.native
  // enable or disable the document fullscreen
  def toggleAll(): scala.Unit = js.native
}

