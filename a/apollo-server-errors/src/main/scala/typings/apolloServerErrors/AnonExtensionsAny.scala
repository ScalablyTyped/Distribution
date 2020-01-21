package typings.apolloServerErrors

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensionsAny extends js.Object {
  var extensions: Record[String, _]
}

object AnonExtensionsAny {
  @scala.inline
  def apply(extensions: Record[String, _]): AnonExtensionsAny = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExtensionsAny]
  }
}

