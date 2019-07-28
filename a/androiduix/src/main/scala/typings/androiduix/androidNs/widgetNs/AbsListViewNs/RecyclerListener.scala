package typings.androiduix.androidNs.widgetNs.AbsListViewNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecyclerListener extends js.Object {
  def onMovedToScrapHeap(view: View): Unit
}

object RecyclerListener {
  @scala.inline
  def apply(onMovedToScrapHeap: View => Unit): RecyclerListener = {
    val __obj = js.Dynamic.literal(onMovedToScrapHeap = js.Any.fromFunction1(onMovedToScrapHeap))
  
    __obj.asInstanceOf[RecyclerListener]
  }
}

