package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBarControl extends StObject {
  
  val Application: Any = js.native
  
  var BeginGroup: Boolean = js.native
  
  val BuiltIn: Boolean = js.native
  
  var Caption: String = js.native
  
  val Control: Any = js.native
  
  def Copy(): CommandBarControl = js.native
  def Copy(Bar: Unit, Before: Double): CommandBarControl = js.native
  def Copy(Bar: CommandBar): CommandBarControl = js.native
  def Copy(Bar: CommandBar, Before: Double): CommandBarControl = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  def Delete(Temporary: Boolean): Unit = js.native
  
  var DescriptionText: String = js.native
  
  var Enabled: Boolean = js.native
  
  def Execute(): Unit = js.native
  
  var Height: Double = js.native
  
  var HelpContextId: Double = js.native
  
  var HelpFile: String = js.native
  
  val Id: Double = js.native
  
  val Index: Double = js.native
  
  val InstanceId: Double = js.native
  
  val IsPriorityDropped: Boolean = js.native
  
  val Left: Double = js.native
  
  def Move(): CommandBarControl = js.native
  def Move(Bar: Unit, Before: Double): CommandBarControl = js.native
  def Move(Bar: CommandBar): CommandBarControl = js.native
  def Move(Bar: CommandBar, Before: Double): CommandBarControl = js.native
  
  var OLEUsage: MsoControlOLEUsage = js.native
  
  /* private */ @JSName("Office.CommandBarControl_typekey")
  var OfficeDotCommandBarControl_typekey: CommandBarControl = js.native
  
  var OnAction: String = js.native
  
  var Parameter: String = js.native
  
  val Parent: CommandBar = js.native
  
  var Priority: Double = js.native
  
  def Reserved1(): Unit = js.native
  
  def Reserved2(): Unit = js.native
  
  def Reserved3(): Unit = js.native
  
  def Reserved4(): Unit = js.native
  
  def Reserved5(): Unit = js.native
  
  def Reserved6(): Unit = js.native
  
  def Reserved7(): Unit = js.native
  
  def Reset(): Unit = js.native
  
  def SetFocus(): Unit = js.native
  
  var Tag: String = js.native
  
  var TooltipText: String = js.native
  
  val Top: Double = js.native
  
  val Type: MsoControlType = js.native
  
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
