package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows initiating an update of linked parts of a document. */
@js.native
trait XLinkUpdate extends XInterface {
  /** initiates the reloading of all linked document content like linked graphics, linked text sections. */
  def updateLinks(): Unit = js.native
}

object XLinkUpdate {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateLinks: () => Unit
  ): XLinkUpdate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateLinks = js.Any.fromFunction0(updateLinks))
    __obj.asInstanceOf[XLinkUpdate]
  }
  @scala.inline
  implicit class XLinkUpdateOps[Self <: XLinkUpdate] (val x: Self) extends AnyVal {
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
    def setUpdateLinks(value: () => Unit): Self = this.set("updateLinks", js.Any.fromFunction0(value))
  }
  
}

