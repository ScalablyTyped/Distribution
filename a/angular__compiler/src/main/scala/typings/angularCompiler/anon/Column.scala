package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: Double | Null
  var line: Double | Null
}

object Column {
  @scala.inline
  def apply(column: Double = null.asInstanceOf[Double], line: Double = null.asInstanceOf[Double]): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

