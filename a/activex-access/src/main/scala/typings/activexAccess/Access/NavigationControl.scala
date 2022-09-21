package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationControl extends StObject {
  
  /* private */ @JSName("Access.NavigationControl_typekey")
  var AccessDotNavigationControl_typekey: NavigationControl = js.native
  
  var AllowedText: Double = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  var AutoTab: Boolean = js.native
  
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
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: Double): T = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  
  var DisplayWhen: Double = js.native
  
  var Enabled: Boolean = js.native
  
  var EventProcPrefix: String = js.native
  
  var FilterLookup: Double = js.native
  
  def FormatConditions(Index: Double): FormatCondition = js.native
  @JSName("FormatConditions")
  val FormatConditions_Original: FormatConditions = js.native
  
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
  
  var InSelection: Boolean = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var IsVisible: Boolean = js.native
  
  var KeyboardLanguage: Double = js.native
  
  val Layout: AcLayoutType = js.native
  
  val LayoutID: Double = js.native
  
  var Left: Double = js.native
  
  var LeftPadding: Double = js.native
  
  var LineSpacing: Double = js.native
  
  def Move(Left: Double): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Unit, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Unit, Height: Double): Unit = js.native
  
  var Name: String = js.native
  
  var NumeralShapes: Double = js.native
  
  var OldBorderStyle: Double = js.native
  
  val OldValue: Any = js.native
  
  var OnClick: String = js.native
  
  var OnClickMacro: String = js.native
  
  var OnDblClick: String = js.native
  
  var OnDblClickMacro: String = js.native
  
  var OnGotFocus: String = js.native
  
  var OnGotFocusMacro: String = js.native
  
  var OnKeyDown: String = js.native
  
  var OnKeyDownMacro: String = js.native
  
  var OnKeyPress: String = js.native
  
  var OnKeyPressMacro: String = js.native
  
  var OnKeyUp: String = js.native
  
  var OnKeyUpMacro: String = js.native
  
  var OnLostFocus: String = js.native
  
  var OnLostFocusMacro: String = js.native
  
  var OnMouseDown: String = js.native
  
  var OnMouseDownMacro: String = js.native
  
  var OnMouseMove: String = js.native
  
  var OnMouseMoveMacro: String = js.native
  
  var OnMouseUp: String = js.native
  
  var OnMouseUpMacro: String = js.native
  
  val Parent: Any = js.native
  
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var ReadingOrder: Double = js.native
  
  def Requery(): Unit = js.native
  
  var RightPadding: Double = js.native
  
  var ScrollBarAlign: Double = js.native
  
  var Section: Double = js.native
  
  val SelectedTab: NavigationButton = js.native
  
  def SetFocus(): Unit = js.native
  
  var ShortcutMenuBar: String = js.native
  
  def SizeToFit(): Unit = js.native
  
  def SmartTags(Index: String): SmartTag = js.native
  def SmartTags(Index: Double): SmartTag = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  
  var Span: AcNavigationSpan = js.native
  
  var SpecialEffect: Double = js.native
  
  var StatusBarText: String = js.native
  
  var SubForm: String = js.native
  
  var TabIndex: Double = js.native
  
  var TabStop: Boolean = js.native
  
  def Tabs[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Tabs[T](Index: Double): T = js.native
  @JSName("Tabs")
  val Tabs_Original: Children = js.native
  
  var Tag: String = js.native
  
  var Target: String = js.native
  
  var Top: Double = js.native
  
  var TopPadding: Double = js.native
  
  def Undo(): Unit = js.native
  
  var Value: Any = js.native
  
  var VerticalAnchor: AcVerticalAnchor = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  def _Evaluate(bstrExpr: String, ppsa: Any*): Any = js.native
  
  var _Name: String = js.native
  
  def accChild(varChild: Any): Any = js.native
  
  val accChildCount: Double = js.native
  
  def accDefaultAction(): String = js.native
  def accDefaultAction(varChild: Any): String = js.native
  
  def accDescription(): String = js.native
  def accDescription(varChild: Any): String = js.native
  
  def accDoDefaultAction(): Unit = js.native
  def accDoDefaultAction(varChild: Any): Unit = js.native
  
  val accFocus: Any = js.native
  
  def accHelp(): String = js.native
  def accHelp(varChild: Any): String = js.native
  
  def accHelpTopic(pszHelpFile: String): Double = js.native
  def accHelpTopic(pszHelpFile: String, varChild: Any): Double = js.native
  
  def accHitTest(xLeft: Double, yTop: Double): Any = js.native
  
  def accKeyboardShortcut(): String = js.native
  def accKeyboardShortcut(varChild: Any): String = js.native
  
  def accLocation(pxLeft: Double, pyTop: Double, pcxWidth: Double, pcyHeight: Double): Unit = js.native
  def accLocation(pxLeft: Double, pyTop: Double, pcxWidth: Double, pcyHeight: Double, varChild: Any): Unit = js.native
  
  def accName(): String = js.native
  def accName(varChild: Any): String = js.native
  
  def accNavigate(navDir: Double): Any = js.native
  def accNavigate(navDir: Double, varStart: Any): Any = js.native
  
  val accParent: Any = js.native
  
  def accRole(): Any = js.native
  def accRole(varChild: Any): Any = js.native
  
  def accSelect(flagsSelect: Double): Unit = js.native
  def accSelect(flagsSelect: Double, varChild: Any): Unit = js.native
  
  val accSelection: Any = js.native
  
  def accState(): Any = js.native
  def accState(varChild: Any): Any = js.native
  
  def accValue(): String = js.native
  def accValue(varChild: Any): String = js.native
}
