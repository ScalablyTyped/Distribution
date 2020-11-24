package typings.androiduix.android.support.v4.view

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagerAdapter extends js.Object {
  
  def destroyItem(container: ViewGroup, position: Double, `object`: js.Any): Unit = js.native
  
  def finishUpdate(container: ViewGroup): Unit = js.native
  
  def getCount(): Double = js.native
  
  def getItemPosition(`object`: js.Any): Double = js.native
  
  def getPageTitle(position: Double): String = js.native
  
  def getPageWidth(position: Double): Double = js.native
  
  def instantiateItem(container: ViewGroup, position: Double): js.Any = js.native
  
  def isViewFromObject(view: View, `object`: js.Any): Boolean = js.native
  
  var mObservable: js.Any = js.native
  
  def notifyDataSetChanged(): Unit = js.native
  
  def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  
  def setPrimaryItem(container: ViewGroup, position: Double, `object`: js.Any): Unit = js.native
  
  def startUpdate(container: ViewGroup): Unit = js.native
  
  def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}
object PagerAdapter {
  
  @scala.inline
  def apply(
    destroyItem: (ViewGroup, Double, js.Any) => Unit,
    finishUpdate: ViewGroup => Unit,
    getCount: () => Double,
    getItemPosition: js.Any => Double,
    getPageTitle: Double => String,
    getPageWidth: Double => Double,
    instantiateItem: (ViewGroup, Double) => js.Any,
    isViewFromObject: (View, js.Any) => Boolean,
    mObservable: js.Any,
    notifyDataSetChanged: () => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    setPrimaryItem: (ViewGroup, Double, js.Any) => Unit,
    startUpdate: ViewGroup => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): PagerAdapter = {
    val __obj = js.Dynamic.literal(destroyItem = js.Any.fromFunction3(destroyItem), finishUpdate = js.Any.fromFunction1(finishUpdate), getCount = js.Any.fromFunction0(getCount), getItemPosition = js.Any.fromFunction1(getItemPosition), getPageTitle = js.Any.fromFunction1(getPageTitle), getPageWidth = js.Any.fromFunction1(getPageWidth), instantiateItem = js.Any.fromFunction2(instantiateItem), isViewFromObject = js.Any.fromFunction2(isViewFromObject), mObservable = mObservable.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), setPrimaryItem = js.Any.fromFunction3(setPrimaryItem), startUpdate = js.Any.fromFunction1(startUpdate), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[PagerAdapter]
  }
  
  @scala.inline
  implicit class PagerAdapterOps[Self <: PagerAdapter] (val x: Self) extends AnyVal {
    
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
    def setDestroyItem(value: (ViewGroup, Double, js.Any) => Unit): Self = this.set("destroyItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFinishUpdate(value: ViewGroup => Unit): Self = this.set("finishUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemPosition(value: js.Any => Double): Self = this.set("getItemPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPageTitle(value: Double => String): Self = this.set("getPageTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPageWidth(value: Double => Double): Self = this.set("getPageWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInstantiateItem(value: (ViewGroup, Double) => js.Any): Self = this.set("instantiateItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsViewFromObject(value: (View, js.Any) => Boolean): Self = this.set("isViewFromObject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMObservable(value: js.Any): Self = this.set("mObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyDataSetChanged(value: () => Unit): Self = this.set("notifyDataSetChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterDataSetObserver(value: DataSetObserver => Unit): Self = this.set("registerDataSetObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPrimaryItem(value: (ViewGroup, Double, js.Any) => Unit): Self = this.set("setPrimaryItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStartUpdate(value: ViewGroup => Unit): Self = this.set("startUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterDataSetObserver(value: DataSetObserver => Unit): Self = this.set("unregisterDataSetObserver", js.Any.fromFunction1(value))
  }
}
