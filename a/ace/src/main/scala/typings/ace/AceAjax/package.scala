package typings.ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AceAjax {
  type CompletionCallback = js.Function2[
    /* error */ typings.std.Error, 
    /* results */ js.Array[typings.ace.AceAjax.Completion], 
    scala.Unit
  ]
}
