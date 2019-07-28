package typings.angularDashLoad.angularNs.loadNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAngularLoadService extends js.Object {
  def loadCSS(url: String): IPromise[_]
  def loadScript(url: String): IPromise[_]
}

object IAngularLoadService {
  @scala.inline
  def apply(loadCSS: String => IPromise[_], loadScript: String => IPromise[_]): IAngularLoadService = {
    val __obj = js.Dynamic.literal(loadCSS = js.Any.fromFunction1(loadCSS), loadScript = js.Any.fromFunction1(loadScript))
  
    __obj.asInstanceOf[IAngularLoadService]
  }
}

