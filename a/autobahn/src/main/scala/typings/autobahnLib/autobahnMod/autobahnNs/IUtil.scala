package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtil extends js.Object {
  def assert(condition: scala.Boolean, message: java.lang.String): scala.Unit
}

object IUtil {
  @scala.inline
  def apply(assert: js.Function2[scala.Boolean, java.lang.String, scala.Unit]): IUtil = {
    val __obj = js.Dynamic.literal(assert = assert)
  
    __obj.asInstanceOf[IUtil]
  }
}

