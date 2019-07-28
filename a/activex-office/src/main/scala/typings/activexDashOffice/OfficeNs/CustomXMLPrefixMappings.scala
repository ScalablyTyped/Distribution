package typings.activexDashOffice.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLPrefixMappings extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): CustomXMLPrefixMapping = js.native
  def apply(Index: Double): CustomXMLPrefixMapping = js.native
  def AddNamespace(Prefix: String, NamespaceURI: String): Unit = js.native
  def Item(Index: String): CustomXMLPrefixMapping = js.native
  def Item(Index: Double): CustomXMLPrefixMapping = js.native
  def LookupNamespace(Prefix: String): String = js.native
  def LookupPrefix(NamespaceURI: String): String = js.native
}

