package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grid extends js.Object {
  var grid: propDashTypesLib.propDashTypesMod.Requireable[_]
  var itemLayout: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
}

object Anon_Grid {
  @scala.inline
  def apply(
    grid: propDashTypesLib.propDashTypesMod.Requireable[_],
    itemLayout: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  ): Anon_Grid = {
    val __obj = js.Dynamic.literal(grid = grid, itemLayout = itemLayout)
  
    __obj.asInstanceOf[Anon_Grid]
  }
}

