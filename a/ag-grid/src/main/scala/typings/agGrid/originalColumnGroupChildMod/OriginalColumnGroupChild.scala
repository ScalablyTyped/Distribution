package typings.agGrid.originalColumnGroupChildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalColumnGroupChild extends js.Object {
  def getColumnGroupShow(): String
  def getId(): String
  def isVisible(): Boolean
}

object OriginalColumnGroupChild {
  @scala.inline
  def apply(getColumnGroupShow: () => String, getId: () => String, isVisible: () => Boolean): OriginalColumnGroupChild = {
    val __obj = js.Dynamic.literal(getColumnGroupShow = js.Any.fromFunction0(getColumnGroupShow), getId = js.Any.fromFunction0(getId), isVisible = js.Any.fromFunction0(isVisible))
    __obj.asInstanceOf[OriginalColumnGroupChild]
  }
}

