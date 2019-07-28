package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventCategoriesMessage extends js.Object {
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The type of source that is generating the events. Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
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

