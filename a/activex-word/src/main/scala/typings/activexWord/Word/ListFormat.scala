package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFormat extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val List: typings.activexWord.Word.List = js.native
  var ListLevelNumber: Double = js.native
  val ListPictureBullet: InlineShape = js.native
  val ListString: String = js.native
  val ListTemplate: typings.activexWord.Word.ListTemplate = js.native
  val ListType: WdListType = js.native
  val ListValue: Double = js.native
  val Parent: js.Any = js.native
  val SingleList: Boolean = js.native
  val SingleListTemplate: Boolean = js.native
  @JSName("Word.ListFormat_typekey")
  var WordDotListFormat_typekey: ListFormat = js.native
  def ApplyBulletDefault(): Unit = js.native
  def ApplyBulletDefault(DefaultListBehavior: js.Any): Unit = js.native
  def ApplyBulletDefaultOld(): Unit = js.native
  def ApplyListTemplate(ListTemplate: typings.activexWord.Word.ListTemplate): Unit = js.native
  def ApplyListTemplate(ListTemplate: typings.activexWord.Word.ListTemplate, ContinuePreviousList: js.Any): Unit = js.native
  def ApplyListTemplate(ListTemplate: typings.activexWord.Word.ListTemplate, ContinuePreviousList: js.Any, ApplyTo: js.Any): Unit = js.native
  def ApplyListTemplate(
    ListTemplate: typings.activexWord.Word.ListTemplate,
    ContinuePreviousList: js.Any,
    ApplyTo: js.Any,
    DefaultListBehavior: js.Any
  ): Unit = js.native
  def ApplyListTemplateOld(ListTemplate: typings.activexWord.Word.ListTemplate): Unit = js.native
  def ApplyListTemplateOld(ListTemplate: typings.activexWord.Word.ListTemplate, ContinuePreviousList: js.Any): Unit = js.native
  def ApplyListTemplateOld(ListTemplate: typings.activexWord.Word.ListTemplate, ContinuePreviousList: js.Any, ApplyTo: js.Any): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: typings.activexWord.Word.ListTemplate): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: typings.activexWord.Word.ListTemplate, ContinuePreviousList: js.Any): Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: typings.activexWord.Word.ListTemplate, ContinuePreviousList: js.Any, ApplyTo: js.Any): Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: typings.activexWord.Word.ListTemplate,
    ContinuePreviousList: js.Any,
    ApplyTo: js.Any,
    DefaultListBehavior: js.Any
  ): Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: typings.activexWord.Word.ListTemplate,
    ContinuePreviousList: js.Any,
    ApplyTo: js.Any,
    DefaultListBehavior: js.Any,
    ApplyLevel: js.Any
  ): Unit = js.native
  def ApplyNumberDefault(): Unit = js.native
  def ApplyNumberDefault(DefaultListBehavior: js.Any): Unit = js.native
  def ApplyNumberDefaultOld(): Unit = js.native
  def ApplyOutlineNumberDefault(): Unit = js.native
  def ApplyOutlineNumberDefault(DefaultListBehavior: js.Any): Unit = js.native
  def ApplyOutlineNumberDefaultOld(): Unit = js.native
  def CanContinuePreviousList(ListTemplate: typings.activexWord.Word.ListTemplate): WdContinue = js.native
  def ConvertNumbersToText(): Unit = js.native
  def ConvertNumbersToText(NumberType: js.Any): Unit = js.native
  def CountNumberedItems(): Double = js.native
  def CountNumberedItems(NumberType: js.Any): Double = js.native
  def CountNumberedItems(NumberType: js.Any, Level: js.Any): Double = js.native
  def ListIndent(): Unit = js.native
  def ListOutdent(): Unit = js.native
  def RemoveNumbers(): Unit = js.native
  def RemoveNumbers(NumberType: js.Any): Unit = js.native
}

