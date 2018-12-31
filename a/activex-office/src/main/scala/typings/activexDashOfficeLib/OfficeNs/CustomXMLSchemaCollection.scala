package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLSchemaCollection extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): CustomXMLSchema = js.native
  def apply(Index: scala.Double): CustomXMLSchema = js.native
  /**
    * @param NamespaceURI [NamespaceURI='']
    * @param Alias [Alias='']
    * @param FileName [FileName='']
    * @param InstallForAllUsers [InstallForAllUsers=false]
    */
  def Add(): CustomXMLSchema = js.native
  def Add(NamespaceURI: java.lang.String): CustomXMLSchema = js.native
  def Add(NamespaceURI: java.lang.String, Alias: java.lang.String): CustomXMLSchema = js.native
  def Add(NamespaceURI: java.lang.String, Alias: java.lang.String, FileName: java.lang.String): CustomXMLSchema = js.native
  def Add(
    NamespaceURI: java.lang.String,
    Alias: java.lang.String,
    FileName: java.lang.String,
    InstallForAllUsers: scala.Boolean
  ): CustomXMLSchema = js.native
  def AddCollection(SchemaCollection: CustomXMLSchemaCollection): scala.Unit = js.native
  def Item(Index: java.lang.String): CustomXMLSchema = js.native
  def Item(Index: scala.Double): CustomXMLSchema = js.native
  def NamespaceURI(Index: scala.Double): java.lang.String = js.native
  def Validate(): scala.Boolean = js.native
}

