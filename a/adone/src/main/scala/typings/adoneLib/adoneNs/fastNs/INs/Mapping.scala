package typings
package adoneLib.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mapping extends js.Object {
  /**
    * Source file/files
    */
  var from: java.lang.String
  /**
    * Destination directory
    */
  var to: java.lang.String
}

object Mapping {
  @scala.inline
  def apply(from: java.lang.String, to: java.lang.String): Mapping = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[Mapping]
  }
}

