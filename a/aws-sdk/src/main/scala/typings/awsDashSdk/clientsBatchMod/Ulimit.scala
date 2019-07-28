package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ulimit extends js.Object {
  /**
    * The hard limit for the ulimit type.
    */
  var hardLimit: Integer
  /**
    * The type of the ulimit.
    */
  var name: String
  /**
    * The soft limit for the ulimit type.
    */
  var softLimit: Integer
}

object Ulimit {
  @scala.inline
  def apply(hardLimit: Integer, name: String, softLimit: Integer): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit, name = name, softLimit = softLimit)
  
    __obj.asInstanceOf[Ulimit]
  }
}

