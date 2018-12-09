package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.collection.Set")
@js.native
class Set[T] () extends js.Object {
  def this(key: js.Function1[/* x */ T, _]) = this()
   // ???
  val size: scala.Double = js.native
  def add(value: T): scala.Unit = js.native
  def delete(value: T): scala.Unit = js.native
  def get(value: T): T = js.native
  def has(value: T): scala.Boolean = js.native
  def only(): T = js.native
}

