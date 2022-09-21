package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  val Actions: RuleActions = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Conditions: RuleConditions = js.native
  
  var Enabled: Boolean = js.native
  
  val Exceptions: RuleConditions = js.native
  
  def Execute(): Unit = js.native
  def Execute(ShowProgress: Any): Unit = js.native
  def Execute(ShowProgress: Any, Folder: Any): Unit = js.native
  def Execute(ShowProgress: Any, Folder: Any, IncludeSubfolders: Any): Unit = js.native
  def Execute(ShowProgress: Any, Folder: Any, IncludeSubfolders: Any, RuleExecuteOption: Any): Unit = js.native
  def Execute(ShowProgress: Any, Folder: Any, IncludeSubfolders: Unit, RuleExecuteOption: Any): Unit = js.native
  def Execute(ShowProgress: Any, Folder: Unit, IncludeSubfolders: Any): Unit = js.native
  def Execute(ShowProgress: Any, Folder: Unit, IncludeSubfolders: Any, RuleExecuteOption: Any): Unit = js.native
  def Execute(ShowProgress: Any, Folder: Unit, IncludeSubfolders: Unit, RuleExecuteOption: Any): Unit = js.native
  def Execute(ShowProgress: Unit, Folder: Any): Unit = js.native
  def Execute(ShowProgress: Unit, Folder: Any, IncludeSubfolders: Any): Unit = js.native
  def Execute(ShowProgress: Unit, Folder: Any, IncludeSubfolders: Any, RuleExecuteOption: Any): Unit = js.native
  def Execute(ShowProgress: Unit, Folder: Any, IncludeSubfolders: Unit, RuleExecuteOption: Any): Unit = js.native
  def Execute(ShowProgress: Unit, Folder: Unit, IncludeSubfolders: Any): Unit = js.native
  def Execute(ShowProgress: Unit, Folder: Unit, IncludeSubfolders: Any, RuleExecuteOption: Any): Unit = js.native
  def Execute(ShowProgress: Unit, Folder: Unit, IncludeSubfolders: Unit, RuleExecuteOption: Any): Unit = js.native
  
  var ExecutionOrder: Double = js.native
  
  val IsLocalRule: Boolean = js.native
  
  var Name: String = js.native
  
  /* private */ @JSName("Outlook.Rule_typekey")
  var OutlookDotRule_typekey: Rule = js.native
  
  val Parent: Any = js.native
  
  val RuleType: OlRuleType = js.native
  
  val Session: NameSpace = js.native
}
