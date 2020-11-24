package typings.androiduix.android.database

import typings.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetObservable extends Observable[DataSetObserver] {
  
  def notifyChanged(): Unit = js.native
  
  def notifyInvalidated(): Unit = js.native
}
object DataSetObservable {
  
  @scala.inline
  def apply(
    mObservers: ArrayList[DataSetObserver],
    notifyChanged: () => Unit,
    notifyInvalidated: () => Unit,
    registerObserver: DataSetObserver => Unit,
    unregisterAll: () => Unit,
    unregisterObserver: DataSetObserver => Unit
  ): DataSetObservable = {
    val __obj = js.Dynamic.literal(mObservers = mObservers.asInstanceOf[js.Any], notifyChanged = js.Any.fromFunction0(notifyChanged), notifyInvalidated = js.Any.fromFunction0(notifyInvalidated), registerObserver = js.Any.fromFunction1(registerObserver), unregisterAll = js.Any.fromFunction0(unregisterAll), unregisterObserver = js.Any.fromFunction1(unregisterObserver))
    __obj.asInstanceOf[DataSetObservable]
  }
  
  @scala.inline
  implicit class DataSetObservableOps[Self <: DataSetObservable] (val x: Self) extends AnyVal {
    
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
    def setNotifyChanged(value: () => Unit): Self = this.set("notifyChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotifyInvalidated(value: () => Unit): Self = this.set("notifyInvalidated", js.Any.fromFunction0(value))
  }
}
