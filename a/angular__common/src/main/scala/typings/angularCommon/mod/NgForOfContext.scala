package typings.angularCommon.mod

import typings.angularCore.mod.NgIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgForOfContext")
@js.native
class NgForOfContext[T] protected () extends js.Object {
  def this($implicit: T, ngForOf: NgIterable[T], index: Double, count: Double) = this()
  @JSName("$implicit")
  var $implicit: T = js.native
  var count: Double = js.native
  val even: Boolean = js.native
  val first: Boolean = js.native
  var index: Double = js.native
  val last: Boolean = js.native
  var ngForOf: NgIterable[T] = js.native
  val odd: Boolean = js.native
}

