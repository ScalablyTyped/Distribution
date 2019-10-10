package typings.autocannon.autocannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autocannon", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: Options): js.Promise[Result] = js.native
  /**
    * Start autocannon against the given target.
    */
  def apply(options: Options, callback: js.Function2[/* err */ js.Any, /* result */ Result, _]): Instance = js.native
}

