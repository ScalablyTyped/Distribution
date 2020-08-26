package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XBrowseHistoryRegistry extends XInterface {
  /** @deprecated Deprecated */
  def createNewEntry(URL: String, Arguments: SeqEquiv[PropertyValue], Title: String): Unit = js.native
  /** @deprecated Deprecated */
  def updateViewData(Value: js.Any): Unit = js.native
}

object XBrowseHistoryRegistry {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createNewEntry: (String, SeqEquiv[PropertyValue], String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateViewData: js.Any => Unit
  ): XBrowseHistoryRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createNewEntry = js.Any.fromFunction3(createNewEntry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateViewData = js.Any.fromFunction1(updateViewData))
    __obj.asInstanceOf[XBrowseHistoryRegistry]
  }
  @scala.inline
  implicit class XBrowseHistoryRegistryOps[Self <: XBrowseHistoryRegistry] (val x: Self) extends AnyVal {
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
    def setCreateNewEntry(value: (String, SeqEquiv[PropertyValue], String) => Unit): Self = this.set("createNewEntry", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdateViewData(value: js.Any => Unit): Self = this.set("updateViewData", js.Any.fromFunction1(value))
  }
  
}

