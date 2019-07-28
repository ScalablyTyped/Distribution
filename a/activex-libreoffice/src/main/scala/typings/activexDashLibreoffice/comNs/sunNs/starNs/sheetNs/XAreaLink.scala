package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to change the settings of a linked cell range.
  * @see com.sun.star.sheet.CellAreaLink
  */
trait XAreaLink extends XInterface {
  /** returns the position of the linked range in the destination document. */
  var DestArea: CellRangeAddress
  /**
    * returns the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  var SourceArea: String
  /** returns the position of the linked range in the destination document. */
  def getDestArea(): CellRangeAddress
  /**
    * returns the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  def getSourceArea(): String
  /** sets the position of the linked range in the destination document. */
  def setDestArea(aDestArea: CellRangeAddress): Unit
  /**
    * sets the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  def setSourceArea(aSourceArea: String): Unit
}

object XAreaLink {
  @scala.inline
  def apply(
    DestArea: CellRangeAddress,
    SourceArea: String,
    acquire: () => Unit,
    getDestArea: () => CellRangeAddress,
    getSourceArea: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDestArea: CellRangeAddress => Unit,
    setSourceArea: String => Unit
  ): XAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea, SourceArea = SourceArea, acquire = js.Any.fromFunction0(acquire), getDestArea = js.Any.fromFunction0(getDestArea), getSourceArea = js.Any.fromFunction0(getSourceArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDestArea = js.Any.fromFunction1(setDestArea), setSourceArea = js.Any.fromFunction1(setSourceArea))
  
    __obj.asInstanceOf[XAreaLink]
  }
}

