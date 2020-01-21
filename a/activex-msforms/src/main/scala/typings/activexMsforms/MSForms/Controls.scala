package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controls extends js.Object {
  val Count: Double = js.native
  def apply(varg: js.Any): js.Any = js.native
  def Add(bstrProgID: String): Control = js.native
  def Add(bstrProgID: String, Name: js.Any): Control = js.native
  def Add(bstrProgID: String, Name: js.Any, Visible: js.Any): Control = js.native
  def AlignToGrid(): Unit = js.native
  def BringForward(): Unit = js.native
  def BringToFront(): Unit = js.native
  def Clear(): Unit = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Enum(): js.Any = js.native
  def Item(varg: js.Any): js.Any = js.native
  def Move(cx: Double, cy: Double): Unit = js.native
  def Remove(varg: js.Any): Unit = js.native
  def SelectAll(): Unit = js.native
  def SendBackward(): Unit = js.native
  def SendToBack(): Unit = js.native
  def _AddByClass(clsid: Double): Control = js.native
  def _GetItemByID(ID: Double): Control = js.native
  def _GetItemByIndex(lIndex: Double): Control = js.native
  def _GetItemByName(pstr: String): Control = js.native
  def _Move(cx: Double, cy: Double): Unit = js.native
}

