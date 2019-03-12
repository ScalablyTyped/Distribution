package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  def __promisify__(address: java.lang.String, port: scala.Double): js.Promise[nodeLib.Anon_Hostname]
}

object Anon_Address {
  @scala.inline
  def apply(__promisify__ : (java.lang.String, scala.Double) => js.Promise[nodeLib.Anon_Hostname]): Anon_Address = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction2(__promisify__))
  
    __obj.asInstanceOf[Anon_Address]
  }
}

