package typings.atom

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  var target: String | Node
}

object Anon_Target {
  @scala.inline
  def apply(target: String | Node): Anon_Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Target]
  }
}

