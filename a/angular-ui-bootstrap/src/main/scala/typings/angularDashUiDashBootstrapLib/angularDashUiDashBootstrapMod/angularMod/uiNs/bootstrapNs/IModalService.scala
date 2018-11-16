package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IModalService extends js.Object {
  /**
               * @returns {IPromise}
               */
  def getPromiseChain(): angularLib.angularMod.angularNs.IPromise[_]
  /**
               * @param {IModalSettings} options
               * @returns {IModalInstanceService}
               */
  def open(options: IModalSettings): IModalInstanceService
}

