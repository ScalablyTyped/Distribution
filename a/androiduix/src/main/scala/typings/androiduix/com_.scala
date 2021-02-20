package typings.androiduix

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.support.v4.view.PagerAdapter
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object com_ {
  
  object jakewharton {
    
    object salvage {
      
      @js.native
      trait RecyclingPagerAdapter extends PagerAdapter {
        
        def getItemViewType(position: Double): Double = js.native
        
        def getView(position: Double, convertView: View, parent: ViewGroup): View = js.native
        
        def getViewTypeCount(): Double = js.native
        
        var recycleBin: js.Any = js.native
      }
      object RecyclingPagerAdapter {
        
        @scala.inline
        def apply(
          destroyItem: (ViewGroup, Double, js.Any) => Unit,
          finishUpdate: ViewGroup => Unit,
          getCount: () => Double,
          getItemPosition: js.Any => Double,
          getItemViewType: Double => Double,
          getPageTitle: Double => String,
          getPageWidth: Double => Double,
          getView: (Double, View, ViewGroup) => View,
          getViewTypeCount: () => Double,
          instantiateItem: (ViewGroup, Double) => js.Any,
          isViewFromObject: (View, js.Any) => Boolean,
          mObservable: js.Any,
          notifyDataSetChanged: () => Unit,
          recycleBin: js.Any,
          registerDataSetObserver: DataSetObserver => Unit,
          setPrimaryItem: (ViewGroup, Double, js.Any) => Unit,
          startUpdate: ViewGroup => Unit,
          unregisterDataSetObserver: DataSetObserver => Unit
        ): RecyclingPagerAdapter = {
          val __obj = js.Dynamic.literal(destroyItem = js.Any.fromFunction3(destroyItem), finishUpdate = js.Any.fromFunction1(finishUpdate), getCount = js.Any.fromFunction0(getCount), getItemPosition = js.Any.fromFunction1(getItemPosition), getItemViewType = js.Any.fromFunction1(getItemViewType), getPageTitle = js.Any.fromFunction1(getPageTitle), getPageWidth = js.Any.fromFunction1(getPageWidth), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), instantiateItem = js.Any.fromFunction2(instantiateItem), isViewFromObject = js.Any.fromFunction2(isViewFromObject), mObservable = mObservable.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), recycleBin = recycleBin.asInstanceOf[js.Any], registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), setPrimaryItem = js.Any.fromFunction3(setPrimaryItem), startUpdate = js.Any.fromFunction1(startUpdate), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
          __obj.asInstanceOf[RecyclingPagerAdapter]
        }
        
        @scala.inline
        implicit class RecyclingPagerAdapterMutableBuilder[Self <: RecyclingPagerAdapter] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setGetItemViewType(value: Double => Double): Self = StObject.set(x, "getItemViewType", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetView(value: (Double, View, ViewGroup) => View): Self = StObject.set(x, "getView", js.Any.fromFunction3(value))
          
          @scala.inline
          def setGetViewTypeCount(value: () => Double): Self = StObject.set(x, "getViewTypeCount", js.Any.fromFunction0(value))
          
          @scala.inline
          def setRecycleBin(value: js.Any): Self = StObject.set(x, "recycleBin", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
