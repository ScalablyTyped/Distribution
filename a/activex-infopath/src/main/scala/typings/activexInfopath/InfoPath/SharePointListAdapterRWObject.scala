package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharePointListAdapterRWObject extends js.Object {
  var ContentTypeId: String
  @JSName("InfoPath.SharePointListAdapterRWObject_typekey")
  var InfoPathDotSharePointListAdapterRWObject_typekey: SharePointListAdapterRWObject
  var ListId: String
  val Name: String
  val QueryAllowed: Boolean
  var SiteUrl: String
  val SubmitAllowed: Boolean
  def Query(): Unit
  def Submit(): Unit
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
}

