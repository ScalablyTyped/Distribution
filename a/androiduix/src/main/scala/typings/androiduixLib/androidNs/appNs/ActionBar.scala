package typings
package androiduixLib.androidNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.ActionBar")
@js.native
class ActionBar protected ()
  extends androiduixLib.androidNs.widgetNs.FrameLayout {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: js.Any) = this()
  var mActionLeft: js.Any = js.native
  var mActionRight: js.Any = js.native
  var mCenterLayout: js.Any = js.native
  var mCustomView: js.Any = js.native
  var mSubTitleView: js.Any = js.native
  var mTitleView: js.Any = js.native
  def getCustomView(): androiduixLib.androidNs.viewNs.View = js.native
  def getSubtitle(): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def hide(): scala.Unit = js.native
  def hideActionLeft(): scala.Unit = js.native
  def hideActionRight(): scala.Unit = js.native
  def isShowing(): scala.Boolean = js.native
  def setActionLeft(
    name: java.lang.String,
    icon: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    listener: androiduixLib.androidNs.viewNs.ViewNs.OnClickListener
  ): scala.Unit = js.native
  def setActionRight(
    name: java.lang.String,
    icon: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    listener: androiduixLib.androidNs.viewNs.ViewNs.OnClickListener
  ): scala.Unit = js.native
  def setCustomView(view: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setCustomView(
    view: androiduixLib.androidNs.viewNs.View,
    layoutParams: androiduixLib.androidNs.viewNs.ViewGroupNs.MarginLayoutParams
  ): scala.Unit = js.native
  def setIcon(icon: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setLogo(logo: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setSubtitle(subtitle: java.lang.String): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

