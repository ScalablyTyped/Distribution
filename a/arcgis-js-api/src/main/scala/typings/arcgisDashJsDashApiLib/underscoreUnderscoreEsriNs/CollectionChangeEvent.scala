package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChangeEvent[T] extends js.Object {
  var added: js.Array[T]
  var moved: js.Array[T]
  var removed: js.Array[T]
}

object CollectionChangeEvent {
  @scala.inline
  def apply[T](added: js.Array[T], moved: js.Array[T], removed: js.Array[T]): CollectionChangeEvent[T] = {
    val __obj = js.Dynamic.literal(added = added, moved = moved, removed = removed)
  
    __obj.asInstanceOf[CollectionChangeEvent[T]]
  }
}

