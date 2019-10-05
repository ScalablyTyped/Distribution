package typings.androiduix.android.app

import typings.androiduix.android.content.Context
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.OnClickListener
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.androiduix.android.widget.FrameLayout
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.ActionBar")
@js.native
class ActionBar protected () extends FrameLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: js.Any) = this()
  var mActionLeft: js.Any = js.native
  var mActionRight: js.Any = js.native
  var mCenterLayout: js.Any = js.native
  var mCustomView: js.Any = js.native
  var mSubTitleView: js.Any = js.native
  var mTitleView: js.Any = js.native
  def getCustomView(): View = js.native
  def getSubtitle(): String = js.native
  def getTitle(): String = js.native
  def hide(): Unit = js.native
  def hideActionLeft(): Unit = js.native
  def hideActionRight(): Unit = js.native
  def isShowing(): Boolean = js.native
  def setActionLeft(name: String, icon: Drawable, listener: OnClickListener): Unit = js.native
  def setActionRight(name: String, icon: Drawable, listener: OnClickListener): Unit = js.native
  def setCustomView(view: View): Unit = js.native
  def setCustomView(view: View, layoutParams: MarginLayoutParams): Unit = js.native
  def setIcon(icon: Drawable): Unit = js.native
  def setLogo(logo: Drawable): Unit = js.native
  def setSubtitle(subtitle: String): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def show(): Unit = js.native
}

