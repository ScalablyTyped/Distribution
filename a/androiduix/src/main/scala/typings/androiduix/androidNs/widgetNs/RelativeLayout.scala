package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.ViewGroup
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RelativeLayout")
@js.native
class RelativeLayout protected () extends ViewGroup {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
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

/* static members */
@JSGlobal("android.widget.RelativeLayout")
@js.native
object RelativeLayout extends js.Object {
  var ABOVE: Double = js.native
  var ALIGN_BASELINE: Double = js.native
  var ALIGN_BOTTOM: Double = js.native
  var ALIGN_END: Double = js.native
  var ALIGN_LEFT: Double = js.native
  var ALIGN_PARENT_BOTTOM: Double = js.native
  var ALIGN_PARENT_END: Double = js.native
  var ALIGN_PARENT_LEFT: Double = js.native
  var ALIGN_PARENT_RIGHT: Double = js.native
  var ALIGN_PARENT_START: Double = js.native
  var ALIGN_PARENT_TOP: Double = js.native
  var ALIGN_RIGHT: Double = js.native
  var ALIGN_START: Double = js.native
  var ALIGN_TOP: Double = js.native
  var BELOW: Double = js.native
  var CENTER_HORIZONTAL: Double = js.native
  var CENTER_IN_PARENT: Double = js.native
  var CENTER_VERTICAL: Double = js.native
  var DEFAULT_WIDTH: js.Any = js.native
  var END_OF: Double = js.native
  var LEFT_OF: Double = js.native
  var RIGHT_OF: Double = js.native
  var RULES_HORIZONTAL: js.Any = js.native
  var RULES_VERTICAL: js.Any = js.native
  var START_OF: Double = js.native
  var TRUE: String = js.native
  var VERB_COUNT: Double = js.native
  /* private */ def centerHorizontal(child: js.Any, params: js.Any, myWidth: js.Any): js.Any = js.native
  /* private */ def centerVertical(child: js.Any, params: js.Any, myHeight: js.Any): js.Any = js.native
}

