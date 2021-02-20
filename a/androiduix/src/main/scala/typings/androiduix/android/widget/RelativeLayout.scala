package typings.androiduix.android.widget

import typings.androiduix.android.util.ArrayMap
import typings.androiduix.android.util.SparseMap
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.androiduix.android.widget.RelativeLayout.DependencyGraph.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeLayout extends ViewGroup {
  
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
object RelativeLayout {
  
  @js.native
  trait DependencyGraph extends StObject {
    
    def add(view: View): Unit = js.native
    
    def clear(): Unit = js.native
    
    /* private */ def findRoots(rulesFilter: js.Any): js.Any = js.native
    
    def getSortedViews(sorted: js.Array[View], rules: js.Array[Double]): Unit = js.native
    
    var mKeyNodes: SparseMap[String, Node] = js.native
    
    var mNodes: js.Any = js.native
    
    var mRoots: js.Any = js.native
  }
  object DependencyGraph {
    
    @scala.inline
    def apply(
      add: View => Unit,
      clear: () => Unit,
      findRoots: js.Any => js.Any,
      getSortedViews: (js.Array[View], js.Array[Double]) => Unit,
      mKeyNodes: SparseMap[String, Node],
      mNodes: js.Any,
      mRoots: js.Any
    ): DependencyGraph = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), findRoots = js.Any.fromFunction1(findRoots), getSortedViews = js.Any.fromFunction2(getSortedViews), mKeyNodes = mKeyNodes.asInstanceOf[js.Any], mNodes = mNodes.asInstanceOf[js.Any], mRoots = mRoots.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyGraph]
    }
    
    @scala.inline
    implicit class DependencyGraphMutableBuilder[Self <: DependencyGraph] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: View => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindRoots(value: js.Any => js.Any): Self = StObject.set(x, "findRoots", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSortedViews(value: (js.Array[View], js.Array[Double]) => Unit): Self = StObject.set(x, "getSortedViews", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMKeyNodes(value: SparseMap[String, Node]): Self = StObject.set(x, "mKeyNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNodes(value: js.Any): Self = StObject.set(x, "mNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMRoots(value: js.Any): Self = StObject.set(x, "mRoots", value.asInstanceOf[js.Any])
    }
    
    @js.native
    trait Node extends StObject {
      
      var dependencies: SparseMap[String, Node] = js.native
      
      var dependents: ArrayMap[Node, DependencyGraph] = js.native
      
      def release(): Unit = js.native
      
      var view: View = js.native
    }
    object Node {
      
      @scala.inline
      def apply(
        dependencies: SparseMap[String, Node],
        dependents: ArrayMap[Node, DependencyGraph],
        release: () => Unit,
        view: View
      ): Node = {
        val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], dependents = dependents.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), view = view.asInstanceOf[js.Any])
        __obj.asInstanceOf[Node]
      }
      
      @scala.inline
      implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDependencies(value: SparseMap[String, Node]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDependents(value: ArrayMap[Node, DependencyGraph]): Self = StObject.set(x, "dependents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
        
        @scala.inline
        def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait LayoutParams extends MarginLayoutParams {
    
    def addRule(verb: Double): Unit = js.native
    def addRule(verb: Double, anchor: String): Unit = js.native
    
    var alignWithParent: Boolean = js.native
    
    def getRules(): js.Array[String] = js.native
    def getRules(layoutDirection: Double): js.Array[String] = js.native
    
    /* private */ def hasRelativeRules(): js.Any = js.native
    
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
    
    def removeRule(verb: Double): Unit = js.native
    
    /* private */ def resolveRules(layoutDirection: js.Any): js.Any = js.native
  }
}
