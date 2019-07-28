package typings.awsDashSdk.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionGroup extends js.Object {
  /**
    * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that all of the dimensions in the group were requested, or are present in the response. Valid values for elements in the Dimensions array are:   db.user.id   db.user.name   db.host.id   db.host.name   db.sql.id   db.sql.db_id   db.sql.statement   db.sql.tokenized_id   db.sql_tokenized.id   db.sql_tokenized.db_id   db.sql_tokenized.statement   db.wait_event.name   db.wait_event.type   db.wait_event_type.name  
    */
  var Dimensions: js.UndefOr[StringList] = js.undefined
  /**
    * The name of the dimension group. Valid values are:    db.user     db.host     db.sql     db.sql_tokenized     db.wait_event     db.wait_event_type   
    */
  var Group: String
  /**
    * The maximum number of items to fetch for this dimension group.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsPiMod.Limit] = js.undefined
}

object DimensionGroup {
  @scala.inline
  def apply(Group: String, Dimensions: StringList = null, Limit: js.UndefOr[Limit] = js.undefined): DimensionGroup = {
    val __obj = js.Dynamic.literal(Group = Group)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    __obj.asInstanceOf[DimensionGroup]
  }
}

