package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryFn[Context] extends js.Object {
  
  /**
  	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided.
  	 */
  def apply[Args /* <: js.Array[_] */](
    fn: Array[EitherMacro[Args, Context]],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[js.Array[TryResult]] = js.native
  /**
  	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided.
  	 */
  def apply[Args /* <: js.Array[_] */](
    fn: EitherMacro[Args, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[TryResult] = js.native
  /**
  	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided. The title may help distinguish attempts from
  	 * one another.
  	 */
  def apply[Args /* <: js.Array[_] */](
    title: String,
    fn: Array[EitherMacro[Args, Context]],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[js.Array[TryResult]] = js.native
  /**
  	 * Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided. The title may help distinguish attempts from
  	 * one another.
  	 */
  def apply[Args /* <: js.Array[_] */](
    title: String,
    fn: EitherMacro[Args, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[TryResult] = js.native
}
