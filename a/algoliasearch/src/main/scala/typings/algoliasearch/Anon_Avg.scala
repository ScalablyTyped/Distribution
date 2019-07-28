package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avg extends js.Object {
  var avg: Double
  var max: Double
  var min: Double
  var sum: Double
}

object Anon_Avg {
  @scala.inline
  def apply(avg: Double, max: Double, min: Double, sum: Double): Anon_Avg = {
    val __obj = js.Dynamic.literal(avg = avg, max = max, min = min, sum = sum)
  
    __obj.asInstanceOf[Anon_Avg]
  }
}

