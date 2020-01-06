package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagColumnOperation extends js.Object {
  /**
    * The column that this operation acts on.
    */
  var ColumnName: typings.awsDashSdk.clientsQuicksightMod.ColumnName = js.native
  /**
    * The dataset column tag, currently only used for geospatial type tagging. .  This is not tags for the AWS tagging feature. . 
    */
  var Tags: ColumnTagList = js.native
}

object TagColumnOperation {
  @scala.inline
  def apply(ColumnName: ColumnName, Tags: ColumnTagList): TagColumnOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagColumnOperation]
  }
}

