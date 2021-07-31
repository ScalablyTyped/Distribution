package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookSkipInterface[Context] extends StObject {
  
  /** Skip this hook. */
  def apply(implementation: Implementation[Context]): Unit = js.native
  /** Skip this hook. */
  def apply(title: String, implementation: Implementation[Context]): Unit = js.native
  /** Skip this hook. */
  def apply[T /* <: js.Array[js.Any] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this hook. */
  def apply[T /* <: js.Array[js.Any] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
}
