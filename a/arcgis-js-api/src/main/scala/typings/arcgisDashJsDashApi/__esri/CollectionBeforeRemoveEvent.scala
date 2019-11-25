package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionBeforeRemoveEvent extends js.Object {
  var cancellable: Boolean
  var defaultPrevented: Boolean
  var item: js.Any
  var preventDefault: js.Function
}

object CollectionBeforeRemoveEvent {
  @scala.inline
  def apply(cancellable: Boolean, defaultPrevented: Boolean, item: js.Any, preventDefault: js.Function): CollectionBeforeRemoveEvent = {
    val __obj = js.Dynamic.literal(cancellable = cancellable.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollectionBeforeRemoveEvent]
  }
}

