package typings.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPoint extends js.Object {
  var count: Double
  var kind: DataPointType
  var max: Double
  var min: Double
  var name: String
  var stdDev: Double
  var value: Double
}

object DataPoint {
  @scala.inline
  def apply(
    count: Double,
    kind: DataPointType,
    max: Double,
    min: Double,
    name: String,
    stdDev: Double,
    value: Double
  ): DataPoint = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
}

