package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastService extends StObject {
  
  def build(): IToastPreset[Any] = js.native
  
  def cancel(): Unit = js.native
  def cancel(response: Any): Unit = js.native
  
  def hide(): Unit = js.native
  def hide(response: Any): Unit = js.native
  
  def show(optionsOrPreset: IToastOptions): IPromise[Any] = js.native
  def show(optionsOrPreset: IToastPreset[Any]): IPromise[Any] = js.native
  
  def showSimple(content: String): IPromise[Any] = js.native
  
  def simple(): ISimpleToastPreset = js.native
  
  def updateContent(newContent: String): Unit = js.native
  
  def updateTextContent(newContent: String): Unit = js.native
}
