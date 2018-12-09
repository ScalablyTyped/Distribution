package typings
package adoneLib.adoneNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.util.Cloner")
@js.native
class Cloner () extends js.Object {
  /**
               * Returns a clone function that is binded to this cloner
               */
  def binding(): js.Function2[
    /* obj */ js.Any, 
    /* options */ js.UndefOr[adoneLib.adoneNs.utilNs.INs.CloneOptions], 
    _
  ] = js.native
  /**
               * Clones the given object
               */
  def clone(obj: js.Any): js.Any = js.native
  /**
               * Clones the given object
               */
  def clone(obj: js.Any, options: adoneLib.adoneNs.utilNs.INs.CloneOptions): js.Any = js.native
}

