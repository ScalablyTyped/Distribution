package typings.apolloDashEnv.libPolyfillsArrayMod

import typings.apolloDashEnv.apolloDashEnvNumbers.`1`
import typings.apolloDashEnv.libPolyfillsArrayMod.Global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  trait Array[T] extends js.Object {
    def flat[U](`this`: Array[js.Array[U]]): Array[U] = js.native
    @JSName("flat")
    def flat_1[U](`this`: Array[js.Array[U]], depth: `1`): Array[U] = js.native
  }
  
}

