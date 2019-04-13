package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomParams extends ErrorParameters {
  var keyword: java.lang.String
}

object CustomParams {
  @scala.inline
  def apply(keyword: java.lang.String): CustomParams = {
    val __obj = js.Dynamic.literal(keyword = keyword)
  
    __obj.asInstanceOf[CustomParams]
  }
}

