package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter extends StObject {
  
  def getCount(): Double = js.native
  
  def getItem(position: Double): js.Any = js.native
  
  def getItemId(position: Double): Double = js.native
  
  def getItemViewType(position: Double): Double = js.native
  
  def getView(position: Double, convertView: View, parent: ViewGroup): View = js.native
  
  def getViewTypeCount(): Double = js.native
  
  def hasStableIds(): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  
  def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}
object Adapter {
  
  @scala.inline
  def apply(
    getCount: () => Double,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    isEmpty: () => Boolean,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): Adapter = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[Adapter]
  }
  
  @scala.inline
  implicit class AdapterMutableBuilder[Self <: Adapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => js.Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemId(value: Double => Double): Self = StObject.set(x, "getItemId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemViewType(value: Double => Double): Self = StObject.set(x, "getItemViewType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetView(value: (Double, View, ViewGroup) => View): Self = StObject.set(x, "getView", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetViewTypeCount(value: () => Double): Self = StObject.set(x, "getViewTypeCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasStableIds(value: () => Boolean): Self = StObject.set(x, "hasStableIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterDataSetObserver(value: DataSetObserver => Unit): Self = StObject.set(x, "registerDataSetObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterDataSetObserver(value: DataSetObserver => Unit): Self = StObject.set(x, "unregisterDataSetObserver", js.Any.fromFunction1(value))
  }
}
