package typings
package atomLib.statusDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTileOptions extends js.Object {
  /**
    *  A DOM element, a jQuery object, or a model object for which a view provider
    *  has been registered in the the view registry.
    */
  var item: js.Object
  /**
    *  Determines the placement of the tile within the status bar. Lower priority
    *  will result in closer placement to the anchor.
    */
  var priority: scala.Double
}

object AddTileOptions {
  @scala.inline
  def apply(item: js.Object, priority: scala.Double): AddTileOptions = {
    val __obj = js.Dynamic.literal(item = item, priority = priority)
  
    __obj.asInstanceOf[AddTileOptions]
  }
}

