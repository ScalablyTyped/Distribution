package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEntityAggregatesResponse extends js.Object {
  /**
    * The number of entities that are affected by each of the specified events.
    */
  var entityAggregates: js.UndefOr[EntityAggregateList] = js.undefined
}

object DescribeEntityAggregatesResponse {
  @scala.inline
  def apply(entityAggregates: EntityAggregateList = null): DescribeEntityAggregatesResponse = {
    val __obj = js.Dynamic.literal()
    if (entityAggregates != null) __obj.updateDynamic("entityAggregates")(entityAggregates)
    __obj.asInstanceOf[DescribeEntityAggregatesResponse]
  }
}

