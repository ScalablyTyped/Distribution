package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddressExpire extends js.Object {
  var Address: String = js.native
  var Expire: Double = js.native
}

object AnonAddressExpire {
  @scala.inline
  def apply(Address: String, Expire: Double): AnonAddressExpire = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Expire = Expire.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddressExpire]
  }
}

