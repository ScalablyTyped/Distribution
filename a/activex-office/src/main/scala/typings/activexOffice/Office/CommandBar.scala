package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBar extends StObject {
  
  var AdaptiveMenu: Boolean = js.native
  
  val Application: Any = js.native
  
  val BuiltIn: Boolean = js.native
  
  var Context: String = js.native
  
  def Controls(Index: String): CommandBarControl = js.native
  def Controls(Index: Double): CommandBarControl = js.native
  @JSName("Controls")
  val Controls_Original: CommandBarControls = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Enabled: Boolean = js.native
  
  def FindControl(): CommandBarControl = js.native
  def FindControl(Type: Any): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Any): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Any, Tag: Any): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Any, Tag: Any, Visible: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Any, Tag: Any, Visible: Boolean, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Any, Tag: Any, Visible: Unit, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Any, Tag: Unit, Visible: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Any, Tag: Unit, Visible: Boolean, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Any, Tag: Unit, Visible: Unit, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Unit, Tag: Any): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Unit, Tag: Any, Visible: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Unit, Tag: Any, Visible: Boolean, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Unit, Tag: Any, Visible: Unit, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Unit, Tag: Unit, Visible: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Unit, Tag: Unit, Visible: Boolean, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Any, Id: Unit, Tag: Unit, Visible: Unit, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Any): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Any): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Any, Visible: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Any, Visible: Boolean, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Any, Visible: Unit, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Unit, Visible: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Unit, Visible: Boolean, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Any, Tag: Unit, Visible: Unit, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Any): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Any, Visible: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Any, Visible: Boolean, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Any, Visible: Unit, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Unit, Visible: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Unit, Visible: Boolean, Recursive: Boolean): CommandBarControl = js.native
  def FindControl(Type: Unit, Id: Unit, Tag: Unit, Visible: Unit, Recursive: Boolean): CommandBarControl = js.native
  
  var Height: Double = js.native
  
  val Id: Double = js.native
  
  val Index: Double = js.native
  
  val InstanceId: Double = js.native
  
  val InstanceIdPtr: Any = js.native
  
  var Left: Double = js.native
  
  var Name: String = js.native
  
  var NameLocal: String = js.native
  
  /* private */ @JSName("Office.CommandBar_typekey")
  var OfficeDotCommandBar_typekey: CommandBar = js.native
  
  val Parent: Any = js.native
  
  var Position: MsoBarPosition = js.native
  
  var Protection: MsoBarProtection = js.native
  
  def Reset(): Unit = js.native
  
  var RowIndex: Double = js.native
  
  def ShowPopup(): Unit = js.native
  def ShowPopup(x: Double): Unit = js.native
  def ShowPopup(x: Double, y: Double): Unit = js.native
  def ShowPopup(x: Unit, y: Double): Unit = js.native
  
  var Top: Double = js.native
  
  val Type: MsoBarType = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
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
