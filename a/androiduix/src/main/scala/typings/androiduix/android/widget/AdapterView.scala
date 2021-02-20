package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.widget.AdapterView.OnItemClickListener
import typings.androiduix.android.widget.AdapterView.OnItemLongClickListener
import typings.androiduix.android.widget.AdapterView.OnItemSelectedListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterView[T /* <: Adapter */] extends ViewGroup {
  
  def checkFocus(): Unit = js.native
  
  def checkSelectionChanged(): Unit = js.native
  
  def findSyncPosition(): Double = js.native
  
  /* private */ def fireOnSelected(): js.Any = js.native
  
  def getAdapter(): T = js.native
  
  def getCount(): Double = js.native
  
  def getEmptyView(): View = js.native
  
  def getFirstVisiblePosition(): Double = js.native
  
  def getItemAtPosition(position: Double): js.Any = js.native
  
  def getItemIdAtPosition(position: Double): Double = js.native
  
  def getLastVisiblePosition(): Double = js.native
  
  def getOnItemClickListener(): OnItemClickListener = js.native
  
  def getOnItemLongClickListener(): OnItemLongClickListener = js.native
  
  def getOnItemSelectedListener(): OnItemSelectedListener = js.native
  
  def getPositionForView(view: View): Double = js.native
  
  def getSelectedItem(): js.Any = js.native
  
  def getSelectedItemId(): Double = js.native
  
  def getSelectedItemPosition(): Double = js.native
  
  def getSelectedView(): View = js.native
  
  def handleDataChanged(): Unit = js.native
  
  def isInFilterMode(): Boolean = js.native
  
  /* private */ def isScrollableForAccessibility(): js.Any = js.native
  
  def lookForSelectablePosition(position: Double, lookDown: Boolean): Double = js.native
  
  var mBlockLayoutRequests: Boolean = js.native
  
  var mDataChanged: Boolean = js.native
  
  var mDesiredFocusableInTouchModeState: js.Any = js.native
  
  var mDesiredFocusableState: js.Any = js.native
  
  var mEmptyView: js.Any = js.native
  
  var mFirstPosition: Double = js.native
  
  var mInLayout: Boolean = js.native
  
  var mItemCount: Double = js.native
  
  var mLayoutHeight: js.Any = js.native
  
  var mNeedSync: Boolean = js.native
  
  var mNextSelectedPosition: Double = js.native
  
  var mNextSelectedRowId: Double = js.native
  
  var mOldItemCount: Double = js.native
  
  var mOldSelectedPosition: Double = js.native
  
  var mOldSelectedRowId: Double = js.native
  
  var mOnItemClickListener: js.Any = js.native
  
  var mOnItemLongClickListener: OnItemLongClickListener = js.native
  
  var mOnItemSelectedListener: js.Any = js.native
  
  var mSelectedPosition: Double = js.native
  
  var mSelectedRowId: Double = js.native
  
  var mSelectionNotifier: js.Any = js.native
  
  var mSpecificTop: Double = js.native
  
  var mSyncHeight: Double = js.native
  
  var mSyncMode: Double = js.native
  
  var mSyncPosition: Double = js.native
  
  var mSyncRowId: Double = js.native
  
  /* private */ def performAccessibilityActionsOnSelected(): js.Any = js.native
  
  def performItemClick(view: View, position: Double, id: Double): Boolean = js.native
  
  def rememberSyncState(): Unit = js.native
  
  /* private */ def selectionChanged(): js.Any = js.native
  
  def setAdapter(adapter: T): Unit = js.native
  
  def setEmptyView(emptyView: View): Unit = js.native
  
  def setNextSelectedPositionInt(position: Double): Unit = js.native
  
  def setOnItemClickListener(listener: OnItemClickListener): Unit = js.native
  
  def setOnItemLongClickListener(listener: OnItemLongClickListener): Unit = js.native
  
  def setOnItemSelectedListener(listener: OnItemSelectedListener): Unit = js.native
  
  def setSelectedPositionInt(position: Double): Unit = js.native
  
  def setSelection(position: Double): Unit = js.native
  
  /* private */ def updateEmptyStatus(empty: js.Any): js.Any = js.native
}
object AdapterView {
  
