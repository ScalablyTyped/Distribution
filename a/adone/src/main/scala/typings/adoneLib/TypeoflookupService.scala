package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoflookupService extends js.Object {
  def __promisify__(address: java.lang.String, port: scala.Double): js.Promise[nodeLib.Anon_Hostname]
}

object TypeoflookupService {
  @scala.inline
  def apply(__promisify__ : (java.lang.String, scala.Double) => js.Promise[nodeLib.Anon_Hostname]): TypeoflookupService = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction2(__promisify__))
  
    __obj.asInstanceOf[TypeoflookupService]
  }
}

