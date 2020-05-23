package typings.angular.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  /**
    * the id of the cache instance
    */
  var id: String
  /**
    * the number of entries kept in the cache instance
    */
  var size: Double
}

object Id {
  @scala.inline
  def apply(id: String, size: Double): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

