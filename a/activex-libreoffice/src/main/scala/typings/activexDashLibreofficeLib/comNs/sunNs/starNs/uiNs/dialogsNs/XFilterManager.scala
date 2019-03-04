package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a filter manager interface for a {@link FilePicker} */
trait XFilterManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the currently selected filter.
    * @returns The name of the selected filter or an empty string if there is no filter or no filter is currently selected.
    */
  var CurrentFilter: java.lang.String
  /**
    * Adds a filter identified by a title.
    * @param aTitle Specifies the name of the filter as shown in the filter box of the {@link FilePicker} dialog.
    * @param aFilter Specifies the extensions of the filter. Multiple filters should be semicolon separated. The semicolon may not be used as character in a f
    * @throws com::sun::star::lang::IllegalArgumentException If a filter with the specified title already exists.
    */
  def appendFilter(aTitle: java.lang.String, aFilter: java.lang.String): scala.Unit
  /**
    * Returns the currently selected filter.
    * @returns The name of the selected filter or an empty string if there is no filter or no filter is currently selected.
    */
  def getCurrentFilter(): java.lang.String
  /**
    * Sets the current filter.
    * @param aTitle Specifies the name of the filter to be set.
    * @throws com::sun::star::lang::IllegalArgumentException If the specified filter was not found.
    */
  def setCurrentFilter(aTitle: java.lang.String): scala.Unit
}

object XFilterManager {
  @scala.inline
  def apply(
    CurrentFilter: java.lang.String,
    acquire: js.Function0[scala.Unit],
    appendFilter: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    getCurrentFilter: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCurrentFilter: js.Function1[java.lang.String, scala.Unit]
  ): XFilterManager = {
    val __obj = js.Dynamic.literal(CurrentFilter = CurrentFilter, acquire = acquire, appendFilter = appendFilter, getCurrentFilter = getCurrentFilter, queryInterface = queryInterface, release = release, setCurrentFilter = setCurrentFilter)
  
    __obj.asInstanceOf[XFilterManager]
  }
}

