package typings.activexDashShell.Shell32Ns

import typings.activexDashShdocvw.SHDocVwNs.InternetExplorer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Shell32.ShellWindows")
@js.native
class ShellWindows protected () extends js.Object {
  /** Contains the number of items in the collection. */
  val Count: Double = js.native
  var `Shell32.ShellWindows_typekey`: ShellWindows = js.native
  /**
    * Retrieves an InternetExplorer object that represents the Shell window.
    * @param index Default is 0
    */
  def Item(): InternetExplorer = js.native
  def Item(index: Double): InternetExplorer = js.native
}

