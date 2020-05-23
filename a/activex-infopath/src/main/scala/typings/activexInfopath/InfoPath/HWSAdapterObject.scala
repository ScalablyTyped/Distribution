package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HWSAdapterObject extends js.Object {
  @JSName("InfoPath.HWSAdapterObject_typekey")
  var InfoPathDotHWSAdapterObject_typekey: HWSAdapterObject
  val Name: String
  val QueryAllowed: Boolean
  val SubmitAllowed: Boolean
  def Query(): Unit
  def Submit(): Unit
}

object HWSAdapterObject {
  @scala.inline
  def apply(
    InfoPathDotHWSAdapterObject_typekey: HWSAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): HWSAdapterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.HWSAdapterObject_typekey")(InfoPathDotHWSAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HWSAdapterObject]
  }
}

