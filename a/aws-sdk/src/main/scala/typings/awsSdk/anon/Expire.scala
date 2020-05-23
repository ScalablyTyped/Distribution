package typings.awsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expire extends js.Object {
  var Address: String = js.native
  var Expire: Double = js.native
}

object Expire {
  @scala.inline
  def apply(Address: String, Expire: Double): Expire = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Expire = Expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expire]
  }
}

