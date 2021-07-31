package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLSchemaCollection extends StObject {
  
  def apply(Index: String): CustomXMLSchema = js.native
  def apply(Index: Double): CustomXMLSchema = js.native
  
  /**
    * @param NamespaceURI [NamespaceURI='']
    * @param Alias [Alias='']
    * @param FileName [FileName='']
    * @param InstallForAllUsers [InstallForAllUsers=false]
    */
  def Add(): CustomXMLSchema = js.native
  def Add(NamespaceURI: String): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: String): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: String, FileName: String): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: String, FileName: String, InstallForAllUsers: Boolean): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: String, FileName: Unit, InstallForAllUsers: Boolean): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: Unit, FileName: String): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: Unit, FileName: String, InstallForAllUsers: Boolean): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: Unit, FileName: Unit, InstallForAllUsers: Boolean): CustomXMLSchema = js.native
  def Add(NamespaceURI: Unit, Alias: String): CustomXMLSchema = js.native
  def Add(NamespaceURI: Unit, Alias: String, FileName: String): CustomXMLSchema = js.native
  def Add(NamespaceURI: Unit, Alias: String, FileName: String, InstallForAllUsers: Boolean): CustomXMLSchema = js.native
  def Add(NamespaceURI: Unit, Alias: String, FileName: Unit, InstallForAllUsers: Boolean): CustomXMLSchema = js.native
  def Add(NamespaceURI: Unit, Alias: Unit, FileName: String): CustomXMLSchema = js.native
  def Add(NamespaceURI: Unit, Alias: Unit, FileName: String, InstallForAllUsers: Boolean): CustomXMLSchema = js.native
  def Add(NamespaceURI: Unit, Alias: Unit, FileName: Unit, InstallForAllUsers: Boolean): CustomXMLSchema = js.native
  
  def AddCollection(SchemaCollection: CustomXMLSchemaCollection): Unit = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): CustomXMLSchema = js.native
  def Item(Index: Double): CustomXMLSchema = js.native
  
  def NamespaceURI(Index: Double): String = js.native
  
  val Parent: js.Any = js.native
  
  def Validate(): Boolean = js.native
}
