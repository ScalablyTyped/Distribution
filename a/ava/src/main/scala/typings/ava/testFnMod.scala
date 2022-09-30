package typings.ava

import typings.ava.assertionsMod.Assertions
import typings.ava.subscribableMod.Subscribable
import typings.ava.tryFnMod.TryResult
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testFnMod {
  
  @js.native
  trait AfterFn[Context] extends StObject {
    
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /**
    	 * Declare a hook that is run once, after all tests are done.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def always[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, after all tests are done.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def always[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("always")
    var always_Original: AlwaysInterface[Context] = js.native
    
    /** Skip this hook. */
    def skip[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Skip this hook. */
    def skip[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("skip")
    var skip_Original: HookSkipFn[Context] = js.native
  }
  
  @js.native
  trait AlwaysInterface[Context] extends StObject {
    
    /**
    	 * Declare a hook that is run once, after all tests are done.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, after all tests are done.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /** Skip this hook. */
    def skip[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Skip this hook. */
    def skip[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("skip")
    var skip_Original: HookSkipFn[Context] = js.native
  }
  
  @js.native
  trait BeforeFn[Context] extends StObject {
    
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /** Skip this hook. */
    def skip[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Skip this hook. */
    def skip[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("skip")
    var skip_Original: HookSkipFn[Context] = js.native
  }
  
  @js.native
  trait ExecutionContext[Context]
    extends StObject
       with Assertions {
    
    /** Test context, shared with hooks. */
    var context: Context = js.native
    
    /** Log one or more values. */
    def log(values: Any*): Unit = js.native
    @JSName("log")
    val log_Original: LogFn = js.native
    
    /** Whether the test has passed. Only accurate in afterEach hooks. */
    val passed: Boolean = js.native
    
    /**
    	 * Plan how many assertion there are in the test. The test will fail if the actual assertion count doesn't match the
    	 * number of planned assertions. See [assertion planning](https://github.com/avajs/ava#assertion-planning).
    	 */
    def plan(count: Double): Unit = js.native
    @JSName("plan")
    val plan_Original: PlanFn = js.native
    
    def teardown(fn: js.Function0[js.Promise[Unit] | Unit]): Unit = js.native
    
    def timeout(ms: Double): Unit = js.native
    def timeout(ms: Double, message: String): Unit = js.native
    
    /** Title of the test or hook. */
    val title: String = js.native
    
    /**
    	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
    	 * the test will fail.
    	 */
    def `try`[Args /* <: js.Array[Any] */](
      fn: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): js.Promise[TryResult] = js.native
    /**
    	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
    	 * the test will fail. The title may help distinguish attempts from one another.
    	 */
    def `try`[Args /* <: js.Array[Any] */](
      title: String,
      fn: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): js.Promise[TryResult] = js.native
  }
  
  @js.native
  trait FailingFn[Context] extends StObject {
    
    /**
    	 * Declare a concurrent test, using a macro, that is expected to fail.
    	 * Additional arguments are passed to the macro. The macro is responsible for generating a unique test title.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a concurrent test that is expected to fail.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /**
    	 * Declare a test that uses a macro. Only this test and others declared with `.only()` are run.
    	 * Additional arguments are passed to the macro. The macro is responsible for generating a unique test title.
    	 */
    def only[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a test. Only this test and others declared with `.only()` are run.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def only[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("only")
    var only_Original: OnlyFn[Context] = js.native
    
    /** Skip this test. */
    def skip[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Skip this test. */
    def skip[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("skip")
    var skip_Original: SkipFn[Context] = js.native
  }
  
  @js.native
  trait HookSkipFn[Context] extends StObject {
    
    /** Skip this hook. */
    def apply[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Skip this hook. */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
  }
  
  type Implementation[Args /* <: js.Array[Any] */, Context] = (ImplementationFn[Args, Context]) | (Macro[Args, Context])
  
  type ImplementationFn[Args /* <: js.Array[Any] */, Context] = js.Function2[
    /* t */ ExecutionContext[Context], 
    /* args */ Args, 
    PromiseLike[Unit] | Subscribable | Unit
  ]
  
  @js.native
  trait LogFn extends StObject {
    
    /** Log one or more values. */
    def apply(values: Any*): Unit = js.native
    
    /** Skip logging. */
    def skip(values: Any*): Unit = js.native
  }
  
  trait Macro[Args /* <: js.Array[Any] */, Context] extends StObject {
    
    /** The function that is executed when the macro is used. */
    val exec: ImplementationFn[Args, Context]
    
    /** Generates a test title when this macro is used. */
    val title: js.UndefOr[TitleFn[Args]] = js.undefined
  }
  object Macro {
    
    inline def apply[Args /* <: js.Array[Any] */, Context](exec: (/* t */ ExecutionContext[Context], Args) => PromiseLike[Unit] | Subscribable | Unit): Macro[Args, Context] = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction2(exec))
      __obj.asInstanceOf[Macro[Args, Context]]
    }
    
    extension [Self <: Macro[?, ?], Args /* <: js.Array[Any] */, Context](x: Self & (Macro[Args, Context])) {
      
      inline def setExec(value: (/* t */ ExecutionContext[Context], Args) => PromiseLike[Unit] | Subscribable | Unit): Self = StObject.set(x, "exec", js.Any.fromFunction2(value))
      
      inline def setTitle(value: (/* providedTitle */ js.UndefOr[String], Args) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait MacroDeclarationOptions[Args /* <: js.Array[Any] */, Context] extends StObject {
    
    /** The function that is executed when the macro is used. */
    var exec: ImplementationFn[Args, Context]
    
    /** The function responsible for generating a unique title when the macro is used. */
    def title(
      providedTitle: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): String
    def title(
      providedTitle: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): String
    /** The function responsible for generating a unique title when the macro is used. */
    @JSName("title")
    var title_Original: TitleFn[Args]
  }
  object MacroDeclarationOptions {
    
    inline def apply[Args /* <: js.Array[Any] */, Context](
      exec: (/* t */ ExecutionContext[Context], Args) => PromiseLike[Unit] | Subscribable | Unit,
      title: (/* providedTitle */ js.UndefOr[String], Args) => String
    ): MacroDeclarationOptions[Args, Context] = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction2(exec), title = js.Any.fromFunction2(title))
      __obj.asInstanceOf[MacroDeclarationOptions[Args, Context]]
    }
    
    extension [Self <: MacroDeclarationOptions[?, ?], Args /* <: js.Array[Any] */, Context](x: Self & (MacroDeclarationOptions[Args, Context])) {
      
      inline def setExec(value: (/* t */ ExecutionContext[Context], Args) => PromiseLike[Unit] | Subscribable | Unit): Self = StObject.set(x, "exec", js.Any.fromFunction2(value))
      
      inline def setTitle(value: (/* providedTitle */ js.UndefOr[String], Args) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait MacroFn[Context] extends StObject {
    
    def apply[Args /* <: js.Array[Any] */](declaration: MacroDeclarationOptions[Args, Context]): Macro[Args, Context] = js.native
    /** Declare a reusable test implementation. */
    def apply[Args /* <: js.Array[Any] */](/** The function that is executed when the macro is used. */ exec: ImplementationFn[Args, Context]): Macro[Args, Context] = js.native
  }
  
  trait Meta extends StObject {
    
    /** Path to the test file being executed. */
    var file: String
    
    /** Directory where snapshots are stored. */
    var snapshotDirectory: String
  }
  object Meta {
    
    inline def apply(file: String, snapshotDirectory: String): Meta = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], snapshotDirectory = snapshotDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    extension [Self <: Meta](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setSnapshotDirectory(value: String): Self = StObject.set(x, "snapshotDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnlyFn[Context] extends StObject {
    
    /**
    	 * Declare a test that uses a macro. Only this test and others declared with `.only()` are run.
    	 * Additional arguments are passed to the macro. The macro is responsible for generating a unique test title.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a test. Only this test and others declared with `.only()` are run.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
  }
  
  @js.native
  trait PlanFn extends StObject {
    
    /**
    	 * Plan how many assertion there are in the test. The test will fail if the actual assertion count doesn't match the
    	 * number of planned assertions. See [assertion planning](https://github.com/avajs/ava#assertion-planning).
    	 */
    def apply(count: Double): Unit = js.native
    
    /** Don't plan assertions. */
    def skip(count: Double): Unit = js.native
  }
  
  @js.native
  trait SerialFn[Context] extends StObject {
    
    /**
    	 * Declare a serial test that uses a macro. The macro is responsible for generating a unique test title.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Declare a serial test. Additional arguments are passed to the implementation or macro. */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def after[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def after[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def afterEach[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def afterEach[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("afterEach")
    var afterEach_Original: AfterFn[Context] = js.native
    
    @JSName("after")
    var after_Original: AfterFn[Context] = js.native
    
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def before[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def before[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def beforeEach[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def beforeEach[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("beforeEach")
    var beforeEach_Original: BeforeFn[Context] = js.native
    
    @JSName("before")
    var before_Original: BeforeFn[Context] = js.native
    
    /**
    	 * Declare a concurrent test, using a macro, that is expected to fail.
    	 * Additional arguments are passed to the macro. The macro is responsible for generating a unique test title.
    	 */
    def failing[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a concurrent test that is expected to fail.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def failing[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("failing")
    var failing_Original: FailingFn[Context] = js.native
    
    /**
    	 * Declare a test that uses a macro. Only this test and others declared with `.only()` are run.
    	 * Additional arguments are passed to the macro. The macro is responsible for generating a unique test title.
    	 */
    def only[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a test. Only this test and others declared with `.only()` are run.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def only[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("only")
    var only_Original: OnlyFn[Context] = js.native
    
    /** Skip this test. */
    def skip[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Skip this test. */
    def skip[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("skip")
    var skip_Original: SkipFn[Context] = js.native
    
    def todo(title: String): Unit = js.native
    @JSName("todo")
    var todo_Original: TodoFn = js.native
  }
  
  @js.native
  trait SkipFn[Context] extends StObject {
    
    /** Skip this test. */
    def apply[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Skip this test. */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
  }
  
  type TeardownFn = js.Function1[/* fn */ js.Function0[js.Promise[Unit] | Unit], Unit]
  
  @js.native
  trait TestFn[Context] extends StObject {
    
    /**
    	 * Declare a concurrent test that uses a macro. Additional arguments are passed to the macro.
    	 * The macro is responsible for generating a unique test title.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Declare a concurrent test. Additional arguments are passed to the implementation or macro. */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def after[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def after[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def afterEach[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, after all tests have passed.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def afterEach[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("afterEach")
    var afterEach_Original: AfterFn[Context] = js.native
    
    @JSName("after")
    var after_Original: AfterFn[Context] = js.native
    
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def before[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def before[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def beforeEach[Args /* <: js.Array[Any] */](
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a hook that is run once, before all tests.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def beforeEach[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("beforeEach")
    var beforeEach_Original: BeforeFn[Context] = js.native
    
    @JSName("before")
    var before_Original: BeforeFn[Context] = js.native
    
    /**
    	 * Declare a concurrent test, using a macro, that is expected to fail.
    	 * Additional arguments are passed to the macro. The macro is responsible for generating a unique test title.
    	 */
    def failing[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a concurrent test that is expected to fail.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def failing[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("failing")
    var failing_Original: FailingFn[Context] = js.native
    
    def `macro`[Args /* <: js.Array[Any] */](declaration: MacroDeclarationOptions[Args, Context]): Macro[Args, Context] = js.native
    /** Declare a reusable test implementation. */
    def `macro`[Args /* <: js.Array[Any] */](/** The function that is executed when the macro is used. */ exec: ImplementationFn[Args, Context]): Macro[Args, Context] = js.native
    @JSName("macro")
    var macro_Original: MacroFn[Context] = js.native
    
    var meta: Meta = js.native
    
    /**
    	 * Declare a test that uses a macro. Only this test and others declared with `.only()` are run.
    	 * Additional arguments are passed to the macro. The macro is responsible for generating a unique test title.
    	 */
    def only[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /**
    	 * Declare a test. Only this test and others declared with `.only()` are run.
    	 * Additional arguments are passed to the implementation or macro.
    	 */
    def only[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("only")
    var only_Original: OnlyFn[Context] = js.native
    
    /**
    	 * Declare a serial test that uses a macro. The macro is responsible for generating a unique test title.
    	 */
    def serial[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Declare a serial test. Additional arguments are passed to the implementation or macro. */
    def serial[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("serial")
    var serial_Original: SerialFn[Context] = js.native
    
    /** Skip this test. */
    def skip[Args /* <: js.Array[Any] */](
      `macro`: Macro[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    /** Skip this test. */
    def skip[Args /* <: js.Array[Any] */](
      title: String,
      implementation: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Unit = js.native
    @JSName("skip")
    var skip_Original: SkipFn[Context] = js.native
    
    def todo(title: String): Unit = js.native
    @JSName("todo")
    var todo_Original: TodoFn = js.native
  }
  
  type TimeoutFn = js.Function2[/* ms */ Double, /* message */ js.UndefOr[String], Unit]
  
  type TitleFn[Args /* <: js.Array[Any] */] = js.Function2[/* providedTitle */ js.UndefOr[String], /* args */ Args, String]
  
  type TodoFn = js.Function1[/* title */ String, Unit]
}
