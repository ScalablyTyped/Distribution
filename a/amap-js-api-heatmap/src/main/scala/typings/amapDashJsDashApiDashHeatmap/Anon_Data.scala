package typings.amapDashJsDashApiDashHeatmap

import typings.amapDashJsDashApiDashHeatmap.AMap.Heatmap.DataSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: String
  var dataParser: js.UndefOr[js.Function1[/* data */ js.Any, DataSet]] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: String, dataParser: /* data */ js.Any => DataSet = null): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data)
    if (dataParser != null) __obj.updateDynamic("dataParser")(js.Any.fromFunction1(dataParser))
    __obj.asInstanceOf[Anon_Data]
  }
}

