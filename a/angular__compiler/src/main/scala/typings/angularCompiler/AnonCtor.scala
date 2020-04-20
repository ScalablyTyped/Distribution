package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCtor extends js.Object {
  var ctor: js.Any
  var filePath: String
  var name: String
}

object AnonCtor {
  @scala.inline
  def apply(ctor: js.Any, filePath: String, name: String): AnonCtor = {
    val __obj = js.Dynamic.literal(ctor = ctor.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCtor]
  }
}

