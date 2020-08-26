package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to some properties describing all open views to a document
  *
  * Each view is described by a sequence< ::com::sun::star::beans::PropertyValue >. Through this interface the state of all open views can be retrieved
  * and restored later. These states can also be made persistent so that a document loader can create all views of the correct types and restore their
  * state to the state when the document was saved.
  */
@js.native
trait XViewDataSupplier extends XInterface {
  /**
    * retrieve information about currently opened view to restore it later
    * @returns a {@link com.sun.star.container.XIndexAccess} , that gives access to a list of {@link com.sun.star.beans.PropertyValue} for every open view. May
    */
  var ViewData: XIndexAccess = js.native
  /**
    * retrieve information about currently opened view to restore it later
    * @returns a {@link com.sun.star.container.XIndexAccess} , that gives access to a list of {@link com.sun.star.beans.PropertyValue} for every open view. May
    */
  def getViewData(): XIndexAccess = js.native
  /**
    * restore all views which will be represented by given data argument
    * @param Data a list of {@link com.sun.star.beans.PropertyValues} with information about last opened views to restore it `NULL` isn't allowed here.
    */
  def setViewData(Data: XIndexAccess): Unit = js.native
}

object XViewDataSupplier {
  @scala.inline
  def apply(
    ViewData: XIndexAccess,
    acquire: () => Unit,
    getViewData: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setViewData: XIndexAccess => Unit
  ): XViewDataSupplier = {
    val __obj = js.Dynamic.literal(ViewData = ViewData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViewData = js.Any.fromFunction0(getViewData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setViewData = js.Any.fromFunction1(setViewData))
    __obj.asInstanceOf[XViewDataSupplier]
  }
  @scala.inline
  implicit class XViewDataSupplierOps[Self <: XViewDataSupplier] (val x: Self) extends AnyVal {
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
    def setViewData(value: XIndexAccess): Self = this.set("ViewData", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetViewData(value: () => XIndexAccess): Self = this.set("getViewData", js.Any.fromFunction0(value))
    @scala.inline
    def setSetViewData(value: XIndexAccess => Unit): Self = this.set("setViewData", js.Any.fromFunction1(value))
  }
  
}

