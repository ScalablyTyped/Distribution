package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Image")
@js.native
class Image protected () extends js.Object {
  var `Access.Image_typekey`: Image = js.native
  val Application: Application = js.native
  var BackColor: scala.Double = js.native
  var BackShade: scala.Double = js.native
  var BackStyle: scala.Double = js.native
  var BackThemeColorIndex: scala.Double = js.native
  var BackTint: scala.Double = js.native
  var BorderColor: scala.Double = js.native
  var BorderLineStyle: scala.Double = js.native
  var BorderShade: scala.Double = js.native
  var BorderStyle: scala.Double = js.native
  var BorderThemeColorIndex: scala.Double = js.native
  var BorderTint: scala.Double = js.native
  var BorderWidth: scala.Double = js.native
  var BottomPadding: scala.Double = js.native
  var ControlName: java.lang.String = js.native
  var ControlTipText: java.lang.String = js.native
  var ControlType: scala.Double = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  var DisplayWhen: scala.Double = js.native
  var EventProcPrefix: java.lang.String = js.native
  var GridlineColor: scala.Double = js.native
  var GridlineShade: scala.Double = js.native
  var GridlineStyleBottom: scala.Double = js.native
  var GridlineStyleLeft: scala.Double = js.native
  var GridlineStyleRight: scala.Double = js.native
  var GridlineStyleTop: scala.Double = js.native
  var GridlineThemeColorIndex: scala.Double = js.native
  var GridlineTint: scala.Double = js.native
  var GridlineWidthBottom: scala.Double = js.native
  var GridlineWidthLeft: scala.Double = js.native
  var GridlineWidthRight: scala.Double = js.native
  var GridlineWidthTop: scala.Double = js.native
  var Height: scala.Double = js.native
  var HelpContextId: scala.Double = js.native
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  val Hyperlink: Hyperlink = js.native
  var HyperlinkAddress: java.lang.String = js.native
  var HyperlinkSubAddress: java.lang.String = js.native
  var ImageHeight: scala.Double = js.native
  var ImageWidth: scala.Double = js.native
  var InSelection: scala.Boolean = js.native
  var IsVisible: scala.Boolean = js.native
  val Layout: AcLayoutType = js.native
  val LayoutID: scala.Double = js.native
  var Left: scala.Double = js.native
  var LeftPadding: scala.Double = js.native
  var Name: java.lang.String = js.native
  var ObjectPalette: js.Any = js.native
  var OldBorderStyle: scala.Double = js.native
  val OldValue: js.Any = js.native
  var OnClick: java.lang.String = js.native
  var OnClickMacro: java.lang.String = js.native
  var OnDblClick: java.lang.String = js.native
  var OnDblClickMacro: java.lang.String = js.native
  var OnMouseDown: java.lang.String = js.native
  var OnMouseDownMacro: java.lang.String = js.native
  var OnMouseMove: java.lang.String = js.native
  var OnMouseMoveMacro: java.lang.String = js.native
  var OnMouseUp: java.lang.String = js.native
  var OnMouseUpMacro: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Picture: java.lang.String = js.native
  var PictureAlignment: scala.Double = js.native
  var PictureData: js.Any = js.native
  var PictureTiling: scala.Boolean = js.native
  var PictureType: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var RightPadding: scala.Double = js.native
  var Section: scala.Double = js.native
  var ShortcutMenuBar: java.lang.String = js.native
  var SizeMode: scala.Double = js.native
  var SpecialEffect: scala.Double = js.native
  var Tag: java.lang.String = js.native
  var Target: java.lang.String = js.native
  var Top: scala.Double = js.native
  var TopPadding: scala.Double = js.native
  var VerticalAnchor: AcVerticalAnchor = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  var _Name: java.lang.String = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: java.lang.String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: scala.Double): T = js.native
  def Goto(): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Move(Left: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double, Width: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit = js.native
  def Properties(Index: java.lang.String): AccessProperty = js.native
  def Properties(Index: scala.Double): AccessProperty = js.native
  def Requery(): scala.Unit = js.native
  def SetFocus(): scala.Unit = js.native
  def SizeToFit(): scala.Unit = js.native
  def _Evaluate(bstrExpr: java.lang.String, ppsa: js.Any*): js.Any = js.native
}

