package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsConfiguration extends js.Object {
  /**
    * The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.
    */
  var Filter: js.UndefOr[AnalyticsFilter] = js.undefined
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId
  /**
    *  Contains data related to access patterns to be collected and made available to analyze the tradeoffs between different storage classes. 
    */
  var StorageClassAnalysis: awsDashSdkLib.clientsS3Mod.StorageClassAnalysis
}

object AnalyticsConfiguration {
  @scala.inline
  def apply(Id: AnalyticsId, StorageClassAnalysis: StorageClassAnalysis, Filter: AnalyticsFilter = null): AnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id, StorageClassAnalysis = StorageClassAnalysis)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    __obj.asInstanceOf[AnalyticsConfiguration]
  }
}

