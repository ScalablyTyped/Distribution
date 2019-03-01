package typings
package appdmgLib.appdmgMod.appdmgNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basepath")(basepath)
    __obj.updateDynamic("specification")(specification)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Options]
  }
}

