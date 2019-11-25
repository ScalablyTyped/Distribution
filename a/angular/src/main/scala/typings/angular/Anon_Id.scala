package typings.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  /**
    * the id of the cache instance
    */
  var id: String
  /**
    * the number of entries kept in the cache instance
    */
  var size: Double
}

object Anon_Id {
  @scala.inline
  def apply(id: String, size: Double): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id]
  }
}

