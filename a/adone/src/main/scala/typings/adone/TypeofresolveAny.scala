package typings.adone

import typings.node.dnsMod.AnyRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofresolveAny extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[AnyRecord]]
}

object TypeofresolveAny {
  @scala.inline
  def apply(__promisify__ : String => js.Promise[js.Array[AnyRecord]]): TypeofresolveAny = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[TypeofresolveAny]
  }
}

