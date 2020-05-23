package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomXMLPrefixMapping extends js.Object {
  val Application: js.Any
  val Creator: Double
  val NamespaceURI: String
  @JSName("Office.CustomXMLPrefixMapping_typekey")
  var OfficeDotCustomXMLPrefixMapping_typekey: CustomXMLPrefixMapping
  val Parent: js.Any
  val Prefix: String
}

object CustomXMLPrefixMapping {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    NamespaceURI: String,
    OfficeDotCustomXMLPrefixMapping_typekey: CustomXMLPrefixMapping,
    Parent: js.Any,
    Prefix: String
  ): CustomXMLPrefixMapping = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CustomXMLPrefixMapping_typekey")(OfficeDotCustomXMLPrefixMapping_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXMLPrefixMapping]
  }
}

