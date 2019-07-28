package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CbSkipInterface[Context] extends js.Object {
  /** Skip this test. */
  def apply(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /** Skip this test. */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this test. */
  def apply[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
}

