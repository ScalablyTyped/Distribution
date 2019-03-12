package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to a file dialog.
  * @deprecated Deprecated
  */
trait XFileDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the currently selected filter. */
  var CurrentFilter: java.lang.String
  /** returns the path. */
  var Path: java.lang.String
  /** returns the currently selected filter. */
  def getCurrentFilter(): java.lang.String
  /** returns the path. */
  def getPath(): java.lang.String
  /** sets the current filter. */
  def setCurrentFilter(Filter: java.lang.String): scala.Unit
  /** sets the filters. */
  def setFilters(
    rFilterNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    rMasks: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): scala.Unit
  /** sets the path. */
  def setPath(Path: java.lang.String): scala.Unit
}

object XFileDialog {
  @scala.inline
  def apply(
    CurrentFilter: java.lang.String,
    Path: java.lang.String,
    acquire: () => scala.Unit,
    getCurrentFilter: () => java.lang.String,
    getPath: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setCurrentFilter: java.lang.String => scala.Unit,
    setFilters: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => scala.Unit,
    setPath: java.lang.String => scala.Unit
  ): XFileDialog = {
    val __obj = js.Dynamic.literal(CurrentFilter = CurrentFilter, Path = Path, acquire = js.Any.fromFunction0(acquire), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), getPath = js.Any.fromFunction0(getPath), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter), setFilters = js.Any.fromFunction2(setFilters), setPath = js.Any.fromFunction1(setPath))
  
    __obj.asInstanceOf[XFileDialog]
  }
}

