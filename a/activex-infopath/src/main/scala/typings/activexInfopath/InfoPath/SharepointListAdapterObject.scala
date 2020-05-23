package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharepointListAdapterObject extends js.Object {
  @JSName("InfoPath.SharepointListAdapterObject_typekey")
  var InfoPathDotSharepointListAdapterObject_typekey: SharepointListAdapterObject
  val Name: String
  val QueryAllowed: Boolean
  val SiteUrl: String
  val SubmitAllowed: Boolean
  def Query(): Unit
  def Submit(): Unit
}

object SharepointListAdapterObject {
  @scala.inline
  def apply(
    InfoPathDotSharepointListAdapterObject_typekey: SharepointListAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    SiteUrl: String,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): SharepointListAdapterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SharepointListAdapterObject_typekey")(InfoPathDotSharepointListAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharepointListAdapterObject]
  }
}

