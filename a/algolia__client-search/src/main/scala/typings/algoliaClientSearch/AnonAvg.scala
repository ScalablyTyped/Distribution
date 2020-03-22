package typings.algoliaClientSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvg extends js.Object {
  val avg: Double
  val max: Double
  val min: Double
  val sum: Double
}

object AnonAvg {
  @scala.inline
  def apply(avg: Double, max: Double, min: Double, sum: Double): AnonAvg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAvg]
  }
}

