package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait COMAddIns extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): COMAddIn = js.native
  def apply(Index: scala.Double): COMAddIn = js.native
  def Item(Index: java.lang.String): COMAddIn = js.native
  def Item(Index: scala.Double): COMAddIn = js.native
  def SetAppModal(varfModal: scala.Boolean): scala.Unit = js.native
  def Update(): scala.Unit = js.native
}

