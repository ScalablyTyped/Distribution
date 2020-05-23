package typings.amapJsApiHeatmap.anon

import typings.amapJsApiHeatmap.AMap.Heatmap.DataSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: String
  var dataParser: js.UndefOr[js.Function1[/* data */ js.Any, DataSet]] = js.undefined
}

object Data {
  @scala.inline
  def apply(data: String, dataParser: /* data */ js.Any => DataSet = null): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (dataParser != null) __obj.updateDynamic("dataParser")(js.Any.fromFunction1(dataParser))
    __obj.asInstanceOf[Data]
  }
}

