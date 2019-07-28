package typings.atAngularCompiler.srcAotFormattedUnderscoreErrorMod

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
    val __obj = js.Dynamic.literal(column = column, fileName = fileName, line = line)
  
    __obj.asInstanceOf[Position]
  }
}

