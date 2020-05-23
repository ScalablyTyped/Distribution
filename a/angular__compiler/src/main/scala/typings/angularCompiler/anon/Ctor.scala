package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ctor extends js.Object {
  var ctor: js.Any
  var filePath: String
  var name: String
}

object Ctor {
  @scala.inline
  def apply(ctor: js.Any, filePath: String, name: String): Ctor = {
    val __obj = js.Dynamic.literal(ctor = ctor.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctor]
  }
}

