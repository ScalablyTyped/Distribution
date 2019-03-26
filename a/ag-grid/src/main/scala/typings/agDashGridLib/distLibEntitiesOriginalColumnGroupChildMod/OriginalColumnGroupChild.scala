package typings
package agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalColumnGroupChild extends js.Object {
  def getColumnGroupShow(): java.lang.String
  def getId(): java.lang.String
  def isVisible(): scala.Boolean
}

object OriginalColumnGroupChild {
  @scala.inline
  def apply(
    getColumnGroupShow: () => java.lang.String,
    getId: () => java.lang.String,
    isVisible: () => scala.Boolean
  ): OriginalColumnGroupChild = {
    val __obj = js.Dynamic.literal(getColumnGroupShow = js.Any.fromFunction0(getColumnGroupShow), getId = js.Any.fromFunction0(getId), isVisible = js.Any.fromFunction0(isVisible))
  
    __obj.asInstanceOf[OriginalColumnGroupChild]
  }
}

