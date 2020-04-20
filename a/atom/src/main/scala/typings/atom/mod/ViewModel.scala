package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModel extends js.Object {
  def getTitle(): String
}

object ViewModel {
  @scala.inline
  def apply(getTitle: () => String): ViewModel = {
    val __obj = js.Dynamic.literal(getTitle = js.Any.fromFunction0(getTitle))
    __obj.asInstanceOf[ViewModel]
  }
}

