package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to a file dialog.
  * @deprecated Deprecated
  */
trait XFileDialog extends XInterface {
  /** returns the currently selected filter. */
  var CurrentFilter: String
  /** returns the path. */
  var Path: String
  /** returns the currently selected filter. */
  def getCurrentFilter(): String
  /** returns the path. */
  def getPath(): String
  /** sets the current filter. */
  def setCurrentFilter(Filter: String): Unit
  /** sets the filters. */
  def setFilters(rFilterNames: SeqEquiv[String], rMasks: SeqEquiv[String]): Unit
  /** sets the path. */
  def setPath(Path: String): Unit
}

object XFileDialog {
  @scala.inline
  def apply(
    CurrentFilter: String,
    Path: String,
    acquire: () => Unit,
    getCurrentFilter: () => String,
    getPath: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentFilter: String => Unit,
    setFilters: (SeqEquiv[String], SeqEquiv[String]) => Unit,
    setPath: String => Unit
  ): XFileDialog = {
    val __obj = js.Dynamic.literal(CurrentFilter = CurrentFilter, Path = Path, acquire = js.Any.fromFunction0(acquire), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), getPath = js.Any.fromFunction0(getPath), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter), setFilters = js.Any.fromFunction2(setFilters), setPath = js.Any.fromFunction1(setPath))
  
    __obj.asInstanceOf[XFileDialog]
  }
}

