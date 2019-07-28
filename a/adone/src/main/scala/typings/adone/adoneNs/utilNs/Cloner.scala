package typings.adone.adoneNs.utilNs

import typings.adone.adoneNs.utilNs.INs.CloneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.util.Cloner")
@js.native
class Cloner () extends js.Object {
  /**
    * Returns a clone function that is binded to this cloner
    */
  def binding(): js.Function2[/* obj */ js.Any, /* options */ js.UndefOr[CloneOptions], _] = js.native
  /**
    * Clones the given object
    */
  def clone(obj: js.Any): js.Any = js.native
  def clone(obj: js.Any, options: CloneOptions): js.Any = js.native
}

