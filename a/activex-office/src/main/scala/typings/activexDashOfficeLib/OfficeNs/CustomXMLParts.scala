package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLParts extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): CustomXMLPart = js.native
  def apply(Index: scala.Double): CustomXMLPart = js.native
  /** @param XML [XML=''] */
  def Add(): CustomXMLPart = js.native
  def Add(XML: java.lang.String): CustomXMLPart = js.native
  def Add(XML: java.lang.String, SchemaCollection: CustomXMLSchemaCollection): CustomXMLPart = js.native
  def Item(Index: java.lang.String): CustomXMLPart = js.native
  def Item(Index: scala.Double): CustomXMLPart = js.native
  def SelectByID(Id: java.lang.String): CustomXMLPart = js.native
  def SelectByNamespace(NamespaceURI: java.lang.String): CustomXMLParts = js.native
}

