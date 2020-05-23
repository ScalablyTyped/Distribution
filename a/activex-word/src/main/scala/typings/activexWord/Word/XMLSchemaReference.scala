package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLSchemaReference extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Location: String
  val NamespaceURI: String
  val Parent: js.Any
  @JSName("Word.XMLSchemaReference_typekey")
  var WordDotXMLSchemaReference_typekey: XMLSchemaReference
  def Delete(): Unit
  def Reload(): Unit
}

object XMLSchemaReference {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Location: String,
    NamespaceURI: String,
    Parent: js.Any,
    Reload: () => Unit,
    WordDotXMLSchemaReference_typekey: XMLSchemaReference
  ): XMLSchemaReference = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Location = Location.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reload = js.Any.fromFunction0(Reload))
    __obj.updateDynamic("Word.XMLSchemaReference_typekey")(WordDotXMLSchemaReference_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLSchemaReference]
  }
}

