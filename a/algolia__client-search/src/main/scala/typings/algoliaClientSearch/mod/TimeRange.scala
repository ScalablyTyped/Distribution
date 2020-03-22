package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeRange extends js.Object {
  /**
    * DateTime with UTC offset for Serialization/Deserialization in unix timespam.
    */
  val from: Double
  /**
    * DateTime with UTC offset for Serialization/Deserialization in unix timespam.
    */
  val until: Double
}

object TimeRange {
  @scala.inline
  def apply(from: Double, until: Double): TimeRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimeRange]
  }
}

