package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSForms.TabStrip")
@js.native
class TabStrip protected () extends js.Object {
  var BackColor: Double = js.native
  val ClientHeight: Double = js.native
  val ClientLeft: Double = js.native
  val ClientTop: Double = js.native
  val ClientWidth: Double = js.native
  var Enabled: Boolean = js.native
  var Font: NewFont = js.native
  var FontBold: Boolean = js.native
  var FontItalic: Boolean = js.native
  var FontName: String = js.native
  var FontSize: Double = js.native
  var FontStrikethru: Boolean = js.native
  var FontUnderline: Boolean = js.native
  var FontWeight: Double = js.native
  var ForeColor: Double = js.native
  @JSName("MSForms.TabStrip_typekey")
  var MSFormsDotTabStrip_typekey: TabStrip = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var MultiRow: Boolean = js.native
  val SelectedItem: Tab = js.native
  var Style: fmTabStyle = js.native
  var TabFixedHeight: Double = js.native
  var TabFixedWidth: Double = js.native
  var TabOrientation: fmTabOrientation = js.native
  @JSName("Tabs")
  val Tabs_Original: Tabs = js.native
  var Value: Double = js.native
  val _Font_Reserved: NewFont = js.native
  def Tabs(varg: js.Any): js.Any = js.native
  def _GetClientHeight(ClientHeight: Double): Unit = js.native
  def _GetClientLeft(ClientLeft: Double): Unit = js.native
  def _GetClientTop(ClientTop: Double): Unit = js.native
  def _GetClientWidth(ClientWidth: Double): Unit = js.native
  def _GetTabFixedHeight(TabFixedHeight: Double): Unit = js.native
  def _GetTabFixedWidth(TabFixedWidth: Double): Unit = js.native
  def _SetTabFixedHeight(TabFixedHeight: Double): Unit = js.native
  def _SetTabFixedWidth(TabFixedWidth: Double): Unit = js.native
}

