package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def ApplyListTemplate(ListTemplate: ListTemplate): Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate, ContinuePreviousList: Any): Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate, ContinuePreviousList: Any, DefaultListBehavior: Any): Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate, ContinuePreviousList: Unit, DefaultListBehavior: Any): Unit = js.native
  
  def ApplyListTemplateOld(ListTemplate: ListTemplate): Unit = js.native
  def ApplyListTemplateOld(ListTemplate: ListTemplate, ContinuePreviousList: Any): Unit = js.native
  
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: Any): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: Any, DefaultListBehavior: Any): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: Any, DefaultListBehavior: Any, ApplyLevel: Any): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: Any, DefaultListBehavior: Unit, ApplyLevel: Any): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: Unit, DefaultListBehavior: Any): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: Unit, DefaultListBehavior: Any, ApplyLevel: Any): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: Unit, DefaultListBehavior: Unit, ApplyLevel: Any): Unit = js.native
  
  def CanContinuePreviousList(ListTemplate: ListTemplate): WdContinue = js.native
  
  def ConvertNumbersToText(): Unit = js.native
  def ConvertNumbersToText(NumberType: Any): Unit = js.native
  
  def CountNumberedItems(): Double = js.native
  def CountNumberedItems(NumberType: Any): Double = js.native
  def CountNumberedItems(NumberType: Any, Level: Any): Double = js.native
  def CountNumberedItems(NumberType: Unit, Level: Any): Double = js.native
  
  val Creator: Double = js.native
  
  val ListParagraphs: typings.activexWord.Word.ListParagraphs = js.native
  
  val Parent: Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  def RemoveNumbers(): Unit = js.native
  def RemoveNumbers(NumberType: Any): Unit = js.native
  
  val SingleListTemplate: Boolean = js.native
  
  val StyleName: String = js.native
  
  /* private */ @JSName("Word.List_typekey")
  var WordDotList_typekey: typings.activexWord.Word.List = js.native
}
