package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /**
    * Optional information about the column.
    */
  var Comment: js.UndefOr[CommentString] = js.native
  /**
    * The name of the column.
    */
  var Name: NameString = js.native
  /**
    * The data type of the column.
    */
  var Type: js.UndefOr[TypeString] = js.native
}

object Column {
  @scala.inline
  def apply(Name: NameString, Comment: CommentString = null, Type: TypeString = null): Column = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

