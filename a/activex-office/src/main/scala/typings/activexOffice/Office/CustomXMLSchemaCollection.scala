package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLSchemaCollection extends js.Object {
  
  def apply(Index: String): CustomXMLSchema = js.native
  def apply(Index: Double): CustomXMLSchema = js.native
  
  /**
    * @param NamespaceURI [NamespaceURI='']
    * @param Alias [Alias='']
    * @param FileName [FileName='']
    * @param InstallForAllUsers [InstallForAllUsers=false]
    */
  def Add(): CustomXMLSchema = js.native
  def Add(
    NamespaceURI: js.UndefOr[scala.Nothing],
    Alias: js.UndefOr[scala.Nothing],
    FileName: js.UndefOr[scala.Nothing],
    InstallForAllUsers: Boolean
  ): CustomXMLSchema = js.native
  def Add(NamespaceURI: js.UndefOr[scala.Nothing], Alias: js.UndefOr[scala.Nothing], FileName: String): CustomXMLSchema = js.native
  def Add(
    NamespaceURI: js.UndefOr[scala.Nothing],
    Alias: js.UndefOr[scala.Nothing],
    FileName: String,
    InstallForAllUsers: Boolean
  ): CustomXMLSchema = js.native
  def Add(NamespaceURI: js.UndefOr[scala.Nothing], Alias: String): CustomXMLSchema = js.native
  def Add(
    NamespaceURI: js.UndefOr[scala.Nothing],
    Alias: String,
    FileName: js.UndefOr[scala.Nothing],
    InstallForAllUsers: Boolean
  ): CustomXMLSchema = js.native
  def Add(NamespaceURI: js.UndefOr[scala.Nothing], Alias: String, FileName: String): CustomXMLSchema = js.native
  def Add(
    NamespaceURI: js.UndefOr[scala.Nothing],
    Alias: String,
    FileName: String,
    InstallForAllUsers: Boolean
  ): CustomXMLSchema = js.native
  def Add(NamespaceURI: String): CustomXMLSchema = js.native
  def Add(
    NamespaceURI: String,
    Alias: js.UndefOr[scala.Nothing],
    FileName: js.UndefOr[scala.Nothing],
    InstallForAllUsers: Boolean
  ): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: js.UndefOr[scala.Nothing], FileName: String): CustomXMLSchema = js.native
  def Add(
    NamespaceURI: String,
    Alias: js.UndefOr[scala.Nothing],
    FileName: String,
    InstallForAllUsers: Boolean
  ): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: String): CustomXMLSchema = js.native
  def Add(
    NamespaceURI: String,
    Alias: String,
    FileName: js.UndefOr[scala.Nothing],
    InstallForAllUsers: Boolean
  ): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: String, FileName: String): CustomXMLSchema = js.native
  def Add(NamespaceURI: String, Alias: String, FileName: String, InstallForAllUsers: Boolean): CustomXMLSchema = js.native
  
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
