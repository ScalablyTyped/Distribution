package typings.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  /**
    * the id of the cache instance
    */
  var id: String
  /**
    * the number of entries kept in the cache instance
    */
  var size: Double
}

object AnonId {
  @scala.inline
  def apply(id: String, size: Double): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

