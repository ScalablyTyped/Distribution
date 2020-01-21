package typings.atom.statusBarMod

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
  var priority: Double
}

object AddTileOptions {
  @scala.inline
  def apply(item: js.Object, priority: Double): AddTileOptions = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddTileOptions]
  }
}

