package typings
package androiduixLib.androidNs.widgetNs.AbsListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecyclerListener extends js.Object {
  def onMovedToScrapHeap(view: androiduixLib.androidNs.viewNs.View): scala.Unit
}

object RecyclerListener {
  @scala.inline
  def apply(onMovedToScrapHeap: androiduixLib.androidNs.viewNs.View => scala.Unit): RecyclerListener = {
    val __obj = js.Dynamic.literal(onMovedToScrapHeap = js.Any.fromFunction1(onMovedToScrapHeap))
  
    __obj.asInstanceOf[RecyclerListener]
  }
}

