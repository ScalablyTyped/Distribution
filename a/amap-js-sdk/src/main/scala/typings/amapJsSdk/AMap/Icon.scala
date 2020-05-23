package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  def getImageSize(): Size
  def setImageSize(size: Size): Unit
}

object Icon {
  @scala.inline
  def apply(getImageSize: () => Size, setImageSize: Size => Unit): Icon = {
    val __obj = js.Dynamic.literal(getImageSize = js.Any.fromFunction0(getImageSize), setImageSize = js.Any.fromFunction1(setImageSize))
    __obj.asInstanceOf[Icon]
  }
}

