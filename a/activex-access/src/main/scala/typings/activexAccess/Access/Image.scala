package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
  /* private */ @JSName("Access.Image_typekey")
  var AccessDotImage_typekey: Image = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  var BackColor: Double = js.native
  
  var BackShade: Double = js.native
  
  var BackStyle: Double = js.native
  
  var BackThemeColorIndex: Double = js.native
  
  var BackTint: Double = js.native
  
  var BorderColor: Double = js.native
  
  var BorderLineStyle: Double = js.native
  
  var BorderShade: Double = js.native
  
  var BorderStyle: Double = js.native
  
  var BorderThemeColorIndex: Double = js.native
  
  var BorderTint: Double = js.native
  
  var BorderWidth: Double = js.native
  
  var BottomPadding: Double = js.native
  
  var ControlName: String = js.native
  
  var ControlTipText: String = js.native
  
  var ControlType: Double = js.native
  
  def Controls[T](Index: String): T = js.native
  // eslint-disable-next-line no-unnecessary-generics
  def Controls[T](Index: Double): T = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  
  var DisplayWhen: Double = js.native
  
  var EventProcPrefix: String = js.native
  
  def Goto(): Unit = js.native
  
  var GridlineColor: Double = js.native
  
  var GridlineShade: Double = js.native
  
  var GridlineStyleBottom: Double = js.native
  
  var GridlineStyleLeft: Double = js.native
  
  var GridlineStyleRight: Double = js.native
  
  var GridlineStyleTop: Double = js.native
  
  var GridlineThemeColorIndex: Double = js.native
  
  var GridlineTint: Double = js.native
  
  var GridlineWidthBottom: Double = js.native
  
  var GridlineWidthLeft: Double = js.native
  
  var GridlineWidthRight: Double = js.native
  
  var GridlineWidthTop: Double = js.native
  
  var Height: Double = js.native
  
  var HelpContextId: Double = js.native
  
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  
  val Hyperlink: typings.activexAccess.Access.Hyperlink = js.native
  
  var HyperlinkAddress: String = js.native
  
  var HyperlinkSubAddress: String = js.native
  
  var ImageHeight: Double = js.native
  
  var ImageWidth: Double = js.native
  
  var InSelection: Boolean = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var IsVisible: Boolean = js.native
  
  val Layout: AcLayoutType = js.native
  
  val LayoutID: Double = js.native
  
  var Left: Double = js.native
  
  var LeftPadding: Double = js.native
  
  def Move(Left: Double): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Unit, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Unit, Height: Double): Unit = js.native
  
  var Name: String = js.native
  
  var ObjectPalette: Any = js.native
  
  var OldBorderStyle: Double = js.native
  
  val OldValue: Any = js.native
  
  var OnClick: String = js.native
  
  var OnClickMacro: String = js.native
  
  var OnDblClick: String = js.native
  
  var OnDblClickMacro: String = js.native
  
  var OnMouseDown: String = js.native
  
  var OnMouseDownMacro: String = js.native
  
  var OnMouseMove: String = js.native
  
  var OnMouseMoveMacro: String = js.native
  
  var OnMouseUp: String = js.native
  
  var OnMouseUpMacro: String = js.native
  
  val Parent: Any = js.native
  
  var Picture: String = js.native
  
  var PictureAlignment: Double = js.native
  
  var PictureData: Any = js.native
  
  var PictureTiling: Boolean = js.native
  
  var PictureType: Double = js.native
  
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  def Requery(): Unit = js.native
  
  var RightPadding: Double = js.native
  
  var Section: Double = js.native
  
  def SetFocus(): Unit = js.native
  
  var ShortcutMenuBar: String = js.native
  
  var SizeMode: Double = js.native
  
  def SizeToFit(): Unit = js.native
  
  var SpecialEffect: Double = js.native
  
  var Tag: String = js.native
  
  var Target: String = js.native
  
  var Top: Double = js.native
  
  var TopPadding: Double = js.native
  
  var VerticalAnchor: AcVerticalAnchor = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  def _Evaluate(bstrExpr: String, ppsa: Any*): Any = js.native
  
  var _Name: String = js.native
}
