package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CbInterface[Context] extends js.Object {
  /** Declare a test that is expected to fail. */
  @JSName("failing")
  var failing_Original: CbFailingInterface[Context] = js.native
  @JSName("only")
  var only_Original: CbOnlyInterface[Context] = js.native
  @JSName("skip")
  var skip_Original: CbSkipInterface[Context] = js.native
  /** Declare a test that must call `t.end()` when it's done. */
  def apply(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * The macro is responsible for generating a unique test title.
  	 */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro.
  	 */
  def apply[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a test that must call `t.end()` when it's done. The test is expected to fail. */
  /** Declare a test that is expected to fail. */
  def failing(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * The test is expected to fail.
  	 */
  /** Declare a test that is expected to fail. */
  def failing[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro. The test is expected to fail.
  	 */
  /** Declare a test that is expected to fail. */
  def failing[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
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
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro. Only this test and others declared with `.only()` are run.
  	 */
  def only[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this test. */
  def skip(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /** Skip this test. */
  def skip[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this test. */
  def skip[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
}

