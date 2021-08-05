package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rules extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Create(Name: String, RuleType: OlRuleType): Rule = js.native
  
  var IsRssRulesProcessingEnabled: Boolean = js.native
  
  def Item(Index: js.Any): Rule = js.native
  
  /* private */ @JSName("Outlook.Rules_typekey")
  var OutlookDotRules_typekey: Rules = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: js.Any): Unit = js.native
  
  def Save(): Unit = js.native
  def Save(ShowProgress: js.Any): Unit = js.native
  
  val Session: NameSpace = js.native
}
