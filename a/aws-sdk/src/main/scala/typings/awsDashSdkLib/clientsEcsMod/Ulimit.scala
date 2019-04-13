package typings
package awsDashSdkLib.clientsEcsMod

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
  var name: UlimitName
  /**
    * The soft limit for the ulimit type.
    */
  var softLimit: Integer
}

object Ulimit {
  @scala.inline
  def apply(hardLimit: Integer, name: UlimitName, softLimit: Integer): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit, name = name.asInstanceOf[js.Any], softLimit = softLimit)
  
    __obj.asInstanceOf[Ulimit]
  }
}

