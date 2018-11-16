package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLSchemaReferences")
@js.native
class XMLSchemaReferences protected () extends js.Object {
  var AllowSaveAsXMLWithoutValidation: scala.Boolean = js.native
  val Application: Application = js.native
  var AutomaticValidation: scala.Boolean = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var HideValidationErrors: scala.Boolean = js.native
  var IgnoreMixedContent: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var ShowPlaceholderText: scala.Boolean = js.native
  var `Word.XMLSchemaReferences_typekey`: XMLSchemaReferences = js.native
  /** @param boolean [InstallForAllUsers=false] */
  def Add(NamespaceURI: js.Any, Alias: js.Any, FileName: js.Any): XMLSchemaReference = js.native
  /** @param boolean [InstallForAllUsers=false] */
  def Add(NamespaceURI: js.Any, Alias: js.Any, FileName: js.Any, InstallForAllUsers: scala.Boolean): XMLSchemaReference = js.native
  def Item(Index: js.Any): XMLSchemaReference = js.native
  def Validate(): scala.Unit = js.native
}

