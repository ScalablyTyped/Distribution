package typings.activexDashOffice.OfficeNs

import typings.activexDashStdole.stdoleNs.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBars extends js.Object {
  val ActionControl: CommandBarControl = js.native
  val ActiveMenuBar: CommandBar = js.native
  var AdaptiveMenus: Boolean = js.native
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var DisableAskAQuestionDropdown: Boolean = js.native
  var DisableCustomize: Boolean = js.native
  var DisplayFonts: Boolean = js.native
  var DisplayKeysInTooltips: Boolean = js.native
  var DisplayTooltips: Boolean = js.native
  var LargeButtons: Boolean = js.native
  var MenuAnimationStyle: MsoMenuAnimation = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): CommandBar = js.native
  def apply(Index: Double): CommandBar = js.native
  def Add(): CommandBar = js.native
  def Add(Name: String): CommandBar = js.native
  def Add(Name: String, Position: MsoBarPosition): CommandBar = js.native
  def Add(Name: String, Position: MsoBarPosition, MenuBar: Boolean): CommandBar = js.native
  def Add(Name: String, Position: MsoBarPosition, MenuBar: Boolean, Temporary: Boolean): CommandBar = js.native
  def AddEx(): CommandBar = js.native
  def AddEx(TbidOrName: js.Any): CommandBar = js.native
  def AddEx(TbidOrName: js.Any, Position: js.Any): CommandBar = js.native
  def AddEx(TbidOrName: js.Any, Position: js.Any, MenuBar: js.Any): CommandBar = js.native
  def AddEx(TbidOrName: js.Any, Position: js.Any, MenuBar: js.Any, Temporary: js.Any): CommandBar = js.native
  def AddEx(TbidOrName: js.Any, Position: js.Any, MenuBar: js.Any, Temporary: js.Any, TbtrProtection: js.Any): CommandBar = js.native
  def CommitRenderingTransaction(hwnd: Double): Unit = js.native
  def ExecuteMso(idMso: String): Unit = js.native
  def FindControl(): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: js.Any): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: js.Any, Tag: js.Any): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: js.Any, Tag: js.Any, Visible: Boolean): CommandBarControl | Null = js.native
  def FindControls(): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: js.Any): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: js.Any, Tag: js.Any): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: js.Any, Tag: js.Any, Visible: Boolean): CommandBarControls | Null = js.native
  def GetEnabledMso(idMso: String): Boolean = js.native
  def GetImageMso(idMso: String, Width: Double, Height: Double): IPictureDisp = js.native
  def GetLabelMso(idMso: String): String = js.native
  def GetPressedMso(idMso: String): Boolean = js.native
  def GetScreentipMso(idMso: String): String = js.native
  def GetSupertipMso(idMso: String): String = js.native
  def GetVisibleMso(idMso: String): Boolean = js.native
  def IdsString(ids: Double, pbstrName: String): Double = js.native
  def Item(Index: String): CommandBar = js.native
  def Item(Index: Double): CommandBar = js.native
  def ReleaseFocus(): Unit = js.native
  def TmcGetName(tmc: Double, pbstrName: String): Double = js.native
}

