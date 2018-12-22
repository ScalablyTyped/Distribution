package typings
package androiduixLib.androidNs.widgetNs.RelativeLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RelativeLayout.LayoutParams")
@js.native
class LayoutParams protected ()
  extends androiduixLib.androidNs.viewNs.ViewGroupNs.MarginLayoutParams {
  def this(source: LayoutParams | androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams) = this()
  def this(source: androiduixLib.androidNs.viewNs.ViewGroupNs.MarginLayoutParams) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, attrs: stdLib.HTMLElement) = this()
  def this(w: scala.Double, h: scala.Double) = this()
  var alignWithParent: scala.Boolean = js.native
  var mBottom: scala.Double = js.native
  var mEnd: js.Any = js.native
  var mInitialRules: js.Any = js.native
  var mIsRtlCompatibilityMode: js.Any = js.native
  var mLeft: scala.Double = js.native
  var mRight: scala.Double = js.native
  var mRules: js.Any = js.native
  var mRulesChanged: js.Any = js.native
  var mStart: js.Any = js.native
  var mTop: scala.Double = js.native
  def addRule(verb: scala.Double): scala.Unit = js.native
  def addRule(verb: scala.Double, anchor: java.lang.String): scala.Unit = js.native
  def getRules(): js.Array[java.lang.String] = js.native
  def getRules(layoutDirection: scala.Double): js.Array[java.lang.String] = js.native
  /* private */ def hasRelativeRules(): js.Any = js.native
  def removeRule(verb: scala.Double): scala.Unit = js.native
  /* private */ def resolveRules(layoutDirection: js.Any): js.Any = js.native
}

