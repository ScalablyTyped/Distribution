package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryFn[Context] extends js.Object {
  /**
  	* Requires opt-in. Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	* the test will fail. A macro may be provided.
  	*/
  def apply[Args /* <: js.Array[_] */](
    fn: js.Array[EitherMacro[Args, Context]],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[js.Array[TryResult]] = js.native
  /**
  	* Requires opt-in. Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	* the test will fail. A macro may be provided.
  	*/
  def apply[Args /* <: js.Array[_] */](
    fn: EitherMacro[Args, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[TryResult] = js.native
  /**
  	* Requires opt-in. Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided. The title may help distinguish attempts from
  	 * one another.
  	 */
  def apply[Args /* <: js.Array[_] */](
    title: String,
    fn: js.Array[EitherMacro[Args, Context]],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[js.Array[TryResult]] = js.native
  /**
  	 * Requires opt-in. Attempt to run some assertions. The result must be explicitly committed or discarded or else
  	 * the test will fail. A macro may be provided. The title may help distinguish attempts from
  	 * one another.
  	 */
  def apply[Args /* <: js.Array[_] */](
    title: String,
    fn: EitherMacro[Args, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): js.Promise[TryResult] = js.native
}

