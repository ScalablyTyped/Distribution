package typings.adone

import typings.node.Anon_Hostname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoflookupService extends js.Object {
  def __promisify__(address: String, port: Double): js.Promise[Anon_Hostname]
}

object TypeoflookupService {
  @scala.inline
  def apply(__promisify__ : (String, Double) => js.Promise[Anon_Hostname]): TypeoflookupService = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction2(__promisify__))
  
    __obj.asInstanceOf[TypeoflookupService]
  }
}

