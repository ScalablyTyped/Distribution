package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends StObject {
  
  @JSName("Access.Label_typekey")
  var AccessDotLabel_typekey: Label = js.native
  
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
  
  var BottomMargin: Double = js.native
  
  var BottomPadding: Double = js.native
  
  var Caption: String = js.native
  
  var ControlName: String = js.native
  
  var ControlTipText: String = js.native
  
  var ControlType: Double = js.native
  
  var DisplayWhen: Double = js.native
  
  var EventProcPrefix: String = js.native
  
  var FontBold: Double = js.native
  
  var FontItalic: Boolean = js.native
  
  var FontName: String = js.native
  
  var FontSize: Double = js.native
  
  var FontUnderline: Boolean = js.native
  
  var FontWeight: Double = js.native
  
  var ForeColor: Double = js.native
  
  var ForeShade: Double = js.native
  
  var ForeThemeColorIndex: Double = js.native
  
  var ForeTint: Double = js.native
  
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
  
  var InSelection: Boolean = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var IsVisible: Boolean = js.native
  
  val Layout: AcLayoutType = js.native
  
  val LayoutID: Double = js.native
  
  var Left: Double = js.native
  
  var LeftMargin: Double = js.native
  
  var LeftPadding: Double = js.native
  
  var LineSpacing: Double = js.native
  
  def Move(Left: Double): Unit = js.native
  def Move(Left: Double, Top: js.UndefOr[scala.Nothing], Width: js.UndefOr[scala.Nothing], Height: Double): Unit = js.native
  def Move(Left: Double, Top: js.UndefOr[scala.Nothing], Width: Double): Unit = js.native
  def Move(Left: Double, Top: js.UndefOr[scala.Nothing], Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: js.UndefOr[scala.Nothing], Height: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  
  var Name: String = js.native
  
  var NumeralShapes: Double = js.native
  
  var OldBorderStyle: Double = js.native
  
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
  
  val Parent: js.Any = js.native
  
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var ReadingOrder: Double = js.native
  
  var RightMargin: Double = js.native
  
  var RightPadding: Double = js.native
  
  var Section: Double = js.native
  
  var ShortcutMenuBar: String = js.native
  
  def SizeToFit(): Unit = js.native
  
  def SmartTags(Index: String): SmartTag = js.native
  def SmartTags(Index: Double): SmartTag = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  
  var SpecialEffect: Double = js.native
  
  var Tag: String = js.native
  
  var Target: String = js.native
  
  var TextAlign: Double = js.native
  
  var TextFontCharSet: Double = js.native
  
  var ThemeFontIndex: Double = js.native
  
  var Top: Double = js.native
  
  var TopMargin: Double = js.native
  
  var TopPadding: Double = js.native
  
  var Vertical: Boolean = js.native
  
  var VerticalAnchor: AcVerticalAnchor = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  def _Evaluate(bstrExpr: String, ppsa: js.Any*): js.Any = js.native
  
  var _Name: String = js.native
  
  def accChild(varChild: js.Any): js.Any = js.native
  
  val accChildCount: Double = js.native
  
  def accDefaultAction(): String = js.native
  def accDefaultAction(varChild: js.Any): String = js.native
  
  def accDescription(): String = js.native
  def accDescription(varChild: js.Any): String = js.native
  
  def accDoDefaultAction(): Unit = js.native
  def accDoDefaultAction(varChild: js.Any): Unit = js.native
  
  val accFocus: js.Any = js.native
  
  def accHelp(): String = js.native
  def accHelp(varChild: js.Any): String = js.native
  
  def accHelpTopic(pszHelpFile: String): Double = js.native
  def accHelpTopic(pszHelpFile: String, varChild: js.Any): Double = js.native
  
  def accHitTest(xLeft: Double, yTop: Double): js.Any = js.native
  
  def accKeyboardShortcut(): String = js.native
  def accKeyboardShortcut(varChild: js.Any): String = js.native
  
  def accLocation(pxLeft: Double, pyTop: Double, pcxWidth: Double, pcyHeight: Double): Unit = js.native
  def accLocation(pxLeft: Double, pyTop: Double, pcxWidth: Double, pcyHeight: Double, varChild: js.Any): Unit = js.native
  
  def accName(): String = js.native
  def accName(varChild: js.Any): String = js.native
  
  def accNavigate(navDir: Double): js.Any = js.native
  def accNavigate(navDir: Double, varStart: js.Any): js.Any = js.native
  
  val accParent: js.Any = js.native
  
  def accRole(): js.Any = js.native
  def accRole(varChild: js.Any): js.Any = js.native
  
  def accSelect(flagsSelect: Double): Unit = js.native
  def accSelect(flagsSelect: Double, varChild: js.Any): Unit = js.native
  
  val accSelection: js.Any = js.native
  
  def accState(): js.Any = js.native
  def accState(varChild: js.Any): js.Any = js.native
  
  def accValue(): String = js.native
  def accValue(varChild: js.Any): String = js.native
}
