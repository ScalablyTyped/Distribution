package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CbFailingInterface[Context] extends js.Object {
  @JSName("only")
  var only_Original: CbOnlyInterface[Context] = js.native
  @JSName("skip")
  var skip_Original: CbSkipInterface[Context] = js.native
  /** Declare a test that must call `t.end()` when it's done. The test is expected to fail. */
  def apply(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * The test is expected to fail.
  	 */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro. The test is expected to fail.
  	 */
  def apply[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a test that must call `t.end()` when it's done. Only this test and others declared with `.only()` are run.
  	 */
  def only(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro. Only this test and others declared with `.only()` are run.
  	 */
  def only[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro. Only this test and others declared with `.only()` are run.
  	 */
  def only[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this test. */
  def skip(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /** Skip this test. */
  def skip[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this test. */
  def skip[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
}

