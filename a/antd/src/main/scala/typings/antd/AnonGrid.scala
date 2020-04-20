package typings.antd

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrid extends js.Object {
  var grid: Requireable[_]
  var itemLayout: Requireable[String]
}

object AnonGrid {
  @scala.inline
  def apply(grid: Requireable[_], itemLayout: Requireable[String]): AnonGrid = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], itemLayout = itemLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrid]
  }
}

