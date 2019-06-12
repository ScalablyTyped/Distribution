package typings
package apolloDashEnvLib.libPolyfillsArrayMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  def flat[U](`this`: Array[js.Array[U]]): Array[U] = js.native
  @JSName("flat")
  def flat_1[U](`this`: Array[js.Array[U]], depth: apolloDashEnvLib.apolloDashEnvLibNumbers.`1`): Array[U] = js.native
}

