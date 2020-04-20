package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ulimit extends js.Object {
  /**
    * The hard limit for the ulimit type.
    */
  var hardLimit: Integer = js.native
  /**
    * The type of the ulimit.
    */
  var name: String = js.native
  /**
    * The soft limit for the ulimit type.
    */
  var softLimit: Integer = js.native
}

object Ulimit {
  @scala.inline
  def apply(hardLimit: Integer, name: String, softLimit: Integer): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], softLimit = softLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ulimit]
  }
}

