package typings
package angularDashLoadLib.angularNs.loadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAngularLoadService extends js.Object {
  def loadCSS(url: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def loadScript(url: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
}

object IAngularLoadService {
  @scala.inline
  def apply(
    loadCSS: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]],
    loadScript: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]]
  ): IAngularLoadService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadCSS")(loadCSS)
    __obj.updateDynamic("loadScript")(loadScript)
    __obj.asInstanceOf[IAngularLoadService]
  }
}

