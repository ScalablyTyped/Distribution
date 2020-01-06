package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputColumn extends js.Object {
  /**
    * The name of this column in the underlying data source.
    */
  var Name: ColumnName = js.native
  /**
    * The data type of the column.
    */
  var Type: InputColumnDataType = js.native
}

object InputColumn {
  @scala.inline
  def apply(Name: ColumnName, Type: InputColumnDataType): InputColumn = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputColumn]
  }
}

