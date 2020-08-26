package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentProperty[TApplication] extends js.Object {
  var Application: TApplication = js.native
  var Creator: Double = js.native
  var LinkSource: String = js.native
  var LinkToContent: Boolean = js.native
  var Name: String = js.native
  @JSName("Office.DocumentProperty_typekey")
  var OfficeDotDocumentProperty_typekey: DocumentProperty[TApplication] = js.native
  var Parent: js.Any = js.native
  var Type: MsoDocProperties = js.native
  var Value: js.Any = js.native
  def Delete(): Unit = js.native
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
  @scala.inline
  implicit class DocumentPropertyOps[Self <: DocumentProperty[_], TApplication] (val x: Self with DocumentProperty[TApplication]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: TApplication): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setLinkSource(value: String): Self = this.set("LinkSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkToContent(value: Boolean): Self = this.set("LinkToContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotDocumentProperty_typekey(value: DocumentProperty[TApplication]): Self = this.set("Office.DocumentProperty_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MsoDocProperties): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

