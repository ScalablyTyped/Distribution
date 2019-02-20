package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the members in a collection of named ranges and to insert and remove them.
  * @see com.sun.star.sheet.NamedRanges
  * @see com.sun.star.sheet.NamedRange
  */
trait XNamedRanges
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /**
    * adds a new named range to the collection.
    * @param aName the new name of the named range.
    * @param aContent the formula expression.  A cell range address is one possible content of a named range.
    * @param aPosition specifies the base address for relative cell references.
    * @param nType a combination of flags that specify the type of a named range, as defined in {@link NamedRangeFlag} .  This parameter will be zero for any
    */
  def addNewByName(
    aName: java.lang.String,
    aContent: java.lang.String,
    aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    nType: scala.Double
  ): scala.Unit
  /**
    * creates named cell ranges from titles in a cell range.
    *
    * The names for the named ranges are taken from title cells in the top or bottom row, or from the cells of the left or right column of the range
    * (depending on the parameter aBorder. The named ranges refer to single columns or rows in the inner part of the original range, excluding the labels.
    *
    * Example: The source range is A1:B3. The named ranges shall be created using row titles. This requires Border::TOP for the second parameter. The method
    * creates two named ranges. The name of the first is equal to the content of cell A1 and contains the range $Sheet.$A$2:$A$3 (excluding the title cell).
    * The latter named range is named using cell B1 and contains the cell range address $Sheet.$B$2:$B$3.
    * @param aSource the cell range used to create the named ranges.
    * @param aBorder specifies the location of the title cells.
    */
  def addNewFromTitles(aSource: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, aBorder: Border): scala.Unit
  /**
    * writes a list of all named ranges into the document.
    *
    * The first column of the list contains the names. The second column contains the contents of the named ranges.
    * @param aOutputPosition specifies the top left cell of the output range.
    */
  def outputList(aOutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Unit
  /** removes a named range from the collection. */
  def removeByName(aName: java.lang.String): scala.Unit
}

