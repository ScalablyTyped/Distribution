package typings
package androiduixLib.androidNs.databaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.database.Observable")
@js.native
abstract class Observable[T] () extends js.Object {
  var mObservers: androiduixLib.javaNs.utilNs.ArrayList[T] = js.native
  def registerObserver(observer: T): scala.Unit = js.native
  def unregisterAll(): scala.Unit = js.native
  def unregisterObserver(observer: T): scala.Unit = js.native
}

