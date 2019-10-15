package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionBeforeAddEvent extends js.Object {
  var cancellable: Boolean
  var defaultPrevented: Boolean
  var item: js.Any
  var preventDefault: js.Function
}

object CollectionBeforeAddEvent {
  @scala.inline
  def apply(cancellable: Boolean, defaultPrevented: Boolean, item: js.Any, preventDefault: js.Function): CollectionBeforeAddEvent = {
    val __obj = js.Dynamic.literal(cancellable = cancellable, defaultPrevented = defaultPrevented, item = item, preventDefault = preventDefault)
  
    __obj.asInstanceOf[CollectionBeforeAddEvent]
  }
}

