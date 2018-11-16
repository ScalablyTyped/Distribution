package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.Menu")
@js.native
class Menu protected () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  var mCallback: js.Any = js.native
  var mContext: js.Any = js.native
  var mItems: js.Any = js.native
  var mVisibleItems: js.Any = js.native
  def add(groupId: scala.Double, itemId: scala.Double, order: scala.Double, title: java.lang.String): MenuItem = js.native
  def add(title: java.lang.String): MenuItem = js.native
  /* private */ def addInternal(group: js.Any, id: js.Any, categoryOrder: js.Any, title: js.Any): js.Any = js.native
  def clear(): scala.Unit = js.native
  def dispatchMenuItemSelected(menu: Menu, item: MenuItem): scala.Boolean = js.native
  def findGroupIndex(group: scala.Double): scala.Double = js.native
  def findGroupIndex(group: scala.Double, start: scala.Double): scala.Double = js.native
  def findItem(id: scala.Double): MenuItem = js.native
  def findItemIndex(id: scala.Double): scala.Double = js.native
  def getContext(): androiduixLib.androidNs.contentNs.Context = js.native
  def getItem(index: scala.Double): MenuItem = js.native
  def getRootMenu(): Menu = js.native
  def getVisibleItems(): androiduixLib.javaNs.utilNs.ArrayList[MenuItem] = js.native
  def hasVisibleItems(): scala.Boolean = js.native
  def onItemsChanged(structureChanged: scala.Boolean): scala.Unit = js.native
  def removeGroup(groupId: scala.Double): scala.Unit = js.native
  def removeItem(id: scala.Double): scala.Unit = js.native
  /* private */ def removeItemAtInt(index: js.Any, updateChildrenOnMenuViews: js.Any): js.Any = js.native
  def setCallback(cb: androiduixLib.androidNs.viewNs.MenuNs.Callback): scala.Unit = js.native
  def setGroupEnabled(group: scala.Double, enabled: scala.Boolean): scala.Unit = js.native
  def setGroupVisible(group: scala.Double, visible: scala.Boolean): scala.Unit = js.native
  def size(): scala.Double = js.native
}

