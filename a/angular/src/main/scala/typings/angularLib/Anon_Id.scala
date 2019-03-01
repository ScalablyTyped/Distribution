package typings
package angularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  /**
    * the id of the cache instance
    */
  var id: java.lang.String
  /**
    * the number of entries kept in the cache instance
    */
  var size: scala.Double
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String, size: scala.Double): Anon_Id = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Id]
  }
}

