package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModel extends js.Object {
  def getTitle(): java.lang.String
}

object ViewModel {
  @scala.inline
  def apply(getTitle: () => java.lang.String): ViewModel = {
    val __obj = js.Dynamic.literal(getTitle = js.Any.fromFunction0(getTitle))
  
    __obj.asInstanceOf[ViewModel]
  }
}

