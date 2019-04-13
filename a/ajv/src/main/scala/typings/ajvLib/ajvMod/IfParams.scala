package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfParams extends ErrorParameters {
  var failingKeyword: java.lang.String
}

object IfParams {
  @scala.inline
  def apply(failingKeyword: java.lang.String): IfParams = {
    val __obj = js.Dynamic.literal(failingKeyword = failingKeyword)
  
    __obj.asInstanceOf[IfParams]
  }
}