  @js.native
  trait AdapterDataSetObserver extends DataSetObserver {
    
    var AdapterView_this: AdapterView[_] = js.native
    
    def clearSavedState(): Unit = js.native
  }
  object AdapterDataSetObserver {
    
    @scala.inline
    def apply(
      AdapterView_this: AdapterView[_],
      clearSavedState: () => Unit,
      onChanged: () => Unit,
      onInvalidated: () => Unit
    ): AdapterDataSetObserver = {
      val __obj = js.Dynamic.literal(AdapterView_this = AdapterView_this.asInstanceOf[js.Any], clearSavedState = js.Any.fromFunction0(clearSavedState), onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
      __obj.asInstanceOf[AdapterDataSetObserver]
    }
    
    @scala.inline
    implicit class AdapterDataSetObserverMutableBuilder[Self <: AdapterDataSetObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapterView_this(value: AdapterView[_]): Self = StObject.set(x, "AdapterView_this", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearSavedState(value: () => Unit): Self = StObject.set(x, "clearSavedState", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OnItemClickListener extends StObject {
    
    def onItemClick(parent: AdapterView[_], view: View, position: Double, id: Double): Unit = js.native
  }
  object OnItemClickListener {
    
    @scala.inline
    def apply(onItemClick: (AdapterView[_], View, Double, Double) => Unit): OnItemClickListener = {
      val __obj = js.Dynamic.literal(onItemClick = js.Any.fromFunction4(onItemClick))
      __obj.asInstanceOf[OnItemClickListener]
    }
    
    @scala.inline
    implicit class OnItemClickListenerMutableBuilder[Self <: OnItemClickListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnItemClick(value: (AdapterView[_], View, Double, Double) => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait OnItemLongClickListener extends StObject {
    
    def onItemLongClick(parent: AdapterView[_], view: View, position: Double, id: Double): Boolean = js.native
  }
  object OnItemLongClickListener {
    
    @scala.inline
    def apply(onItemLongClick: (AdapterView[_], View, Double, Double) => Boolean): OnItemLongClickListener = {
      val __obj = js.Dynamic.literal(onItemLongClick = js.Any.fromFunction4(onItemLongClick))
      __obj.asInstanceOf[OnItemLongClickListener]
    }
    
    @scala.inline
    implicit class OnItemLongClickListenerMutableBuilder[Self <: OnItemLongClickListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnItemLongClick(value: (AdapterView[_], View, Double, Double) => Boolean): Self = StObject.set(x, "onItemLongClick", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait OnItemSelectedListener extends StObject {
    
    def onItemSelected(parent: AdapterView[_], view: View, position: Double, id: Double): Unit = js.native
    
    def onNothingSelected(parent: AdapterView[_]): Unit = js.native
  }
  object OnItemSelectedListener {
    
    @scala.inline
    def apply(
      onItemSelected: (AdapterView[_], View, Double, Double) => Unit,
      onNothingSelected: AdapterView[_] => Unit
    ): OnItemSelectedListener = {
      val __obj = js.Dynamic.literal(onItemSelected = js.Any.fromFunction4(onItemSelected), onNothingSelected = js.Any.fromFunction1(onNothingSelected))
      __obj.asInstanceOf[OnItemSelectedListener]
    }
    
    @scala.inline
    implicit class OnItemSelectedListenerMutableBuilder[Self <: OnItemSelectedListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnItemSelected(value: (AdapterView[_], View, Double, Double) => Unit): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnNothingSelected(value: AdapterView[_] => Unit): Self = StObject.set(x, "onNothingSelected", js.Any.fromFunction1(value))
    }
  }
}
