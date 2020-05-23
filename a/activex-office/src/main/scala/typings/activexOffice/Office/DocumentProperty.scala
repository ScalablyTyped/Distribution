package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProperty[TApplication] extends js.Object {
  var Application: TApplication
  var Creator: Double
  var LinkSource: String
  var LinkToContent: Boolean
  var Name: String
  @JSName("Office.DocumentProperty_typekey")
  var OfficeDotDocumentProperty_typekey: DocumentProperty[TApplication]
  var Parent: js.Any
  var Type: MsoDocProperties
  var Value: js.Any
  def Delete(): Unit
}

object DocumentProperty {
  @scala.inline
  def apply[TApplication](
    Application: TApplication,
    Creator: Double,
    Delete: () => Unit,
    LinkSource: String,
    LinkToContent: Boolean,
    Name: String,
    OfficeDotDocumentProperty_typekey: DocumentProperty[TApplication],
    Parent: js.Any,
    Type: MsoDocProperties,
    Value: js.Any
  ): DocumentProperty[TApplication] = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), LinkSource = LinkSource.asInstanceOf[js.Any], LinkToContent = LinkToContent.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.DocumentProperty_typekey")(OfficeDotDocumentProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProperty[TApplication]]
  }
}

