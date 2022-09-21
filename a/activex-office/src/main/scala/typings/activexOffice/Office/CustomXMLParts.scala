package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLParts extends StObject {
  
  def apply(Index: String): CustomXMLPart = js.native
  def apply(Index: Double): CustomXMLPart = js.native
  
  /** @param XML [XML=''] */
  def Add(): CustomXMLPart = js.native
  def Add(XML: String): CustomXMLPart = js.native
  def Add(XML: String, SchemaCollection: CustomXMLSchemaCollection): CustomXMLPart = js.native
  def Add(XML: Unit, SchemaCollection: CustomXMLSchemaCollection): CustomXMLPart = js.native
  
  val Application: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): CustomXMLPart = js.native
  def Item(Index: Double): CustomXMLPart = js.native
  
  val Parent: Any = js.native
  
  def SelectByID(Id: String): CustomXMLPart = js.native
  
  def SelectByNamespace(NamespaceURI: String): CustomXMLParts = js.native
}
