package typings.ava

import typings.ava.testFnMod.Implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tryFnMod {
  
  type AssertionError = js.Error
  
  trait CommitDiscardOptions extends StObject {
    
    /**
    	 * Whether the logs should be included in those of the parent test.
    	 */
    var retainLogs: js.UndefOr[Boolean] = js.undefined
  }
  object CommitDiscardOptions {
    
    inline def apply(): CommitDiscardOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommitDiscardOptions]
    }
    
    extension [Self <: CommitDiscardOptions](x: Self) {
      
      inline def setRetainLogs(value: Boolean): Self = StObject.set(x, "retainLogs", value.asInstanceOf[js.Any])
      
      inline def setRetainLogsUndefined: Self = StObject.set(x, "retainLogs", js.undefined)
    }
  }
  
  @js.native
  trait TryFn[Context] extends StObject {
    
    /**
    	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
    	 * the test will fail.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      fn: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): js.Promise[TryResult] = js.native
    /**
    	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
    	 * the test will fail. The title may help distinguish attempts from one another.
    	 */
    def apply[Args /* <: js.Array[Any] */](
      title: String,
      fn: Implementation[Args, Context],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): js.Promise[TryResult] = js.native
  }
  
  @js.native
  trait TryResult extends StObject {
    
    /**
    	 * Commit the attempt. Counts as one assertion for the plan count. If the
    	 * attempt failed, calling this will also cause your test to fail.
    	 */
    def commit(): Unit = js.native
    def commit(options: CommitDiscardOptions): Unit = js.native
    
    /**
    	 * Discard the attempt.
    	 */
    def discard(): Unit = js.native
    def discard(options: CommitDiscardOptions): Unit = js.native
    
    /**
    	* Errors raised for each failed assertion.
    	*/
    var errors: js.Array[js.Error] = js.native
    
    /**
    	 * Logs created during the attempt using `t.log()`. Contains formatted values.
    	 */
    var logs: js.Array[String] = js.native
    
    /**
    	* Indicates whether all assertions passed, or at least one failed.
    	*/
    var passed: Boolean = js.native
    
    /**
    	* Title of the attempt, helping you tell attempts aparts.
    	*/
    var title: String = js.native
  }
}
