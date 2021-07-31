package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookCbSkipInterface[Context] extends StObject {
  
  /** Skip this hook. */
  def apply(implementation: CbImplementation[Context]): Unit = js.native
  /** Skip this hook. */
  def apply(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /** Skip this hook. */
  def apply[T /* <: js.Array[js.Any] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this hook. */
  def apply[T /* <: js.Array[js.Any] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
}
