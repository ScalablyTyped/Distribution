package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def Execute(
    ShowProgress: js.UndefOr[scala.Nothing],
    Folder: js.UndefOr[scala.Nothing],
    IncludeSubfolders: js.UndefOr[scala.Nothing],
    RuleExecuteOption: js.Any
  ): Unit = js.native
  def Execute(
    ShowProgress: js.UndefOr[scala.Nothing],
    Folder: js.UndefOr[scala.Nothing],
    IncludeSubfolders: js.Any
  ): Unit = js.native
  def Execute(
    ShowProgress: js.UndefOr[scala.Nothing],
    Folder: js.UndefOr[scala.Nothing],
    IncludeSubfolders: js.Any,
    RuleExecuteOption: js.Any
  ): Unit = js.native
  def Execute(ShowProgress: js.UndefOr[scala.Nothing], Folder: js.Any): Unit = js.native
  def Execute(
    ShowProgress: js.UndefOr[scala.Nothing],
    Folder: js.Any,
    IncludeSubfolders: js.UndefOr[scala.Nothing],
    RuleExecuteOption: js.Any
  ): Unit = js.native
  def Execute(ShowProgress: js.UndefOr[scala.Nothing], Folder: js.Any, IncludeSubfolders: js.Any): Unit = js.native
  def Execute(
    ShowProgress: js.UndefOr[scala.Nothing],
    Folder: js.Any,
    IncludeSubfolders: js.Any,
    RuleExecuteOption: js.Any
  ): Unit = js.native
  def Execute(ShowProgress: js.Any): Unit = js.native
  def Execute(
    ShowProgress: js.Any,
    Folder: js.UndefOr[scala.Nothing],
    IncludeSubfolders: js.UndefOr[scala.Nothing],
    RuleExecuteOption: js.Any
  ): Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.UndefOr[scala.Nothing], IncludeSubfolders: js.Any): Unit = js.native
  def Execute(
    ShowProgress: js.Any,
    Folder: js.UndefOr[scala.Nothing],
    IncludeSubfolders: js.Any,
    RuleExecuteOption: js.Any
  ): Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.Any): Unit = js.native
  def Execute(
    ShowProgress: js.Any,
    Folder: js.Any,
    IncludeSubfolders: js.UndefOr[scala.Nothing],
    RuleExecuteOption: js.Any
  ): Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.Any, IncludeSubfolders: js.Any): Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.Any, IncludeSubfolders: js.Any, RuleExecuteOption: js.Any): Unit = js.native
  
  var ExecutionOrder: Double = js.native
  
  val IsLocalRule: Boolean = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.Rule_typekey")
  var OutlookDotRule_typekey: Rule = js.native
  
  val Parent: js.Any = js.native
  
  val RuleType: OlRuleType = js.native
  
  val Session: NameSpace = js.native
}
