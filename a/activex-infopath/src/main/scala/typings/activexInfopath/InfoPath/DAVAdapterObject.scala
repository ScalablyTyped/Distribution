package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DAVAdapterObject extends js.Object {
  var FileName: String = js.native
  var FolderURL: String = js.native
  @JSName("InfoPath.DAVAdapterObject_typekey")
  var InfoPathDotDAVAdapterObject_typekey: DAVAdapterObject = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  val SubmitAllowed: Boolean = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
  def SubmitData(pData: IXMLDOMNode): Unit = js.native
}

object DAVAdapterObject {
  @scala.inline
  def apply(
    FileName: String,
    FolderURL: String,
    InfoPathDotDAVAdapterObject_typekey: DAVAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean,
    SubmitData: IXMLDOMNode => Unit
  ): DAVAdapterObject = {
    val __obj = js.Dynamic.literal(FileName = FileName.asInstanceOf[js.Any], FolderURL = FolderURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], SubmitData = js.Any.fromFunction1(SubmitData))
    __obj.updateDynamic("InfoPath.DAVAdapterObject_typekey")(InfoPathDotDAVAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DAVAdapterObject]
  }
  @scala.inline
  implicit class DAVAdapterObjectOps[Self <: DAVAdapterObject] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("FileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolderURL(value: String): Self = this.set("FolderURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotDAVAdapterObject_typekey(value: DAVAdapterObject): Self = this.set("InfoPath.DAVAdapterObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: () => Unit): Self = this.set("Query", js.Any.fromFunction0(value))
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = this.set("QueryAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmit(value: () => Unit): Self = this.set("Submit", js.Any.fromFunction0(value))
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = this.set("SubmitAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitData(value: IXMLDOMNode => Unit): Self = this.set("SubmitData", js.Any.fromFunction1(value))
  }
  
}

