package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLPrefixMappings extends StObject {
  
  def apply(Index: String): CustomXMLPrefixMapping = js.native
  def apply(Index: Double): CustomXMLPrefixMapping = js.native
  
  def AddNamespace(Prefix: String, NamespaceURI: String): Unit = js.native
  
  val Application: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): CustomXMLPrefixMapping = js.native
  def Item(Index: Double): CustomXMLPrefixMapping = js.native
  
  def LookupNamespace(Prefix: String): String = js.native
  
  def LookupPrefix(NamespaceURI: String): String = js.native
  
  val Parent: Any = js.native
}
