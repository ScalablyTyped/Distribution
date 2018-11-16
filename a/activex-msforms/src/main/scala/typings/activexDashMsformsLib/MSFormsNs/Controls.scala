package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controls extends js.Object {
  val Count: scala.Double = js.native
  def apply(varg: js.Any): js.Any = js.native
  def Add(bstrProgID: java.lang.String): Control = js.native
  def Add(bstrProgID: java.lang.String, Name: js.Any): Control = js.native
  def Add(bstrProgID: java.lang.String, Name: js.Any, Visible: js.Any): Control = js.native
  def AlignToGrid(): scala.Unit = js.native
  def BringForward(): scala.Unit = js.native
  def BringToFront(): scala.Unit = js.native
  def Clear(): scala.Unit = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Enum(): js.Any = js.native
  def Item(varg: js.Any): js.Any = js.native
  def Move(cx: scala.Double, cy: scala.Double): scala.Unit = js.native
  def Remove(varg: js.Any): scala.Unit = js.native
  def SelectAll(): scala.Unit = js.native
  def SendBackward(): scala.Unit = js.native
  def SendToBack(): scala.Unit = js.native
  def _AddByClass(clsid: scala.Double): Control = js.native
  def _GetItemByID(ID: scala.Double): Control = js.native
  def _GetItemByIndex(lIndex: scala.Double): Control = js.native
  def _GetItemByName(pstr: java.lang.String): Control = js.native
  def _Move(cx: scala.Double, cy: scala.Double): scala.Unit = js.native
}

