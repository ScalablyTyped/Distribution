package typings.adone

import typings.node.dnsMod.SrvRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofresolveSrv extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[SrvRecord]]
}

object TypeofresolveSrv {
  @scala.inline
  def apply(__promisify__ : String => js.Promise[js.Array[SrvRecord]]): TypeofresolveSrv = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[TypeofresolveSrv]
  }
}

