package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharePointListAdapterRWObject extends js.Object {
  var ContentTypeId: String = js.native
  @JSName("InfoPath.SharePointListAdapterRWObject_typekey")
  var InfoPathDotSharePointListAdapterRWObject_typekey: SharePointListAdapterRWObject = js.native
  var ListId: String = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  var SiteUrl: String = js.native
  val SubmitAllowed: Boolean = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
}

object SharePointListAdapterRWObject {
  @scala.inline
  def apply(
    ContentTypeId: String,
    InfoPathDotSharePointListAdapterRWObject_typekey: SharePointListAdapterRWObject,
    ListId: String,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    SiteUrl: String,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): SharePointListAdapterRWObject = {
    val __obj = js.Dynamic.literal(ContentTypeId = ContentTypeId.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SharePointListAdapterRWObject_typekey")(InfoPathDotSharePointListAdapterRWObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePointListAdapterRWObject]
  }
  @scala.inline
  implicit class SharePointListAdapterRWObjectOps[Self <: SharePointListAdapterRWObject] (val x: Self) extends AnyVal {
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
    def setContentTypeId(value: String): Self = this.set("ContentTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotSharePointListAdapterRWObject_typekey(value: SharePointListAdapterRWObject): Self = this.set("InfoPath.SharePointListAdapterRWObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setListId(value: String): Self = this.set("ListId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: () => Unit): Self = this.set("Query", js.Any.fromFunction0(value))
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = this.set("QueryAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSiteUrl(value: String): Self = this.set("SiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmit(value: () => Unit): Self = this.set("Submit", js.Any.fromFunction0(value))
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = this.set("SubmitAllowed", value.asInstanceOf[js.Any])
  }
  
}

