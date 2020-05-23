package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avg extends js.Object {
  /**
    * The average facet value in the result set.
    */
  var avg: Double
  /**
    * The maximum value in the result set.
    */
  var max: Double
  /**
    * The minimum value in the result set.
    */
  var min: Double
  /**
    * The sum of all values in the result set.
    */
  var sum: Double
}

object Avg {
  @scala.inline
  def apply(avg: Double, max: Double, min: Double, sum: Double): Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avg]
  }
}

