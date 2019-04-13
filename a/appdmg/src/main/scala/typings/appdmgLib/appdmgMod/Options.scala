package typings
package appdmgLib.appdmgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var basepath: java.lang.String
  var specification: Specification
  var target: java.lang.String
}

object Options {
  @scala.inline
  def apply(basepath: java.lang.String, specification: Specification, target: java.lang.String): Options = {
    val __obj = js.Dynamic.literal(basepath = basepath, specification = specification, target = target)
  
    __obj.asInstanceOf[Options]
  }
}

