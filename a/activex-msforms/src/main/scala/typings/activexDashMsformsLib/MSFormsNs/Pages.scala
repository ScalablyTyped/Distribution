package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pages extends js.Object {
  val Count: scala.Double = js.native
  def apply(varg: js.Any): js.Any = js.native
  def Add(): Page = js.native
  def Add(bstrName: js.Any): Page = js.native
  def Add(bstrName: js.Any, bstrCaption: js.Any): Page = js.native
  def Add(bstrName: js.Any, bstrCaption: js.Any, lIndex: js.Any): Page = js.native
  def Clear(): scala.Unit = js.native
  def Enum(): js.Any = js.native
  def Item(varg: js.Any): js.Any = js.native
  def Remove(varg: js.Any): scala.Unit = js.native
  def _AddCtrl(clsid: scala.Double, bstrName: java.lang.String, bstrCaption: java.lang.String): Page = js.native
  def _GetItemByIndex(lIndex: scala.Double): Control = js.native
  def _GetItemByName(pstrName: java.lang.String): Control = js.native
  def _InsertCtrl(
    clsid: scala.Double,
    bstrName: java.lang.String,
    bstrCaption: java.lang.String,
    lIndex: scala.Double
  ): Page = js.native
}

