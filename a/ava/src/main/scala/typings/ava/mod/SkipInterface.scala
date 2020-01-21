package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipInterface[Context] extends js.Object {
  /** Skip this test. */
  def apply(title: String, implementation: Implementation[Context]): Unit = js.native
  /** Skip this test. */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this test. */
  def apply[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
}

