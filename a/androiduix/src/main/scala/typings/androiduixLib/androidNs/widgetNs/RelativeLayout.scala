package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RelativeLayout")
@js.native
class RelativeLayout protected ()
  extends androiduixLib.androidNs.viewNs.ViewGroup {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
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
  def getGravity(): scala.Double = js.native
  /* private */ def getRelatedView(rules: js.Any, relation: js.Any): js.Any = js.native
  /* private */ def getRelatedViewBaseline(rules: js.Any, relation: js.Any): js.Any = js.native
  /* private */ def getRelatedViewParams(rules: js.Any, relation: js.Any): js.Any = js.native
  /* private */ def measureChildHorizontal(child: js.Any, params: js.Any, myWidth: js.Any, myHeight: js.Any): js.Any = js.native
  /* private */ def positionChildHorizontal(child: js.Any, params: js.Any, myWidth: js.Any, wrapContent: js.Any): js.Any = js.native
  /* private */ def positionChildVertical(child: js.Any, params: js.Any, myHeight: js.Any, wrapContent: js.Any): js.Any = js.native
  /* private */ def queryCompatibilityModes(): js.Any = js.native
  def setGravity(gravity: scala.Double): scala.Unit = js.native
  def setHorizontalGravity(horizontalGravity: scala.Double): scala.Unit = js.native
  def setIgnoreGravity(viewId: java.lang.String): scala.Unit = js.native
  def setVerticalGravity(verticalGravity: scala.Double): scala.Unit = js.native
  /* private */ def sortChildren(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.RelativeLayout")
@js.native
object RelativeLayout extends js.Object {
  var ABOVE: scala.Double = js.native
  var ALIGN_BASELINE: scala.Double = js.native
  var ALIGN_BOTTOM: scala.Double = js.native
  var ALIGN_END: scala.Double = js.native
  var ALIGN_LEFT: scala.Double = js.native
  var ALIGN_PARENT_BOTTOM: scala.Double = js.native
  var ALIGN_PARENT_END: scala.Double = js.native
  var ALIGN_PARENT_LEFT: scala.Double = js.native
  var ALIGN_PARENT_RIGHT: scala.Double = js.native
  var ALIGN_PARENT_START: scala.Double = js.native
  var ALIGN_PARENT_TOP: scala.Double = js.native
  var ALIGN_RIGHT: scala.Double = js.native
  var ALIGN_START: scala.Double = js.native
  var ALIGN_TOP: scala.Double = js.native
  var BELOW: scala.Double = js.native
  var CENTER_HORIZONTAL: scala.Double = js.native
  var CENTER_IN_PARENT: scala.Double = js.native
  var CENTER_VERTICAL: scala.Double = js.native
  var DEFAULT_WIDTH: js.Any = js.native
  var END_OF: scala.Double = js.native
  var LEFT_OF: scala.Double = js.native
  var RIGHT_OF: scala.Double = js.native
  var RULES_HORIZONTAL: js.Any = js.native
  var RULES_VERTICAL: js.Any = js.native
  var START_OF: scala.Double = js.native
  var TRUE: java.lang.String = js.native
  var VERB_COUNT: scala.Double = js.native
  /* private */ def centerHorizontal(child: js.Any, params: js.Any, myWidth: js.Any): js.Any = js.native
  /* private */ def centerVertical(child: js.Any, params: js.Any, myHeight: js.Any): js.Any = js.native
}

