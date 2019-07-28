package typings.androiduix.androidNs.viewNs.ViewGroupNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHierarchyChangeListener extends js.Object {
  def onChildViewAdded(parent: View, child: View): js.Any
  def onChildViewRemoved(parent: View, child: View): js.Any
}

object OnHierarchyChangeListener {
  @scala.inline
  def apply(onChildViewAdded: (View, View) => js.Any, onChildViewRemoved: (View, View) => js.Any): OnHierarchyChangeListener = {
    val __obj = js.Dynamic.literal(onChildViewAdded = js.Any.fromFunction2(onChildViewAdded), onChildViewRemoved = js.Any.fromFunction2(onChildViewRemoved))
  
    __obj.asInstanceOf[OnHierarchyChangeListener]
  }
}

