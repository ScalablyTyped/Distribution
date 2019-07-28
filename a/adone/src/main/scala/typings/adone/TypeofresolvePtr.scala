package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofresolvePtr extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[String]]
}

object TypeofresolvePtr {
  @scala.inline
  def apply(__promisify__ : String => js.Promise[js.Array[String]]): TypeofresolvePtr = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[TypeofresolvePtr]
  }
}

