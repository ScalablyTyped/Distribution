package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`3`
import typings.activexExcel.activexExcelNumbers.`4`
import typings.activexExcel.activexExcelNumbers.`5`
import typings.activexExcel.activexExcelNumbers.`6`
import typings.activexExcel.activexExcelNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishObjects extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): PublishObject = js.native
  def apply(Index: Double): PublishObject = js.native
  def Add(
    SourceType: XlSourceType,
    Filename: String,
    Sheet: js.UndefOr[String],
    Source: js.UndefOr[`3` | `5` | `6` | `2` | `7` | `4`],
    HtmlType: js.UndefOr[XlHtmlType],
    DivID: js.UndefOr[String],
    Title: js.UndefOr[String]
  ): PublishObject = js.native
  def Delete(): Unit = js.native
  def Item(Index: String): PublishObject = js.native
  def Item(Index: Double): PublishObject = js.native
  def Publish(): Unit = js.native
  def _Default(Index: js.Any): PublishObject = js.native
}

