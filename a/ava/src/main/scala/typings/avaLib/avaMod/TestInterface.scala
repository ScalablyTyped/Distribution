package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInterface[Context] extends js.Object {
  /** Declare a hook that is run after each passing test. */
  @JSName("afterEach")
  var afterEach_Original: AfterInterface[Context] = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  @JSName("after")
  var after_Original: AfterInterface[Context] = js.native
  /** Declare a hook that is run before each test. */
  @JSName("beforeEach")
  var beforeEach_Original: BeforeInterface[Context] = js.native
  /** Declare a hook that is run once, before all tests. */
  @JSName("before")
  var before_Original: BeforeInterface[Context] = js.native
  /** Declare a test that must call `t.end()` when it's done. */
  @JSName("cb")
  var cb_Original: CbInterface[Context] = js.native
  /** Declare a test that is expected to fail. */
  @JSName("failing")
  var failing_Original: FailingInterface[Context] = js.native
  var meta: MetaInterface = js.native
  @JSName("only")
  var only_Original: OnlyInterface[Context] = js.native
  /** Declare tests and hooks that are run serially. */
  @JSName("serial")
  var serial_Original: SerialInterface[Context] = js.native
  @JSName("skip")
  var skip_Original: SkipInterface[Context] = js.native
  @JSName("todo")
  var todo_Original: TodoDeclaration = js.native
  def apply(
    macros: OneOrMoreMacros[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify T */ _, 
      Context
    ],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify T */ js.Any
  ): scala.Unit = js.native
  /** Declare a concurrent test. */
  def apply(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a concurrent test that uses one or more macros. Additional arguments are passed to the macro. */
  def apply[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a hook that is run once, after all tests have passed. */
  def after(implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a hook that is run once, after all tests have passed. */
  def after(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a hook that is run once, after all tests have passed. */
  def after[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. Additional arguments are passed to the macro. */
  /** Declare a hook that is run once, after all tests have passed. */
  def after[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a hook that is run after each passing test. */
  def afterEach(implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a hook that is run after each passing test. */
  def afterEach(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. */
  /** Declare a hook that is run after each passing test. */
  def afterEach[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests have passed. Additional arguments are passed to the macro. */
  /** Declare a hook that is run after each passing test. */
  def afterEach[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a hook that is run once, before all tests. */
  def before(implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a hook that is run once, before all tests. */
  def before(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a hook that is run once, before all tests. */
  def before[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. Additional arguments are passed to the macro. */
  /** Declare a hook that is run once, before all tests. */
  def before[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a hook that is run before each test. */
  def beforeEach(implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a hook that is run before each test. */
  def beforeEach(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  /** Declare a hook that is run before each test. */
  def beforeEach[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. Additional arguments are passed to the macro. */
  /** Declare a hook that is run before each test. */
  def beforeEach[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a test that must call `t.end()` when it's done. */
  /** Declare a test that must call `t.end()` when it's done. */
  def cb(title: java.lang.String, implementation: CbImplementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * The macro is responsible for generating a unique test title.
  	 */
  /** Declare a test that must call `t.end()` when it's done. */
  def cb[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro.
  	 */
  /** Declare a test that must call `t.end()` when it's done. */
  def cb[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a concurrent test. The test is expected to fail. */
  /** Declare a test that is expected to fail. */
  def failing(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 * The test is expected to fail.
  	 */
  /** Declare a test that is expected to fail. */
  def failing[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. Additional arguments are passed to the macro.
  	 * The test is expected to fail.
  	 */
  /** Declare a test that is expected to fail. */
  def failing[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a test. Only this test and others declared with `.only()` are run. */
  def only(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 * Only this test and others declared with `.only()` are run.
  	 */
  def only[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. Additional arguments are passed to the macro.
  	 * Only this test and others declared with `.only()` are run.
  	 */
  def only[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a serial test. */
  /** Declare tests and hooks that are run serially. */
  def serial(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a serial test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 */
  /** Declare tests and hooks that are run serially. */
  def serial[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a serial test that uses one or more macros. Additional arguments are passed to the macro. */
  /** Declare tests and hooks that are run serially. */
  def serial[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Skip this test. */
  def skip(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Skip this test. */
  def skip[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Skip this test. */
  def skip[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  def todo(title: java.lang.String): scala.Unit = js.native
}

