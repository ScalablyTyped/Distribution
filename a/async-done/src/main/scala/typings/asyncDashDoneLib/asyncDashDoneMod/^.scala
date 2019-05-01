package typings
package asyncDashDoneLib.asyncDashDoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-done", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Takes a function to execute (`fn`) and a function to call on completion (`callback`).
    *
    * @param fn Function to execute.
    * @param callback Function to call on completion.
    */
  def apply[R](fn: AsyncTask[R], callback: Callback[R]): scala.Unit = js.native
}

