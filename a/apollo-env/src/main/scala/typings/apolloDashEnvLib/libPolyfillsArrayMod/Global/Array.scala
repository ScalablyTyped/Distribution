package typings
package apolloDashEnvLib.libPolyfillsArrayMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  def flat[U](`this`: Array[js.Array[U]]): Array[U] = js.native
  def flat[U](`this`: Array[js.Array[U]], depth: apolloDashEnvLib.apolloDashEnvLibNumbers.`1`): Array[U] = js.native
  def flatMap[U](
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], js.Array[U] | U]
  ): Array[U] = js.native
  def flatMap[U](
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], js.Array[U] | U],
    thisArg: this.type
  ): Array[U] = js.native
}

