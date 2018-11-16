package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.MenuItem")
@js.native
class MenuItem protected () extends js.Object {
  def this(menu: Menu, group: scala.Double, id: scala.Double, categoryOrder: scala.Double, ordering: scala.Double, title: java.lang.String) = this()
  var mActionView: js.Any = js.native
  var mCategoryOrder: js.Any = js.native
  var mClickListener: js.Any = js.native
  var mEnable: js.Any = js.native
  var mGroup: js.Any = js.native
  var mIconDrawable: js.Any = js.native
  var mId: js.Any = js.native
  var mIntent: js.Any = js.native
  var mMenu: js.Any = js.native
  var mOrdering: js.Any = js.native
  var mTitle: js.Any = js.native
  var mVisible: js.Any = js.native
  def getActionView(): View = js.native
  def getGroupId(): scala.Double = js.native
  def getIcon(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getIntent(): androiduixLib.androidNs.contentNs.Intent = js.native
  def getItemId(): scala.Double = js.native
  def getOrder(): scala.Double = js.native
  def getTitle(): java.lang.String = js.native
  def invoke(): scala.Boolean = js.native
  def isEnabled(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def setActionView(view: View): MenuItem = js.native
  def setEnabled(enabled: scala.Boolean): MenuItem = js.native
  def setIcon(icon: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): MenuItem = js.native
  def setIntent(intent: androiduixLib.androidNs.contentNs.Intent): MenuItem = js.native
  def setOnMenuItemClickListener(menuItemClickListener: androiduixLib.androidNs.viewNs.MenuItemNs.OnMenuItemClickListener): MenuItem = js.native
  def setTitle(title: java.lang.String): MenuItem = js.native
  def setVisible(visible: scala.Boolean): MenuItem = js.native
}

