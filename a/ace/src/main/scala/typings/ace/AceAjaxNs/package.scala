package typings.ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AceAjaxNs {
  import typings.std.Error

  type CompletionCallback = js.Function2[/* error */ Error, /* results */ js.Array[Completion], Unit]
}
