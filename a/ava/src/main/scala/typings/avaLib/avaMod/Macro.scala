package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Macro[Args /* <: js.Array[_] */, Context] extends js.Object {
  /**
  	 * Implement this function to generate a test (or hook) title whenever this macro is used. `providedTitle` contains
  	 * the title provided when the test or hook was declared. Also receives the remaining test arguments.
  	 */
  var title: js.UndefOr[
    js.Function2[/* providedTitle */ js.UndefOr[java.lang.String], /* args */ Args, java.lang.String]
  ] = js.native
  def apply(
    t: ExecutionContext[Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): ImplementationResult = js.native
}

