package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlNamespaces extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  val Value: java.lang.String = js.native
  def apply(Index: java.lang.String): XmlNamespace = js.native
  def apply(Index: scala.Double): XmlNamespace = js.native
  def InstallManifest(Path: java.lang.String): scala.Unit = js.native
  def InstallManifest(Path: java.lang.String, InstallForAllUsers: scala.Boolean): scala.Unit = js.native
  def Item(Index: java.lang.String): XmlNamespace = js.native
  def Item(Index: scala.Double): XmlNamespace = js.native
  def _Default(Index: js.Any): XmlNamespace = js.native
}

