package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends StObject {
  
  @JSName("Access.Attachment_typekey")
  var AccessDotAttachment_typekey: Attachment = js.native
  
  var AddColon: Boolean = js.native
  
  var AfterUpdate: String = js.native
  
  var AfterUpdateMacro: String = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val AttachmentCount: Double = js.native
  
  var AutoLabel: Boolean = js.native
  
  def Back(): Unit = js.native
  
  var BackColor: Double = js.native
  
  var BackShade: Double = js.native
  
  var BackStyle: Double = js.native
  
  var BackThemeColorIndex: Double = js.native
  
  var BackTint: Double = js.native
  
  var BeforeUpdate: String = js.native
  
  var BeforeUpdateMacro: String = js.native
  
  var BorderColor: Double = js.native
  
  var BorderLineStyle: Double = js.native
  
  var BorderShade: Double = js.native
  
  var BorderStyle: Double = js.native
  
  var BorderThemeColorIndex: Double = js.native
  
  var BorderTint: Double = js.native
  
  var BorderWidth: Double = js.native
  
  var BottomPadding: Double = js.native
  
  var ColumnHidden: Boolean = js.native
  
  var ColumnOrder: Double = js.native
  
  var ColumnWidth: Double = js.native
  
  var ControlName: String = js.native
  
  var ControlSource: String = js.native
  
  var ControlTipText: String = js.native
  
  var ControlType: Double = js.native
  
  def Controls[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: Double): T = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  
  var CurrentAttachment: Double = js.native
  
  var DefaultPicture: String = js.native
  
  var DefaultPictureType: Double = js.native
  
  var DisplayAs: AcDisplayAs = js.native
  
  var DisplayWhen: Double = js.native
  
  var Enabled: Boolean = js.native
  
  var EventProcPrefix: String = js.native
  
  def FileData(): js.Any = js.native
  def FileData(var_0: js.Any): js.Any = js.native
  
  def FileName(): String = js.native
  def FileName(var_0: String): String = js.native
  def FileName(var_0: Double): String = js.native
  
  def FileType(): String = js.native
  def FileType(var_0: String): String = js.native
  def FileType(var_0: Double): String = js.native
  
  def FileURL(): String = js.native
  def FileURL(var_0: String): String = js.native
  def FileURL(var_0: Double): String = js.native
  
  def Forward(): Unit = js.native
  
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
  
  var LabelAlign: Double = js.native
  
  var LabelX: Double = js.native
  
  var LabelY: Double = js.native
  
  val Layout: AcLayoutType = js.native
  
  val LayoutID: Double = js.native
  
  var Left: Double = js.native
  
  var LeftPadding: Double = js.native
  
  var Locked: Boolean = js.native
  
  def Move(Left: Double): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Double): Unit = js.native
  
  var Name: String = js.native
  
  var OldBorderStyle: Double = js.native
  
  val OldValue: js.Any = js.native
  
  var OnAttachmentCurrent: String = js.native
  
  var OnAttachmentCurrentMacro: String = js.native
  
  var OnChange: String = js.native
  
  var OnChangeMacro: String = js.native
  
  var OnClick: String = js.native
  
  var OnClickMacro: String = js.native
  
  var OnDblClick: String = js.native
  
  var OnDblClickMacro: String = js.native
  
  var OnDirty: String = js.native
  
  var OnDirtyMacro: String = js.native
  
  var OnEnter: String = js.native
  
  var OnEnterMacro: String = js.native
  
  var OnExit: String = js.native
  
  var OnExitMacro: String = js.native
  
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
  
  val Parent: js.Any = js.native
  
  var PictureAlignment: Double = js.native
  
  def PictureDisp(): js.Any = js.native
  def PictureDisp(var_0: js.Any): js.Any = js.native
  
  var PictureSizeMode: Double = js.native
  
  var PictureTiling: Boolean = js.native
  
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  def Requery(): Unit = js.native
  
  var RightPadding: Double = js.native
  
  var Section: Double = js.native
  
  def SetFocus(): Unit = js.native
  
  var ShortcutMenuBar: String = js.native
  
  def SizeToFit(): Unit = js.native
  
  var SpecialEffect: Double = js.native
  
  var StatusBarText: String = js.native
  
  var TabIndex: Double = js.native
  
  var TabStop: Boolean = js.native
  
  var Tag: String = js.native
  
  var Top: Double = js.native
  
  var TopPadding: Double = js.native
  
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
