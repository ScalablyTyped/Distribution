package typings.androiduix.android

import typings.androiduix.java.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.database")
@js.native
object database extends js.Object {
  @js.native
  class DataSetObservable () extends Observable[DataSetObserver] {
    def notifyChanged(): Unit = js.native
    def notifyInvalidated(): Unit = js.native
  }
  
  @js.native
  class DataSetObserver () extends js.Object {
    def onChanged(): Unit = js.native
    def onInvalidated(): Unit = js.native
  }
  
  @js.native
  abstract class Observable[T] () extends js.Object {
    var mObservers: ArrayList[T] = js.native
    def registerObserver(observer: T): Unit = js.native
    def unregisterAll(): Unit = js.native
    def unregisterObserver(observer: T): Unit = js.native
  }
  
}

