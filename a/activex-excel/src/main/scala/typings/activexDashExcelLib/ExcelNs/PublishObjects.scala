package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishObjects extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): PublishObject = js.native
  def apply(Index: scala.Double): PublishObject = js.native
  def Add(SourceType: XlSourceType, Filename: java.lang.String): PublishObject = js.native
  def Add(SourceType: XlSourceType, Filename: java.lang.String, Sheet: java.lang.String): PublishObject = js.native
  def Add(
    SourceType: XlSourceType,
    Filename: java.lang.String,
    Sheet: java.lang.String,
    Source: XlSourceType
  ): PublishObject = js.native
  def Add(
    SourceType: XlSourceType,
    Filename: java.lang.String,
    Sheet: java.lang.String,
    Source: XlSourceType,
    HtmlType: XlHtmlType
  ): PublishObject = js.native
  def Add(
    SourceType: XlSourceType,
    Filename: java.lang.String,
    Sheet: java.lang.String,
    Source: XlSourceType,
    HtmlType: XlHtmlType,
    DivID: java.lang.String
  ): PublishObject = js.native
  def Add(
    SourceType: XlSourceType,
    Filename: java.lang.String,
    Sheet: java.lang.String,
    Source: XlSourceType,
    HtmlType: XlHtmlType,
    DivID: java.lang.String,
    Title: java.lang.String
  ): PublishObject = js.native
  def Delete(): scala.Unit = js.native
  def Item(Index: java.lang.String): PublishObject = js.native
  def Item(Index: scala.Double): PublishObject = js.native
  def Publish(): scala.Unit = js.native
  def _Default(Index: js.Any): PublishObject = js.native
}

