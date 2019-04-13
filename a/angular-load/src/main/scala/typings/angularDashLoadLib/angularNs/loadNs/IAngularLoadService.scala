package typings
package angularDashLoadLib.angularNs.loadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAngularLoadService extends js.Object {
  def loadCSS(url: java.lang.String): angularLib.angularMod.IPromise[_]
  def loadScript(url: java.lang.String): angularLib.angularMod.IPromise[_]
}

object IAngularLoadService {
  @scala.inline
  def apply(
    loadCSS: java.lang.String => angularLib.angularMod.IPromise[_],
    loadScript: java.lang.String => angularLib.angularMod.IPromise[_]
  ): IAngularLoadService = {
    val __obj = js.Dynamic.literal(loadCSS = js.Any.fromFunction1(loadCSS), loadScript = js.Any.fromFunction1(loadScript))
  
    __obj.asInstanceOf[IAngularLoadService]
  }
}

