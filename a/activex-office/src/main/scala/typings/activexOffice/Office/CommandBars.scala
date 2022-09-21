package typings.activexOffice.Office

import typings.activexStdole.stdole.IPictureDisp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBars extends StObject {
  
  def apply(Index: String): CommandBar = js.native
  def apply(Index: Double): CommandBar = js.native
  
  val ActionControl: CommandBarControl = js.native
  
  val ActiveMenuBar: CommandBar = js.native
  
  var AdaptiveMenus: Boolean = js.native
  
  def Add(): CommandBar = js.native
  def Add(Name: String): CommandBar = js.native
  def Add(Name: String, Position: Unit, MenuBar: Boolean): CommandBar = js.native
  def Add(Name: String, Position: Unit, MenuBar: Boolean, Temporary: Boolean): CommandBar = js.native
  def Add(Name: String, Position: Unit, MenuBar: Unit, Temporary: Boolean): CommandBar = js.native
  def Add(Name: String, Position: MsoBarPosition): CommandBar = js.native
  def Add(Name: String, Position: MsoBarPosition, MenuBar: Boolean): CommandBar = js.native
  def Add(Name: String, Position: MsoBarPosition, MenuBar: Boolean, Temporary: Boolean): CommandBar = js.native
  def Add(Name: String, Position: MsoBarPosition, MenuBar: Unit, Temporary: Boolean): CommandBar = js.native
  def Add(Name: Unit, Position: Unit, MenuBar: Boolean): CommandBar = js.native
  def Add(Name: Unit, Position: Unit, MenuBar: Boolean, Temporary: Boolean): CommandBar = js.native
  def Add(Name: Unit, Position: Unit, MenuBar: Unit, Temporary: Boolean): CommandBar = js.native
  def Add(Name: Unit, Position: MsoBarPosition): CommandBar = js.native
  def Add(Name: Unit, Position: MsoBarPosition, MenuBar: Boolean): CommandBar = js.native
  def Add(Name: Unit, Position: MsoBarPosition, MenuBar: Boolean, Temporary: Boolean): CommandBar = js.native
  def Add(Name: Unit, Position: MsoBarPosition, MenuBar: Unit, Temporary: Boolean): CommandBar = js.native
  
  def AddEx(): CommandBar = js.native
  def AddEx(TbidOrName: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Any, MenuBar: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Any, MenuBar: Any, Temporary: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Any, MenuBar: Any, Temporary: Any, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Any, MenuBar: Any, Temporary: Unit, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Any, MenuBar: Unit, Temporary: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Any, MenuBar: Unit, Temporary: Any, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Any, MenuBar: Unit, Temporary: Unit, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Unit, MenuBar: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Unit, MenuBar: Any, Temporary: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Unit, MenuBar: Any, Temporary: Any, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Unit, MenuBar: Any, Temporary: Unit, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Unit, MenuBar: Unit, Temporary: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Unit, MenuBar: Unit, Temporary: Any, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Any, Position: Unit, MenuBar: Unit, Temporary: Unit, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Any, MenuBar: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Any, MenuBar: Any, Temporary: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Any, MenuBar: Any, Temporary: Any, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Any, MenuBar: Any, Temporary: Unit, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Any, MenuBar: Unit, Temporary: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Any, MenuBar: Unit, Temporary: Any, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Any, MenuBar: Unit, Temporary: Unit, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Unit, MenuBar: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Unit, MenuBar: Any, Temporary: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Unit, MenuBar: Any, Temporary: Any, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Unit, MenuBar: Any, Temporary: Unit, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Unit, MenuBar: Unit, Temporary: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Unit, MenuBar: Unit, Temporary: Any, TbtrProtection: Any): CommandBar = js.native
  def AddEx(TbidOrName: Unit, Position: Unit, MenuBar: Unit, Temporary: Unit, TbtrProtection: Any): CommandBar = js.native
  
  val Application: Any = js.native
  
  def CommitRenderingTransaction(hwnd: Double): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var DisableAskAQuestionDropdown: Boolean = js.native
  
  var DisableCustomize: Boolean = js.native
  
  var DisplayFonts: Boolean = js.native
  
  var DisplayKeysInTooltips: Boolean = js.native
  
  var DisplayTooltips: Boolean = js.native
  
  def ExecuteMso(idMso: String): Unit = js.native
  
  def FindControl(): CommandBarControl | Null = js.native
  def FindControl(Type: Unit, Id: Any): CommandBarControl | Null = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Any): CommandBarControl | Null = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Any, Visible: Boolean): CommandBarControl | Null = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Unit, Visible: Boolean): CommandBarControl | Null = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Any): CommandBarControl | Null = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Any, Visible: Boolean): CommandBarControl | Null = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Unit, Visible: Boolean): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: Any): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: Any, Tag: Any): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: Any, Tag: Any, Visible: Boolean): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: Any, Tag: Unit, Visible: Boolean): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: Unit, Tag: Any): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: Unit, Tag: Any, Visible: Boolean): CommandBarControl | Null = js.native
  def FindControl(Type: MsoControlType, Id: Unit, Tag: Unit, Visible: Boolean): CommandBarControl | Null = js.native
  
  def FindControls(): CommandBarControls | Null = js.native
  def FindControls(Type: Unit, Id: Any): CommandBarControls | Null = js.native
  def FindControls(Type: Unit, Id: Any, Tag: Any): CommandBarControls | Null = js.native
  def FindControls(Type: Unit, Id: Any, Tag: Any, Visible: Boolean): CommandBarControls | Null = js.native
  def FindControls(Type: Unit, Id: Any, Tag: Unit, Visible: Boolean): CommandBarControls | Null = js.native
  def FindControls(Type: Unit, Id: Unit, Tag: Any): CommandBarControls | Null = js.native
  def FindControls(Type: Unit, Id: Unit, Tag: Any, Visible: Boolean): CommandBarControls | Null = js.native
  def FindControls(Type: Unit, Id: Unit, Tag: Unit, Visible: Boolean): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: Any): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: Any, Tag: Any): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: Any, Tag: Any, Visible: Boolean): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: Any, Tag: Unit, Visible: Boolean): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: Unit, Tag: Any): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: Unit, Tag: Any, Visible: Boolean): CommandBarControls | Null = js.native
  def FindControls(Type: MsoControlType, Id: Unit, Tag: Unit, Visible: Boolean): CommandBarControls | Null = js.native
  
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
  
  var LargeButtons: Boolean = js.native
  
  var MenuAnimationStyle: MsoMenuAnimation = js.native
  
  val Parent: Any = js.native
  
  def ReleaseFocus(): Unit = js.native
  
  def TmcGetName(tmc: Double, pbstrName: String): Double = js.native
}
