package typings.angularCommon.mod

import typings.angularCore.mod.NgIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgForOfContext")
@js.native
class NgForOfContext[T, U /* <: NgIterable[T] */] protected () extends js.Object {
  def this($implicit: T, ngForOf: U, index: Double, count: Double) = this()
  @JSName("$implicit")
  var $implicit: T = js.native
  var count: Double = js.native
  var index: Double = js.native
  var ngForOf: U = js.native
  def even: Boolean = js.native
  def first: Boolean = js.native
  def last: Boolean = js.native
  def odd: Boolean = js.native
}

