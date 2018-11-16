package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastService extends js.Object {
  def build(): IToastPreset[_] = js.native
  def cancel(): scala.Unit = js.native
  def cancel(response: js.Any): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def hide(response: js.Any): scala.Unit = js.native
  def show(optionsOrPreset: IToastOptions): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def show(optionsOrPreset: IToastPreset[_]): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def showSimple(content: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def simple(): ISimpleToastPreset = js.native
  def updateContent(newContent: java.lang.String): scala.Unit = js.native
  def updateTextContent(newContent: java.lang.String): scala.Unit = js.native
}

