package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to change the settings of a linked cell range.
  * @see com.sun.star.sheet.CellAreaLink
  */
trait XAreaLink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the position of the linked range in the destination document. */
  var DestArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /**
    * returns the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  var SourceArea: java.lang.String
  /** returns the position of the linked range in the destination document. */
  def getDestArea(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /**
    * returns the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  def getSourceArea(): java.lang.String
  /** sets the position of the linked range in the destination document. */
  def setDestArea(aDestArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
  /**
    * sets the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  def setSourceArea(aSourceArea: java.lang.String): scala.Unit
}

object XAreaLink {
  @scala.inline
  def apply(
    DestArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    SourceArea: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getDestArea: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getSourceArea: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDestArea: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    setSourceArea: js.Function1[java.lang.String, scala.Unit]
  ): XAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea, SourceArea = SourceArea, acquire = acquire, getDestArea = getDestArea, getSourceArea = getSourceArea, queryInterface = queryInterface, release = release, setDestArea = setDestArea, setSourceArea = setSourceArea)
  
    __obj.asInstanceOf[XAreaLink]
  }
}

