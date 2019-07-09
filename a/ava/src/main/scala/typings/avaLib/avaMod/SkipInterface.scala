package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipInterface[Context] extends js.Object {
  /** Skip this test. */
  def apply(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Skip this test. */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Skip this test. */
  def apply[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
}

