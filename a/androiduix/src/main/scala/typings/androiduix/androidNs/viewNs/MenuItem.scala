package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.contentNs.Intent
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.viewNs.MenuItemNs.OnMenuItemClickListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.MenuItem")
@js.native
class MenuItem protected () extends js.Object {
  def this(menu: Menu, group: Double, id: Double, categoryOrder: Double, ordering: Double, title: String) = this()
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
  def getGroupId(): Double = js.native
  def getIcon(): Drawable = js.native
  def getIntent(): Intent = js.native
  def getItemId(): Double = js.native
  def getOrder(): Double = js.native
  def getTitle(): String = js.native
  def invoke(): Boolean = js.native
  def isEnabled(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def setActionView(view: View): MenuItem = js.native
  def setEnabled(enabled: Boolean): MenuItem = js.native
  def setIcon(icon: Drawable): MenuItem = js.native
  def setIntent(intent: Intent): MenuItem = js.native
  def setOnMenuItemClickListener(menuItemClickListener: OnMenuItemClickListener): MenuItem = js.native
  def setTitle(title: String): MenuItem = js.native
  def setVisible(visible: Boolean): MenuItem = js.native
}

