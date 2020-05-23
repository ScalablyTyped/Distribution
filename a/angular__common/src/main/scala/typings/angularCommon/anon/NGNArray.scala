package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NGNArray extends js.Object {
  var NGN: js.Array[String]
}

object NGNArray {
  @scala.inline
  def apply(NGN: js.Array[String]): NGNArray = {
    val __obj = js.Dynamic.literal(NGN = NGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[NGNArray]
  }
}

