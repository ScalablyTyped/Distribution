package typings
package androiduixLib.androidNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertController")
@js.native
class AlertController protected () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context, di: androiduixLib.androidNs.contentNs.DialogInterface, window: androiduixLib.androidNs.viewNs.Window) = this()
  var mAdapter: js.Any = js.native
  var mAlertDialogLayout: js.Any = js.native
  var mButtonHandler: androiduixLib.androidNs.viewNs.ViewNs.OnClickListener = js.native
  var mButtonNegative: js.Any = js.native
  var mButtonNegativeMessage: js.Any = js.native
  var mButtonNegativeText: js.Any = js.native
  var mButtonNeutral: js.Any = js.native
  var mButtonNeutralMessage: js.Any = js.native
  var mButtonNeutralText: js.Any = js.native
  var mButtonPositive: js.Any = js.native
  var mButtonPositiveMessage: js.Any = js.native
  var mButtonPositiveText: js.Any = js.native
  var mCheckedItem: js.Any = js.native
  var mContext: js.Any = js.native
  var mCustomTitleView: js.Any = js.native
  var mDialogInterface: js.Any = js.native
  var mForceInverseBackground: js.Any = js.native
  var mHandler: js.Any = js.native
  var mIcon: js.Any = js.native
  var mIconView: js.Any = js.native
  var mListItemLayout: js.Any = js.native
  var mListLayout: js.Any = js.native
  var mListView: js.Any = js.native
  var mMessage: js.Any = js.native
  var mMessageView: js.Any = js.native
  var mMultiChoiceItemLayout: js.Any = js.native
  var mScrollView: js.Any = js.native
  var mSingleChoiceItemLayout: js.Any = js.native
  var mTitle: js.Any = js.native
  var mTitleView: js.Any = js.native
  var mView: js.Any = js.native
  var mViewSpacingBottom: js.Any = js.native
  var mViewSpacingLeft: js.Any = js.native
  var mViewSpacingRight: js.Any = js.native
  var mViewSpacingSpecified: js.Any = js.native
  var mViewSpacingTop: js.Any = js.native
  var mWindow: js.Any = js.native
  /* private */ def centerButton(button: js.Any): js.Any = js.native
  def getButton(whichButton: scala.Double): androiduixLib.androidNs.widgetNs.Button = js.native
  def getListView(): androiduixLib.androidNs.widgetNs.ListView = js.native
  def installContent(): scala.Unit = js.native
  def onKeyDown(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def onKeyUp(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* private */ def setBackground(
    topPanel: js.Any,
    contentPanel: js.Any,
    customPanel: js.Any,
    hasButtons: js.Any,
    hasTitle: js.Any,
    buttonPanel: js.Any
  ): js.Any = js.native
  def setButton(
    whichButton: scala.Double,
    text: java.lang.String,
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener,
    msg: androiduixLib.androidNs.osNs.Message
  ): scala.Unit = js.native
  def setCustomTitle(customTitleView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setIcon(icon: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setInverseBackgroundForced(forceInverseBackground: scala.Boolean): scala.Unit = js.native
  def setMessage(message: java.lang.String): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setView(view: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setView(view: androiduixLib.androidNs.viewNs.View, viewSpacingLeft: scala.Double): scala.Unit = js.native
  def setView(
    view: androiduixLib.androidNs.viewNs.View,
    viewSpacingLeft: scala.Double,
    viewSpacingTop: scala.Double
  ): scala.Unit = js.native
  def setView(
    view: androiduixLib.androidNs.viewNs.View,
    viewSpacingLeft: scala.Double,
    viewSpacingTop: scala.Double,
    viewSpacingRight: scala.Double
  ): scala.Unit = js.native
  def setView(
    view: androiduixLib.androidNs.viewNs.View,
    viewSpacingLeft: scala.Double,
    viewSpacingTop: scala.Double,
    viewSpacingRight: scala.Double,
    viewSpacingBottom: scala.Double
  ): scala.Unit = js.native
  /* private */ def setupButtons(): js.Any = js.native
  /* private */ def setupContent(contentPanel: js.Any): js.Any = js.native
  /* private */ def setupTitle(topPanel: js.Any): js.Any = js.native
  /* private */ def setupView(): js.Any = js.native
}

/* static members */
@JSGlobal("android.app.AlertController")
@js.native
object AlertController extends js.Object {
  /* private */ def shouldCenterSingleButton(context: js.Any): js.Any = js.native
}

