package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialInterface[Context] extends js.Object {
  /** Declare a serial hook that is run after each passing test. */
  @JSName("afterEach")
  var afterEach_Original: AfterInterface[Context] = js.native
  /** Declare a serial hook that is run once, after all tests have passed. */
  @JSName("after")
  var after_Original: AfterInterface[Context] = js.native
  /** Declare a serial hook that is run before each test. */
  @JSName("beforeEach")
  var beforeEach_Original: BeforeInterface[Context] = js.native
  /** Declare a serial hook that is run once, before all tests. */
  @JSName("before")
  var before_Original: BeforeInterface[Context] = js.native
  /** Declare a serial test that must call `t.end()` when it's done. */
  @JSName("cb")
  var cb_Original: CbInterface[Context] = js.native
  /** Declare a serial test that is expected to fail. */
  @JSName("failing")
  var failing_Original: FailingInterface[Context] = js.native
  @JSName("only")
  var only_Original: OnlyInterface[Context] = js.native
  @JSName("skip")
  var skip_Original: SkipInterface[Context] = js.native
  @JSName("todo")
  var todo_Original: TodoDeclaration = js.native
  /** Declare a serial test. */
  def apply(title: String, implementation: Implementation[Context]): Unit = js.native
  /**
  	 * Declare a serial test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a serial test that uses one or more macros. Additional arguments are passed to the macro. */
  def apply[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a serial hook that is run once, after all tests have passed. */
  def after(implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a serial hook that is run once, after all tests have passed. */
  def after(title: String, implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a serial hook that is run once, after all tests have passed. */
  def after[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. Additional arguments are passed to the macro. */
  /** Declare a serial hook that is run once, after all tests have passed. */
  def after[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a serial hook that is run after each passing test. */
  def afterEach(implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a serial hook that is run after each passing test. */
  def afterEach(title: String, implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a serial hook that is run after each passing test. */
  def afterEach[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. Additional arguments are passed to the macro. */
  /** Declare a serial hook that is run after each passing test. */
  def afterEach[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a serial hook that is run once, before all tests. */
  def before(implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a serial hook that is run once, before all tests. */
  def before(title: String, implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a serial hook that is run once, before all tests. */
  def before[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that is run once, before all tests. Additional arguments are passed to the macro. */
  /** Declare a serial hook that is run once, before all tests. */
  def before[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a serial hook that is run before each test. */
  def beforeEach(implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a serial hook that is run before each test. */
  def beforeEach(title: String, implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a serial hook that is run before each test. */
  def beforeEach[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that is run once, before all tests. Additional arguments are passed to the macro. */
  /** Declare a serial hook that is run before each test. */
  def beforeEach[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a test that must call `t.end()` when it's done. */
  /** Declare a serial test that must call `t.end()` when it's done. */
  def cb(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * The macro is responsible for generating a unique test title.
  	 */
  /** Declare a serial test that must call `t.end()` when it's done. */
  def cb[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro.
  	 */
  /** Declare a serial test that must call `t.end()` when it's done. */
  def cb[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a concurrent test. The test is expected to fail. */
  /** Declare a serial test that is expected to fail. */
  def failing(title: String, implementation: Implementation[Context]): Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 * The test is expected to fail.
  	 */
  /** Declare a serial test that is expected to fail. */
  def failing[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. Additional arguments are passed to the macro.
  	 * The test is expected to fail.
  	 */
  /** Declare a serial test that is expected to fail. */
  def failing[T /* <: js.Array[_] */](
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
  def todo(title: String): Unit = js.native
}

