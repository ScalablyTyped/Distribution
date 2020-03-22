package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpire extends js.Object {
  var Address: String = js.native
  var Expire: Double = js.native
}

object AnonExpire {
  @scala.inline
  def apply(Address: String, Expire: Double): AnonExpire = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Expire = Expire.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpire]
  }
}

