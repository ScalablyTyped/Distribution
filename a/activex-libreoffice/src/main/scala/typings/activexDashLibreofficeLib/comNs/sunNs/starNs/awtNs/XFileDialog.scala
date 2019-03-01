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
    acquire: js.Function0[scala.Unit],
    getCurrentFilter: js.Function0[java.lang.String],
    getPath: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCurrentFilter: js.Function1[java.lang.String, scala.Unit],
    setFilters: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      scala.Unit
    ],
    setPath: js.Function1[java.lang.String, scala.Unit]
  ): XFileDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentFilter")(CurrentFilter)
    __obj.updateDynamic("Path")(Path)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getCurrentFilter")(getCurrentFilter)
    __obj.updateDynamic("getPath")(getPath)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setCurrentFilter")(setCurrentFilter)
    __obj.updateDynamic("setFilters")(setFilters)
    __obj.updateDynamic("setPath")(setPath)
    __obj.asInstanceOf[XFileDialog]
  }
}

