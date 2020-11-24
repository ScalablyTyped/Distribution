package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailingInterface[Context] extends js.Object {
  
  /** Declare a concurrent test. The test is expected to fail. */
  def apply(title: String, implementation: Implementation[Context]): Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 * The test is expected to fail.
  	 */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. Additional arguments are passed to the macro.
  	 * The test is expected to fail.
  	 */
  def apply[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  
  /** Declare a test. Only this test and others declared with `.only()` are run. */
  def only(title: String, implementation: Implementation[Context]): Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 * Only this test and others declared with `.only()` are run.
  	 */
  def only[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. Additional arguments are passed to the macro.
  	 * Only this test and others declared with `.only()` are run.
  	 */
  def only[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  @JSName("only")
  var only_Original: OnlyInterface[Context] = js.native
  
  /** Skip this test. */
  def skip(title: String, implementation: Implementation[Context]): Unit = js.native
  /** Skip this test. */
  def skip[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this test. */
  def skip[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  @JSName("skip")
  var skip_Original: SkipInterface[Context] = js.native
}
