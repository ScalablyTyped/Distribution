package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Page")
@js.native
class Page protected () extends js.Object {
  var `Access.Page_typekey`: Page = js.native
  val Application: Application = js.native
  var Caption: java.lang.String = js.native
  var ControlName: java.lang.String = js.native
  var ControlTipText: java.lang.String = js.native
  var ControlType: scala.Double = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  var Enabled: scala.Boolean = js.native
  var EventProcPrefix: java.lang.String = js.native
  var Height: scala.Double = js.native
  var HelpContextId: scala.Double = js.native
  var InSelection: scala.Boolean = js.native
  var IsVisible: scala.Boolean = js.native
  var Left: scala.Double = js.native
  var Name: java.lang.String = js.native
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
  var PageIndex: scala.Double = js.native
  val Parent: js.Any = js.native
  var Picture: java.lang.String = js.native
  var PictureData: js.Any = js.native
  var PictureType: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Section: scala.Double = js.native
  var ShortcutMenuBar: java.lang.String = js.native
  var StatusBarText: java.lang.String = js.native
  var Tag: java.lang.String = js.native
  var Top: scala.Double = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  var _Name: java.lang.String = js.native
  val accChildCount: scala.Double = js.native
  val accFocus: js.Any = js.native
  val accParent: js.Any = js.native
  val accSelection: js.Any = js.native
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
  def SetTabOrder(): scala.Unit = js.native
  def SizeToFit(): scala.Unit = js.native
  def _Evaluate(bstrExpr: java.lang.String, ppsa: js.Any*): js.Any = js.native
  def accChild(varChild: js.Any): js.Any = js.native
  def accDefaultAction(): java.lang.String = js.native
  def accDefaultAction(varChild: js.Any): java.lang.String = js.native
  def accDescription(): java.lang.String = js.native
  def accDescription(varChild: js.Any): java.lang.String = js.native
  def accDoDefaultAction(): scala.Unit = js.native
  def accDoDefaultAction(varChild: js.Any): scala.Unit = js.native
  def accHelp(): java.lang.String = js.native
  def accHelp(varChild: js.Any): java.lang.String = js.native
  def accHelpTopic(pszHelpFile: java.lang.String): scala.Double = js.native
  def accHelpTopic(pszHelpFile: java.lang.String, varChild: js.Any): scala.Double = js.native
  def accHitTest(xLeft: scala.Double, yTop: scala.Double): js.Any = js.native
  def accKeyboardShortcut(): java.lang.String = js.native
  def accKeyboardShortcut(varChild: js.Any): java.lang.String = js.native
  def accLocation(pxLeft: scala.Double, pyTop: scala.Double, pcxWidth: scala.Double, pcyHeight: scala.Double): scala.Unit = js.native
  def accLocation(
    pxLeft: scala.Double,
    pyTop: scala.Double,
    pcxWidth: scala.Double,
    pcyHeight: scala.Double,
    varChild: js.Any
  ): scala.Unit = js.native
  def accName(): java.lang.String = js.native
  def accName(varChild: js.Any): java.lang.String = js.native
  def accNavigate(navDir: scala.Double): js.Any = js.native
  def accNavigate(navDir: scala.Double, varStart: js.Any): js.Any = js.native
  def accRole(): js.Any = js.native
  def accRole(varChild: js.Any): js.Any = js.native
  def accSelect(flagsSelect: scala.Double): scala.Unit = js.native
  def accSelect(flagsSelect: scala.Double, varChild: js.Any): scala.Unit = js.native
  def accState(): js.Any = js.native
  def accState(varChild: js.Any): js.Any = js.native
  def accValue(): java.lang.String = js.native
  def accValue(varChild: js.Any): java.lang.String = js.native
}

