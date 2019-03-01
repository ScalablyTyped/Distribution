package typings
package androiduixLib.androidNs.viewNs.ViewGroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHierarchyChangeListener extends js.Object {
  def onChildViewAdded(parent: androiduixLib.androidNs.viewNs.View, child: androiduixLib.androidNs.viewNs.View): js.Any
  def onChildViewRemoved(parent: androiduixLib.androidNs.viewNs.View, child: androiduixLib.androidNs.viewNs.View): js.Any
}

object OnHierarchyChangeListener {
  @scala.inline
  def apply(
    onChildViewAdded: js.Function2[androiduixLib.androidNs.viewNs.View, androiduixLib.androidNs.viewNs.View, js.Any],
    onChildViewRemoved: js.Function2[androiduixLib.androidNs.viewNs.View, androiduixLib.androidNs.viewNs.View, js.Any]
  ): OnHierarchyChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChildViewAdded")(onChildViewAdded)
    __obj.updateDynamic("onChildViewRemoved")(onChildViewRemoved)
    __obj.asInstanceOf[OnHierarchyChangeListener]
  }
}

