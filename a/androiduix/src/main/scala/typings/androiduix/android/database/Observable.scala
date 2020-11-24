package typings.androiduix.android.database

import typings.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observable[T] extends js.Object {
  
  var mObservers: ArrayList[T] = js.native
  
  def registerObserver(observer: T): Unit = js.native
  
  def unregisterAll(): Unit = js.native
  
  def unregisterObserver(observer: T): Unit = js.native
}
object Observable {
  
  @scala.inline
  def apply[T](
    mObservers: ArrayList[T],
    registerObserver: T => Unit,
    unregisterAll: () => Unit,
    unregisterObserver: T => Unit
  ): Observable[T] = {
    val __obj = js.Dynamic.literal(mObservers = mObservers.asInstanceOf[js.Any], registerObserver = js.Any.fromFunction1(registerObserver), unregisterAll = js.Any.fromFunction0(unregisterAll), unregisterObserver = js.Any.fromFunction1(unregisterObserver))
    __obj.asInstanceOf[Observable[T]]
  }
  
  @scala.inline
  implicit class ObservableOps[Self <: Observable[_], T] (val x: Self with Observable[T]) extends AnyVal {
    
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
    def setMObservers(value: ArrayList[T]): Self = this.set("mObservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterObserver(value: T => Unit): Self = this.set("registerObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterAll(value: () => Unit): Self = this.set("unregisterAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnregisterObserver(value: T => Unit): Self = this.set("unregisterObserver", js.Any.fromFunction1(value))
  }
}
