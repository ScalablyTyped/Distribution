package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputColumn extends js.Object {
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ColumnName] = js.native
  /**
    * Type.
    */
  var Type: js.UndefOr[ColumnDataType] = js.native
}

object OutputColumn {
  @scala.inline
  def apply(Name: ColumnName = null, Type: ColumnDataType = null): OutputColumn = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputColumn]
  }
}

