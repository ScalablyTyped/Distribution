package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter extends js.Object {
  
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
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => js.Any): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemId(value: Double => Double): Self = this.set("getItemId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemViewType(value: Double => Double): Self = this.set("getItemViewType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetView(value: (Double, View, ViewGroup) => View): Self = this.set("getView", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetViewTypeCount(value: () => Double): Self = this.set("getViewTypeCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasStableIds(value: () => Boolean): Self = this.set("hasStableIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterDataSetObserver(value: DataSetObserver => Unit): Self = this.set("registerDataSetObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterDataSetObserver(value: DataSetObserver => Unit): Self = this.set("unregisterDataSetObserver", js.Any.fromFunction1(value))
  }
}
