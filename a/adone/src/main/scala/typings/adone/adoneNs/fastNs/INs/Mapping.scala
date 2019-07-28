package typings.adone.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mapping extends js.Object {
  /**
    * Source file/files
    */
  var from: String
  /**
    * Destination directory
    */
  var to: String
}

object Mapping {
  @scala.inline
  def apply(from: String, to: String): Mapping = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[Mapping]
  }
}

