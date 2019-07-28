package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofresolveTxt extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[js.Array[String]]]
}

object TypeofresolveTxt {
  @scala.inline
  def apply(__promisify__ : String => js.Promise[js.Array[js.Array[String]]]): TypeofresolveTxt = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[TypeofresolveTxt]
  }
}

