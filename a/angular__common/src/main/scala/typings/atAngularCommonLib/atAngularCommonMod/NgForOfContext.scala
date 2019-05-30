package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgForOfContext")
@js.native
class NgForOfContext[T] protected () extends js.Object {
  def this($implicit: T, ngForOf: atAngularCoreLib.atAngularCoreMod.NgIterable[T], index: scala.Double, count: scala.Double) = this()
  @JSName("$implicit")
  var $implicit: T = js.native
  var count: scala.Double = js.native
  val even: scala.Boolean = js.native
  val first: scala.Boolean = js.native
  var index: scala.Double = js.native
  val last: scala.Boolean = js.native
  var ngForOf: atAngularCoreLib.atAngularCoreMod.NgIterable[T] = js.native
  val odd: scala.Boolean = js.native
}

