package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomXMLSchema extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Location: String
  val NamespaceURI: String
  @JSName("Office.CustomXMLSchema_typekey")
  var OfficeDotCustomXMLSchema_typekey: CustomXMLSchema
  val Parent: js.Any
  def Delete(): Unit
  def Reload(): Unit
}

object CustomXMLSchema {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Delete: () => Unit,
    Location: String,
    NamespaceURI: String,
    OfficeDotCustomXMLSchema_typekey: CustomXMLSchema,
    Parent: js.Any,
    Reload: () => Unit
  ): CustomXMLSchema = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Location = Location.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reload = js.Any.fromFunction0(Reload))
    __obj.updateDynamic("Office.CustomXMLSchema_typekey")(OfficeDotCustomXMLSchema_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXMLSchema]
  }
}

