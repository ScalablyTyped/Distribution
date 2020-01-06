package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /**
    * A free-form text comment.
    */
  var Comment: js.UndefOr[CommentString] = js.native
  /**
    * The name of the Column.
    */
  var Name: NameString = js.native
  /**
    * These key-value pairs define properties associated with the column.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * The data type of the Column.
    */
  var Type: js.UndefOr[ColumnTypeString] = js.native
}

object Column {
  @scala.inline
  def apply(
    Name: NameString,
    Comment: CommentString = null,
    Parameters: ParametersMap = null,
    Type: ColumnTypeString = null
  ): Column = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

