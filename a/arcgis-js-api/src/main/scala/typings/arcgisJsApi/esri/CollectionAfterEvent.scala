package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionAfterEvent[T] extends js.Object {
  var item: T
}

object CollectionAfterEvent {
  @scala.inline
  def apply[T](item: T): CollectionAfterEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollectionAfterEvent[T]]
  }
}

