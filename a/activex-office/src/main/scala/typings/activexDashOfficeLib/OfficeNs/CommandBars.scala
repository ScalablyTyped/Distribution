package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBars extends js.Object {
  val ActionControl: CommandBarControl = js.native
  val ActiveMenuBar: CommandBar = js.native
  var AdaptiveMenus: scala.Boolean = js.native
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var DisableAskAQuestionDropdown: scala.Boolean = js.native
  var DisableCustomize: scala.Boolean = js.native
  var DisplayFonts: scala.Boolean = js.native
  var DisplayKeysInTooltips: scala.Boolean = js.native
  var DisplayTooltips: scala.Boolean = js.native
  var LargeButtons: scala.Boolean = js.native
  var MenuAnimationStyle: MsoMenuAnimation = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): CommandBar = js.native
  def apply(Index: scala.Double): CommandBar = js.native
  def Add(): CommandBar = js.native
  def Add(Name: java.lang.String): CommandBar = js.native
  def Add(Name: java.lang.String, Position: MsoBarPosition): CommandBar = js.native
  def Add(Name: java.lang.String, Position: MsoBarPosition, MenuBar: scala.Boolean): CommandBar = js.native
  def Add(Name: java.lang.String, Position: MsoBarPosition, MenuBar: scala.Boolean, Temporary: scala.Boolean): CommandBar = js.native
  def AddEx(): CommandBar = js.native
  def AddEx(TbidOrName: js.Any): CommandBar = js.native
  def AddEx(TbidOrName: js.Any, Position: js.Any): CommandBar = js.native
  def AddEx(TbidOrName: js.Any, Position: js.Any, MenuBar: js.Any): CommandBar = js.native
  def AddEx(TbidOrName: js.Any, Position: js.Any, MenuBar: js.Any, Temporary: js.Any): CommandBar = js.native
  def AddEx(TbidOrName: js.Any, Position: js.Any, MenuBar: js.Any, Temporary: js.Any, TbtrProtection: js.Any): CommandBar = js.native
  def CommitRenderingTransaction(hwnd: scala.Double): scala.Unit = js.native
  def ExecuteMso(idMso: java.lang.String): scala.Unit = js.native
  def FindControl(): CommandBarControl | scala.Null = js.native
  def FindControl(Type: MsoControlType): CommandBarControl | scala.Null = js.native
  def FindControl(Type: MsoControlType, Id: js.Any): CommandBarControl | scala.Null = js.native
  def FindControl(Type: MsoControlType, Id: js.Any, Tag: js.Any): CommandBarControl | scala.Null = js.native
  def FindControl(Type: MsoControlType, Id: js.Any, Tag: js.Any, Visible: scala.Boolean): CommandBarControl | scala.Null = js.native
  def FindControls(): CommandBarControls | scala.Null = js.native
  def FindControls(Type: MsoControlType): CommandBarControls | scala.Null = js.native
  def FindControls(Type: MsoControlType, Id: js.Any): CommandBarControls | scala.Null = js.native
  def FindControls(Type: MsoControlType, Id: js.Any, Tag: js.Any): CommandBarControls | scala.Null = js.native
  def FindControls(Type: MsoControlType, Id: js.Any, Tag: js.Any, Visible: scala.Boolean): CommandBarControls | scala.Null = js.native
  def GetEnabledMso(idMso: java.lang.String): scala.Boolean = js.native
  def GetImageMso(idMso: java.lang.String, Width: scala.Double, Height: scala.Double): activexDashStdoleLib.stdoleNs.IPictureDisp = js.native
  def GetLabelMso(idMso: java.lang.String): java.lang.String = js.native
  def GetPressedMso(idMso: java.lang.String): scala.Boolean = js.native
  def GetScreentipMso(idMso: java.lang.String): java.lang.String = js.native
  def GetSupertipMso(idMso: java.lang.String): java.lang.String = js.native
  def GetVisibleMso(idMso: java.lang.String): scala.Boolean = js.native
  def IdsString(ids: scala.Double, pbstrName: java.lang.String): scala.Double = js.native
  def Item(Index: java.lang.String): CommandBar = js.native
  def Item(Index: scala.Double): CommandBar = js.native
  def ReleaseFocus(): scala.Unit = js.native
  def TmcGetName(tmc: scala.Double, pbstrName: java.lang.String): scala.Double = js.native
}

