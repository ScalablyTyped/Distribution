package typings.ace

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AceAjaxNs {
  type CompletionCallback = js.Function2[/* error */ Error, /* results */ js.Array[Completion], Unit]
}
