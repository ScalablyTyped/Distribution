package typings.androiduix.androidNs.widgetNs.RelativeLayoutNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.ViewGroupNs.MarginLayoutParams
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RelativeLayout.LayoutParams")
@js.native
class LayoutParams protected () extends MarginLayoutParams {
  def this(source: typings.androiduix.androidNs.viewNs.ViewGroupNs.LayoutParams) = this()
  def this(source: MarginLayoutParams) = this()
  def this(source: LayoutParams) = this()
  def this(context: Context, attrs: HTMLElement) = this()
  def this(w: Double, h: Double) = this()
  var alignWithParent: Boolean = js.native
  var mBottom: Double = js.native
  var mEnd: js.Any = js.native
  var mInitialRules: js.Any = js.native
  var mIsRtlCompatibilityMode: js.Any = js.native
  var mLeft: Double = js.native
  var mRight: Double = js.native
  var mRules: js.Any = js.native
  var mRulesChanged: js.Any = js.native
  var mStart: js.Any = js.native
  var mTop: Double = js.native
  def addRule(verb: Double): Unit = js.native
  def addRule(verb: Double, anchor: String): Unit = js.native
  def getRules(): js.Array[String] = js.native
  def getRules(layoutDirection: Double): js.Array[String] = js.native
  /* private */ def hasRelativeRules(): js.Any = js.native
  def removeRule(verb: Double): Unit = js.native
  /* private */ def resolveRules(layoutDirection: js.Any): js.Any = js.native
}

