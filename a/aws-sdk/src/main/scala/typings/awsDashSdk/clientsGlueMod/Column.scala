package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /**
    * A free-form text comment.
    */
  var Comment: js.UndefOr[CommentString] = js.undefined
  /**
    * The name of the Column.
    */
  var Name: NameString
  /**
    * These key-value pairs define properties associated with the column.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  /**
    * The data type of the Column.
    */
  var Type: js.UndefOr[ColumnTypeString] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    Name: NameString,
    Comment: CommentString = null,
    Parameters: ParametersMap = null,
    Type: ColumnTypeString = null
  ): Column = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[Column]
  }
}

