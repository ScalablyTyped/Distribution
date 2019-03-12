package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlMaps extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): XmlMap = js.native
  def apply(Index: scala.Double): XmlMap = js.native
  def Add(Schema: java.lang.String): XmlMap = js.native
  def Add(Schema: java.lang.String, RootElementName: java.lang.String): XmlMap = js.native
  def Item(Index: java.lang.String): XmlMap = js.native
  def Item(Index: scala.Double): XmlMap = js.native
  def _Default(Index: js.Any): XmlMap = js.native
}

