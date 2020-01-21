package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pages extends js.Object {
  val Count: Double = js.native
  def apply(varg: js.Any): js.Any = js.native
  def Add(): Page = js.native
  def Add(bstrName: js.Any): Page = js.native
  def Add(bstrName: js.Any, bstrCaption: js.Any): Page = js.native
  def Add(bstrName: js.Any, bstrCaption: js.Any, lIndex: js.Any): Page = js.native
  def Clear(): Unit = js.native
  def Enum(): js.Any = js.native
  def Item(varg: js.Any): js.Any = js.native
  def Remove(varg: js.Any): Unit = js.native
  def _AddCtrl(clsid: Double, bstrName: String, bstrCaption: String): Page = js.native
  def _GetItemByIndex(lIndex: Double): Control = js.native
  def _GetItemByName(pstrName: String): Control = js.native
  def _InsertCtrl(clsid: Double, bstrName: String, bstrCaption: String, lIndex: Double): Page = js.native
}

