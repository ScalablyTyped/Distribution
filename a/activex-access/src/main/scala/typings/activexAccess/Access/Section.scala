package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Section")
@js.native
class Section protected () extends js.Object {
  @JSName("Access.Section_typekey")
  var AccessDotSection_typekey: Section = js.native
  var AlternateBackColor: Double = js.native
  var AlternateBackShade: Double = js.native
  var AlternateBackThemeColorIndex: Double = js.native
  var AlternateBackTint: Double = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  var AutoHeight: Boolean = js.native
  var BackColor: Double = js.native
  var BackShade: Double = js.native
  var BackThemeColorIndex: Double = js.native
  var BackTint: Double = js.native
  var CanGrow: Boolean = js.native
  var CanShrink: Boolean = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  var DisplayWhen: Double = js.native
  var EventProcPrefix: String = js.native
  var ForceNewPage: Double = js.native
  var HasContinued: Boolean = js.native
  var Height: Double = js.native
  var InSelection: Boolean = js.native
  var KeepTogether: Boolean = js.native
  var Name: String = js.native
  var NewRowOrCol: Double = js.native
  var OnClick: String = js.native
  var OnClickMacro: String = js.native
  var OnDblClick: String = js.native
  var OnDblClickMacro: String = js.native
  var OnFormat: String = js.native
  var OnFormatMacro: String = js.native
  var OnMouseDown: String = js.native
  var OnMouseDownMacro: String = js.native
  var OnMouseMove: String = js.native
  var OnMouseMoveMacro: String = js.native
  var OnMouseUp: String = js.native
  var OnMouseUpMacro: String = js.native
  var OnPaint: String = js.native
  var OnPaintMacro: String = js.native
  var OnPrint: String = js.native
  var OnPrintMacro: String = js.native
  var OnRetreat: String = js.native
  var OnRetreatMacro: String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var RepeatSection: Boolean = js.native
  var SpecialEffect: Double = js.native
  var Tag: String = js.native
  var Visible: Boolean = js.native
  var WillContinue: Boolean = js.native
  var _Name: String = js.native
  def Controls[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: Double): T = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  def SetTabOrder(): Unit = js.native
}

