package typings.appdmg.appdmgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var basepath: String
  var specification: Specification
  var target: String
}

object Options {
  @scala.inline
  def apply(basepath: String, specification: Specification, target: String): Options = {
    val __obj = js.Dynamic.literal(basepath = basepath.asInstanceOf[js.Any], specification = specification.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

