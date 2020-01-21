package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastService extends js.Object {
  def build(): IToastPreset[_] = js.native
  def cancel(): Unit = js.native
  def cancel(response: js.Any): Unit = js.native
  def hide(): Unit = js.native
  def hide(response: js.Any): Unit = js.native
  def show(optionsOrPreset: IToastOptions): IPromise[_] = js.native
  def show(optionsOrPreset: IToastPreset[_]): IPromise[_] = js.native
  def showSimple(content: String): IPromise[_] = js.native
  def simple(): ISimpleToastPreset = js.native
  def updateContent(newContent: String): Unit = js.native
  def updateTextContent(newContent: String): Unit = js.native
}

