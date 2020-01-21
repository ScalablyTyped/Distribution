package typings.antdMobileRn.imageRollNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollProps extends js.Object {
  def onCancel(): Unit
  def onSelected(imgObj: js.Object): Unit
}

object ImageRollProps {
  @scala.inline
  def apply(onCancel: () => Unit, onSelected: js.Object => Unit): ImageRollProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
  
    __obj.asInstanceOf[ImageRollProps]
  }
}

