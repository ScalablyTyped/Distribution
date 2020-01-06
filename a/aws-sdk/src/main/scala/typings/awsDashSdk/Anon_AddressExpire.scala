package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddressExpire extends js.Object {
  var Address: String = js.native
  var Expire: Double = js.native
}

object Anon_AddressExpire {
  @scala.inline
  def apply(Address: String, Expire: Double): Anon_AddressExpire = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Expire = Expire.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AddressExpire]
  }
}

