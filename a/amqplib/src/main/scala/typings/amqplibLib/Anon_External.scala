package typings
package amqplibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_External extends js.Object {
  def external(): Anon_Mechanism
  def plain(username: java.lang.String, password: java.lang.String): Anon_MechanismPassword
}

object Anon_External {
  @scala.inline
  def apply(
    external: () => Anon_Mechanism,
    plain: (java.lang.String, java.lang.String) => Anon_MechanismPassword
  ): Anon_External = {
    val __obj = js.Dynamic.literal(external = js.Any.fromFunction0(external), plain = js.Any.fromFunction2(plain))
  
    __obj.asInstanceOf[Anon_External]
  }
}

