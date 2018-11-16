package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ListFormat")
@js.native
class ListFormat protected () extends js.Object {
  val Application: Application = js.native
  val Creator: scala.Double = js.native
  val List: List = js.native
  var ListLevelNumber: scala.Double = js.native
  val ListPictureBullet: InlineShape = js.native
  val ListString: java.lang.String = js.native
  val ListTemplate: ListTemplate = js.native
  val ListType: WdListType = js.native
  val ListValue: scala.Double = js.native
  val Parent: js.Any = js.native
  val SingleList: scala.Boolean = js.native
  val SingleListTemplate: scala.Boolean = js.native
  var `Word.ListFormat_typekey`: ListFormat = js.native
  def ApplyBulletDefault(): scala.Unit = js.native
  def ApplyBulletDefault(DefaultListBehavior: js.Any): scala.Unit = js.native
  def ApplyBulletDefaultOld(): scala.Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate): scala.Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate, ContinuePreviousList: js.Any): scala.Unit = js.native
  def ApplyListTemplate(ListTemplate: ListTemplate, ContinuePreviousList: js.Any, ApplyTo: js.Any): scala.Unit = js.native
  def ApplyListTemplate(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.Any,
    ApplyTo: js.Any,
    DefaultListBehavior: js.Any
  ): scala.Unit = js.native
  def ApplyListTemplateOld(ListTemplate: ListTemplate): scala.Unit = js.native
  def ApplyListTemplateOld(ListTemplate: ListTemplate, ContinuePreviousList: js.Any): scala.Unit = js.native
  def ApplyListTemplateOld(ListTemplate: ListTemplate, ContinuePreviousList: js.Any, ApplyTo: js.Any): scala.Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate): scala.Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: js.Any): scala.Unit = js.native
  def ApplyListTemplateWithLevel(ListTemplate: ListTemplate, ContinuePreviousList: js.Any, ApplyTo: js.Any): scala.Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.Any,
    ApplyTo: js.Any,
    DefaultListBehavior: js.Any
  ): scala.Unit = js.native
  def ApplyListTemplateWithLevel(
    ListTemplate: ListTemplate,
    ContinuePreviousList: js.Any,
    ApplyTo: js.Any,
    DefaultListBehavior: js.Any,
    ApplyLevel: js.Any
  ): scala.Unit = js.native
  def ApplyNumberDefault(): scala.Unit = js.native
  def ApplyNumberDefault(DefaultListBehavior: js.Any): scala.Unit = js.native
  def ApplyNumberDefaultOld(): scala.Unit = js.native
  def ApplyOutlineNumberDefault(): scala.Unit = js.native
  def ApplyOutlineNumberDefault(DefaultListBehavior: js.Any): scala.Unit = js.native
  def ApplyOutlineNumberDefaultOld(): scala.Unit = js.native
  def CanContinuePreviousList(ListTemplate: ListTemplate): WdContinue = js.native
  def ConvertNumbersToText(): scala.Unit = js.native
  def ConvertNumbersToText(NumberType: js.Any): scala.Unit = js.native
  def CountNumberedItems(): scala.Double = js.native
  def CountNumberedItems(NumberType: js.Any): scala.Double = js.native
  def CountNumberedItems(NumberType: js.Any, Level: js.Any): scala.Double = js.native
  def ListIndent(): scala.Unit = js.native
  def ListOutdent(): scala.Unit = js.native
  def RemoveNumbers(): scala.Unit = js.native
  def RemoveNumbers(NumberType: js.Any): scala.Unit = js.native
}

