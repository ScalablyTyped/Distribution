package typings.androiduix.android.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetObserver extends js.Object {
  
  def onChanged(): Unit = js.native
  
  def onInvalidated(): Unit = js.native
}
object DataSetObserver {
  
  @scala.inline
  def apply(onChanged: () => Unit, onInvalidated: () => Unit): DataSetObserver = {
    val __obj = js.Dynamic.literal(onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
    __obj.asInstanceOf[DataSetObserver]
  }
  
  @scala.inline
  implicit class DataSetObserverOps[Self <: DataSetObserver] (val x: Self) extends AnyVal {
    
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
    def setOnChanged(value: () => Unit): Self = this.set("onChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnInvalidated(value: () => Unit): Self = this.set("onInvalidated", js.Any.fromFunction0(value))
  }
}
