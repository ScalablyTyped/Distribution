package typings
package antdLib.libListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListState extends js.Object {
  var paginationCurrent: scala.Double
  var paginationSize: scala.Double
}

object ListState {
  @scala.inline
  def apply(paginationCurrent: scala.Double, paginationSize: scala.Double): ListState = {
    val __obj = js.Dynamic.literal(paginationCurrent = paginationCurrent, paginationSize = paginationSize)
  
    __obj.asInstanceOf[ListState]
  }
}

