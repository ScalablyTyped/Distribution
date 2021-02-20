package typings.androiduix.android.view

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View.OnKeyListener
import typings.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typings.androiduix.android.widget.AdapterView
import typings.androiduix.android.widget.AdapterView.OnItemClickListener
import typings.androiduix.android.widget.BaseAdapter
import typings.androiduix.android.widget.PopupWindow.OnDismissListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menu {
  
  @js.native
  trait MenuPopupHelper
    extends OnItemClickListener
       with OnKeyListener
       with OnGlobalLayoutListener
       with OnDismissListener {
    
    def dismiss(): Unit = js.native
    
    def isShowing(): Boolean = js.native
    
    var mAdapter: js.Any = js.native
    
    var mAnchorView: js.Any = js.native
    
    var mContext: js.Any = js.native
    
    var mInflater: js.Any = js.native
    
    var mMeasureParent: js.Any = js.native
    
    var mMenu: js.Any = js.native
    
    var mPopup: js.Any = js.native
    
    var mPopupMaxWidth: js.Any = js.native
    
    var mTreeObserver: js.Any = js.native
    
    /* private */ def measureContentWidth(adapter: js.Any): js.Any = js.native
    
    def setAnchorView(anchor: View): Unit = js.native
    
    def show(): Unit = js.native
    
    def tryShow(): Boolean = js.native
  }
  object MenuPopupHelper {
    
    @scala.inline
    def apply(
      dismiss: () => Unit,
      isShowing: () => Boolean,
      mAdapter: js.Any,
      mAnchorView: js.Any,
      mContext: js.Any,
      mInflater: js.Any,
      mMeasureParent: js.Any,
      mMenu: js.Any,
      mPopup: js.Any,
      mPopupMaxWidth: js.Any,
      mTreeObserver: js.Any,
      measureContentWidth: js.Any => js.Any,
      onDismiss: () => Unit,
      onGlobalLayout: () => js.Any,
      onItemClick: (AdapterView[_], View, Double, Double) => Unit,
      onKey: (View, Double, KeyEvent) => Unit,
      setAnchorView: View => Unit,
      show: () => Unit,
      tryShow: () => Boolean
    ): MenuPopupHelper = {
      val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), isShowing = js.Any.fromFunction0(isShowing), mAdapter = mAdapter.asInstanceOf[js.Any], mAnchorView = mAnchorView.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mInflater = mInflater.asInstanceOf[js.Any], mMeasureParent = mMeasureParent.asInstanceOf[js.Any], mMenu = mMenu.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPopupMaxWidth = mPopupMaxWidth.asInstanceOf[js.Any], mTreeObserver = mTreeObserver.asInstanceOf[js.Any], measureContentWidth = js.Any.fromFunction1(measureContentWidth), onDismiss = js.Any.fromFunction0(onDismiss), onGlobalLayout = js.Any.fromFunction0(onGlobalLayout), onItemClick = js.Any.fromFunction4(onItemClick), onKey = js.Any.fromFunction3(onKey), setAnchorView = js.Any.fromFunction1(setAnchorView), show = js.Any.fromFunction0(show), tryShow = js.Any.fromFunction0(tryShow))
      __obj.asInstanceOf[MenuPopupHelper]
    }
    
    @js.native
    trait MenuAdapter extends BaseAdapter {
      
      var _MenuPopupHelper_this: MenuPopupHelper = js.native
      
      var mAdapterMenu: js.Any = js.native
    }
    object MenuAdapter {
      
      @scala.inline
      def apply(
        _MenuPopupHelper_this: MenuPopupHelper,
        areAllItemsEnabled: () => Boolean,
        getCount: () => Double,
        getDropDownView: (Double, View, ViewGroup) => View,
        getItem: Double => js.Any,
        getItemId: Double => Double,
        getItemViewType: Double => Double,
        getView: (Double, View, ViewGroup) => View,
        getViewTypeCount: () => Double,
        hasStableIds: () => Boolean,
        isEmpty: () => Boolean,
        isEnabled: Double => Boolean,
        mAdapterMenu: js.Any,
        mDataSetObservable: js.Any,
        notifyDataSetChanged: () => Unit,
        notifyDataSetInvalidated: () => Unit,
        registerDataSetObserver: DataSetObserver => Unit,
        unregisterDataSetObserver: DataSetObserver => Unit
      ): MenuAdapter = {
        val __obj = js.Dynamic.literal(_MenuPopupHelper_this = _MenuPopupHelper_this.asInstanceOf[js.Any], areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), mAdapterMenu = mAdapterMenu.asInstanceOf[js.Any], mDataSetObservable = mDataSetObservable.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), notifyDataSetInvalidated = js.Any.fromFunction0(notifyDataSetInvalidated), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
        __obj.asInstanceOf[MenuAdapter]
      }
      
      @scala.inline
      implicit class MenuAdapterMutableBuilder[Self <: MenuAdapter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMAdapterMenu(value: js.Any): Self = StObject.set(x, "mAdapterMenu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_MenuPopupHelper_this(value: MenuPopupHelper): Self = StObject.set(x, "_MenuPopupHelper_this", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class MenuPopupHelperMutableBuilder[Self <: MenuPopupHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsShowing(value: () => Boolean): Self = StObject.set(x, "isShowing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMAdapter(value: js.Any): Self = StObject.set(x, "mAdapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAnchorView(value: js.Any): Self = StObject.set(x, "mAnchorView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMContext(value: js.Any): Self = StObject.set(x, "mContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMInflater(value: js.Any): Self = StObject.set(x, "mInflater", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMMeasureParent(value: js.Any): Self = StObject.set(x, "mMeasureParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMMenu(value: js.Any): Self = StObject.set(x, "mMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPopup(value: js.Any): Self = StObject.set(x, "mPopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPopupMaxWidth(value: js.Any): Self = StObject.set(x, "mPopupMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTreeObserver(value: js.Any): Self = StObject.set(x, "mTreeObserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureContentWidth(value: js.Any => js.Any): Self = StObject.set(x, "measureContentWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAnchorView(value: View => Unit): Self = StObject.set(x, "setAnchorView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTryShow(value: () => Boolean): Self = StObject.set(x, "tryShow", js.Any.fromFunction0(value))
    }
  }
}
