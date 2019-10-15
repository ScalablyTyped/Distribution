package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionBeforeChangesEvent extends js.Object {
  var cancellable: Boolean
  var defaultPrevented: Boolean
  var item: js.Any
  var preventDefault: js.Function
}

object CollectionBeforeChangesEvent {
  @scala.inline
  def apply(cancellable: Boolean, defaultPrevented: Boolean, item: js.Any, preventDefault: js.Function): CollectionBeforeChangesEvent = {
    val __obj = js.Dynamic.literal(cancellable = cancellable, defaultPrevented = defaultPrevented, item = item, preventDefault = preventDefault)
  
    __obj.asInstanceOf[CollectionBeforeChangesEvent]
  }
}

