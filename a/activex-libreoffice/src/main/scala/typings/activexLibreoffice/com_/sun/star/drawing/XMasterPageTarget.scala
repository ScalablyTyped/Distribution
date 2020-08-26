package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by objects that can be linked to a {@link MasterPage} .
  * @see DrawPage
  */
@js.native
trait XMasterPageTarget extends XInterface {
  /** @returns the {@link MasterPage} linked to this object. */
  var MasterPage: XDrawPage = js.native
  /** @returns the {@link MasterPage} linked to this object. */
  def getMasterPage(): XDrawPage = js.native
  /**
    * links a {@link MasterPage} to this object.
    * @param xMasterPage the {@link MasterPage} that is linked to this object
    */
  def setMasterPage(xMasterPage: XDrawPage): Unit = js.native
}

object XMasterPageTarget {
  @scala.inline
  def apply(
    MasterPage: XDrawPage,
    acquire: () => Unit,
    getMasterPage: () => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMasterPage: XDrawPage => Unit
  ): XMasterPageTarget = {
    val __obj = js.Dynamic.literal(MasterPage = MasterPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMasterPage = js.Any.fromFunction0(getMasterPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMasterPage = js.Any.fromFunction1(setMasterPage))
    __obj.asInstanceOf[XMasterPageTarget]
  }
  @scala.inline
  implicit class XMasterPageTargetOps[Self <: XMasterPageTarget] (val x: Self) extends AnyVal {
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
    def setMasterPage(value: XDrawPage): Self = this.set("MasterPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMasterPage(value: () => XDrawPage): Self = this.set("getMasterPage", js.Any.fromFunction0(value))
    @scala.inline
    def setSetMasterPage(value: XDrawPage => Unit): Self = this.set("setMasterPage", js.Any.fromFunction1(value))
  }
  
}

