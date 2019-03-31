package typings
package antdDashMobileLib.libImageDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePicker
  extends reactLib.reactMod.Component[ImagePickerPropTypes, js.Any, js.Any] {
  var fileSelectorInput: stdLib.HTMLInputElement | scala.Null = js.native
  def addImage(imgItem: js.Any): scala.Unit = js.native
  def getOrientation(file: js.Any, callback: js.Function1[/* _ */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getRotation(): scala.Double = js.native
  def getRotation(orientation: scala.Double): scala.Double = js.native
  def onFileChange(): scala.Unit = js.native
  def onImageClick(index: scala.Double): scala.Unit = js.native
  def parseFile(file: js.Any, index: scala.Double): js.Promise[js.Object] = js.native
  def removeImage(index: scala.Double): scala.Unit = js.native
}

