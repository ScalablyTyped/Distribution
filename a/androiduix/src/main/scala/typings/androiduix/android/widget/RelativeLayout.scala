package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.util.ArrayMap
import typings.androiduix.android.util.SparseMap
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.androiduix.android.widget.RelativeLayout.DependencyGraph.Node
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
  @js.native
  class DependencyGraph () extends js.Object {
    var mKeyNodes: SparseMap[String, Node] = js.native
    var mNodes: js.Any = js.native
    var mRoots: js.Any = js.native
    def add(view: View): Unit = js.native
    def clear(): Unit = js.native
    /* private */ def findRoots(rulesFilter: js.Any): js.Any = js.native
    def getSortedViews(sorted: js.Array[View], rules: js.Array[Double]): Unit = js.native
  }
  
  @js.native
  class LayoutParams protected () extends MarginLayoutParams {
    def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
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
  @js.native
  object DependencyGraph extends js.Object {
    @js.native
    class Node () extends js.Object {
      var dependencies: SparseMap[String, Node] = js.native
      var dependents: ArrayMap[Node, DependencyGraph] = js.native
      var view: View = js.native
      def release(): Unit = js.native
    }
    
    /* static members */
    @js.native
    object Node extends js.Object {
      var POOL_LIMIT: js.Any = js.native
      var sPool: js.Any = js.native
      def acquire(view: View): Node = js.native
    }
    
  }
  
}

