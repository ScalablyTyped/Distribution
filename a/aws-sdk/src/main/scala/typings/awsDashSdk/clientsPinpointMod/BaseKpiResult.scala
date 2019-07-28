package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseKpiResult extends js.Object {
  /**
    * An array of objects that provides the results of a query that retrieved the data for a standard metric that applies to an application or campaign.
    */
  var Rows: ListOfResultRow
}

object BaseKpiResult {
  @scala.inline
  def apply(Rows: ListOfResultRow): BaseKpiResult = {
    val __obj = js.Dynamic.literal(Rows = Rows)
  
    __obj.asInstanceOf[BaseKpiResult]
  }
}

