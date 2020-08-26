package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLFileAdapterObject extends js.Object {
  var FileURL: String = js.native
  @JSName("InfoPath.XMLFileAdapterObject_typekey")
  var InfoPathDotXMLFileAdapterObject_typekey: XMLFileAdapterObject = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  val SubmitAllowed: Boolean = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
}

object XMLFileAdapterObject {
  @scala.inline
  def apply(
    FileURL: String,
    InfoPathDotXMLFileAdapterObject_typekey: XMLFileAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): XMLFileAdapterObject = {
    val __obj = js.Dynamic.literal(FileURL = FileURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.XMLFileAdapterObject_typekey")(InfoPathDotXMLFileAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLFileAdapterObject]
  }
  @scala.inline
  implicit class XMLFileAdapterObjectOps[Self <: XMLFileAdapterObject] (val x: Self) extends AnyVal {
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
    def setFileURL(value: String): Self = this.set("FileURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotXMLFileAdapterObject_typekey(value: XMLFileAdapterObject): Self = this.set("InfoPath.XMLFileAdapterObject_typekey", value.asInstanceOf[js.Any])
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
  }
  
}

