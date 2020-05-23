package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitToHostAdapterObject extends js.Object {
  @JSName("InfoPath.SubmitToHostAdapterObject_typekey")
  var InfoPathDotSubmitToHostAdapterObject_typekey: SubmitToHostAdapterObject
  val Name: String
  val QueryAllowed: Boolean
  val SubmitAllowed: Boolean
  def Query(): Unit
  def Submit(): Unit
}

object SubmitToHostAdapterObject {
  @scala.inline
  def apply(
    InfoPathDotSubmitToHostAdapterObject_typekey: SubmitToHostAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): SubmitToHostAdapterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SubmitToHostAdapterObject_typekey")(InfoPathDotSubmitToHostAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitToHostAdapterObject]
  }
}

