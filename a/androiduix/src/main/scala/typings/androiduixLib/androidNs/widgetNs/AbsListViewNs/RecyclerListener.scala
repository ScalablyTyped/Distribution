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
  def apply(onMovedToScrapHeap: js.Function1[androiduixLib.androidNs.viewNs.View, scala.Unit]): RecyclerListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMovedToScrapHeap")(onMovedToScrapHeap)
    __obj.asInstanceOf[RecyclerListener]
  }
}

