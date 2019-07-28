package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventCategoriesMessage extends js.Object {
  /**
    * Filters applied to the action.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | replication-task
    */
  var SourceType: js.UndefOr[String] = js.undefined
}

object DescribeEventCategoriesMessage {
  @scala.inline
  def apply(Filters: FilterList = null, SourceType: String = null): DescribeEventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    __obj.asInstanceOf[DescribeEventCategoriesMessage]
  }
}

