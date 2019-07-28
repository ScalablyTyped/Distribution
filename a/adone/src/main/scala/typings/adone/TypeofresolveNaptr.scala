package typings.adone

import typings.node.dnsMod.NaptrRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofresolveNaptr extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[NaptrRecord]]
}

object TypeofresolveNaptr {
  @scala.inline
  def apply(__promisify__ : String => js.Promise[js.Array[NaptrRecord]]): TypeofresolveNaptr = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[TypeofresolveNaptr]
  }
}

