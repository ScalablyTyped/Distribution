package typings.angularCore

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectives extends js.Object {
  var directives: Set[_]
  var pipes: Set[_]
}

object AnonDirectives {
  @scala.inline
  def apply(directives: Set[_], pipes: Set[_]): AnonDirectives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectives]
  }
}

