package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSForms.DataObject")
@js.native
class DataObject protected () extends js.Object {
  var `MSForms.DataObject_typekey`: DataObject = js.native
  def Clear(): scala.Unit = js.native
  def GetFormat(Format: js.Any): scala.Boolean = js.native
  def GetFromClipboard(): scala.Unit = js.native
  def GetText(): java.lang.String = js.native
  def GetText(Format: js.Any): java.lang.String = js.native
  def PutInClipboard(): scala.Unit = js.native
  def SetText(Text: java.lang.String): scala.Unit = js.native
  def SetText(Text: java.lang.String, Format: js.Any): scala.Unit = js.native
  def StartDrag(): fmDropEffect = js.native
  def StartDrag(OKEffect: js.Any): fmDropEffect = js.native
}

