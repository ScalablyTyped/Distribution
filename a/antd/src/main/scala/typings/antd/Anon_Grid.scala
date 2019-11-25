package typings.antd

import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grid extends js.Object {
  var grid: Requireable[_]
  var itemLayout: Requireable[String]
}

object Anon_Grid {
  @scala.inline
  def apply(grid: Requireable[_], itemLayout: Requireable[String]): Anon_Grid = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], itemLayout = itemLayout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Grid]
  }
}

