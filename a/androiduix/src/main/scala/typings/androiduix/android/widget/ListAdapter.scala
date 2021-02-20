package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAdapter extends Adapter {
  
  def areAllItemsEnabled(): Boolean = js.native
  
  def isEnabled(position: Double): Boolean = js.native
}
object ListAdapter {
  
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    getCount: () => Double,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    isEnabled: Double => Boolean,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): ListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getCount = js.Any.fromFunction0(getCount), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[ListAdapter]
  }
  
  @scala.inline
  implicit class ListAdapterMutableBuilder[Self <: ListAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreAllItemsEnabled(value: () => Boolean): Self = StObject.set(x, "areAllItemsEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: Double => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
  }
}
