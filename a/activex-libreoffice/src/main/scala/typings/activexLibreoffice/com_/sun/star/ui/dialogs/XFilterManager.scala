package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a filter manager interface for a {@link FilePicker} */
@js.native
trait XFilterManager extends XInterface {
  /**
    * Returns the currently selected filter.
    * @returns The name of the selected filter or an empty string if there is no filter or no filter is currently selected.
    */
  var CurrentFilter: String = js.native
  /**
    * Adds a filter identified by a title.
    * @param aTitle Specifies the name of the filter as shown in the filter box of the {@link FilePicker} dialog.
    * @param aFilter Specifies the extensions of the filter. Multiple filters should be semicolon separated. The semicolon may not be used as character in a f
    * @throws com::sun::star::lang::IllegalArgumentException If a filter with the specified title already exists.
    */
  def appendFilter(aTitle: String, aFilter: String): Unit = js.native
  /**
    * Returns the currently selected filter.
    * @returns The name of the selected filter or an empty string if there is no filter or no filter is currently selected.
    */
  def getCurrentFilter(): String = js.native
  /**
    * Sets the current filter.
    * @param aTitle Specifies the name of the filter to be set.
    * @throws com::sun::star::lang::IllegalArgumentException If the specified filter was not found.
    */
  def setCurrentFilter(aTitle: String): Unit = js.native
}

object XFilterManager {
  @scala.inline
  def apply(
    CurrentFilter: String,
    acquire: () => Unit,
    appendFilter: (String, String) => Unit,
    getCurrentFilter: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentFilter: String => Unit
  ): XFilterManager = {
    val __obj = js.Dynamic.literal(CurrentFilter = CurrentFilter.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendFilter = js.Any.fromFunction2(appendFilter), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter))
    __obj.asInstanceOf[XFilterManager]
  }
  @scala.inline
  implicit class XFilterManagerOps[Self <: XFilterManager] (val x: Self) extends AnyVal {
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
    def setCurrentFilter(value: String): Self = this.set("CurrentFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppendFilter(value: (String, String) => Unit): Self = this.set("appendFilter", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCurrentFilter(value: () => String): Self = this.set("getCurrentFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCurrentFilter(value: String => Unit): Self = this.set("setCurrentFilter", js.Any.fromFunction1(value))
  }
  
}

