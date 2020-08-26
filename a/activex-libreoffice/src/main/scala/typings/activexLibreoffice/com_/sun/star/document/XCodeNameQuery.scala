package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XCodeNameQuery extends js.Object {
  def getCodeNameForContainer(aObj: XInterface): String = js.native
  def getCodeNameForObject(aObj: XInterface): String = js.native
}

object XCodeNameQuery {
  @scala.inline
  def apply(getCodeNameForContainer: XInterface => String, getCodeNameForObject: XInterface => String): XCodeNameQuery = {
    val __obj = js.Dynamic.literal(getCodeNameForContainer = js.Any.fromFunction1(getCodeNameForContainer), getCodeNameForObject = js.Any.fromFunction1(getCodeNameForObject))
    __obj.asInstanceOf[XCodeNameQuery]
  }
  @scala.inline
  implicit class XCodeNameQueryOps[Self <: XCodeNameQuery] (val x: Self) extends AnyVal {
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
    def setGetCodeNameForContainer(value: XInterface => String): Self = this.set("getCodeNameForContainer", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCodeNameForObject(value: XInterface => String): Self = this.set("getCodeNameForObject", js.Any.fromFunction1(value))
  }
  
}

