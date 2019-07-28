package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlNamespaces extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  val Value: String = js.native
  def apply(Index: String): XmlNamespace = js.native
  def apply(Index: Double): XmlNamespace = js.native
  def InstallManifest(Path: String): Unit = js.native
  def InstallManifest(Path: String, InstallForAllUsers: Boolean): Unit = js.native
  def Item(Index: String): XmlNamespace = js.native
  def Item(Index: Double): XmlNamespace = js.native
  def _Default(Index: js.Any): XmlNamespace = js.native
}

