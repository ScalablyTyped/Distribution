package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLParts extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): CustomXMLPart = js.native
  def apply(Index: Double): CustomXMLPart = js.native
  /** @param XML [XML=''] */
  def Add(): CustomXMLPart = js.native
  def Add(XML: String): CustomXMLPart = js.native
  def Add(XML: String, SchemaCollection: CustomXMLSchemaCollection): CustomXMLPart = js.native
  def Item(Index: String): CustomXMLPart = js.native
  def Item(Index: Double): CustomXMLPart = js.native
  def SelectByID(Id: String): CustomXMLPart = js.native
  def SelectByNamespace(NamespaceURI: String): CustomXMLParts = js.native
}

