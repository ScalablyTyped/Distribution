package typings.androiduix.android.widget.RelativeLayout

import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParams extends MarginLayoutParams {
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

