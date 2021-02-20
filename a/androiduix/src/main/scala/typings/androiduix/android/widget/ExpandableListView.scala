package typings.androiduix.android.widget

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.ExpandableListView.OnChildClickListener
import typings.androiduix.android.widget.ExpandableListView.OnGroupClickListener
import typings.androiduix.android.widget.ExpandableListView.OnGroupCollapseListener
import typings.androiduix.android.widget.ExpandableListView.OnGroupExpandListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandableListView extends ListView {
  
  def collapseGroup(groupPos: Double): Boolean = js.native
  
  def expandGroup(groupPos: Double): Boolean = js.native
  def expandGroup(groupPos: Double, animate: Boolean): Boolean = js.native
  
  /* private */ def getAbsoluteFlatPosition(flatListPosition: js.Any): js.Any = js.native
  
  /* private */ def getChildOrGroupId(position: js.Any): js.Any = js.native
  
  def getExpandableListAdapter(): ExpandableListAdapter = js.native
  
  def getExpandableListPosition(flatListPosition: Double): Double = js.native
  
  def getFlatListPosition(packedPosition: Double): Double = js.native
  
  /* private */ def getFlatPositionForConnector(flatListPosition: js.Any): js.Any = js.native
  
  /* private */ def getIndicator(pos: js.Any): js.Any = js.native
  
  def getSelectedId(): Double = js.native
  
  def getSelectedPosition(): Double = js.native
  
  def handleItemClick(v: View, position: Double, id: Double): Boolean = js.native
  
  /* private */ def hasRtlSupport(): js.Any = js.native
  
  def isGroupExpanded(groupPosition: Double): Boolean = js.native
  
  /* private */ def isHeaderOrFooterPosition(position: js.Any): js.Any = js.native
  
  /* private */ def isRtlCompatibilityMode(): js.Any = js.native
  
  var mChildDivider: js.Any = js.native
  
  var mChildIndicator: js.Any = js.native
  
  var mChildIndicatorEnd: js.Any = js.native
  
  var mChildIndicatorLeft: js.Any = js.native
  
  var mChildIndicatorRight: js.Any = js.native
  
  var mChildIndicatorStart: js.Any = js.native
  
  var mConnector: js.Any = js.native
  
  var mExpandAdapter: js.Any = js.native
  
  var mGroupIndicator: js.Any = js.native
  
  var mIndicatorEnd: js.Any = js.native
  
  var mIndicatorLeft: js.Any = js.native
  
  var mIndicatorRect: js.Any = js.native
  
  var mIndicatorRight: js.Any = js.native
  
  var mIndicatorStart: js.Any = js.native
  
  var mOnChildClickListener: js.Any = js.native
  
  var mOnGroupClickListener: js.Any = js.native
  
  var mOnGroupCollapseListener: js.Any = js.native
  
  var mOnGroupExpandListener: js.Any = js.native
  
  def onRtlPropertiesChanged(layoutDirection: Double): Unit = js.native
  
  /* private */ def resolveChildIndicator(): js.Any = js.native
  
  /* private */ def resolveIndicator(): js.Any = js.native
  
  def setChildDivider(childDivider: Drawable): Unit = js.native
  
  def setChildIndicator(childIndicator: Drawable): Unit = js.native
  
  def setChildIndicatorBounds(left: Double, right: Double): Unit = js.native
  
  def setChildIndicatorBoundsRelative(start: Double, end: Double): Unit = js.native
  
  def setExpandableAdapter(adapter: ExpandableListAdapter): Unit = js.native
  
  def setGroupIndicator(groupIndicator: Drawable): Unit = js.native
  
  def setIndicatorBounds(left: Double, right: Double): Unit = js.native
  
  def setIndicatorBoundsRelative(start: Double, end: Double): Unit = js.native
  
  def setOnChildClickListener(onChildClickListener: OnChildClickListener): Unit = js.native
  
  def setOnGroupClickListener(onGroupClickListener: OnGroupClickListener): Unit = js.native
  
  def setOnGroupCollapseListener(onGroupCollapseListener: OnGroupCollapseListener): Unit = js.native
  
  def setOnGroupExpandListener(onGroupExpandListener: OnGroupExpandListener): Unit = js.native
  
  def setSelectedChild(groupPosition: Double, childPosition: Double, shouldExpandGroup: Boolean): Boolean = js.native
  
  def setSelectedGroup(groupPosition: Double): Unit = js.native
}
object ExpandableListView {
  
  @js.native
  trait OnChildClickListener extends StObject {
    
    def onChildClick(parent: ExpandableListView, v: View, groupPosition: Double, childPosition: Double, id: Double): Boolean = js.native
  }
  object OnChildClickListener {
    
    @scala.inline
    def apply(onChildClick: (ExpandableListView, View, Double, Double, Double) => Boolean): OnChildClickListener = {
      val __obj = js.Dynamic.literal(onChildClick = js.Any.fromFunction5(onChildClick))
      __obj.asInstanceOf[OnChildClickListener]
    }
    
    @scala.inline
    implicit class OnChildClickListenerMutableBuilder[Self <: OnChildClickListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChildClick(value: (ExpandableListView, View, Double, Double, Double) => Boolean): Self = StObject.set(x, "onChildClick", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait OnGroupClickListener extends StObject {
    
    def onGroupClick(parent: ExpandableListView, v: View, groupPosition: Double, id: Double): Boolean = js.native
  }
  object OnGroupClickListener {
    
    @scala.inline
    def apply(onGroupClick: (ExpandableListView, View, Double, Double) => Boolean): OnGroupClickListener = {
      val __obj = js.Dynamic.literal(onGroupClick = js.Any.fromFunction4(onGroupClick))
      __obj.asInstanceOf[OnGroupClickListener]
    }
    
    @scala.inline
    implicit class OnGroupClickListenerMutableBuilder[Self <: OnGroupClickListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnGroupClick(value: (ExpandableListView, View, Double, Double) => Boolean): Self = StObject.set(x, "onGroupClick", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait OnGroupCollapseListener extends StObject {
    
    def onGroupCollapse(groupPosition: Double): Unit = js.native
  }
  object OnGroupCollapseListener {
    
    @scala.inline
    def apply(onGroupCollapse: Double => Unit): OnGroupCollapseListener = {
      val __obj = js.Dynamic.literal(onGroupCollapse = js.Any.fromFunction1(onGroupCollapse))
      __obj.asInstanceOf[OnGroupCollapseListener]
    }
    
    @scala.inline
    implicit class OnGroupCollapseListenerMutableBuilder[Self <: OnGroupCollapseListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnGroupCollapse(value: Double => Unit): Self = StObject.set(x, "onGroupCollapse", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OnGroupExpandListener extends StObject {
    
    def onGroupExpand(groupPosition: Double): Unit = js.native
  }
  object OnGroupExpandListener {
    
    @scala.inline
    def apply(onGroupExpand: Double => Unit): OnGroupExpandListener = {
      val __obj = js.Dynamic.literal(onGroupExpand = js.Any.fromFunction1(onGroupExpand))
      __obj.asInstanceOf[OnGroupExpandListener]
    }
    
    @scala.inline
    implicit class OnGroupExpandListenerMutableBuilder[Self <: OnGroupExpandListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnGroupExpand(value: Double => Unit): Self = StObject.set(x, "onGroupExpand", js.Any.fromFunction1(value))
    }
  }
}
