package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait COMAddIns extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): COMAddIn = js.native
  def apply(Index: Double): COMAddIn = js.native
  def Item(Index: String): COMAddIn = js.native
  def Item(Index: Double): COMAddIn = js.native
  def SetAppModal(varfModal: Boolean): Unit = js.native
  def Update(): Unit = js.native
}

