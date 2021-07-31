package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionContext[Context]
  extends StObject
     with Assertions {
  
  /** Test context, shared with hooks. */
  var context: Context
  
  /** Log one or more values. */
  def log(values: js.Any*): Unit
  @JSName("log")
  var log_Original: LogFn
  
  /** Whether the test has passed. Only accurate in afterEach hooks. */
  val passed: Boolean
  
  /**
  	 * Plan how many assertion there are in the test. The test will fail if the actual assertion count doesn't match the
  	 * number of planned assertions. See [assertion planning](https://github.com/avajs/ava#assertion-planning).
  	 */
  def plan(count: Double): Unit
  @JSName("plan")
  var plan_Original: PlanFn
  
  def teardown(fn: js.Function0[Unit]): Unit
  @JSName("teardown")
  var teardown_Original: TeardownFn
  
  def timeout(ms: Double): Unit
  def timeout(ms: Double, message: String): Unit
  @JSName("timeout")
  var timeout_Original: TimeoutFn
  
  /** Title of the test or hook. */
  val title: String
  
  /**
  	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided.
  	 */
  def `try`[Args /* <: js.Array[js.Any] */](
    fn: Array[EitherMacro[Args, Context]],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[js.Array[TryResult]]
  /**
  	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided.
  	 */
  def `try`[Args /* <: js.Array[js.Any] */](
    fn: EitherMacro[Args, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[TryResult]
  /**
  	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided. The title may help distinguish attempts from
  	 * one another.
  	 */
  def `try`[Args /* <: js.Array[js.Any] */](
    title: String,
    fn: Array[EitherMacro[Args, Context]],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[js.Array[TryResult]]
  /**
  	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided. The title may help distinguish attempts from
  	 * one another.
  	 */
  def `try`[Args /* <: js.Array[js.Any] */](
    title: String,
    fn: EitherMacro[Args, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[TryResult]
  @JSName("try")
  var try_Original: TryFn[Context]
}
object ExecutionContext {
  
  @scala.inline
  def apply[Context](
    assert: AssertAssertion,
    context: Context,
    deepEqual: DeepEqualAssertion,
    fail: FailAssertion,
    `false`: FalseAssertion,
    falsy: FalsyAssertion,
    is: IsAssertion,
    like: LikeAssertion,
    log: LogFn,
    not: NotAssertion,
    notDeepEqual: NotDeepEqualAssertion,
    notRegex: NotRegexAssertion,
    notThrows: NotThrowsAssertion,
    notThrowsAsync: NotThrowsAsyncAssertion,
    pass: PassAssertion,
    passed: Boolean,
    plan: PlanFn,
    regex: RegexAssertion,
    snapshot: SnapshotAssertion,
    teardown: /* fn */ js.Function0[Unit] => Unit,
    throws: ThrowsAssertion,
    throwsAsync: ThrowsAsyncAssertion,
    timeout: (/* ms */ Double, /* message */ js.UndefOr[String]) => Unit,
    title: String,
    `true`: TrueAssertion,
    truthy: TruthyAssertion,
    `try`: TryFn[Context]
  ): ExecutionContext[Context] = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], deepEqual = deepEqual.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], falsy = falsy.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], notDeepEqual = notDeepEqual.asInstanceOf[js.Any], notRegex = notRegex.asInstanceOf[js.Any], notThrows = notThrows.asInstanceOf[js.Any], notThrowsAsync = notThrowsAsync.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], teardown = js.Any.fromFunction1(teardown), throws = throws.asInstanceOf[js.Any], throwsAsync = throwsAsync.asInstanceOf[js.Any], timeout = js.Any.fromFunction2(timeout), title = title.asInstanceOf[js.Any], truthy = truthy.asInstanceOf[js.Any])
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.updateDynamic("try")(`try`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContext[Context]]
  }
  
  @scala.inline
  implicit class ExecutionContextMutableBuilder[Self <: ExecutionContext[?], Context] (val x: Self & ExecutionContext[Context]) extends AnyVal {
    
    @scala.inline
    def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: LogFn): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: PlanFn): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeardown(value: /* fn */ js.Function0[Unit] => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: (/* ms */ Double, /* message */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "timeout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTry(value: TryFn[Context]): Self = StObject.set(x, "try", value.asInstanceOf[js.Any])
  }
}
