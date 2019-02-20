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

