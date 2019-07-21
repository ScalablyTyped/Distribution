package typings
package atAntDashDesignReactDashNativeLib.esImageDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePicker
  extends reactLib.reactMod.Component[ImagePickerProps, js.Any, js.Any] {
  var plusText: js.Any = js.native
  var plusWrap: js.Any = js.native
  def addImage(imageObj: js.Any): scala.Unit = js.native
  def hideImageRoll(): scala.Unit = js.native
  def onImageClick(index: scala.Double): scala.Unit = js.native
  def onPressIn(styles: atAntDashDesignReactDashNativeLib.Anon_CloseText): js.Function0[scala.Unit] = js.native
  def onPressOut(styles: atAntDashDesignReactDashNativeLib.Anon_CloseText): js.Function0[scala.Unit] = js.native
  def removeImage(idx: scala.Double): scala.Unit = js.native
  def showPicker(): scala.Unit = js.native
}

