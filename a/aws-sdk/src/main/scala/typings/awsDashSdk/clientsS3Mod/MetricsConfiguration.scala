package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsConfiguration extends js.Object {
  /**
    * Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).
    */
  var Filter: js.UndefOr[MetricsFilter] = js.undefined
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId
}

object MetricsConfiguration {
  @scala.inline
  def apply(Id: MetricsId, Filter: MetricsFilter = null): MetricsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    __obj.asInstanceOf[MetricsConfiguration]
  }
}

