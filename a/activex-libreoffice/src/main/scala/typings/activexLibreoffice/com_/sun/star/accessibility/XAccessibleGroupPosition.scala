package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAccessibleGroupPosition extends XInterface {
  def getGroupPosition(accoject: js.Any): SafeArray[Double] = js.native
  def getObjectLink(accoject: js.Any): String = js.native
}

object XAccessibleGroupPosition {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getGroupPosition: js.Any => SafeArray[Double],
    getObjectLink: js.Any => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleGroupPosition = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getGroupPosition = js.Any.fromFunction1(getGroupPosition), getObjectLink = js.Any.fromFunction1(getObjectLink), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleGroupPosition]
  }
  @scala.inline
  implicit class XAccessibleGroupPositionOps[Self <: XAccessibleGroupPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetGroupPosition(value: js.Any => SafeArray[Double]): Self = this.set("getGroupPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setGetObjectLink(value: js.Any => String): Self = this.set("getObjectLink", js.Any.fromFunction1(value))
  }
  
}

