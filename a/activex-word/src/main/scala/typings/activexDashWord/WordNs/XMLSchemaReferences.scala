package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLSchemaReferences")
@js.native
class XMLSchemaReferences protected () extends js.Object {
  var AllowSaveAsXMLWithoutValidation: Boolean = js.native
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var AutomaticValidation: Boolean = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var HideValidationErrors: Boolean = js.native
  var IgnoreMixedContent: Boolean = js.native
  val Parent: js.Any = js.native
  var ShowPlaceholderText: Boolean = js.native
  var `Word.XMLSchemaReferences_typekey`: XMLSchemaReferences = js.native
  /** @param boolean [InstallForAllUsers=false] */
  def Add(NamespaceURI: js.Any, Alias: js.Any, FileName: js.Any): XMLSchemaReference = js.native
  def Add(NamespaceURI: js.Any, Alias: js.Any, FileName: js.Any, InstallForAllUsers: Boolean): XMLSchemaReference = js.native
  def Item(Index: js.Any): XMLSchemaReference = js.native
  def Validate(): Unit = js.native
}

