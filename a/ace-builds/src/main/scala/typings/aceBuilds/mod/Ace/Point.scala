package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var column: Double
  var row: Double
}

object Point {
  @scala.inline
  def apply(column: Double, row: Double): Point = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Point]
  }
}

