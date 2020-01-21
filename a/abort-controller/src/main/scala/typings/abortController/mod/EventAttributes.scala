package typings.abortController.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAttributes extends js.Object {
  var onabort: js.Any
}

object EventAttributes {
  @scala.inline
  def apply(onabort: js.Any): EventAttributes = {
    val __obj = js.Dynamic.literal(onabort = onabort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventAttributes]
  }
}

