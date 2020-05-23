package typings.angularCore.anon

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directives extends js.Object {
  var directives: Set[_]
  var pipes: Set[_]
}

object Directives {
  @scala.inline
  def apply(directives: Set[_], pipes: Set[_]): Directives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
}

