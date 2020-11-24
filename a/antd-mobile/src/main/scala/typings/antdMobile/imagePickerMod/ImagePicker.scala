package typings.antdMobile.imagePickerMod

import typings.react.mod.Component
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePicker
  extends Component[ImagePickerPropTypes, js.Any, js.Any] {
  
  def addImage(imgItem: js.Any): Unit = js.native
  
  var fileSelectorInput: HTMLInputElement | Null = js.native
  
  def getOrientation(file: js.Any, callback: js.Function1[/* _ */ Double, Unit]): Unit = js.native
  
  def getRotation(): Double = js.native
  def getRotation(orientation: Double): Double = js.native
  
  def onFileChange(): Unit = js.native
  
  def onImageClick(index: Double): Unit = js.native
  
  def parseFile(file: js.Any, index: Double): js.Promise[js.Object] = js.native
  
  def removeImage(index: Double): Unit = js.native
}
