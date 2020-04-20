package typings.angularCompiler.formattedErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: Double
  var fileName: String
  var line: Double
}

object Position {
  @scala.inline
  def apply(column: Double, fileName: String, line: Double): Position = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

