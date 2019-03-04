package typings
package atAngularCompilerLib.srcAotFormattedUnderscoreErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: scala.Double
  var fileName: java.lang.String
  var line: scala.Double
}

object Position {
  @scala.inline
  def apply(column: scala.Double, fileName: java.lang.String, line: scala.Double): Position = {
    val __obj = js.Dynamic.literal(column = column, fileName = fileName, line = line)
  
    __obj.asInstanceOf[Position]
  }
}

