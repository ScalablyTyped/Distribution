package typings.androiduix.androidNs.databaseNs

import typings.androiduix.javaNs.utilNs.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.database.Observable")
@js.native
abstract class Observable[T] () extends js.Object {
  var mObservers: ArrayList[T] = js.native
  def registerObserver(observer: T): Unit = js.native
  def unregisterAll(): Unit = js.native
  def unregisterObserver(observer: T): Unit = js.native
}

