package typings.awsDashSdk.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricQuery extends js.Object {
  /**
    * One or more filters to apply in the request. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy parameter.   A single filter for any other dimension in this dimension group.  
    */
  var Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined
  /**
    * A specification for how to aggregate the data points from a query result. You must specify a valid dimension group. Performance Insights will return all of the dimensions within that group, unless you provide the names of specific dimensions within that group. You can also request that Performance Insights return a limited number of values for a dimension.
    */
  var GroupBy: js.UndefOr[DimensionGroup] = js.undefined
  /**
    * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
    */
  var Metric: String
}

object MetricQuery {
  @scala.inline
  def apply(Metric: String, Filter: MetricQueryFilterMap = null, GroupBy: DimensionGroup = null): MetricQuery = {
    val __obj = js.Dynamic.literal(Metric = Metric)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (GroupBy != null) __obj.updateDynamic("GroupBy")(GroupBy)
    __obj.asInstanceOf[MetricQuery]
  }
}

