package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def ApplyListTemplate(ListTemplate: ListTemplate): Unit = js.native
  def ApplyListTemplate(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.UndefOr[scala.Nothing],
    DefaultListBehavior: js.Any
  ): Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate, ContinuePreviousList: js.Any): Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate, ContinuePreviousList: js.Any, DefaultListBehavior: js.Any): Unit = js.native
  
  def ApplyListTemplateOld(ListTemplate: ListTemplate): Unit = js.native
  def ApplyListTemplateOld(ListTemplate: ListTemplate, ContinuePreviousList: js.Any): Unit = js.native
  
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate): Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.UndefOr[scala.Nothing],
    DefaultListBehavior: js.UndefOr[scala.Nothing],
    ApplyLevel: js.Any
  ): Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.UndefOr[scala.Nothing],
    DefaultListBehavior: js.Any
  ): Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.UndefOr[scala.Nothing],
    DefaultListBehavior: js.Any,
    ApplyLevel: js.Any
  ): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: js.Any): Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.Any,
    DefaultListBehavior: js.UndefOr[scala.Nothing],
    ApplyLevel: js.Any
  ): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: js.Any, DefaultListBehavior: js.Any): Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.Any,
    DefaultListBehavior: js.Any,
    ApplyLevel: js.Any
  ): Unit = js.native
  
  def CanContinuePreviousList(ListTemplate: ListTemplate): WdContinue = js.native
  
  def ConvertNumbersToText(): Unit = js.native
  def ConvertNumbersToText(NumberType: js.Any): Unit = js.native
  
  def CountNumberedItems(): Double = js.native
  def CountNumberedItems(NumberType: js.UndefOr[scala.Nothing], Level: js.Any): Double = js.native
  def CountNumberedItems(NumberType: js.Any): Double = js.native
  def CountNumberedItems(NumberType: js.Any, Level: js.Any): Double = js.native
  
  val Creator: Double = js.native
  
  val ListParagraphs: typings.activexWord.Word.ListParagraphs = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  def RemoveNumbers(): Unit = js.native
  def RemoveNumbers(NumberType: js.Any): Unit = js.native
  
  val SingleListTemplate: Boolean = js.native
  
  val StyleName: String = js.native
  
  @JSName("Word.List_typekey")
  var WordDotList_typekey: List = js.native
}
