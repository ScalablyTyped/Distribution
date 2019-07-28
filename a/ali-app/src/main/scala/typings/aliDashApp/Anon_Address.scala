package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var name: String
}

object Anon_Address {
  @scala.inline
  def apply(address: String, name: String): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, name = name)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

