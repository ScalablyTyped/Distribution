package typings.androiduix.android.widget

import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeLayout_ extends ViewGroup {
  var mAllowBrokenMeasureSpecs: js.Any = js.native
  var mBaselineView: js.Any = js.native
  var mContentBounds: js.Any = js.native
  var mDirtyHierarchy: js.Any = js.native
  var mGraph: js.Any = js.native
  var mGravity: js.Any = js.native
  var mHasBaselineAlignedChild: js.Any = js.native
  var mIgnoreGravity: js.Any = js.native
  var mMeasureVerticalWithPaddingMargin: js.Any = js.native
  var mSelfBounds: js.Any = js.native
  var mSortedHorizontalChildren: js.Any = js.native
  var mSortedVerticalChildren: js.Any = js.native
  /* private */ def _measureChild(child: js.Any, params: js.Any, myWidth: js.Any, myHeight: js.Any): js.Any = js.native
  /* private */ def alignBaseline(child: js.Any, params: js.Any): js.Any = js.native
  /* private */ def applyHorizontalSizeRules(childParams: js.Any, myWidth: js.Any, rules: js.Any): js.Any = js.native
  /* private */ def applyVerticalSizeRules(childParams: js.Any, myHeight: js.Any): js.Any = js.native
  /* private */ def getChildMeasureSpec(
    childStart: js.Any,
    childEnd: js.Any,
    childSize: js.Any,
    startMargin: js.Any,
    endMargin: js.Any,
    startPadding: js.Any,
    endPadding: js.Any,
    mySize: js.Any
  ): js.Any = js.native
  def getGravity(): Double = js.native
  /* private */ def getRelatedView(rules: js.Any, relation: js.Any): js.Any = js.native
  /* private */ def getRelatedViewBaseline(rules: js.Any, relation: js.Any): js.Any = js.native
  /* private */ def getRelatedViewParams(rules: js.Any, relation: js.Any): js.Any = js.native
  /* private */ def measureChildHorizontal(child: js.Any, params: js.Any, myWidth: js.Any, myHeight: js.Any): js.Any = js.native
  /* private */ def positionChildHorizontal(child: js.Any, params: js.Any, myWidth: js.Any, wrapContent: js.Any): js.Any = js.native
  /* private */ def positionChildVertical(child: js.Any, params: js.Any, myHeight: js.Any, wrapContent: js.Any): js.Any = js.native
  /* private */ def queryCompatibilityModes(): js.Any = js.native
  def setGravity(gravity: Double): Unit = js.native
  def setHorizontalGravity(horizontalGravity: Double): Unit = js.native
  def setIgnoreGravity(viewId: String): Unit = js.native
  def setVerticalGravity(verticalGravity: Double): Unit = js.native
  /* private */ def sortChildren(): js.Any = js.native
}

