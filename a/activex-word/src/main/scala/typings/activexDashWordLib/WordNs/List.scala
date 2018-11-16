package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.List")
@js.native
class List protected () extends js.Object {
  val Application: Application = js.native
  val Creator: scala.Double = js.native
  val ListParagraphs: ListParagraphs = js.native
  val Parent: js.Any = js.native
  val Range: Range = js.native
  val SingleListTemplate: scala.Boolean = js.native
  val StyleName: java.lang.String = js.native
  var `Word.List_typekey`: List = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate): scala.Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate, ContinuePreviousList: js.Any): scala.Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate, ContinuePreviousList: js.Any, DefaultListBehavior: js.Any): scala.Unit = js.native
  def ApplyListTemplateOld(ListTemplate: ListTemplate): scala.Unit = js.native
  def ApplyListTemplateOld(ListTemplate: ListTemplate, ContinuePreviousList: js.Any): scala.Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate): scala.Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: js.Any): scala.Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: js.Any, DefaultListBehavior: js.Any): scala.Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.Any,
    DefaultListBehavior: js.Any,
    ApplyLevel: js.Any
  ): scala.Unit = js.native
  def CanContinuePreviousList(ListTemplate: ListTemplate): WdContinue = js.native
  def ConvertNumbersToText(): scala.Unit = js.native
  def ConvertNumbersToText(NumberType: js.Any): scala.Unit = js.native
  def CountNumberedItems(): scala.Double = js.native
  def CountNumberedItems(NumberType: js.Any): scala.Double = js.native
  def CountNumberedItems(NumberType: js.Any, Level: js.Any): scala.Double = js.native
  def RemoveNumbers(): scala.Unit = js.native
  def RemoveNumbers(NumberType: js.Any): scala.Unit = js.native
}

