package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the members in a collection of named ranges and to insert and remove them.
  * @see com.sun.star.sheet.NamedRanges
  * @see com.sun.star.sheet.NamedRange
  */
@js.native
trait XNamedRanges extends XNameAccess {
  
  /**
    * adds a new named range to the collection.
    * @param aName the new name of the named range.
    * @param aContent the formula expression.  A cell range address is one possible content of a named range.
    * @param aPosition specifies the base address for relative cell references.
    * @param nType a combination of flags that specify the type of a named range, as defined in {@link NamedRangeFlag} .  This parameter will be zero for any
    */
  def addNewByName(aName: String, aContent: String, aPosition: CellAddress, nType: Double): Unit = js.native
  
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
  def addNewFromTitles(aSource: CellRangeAddress, aBorder: Border): Unit = js.native
  
  /**
    * writes a list of all named ranges into the document.
    *
    * The first column of the list contains the names. The second column contains the contents of the named ranges.
    * @param aOutputPosition specifies the top left cell of the output range.
    */
  def outputList(aOutputPosition: CellAddress): Unit = js.native
  
  /** removes a named range from the collection. */
  def removeByName(aName: String): Unit = js.native
}
object XNamedRanges {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addNewByName: (String, String, CellAddress, Double) => Unit,
    addNewFromTitles: (CellRangeAddress, Border) => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    outputList: CellAddress => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): XNamedRanges = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNewByName = js.Any.fromFunction4(addNewByName), addNewFromTitles = js.Any.fromFunction2(addNewFromTitles), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), outputList = js.Any.fromFunction1(outputList), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
    __obj.asInstanceOf[XNamedRanges]
  }
  
  @scala.inline
  implicit class XNamedRangesMutableBuilder[Self <: XNamedRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNewByName(value: (String, String, CellAddress, Double) => Unit): Self = StObject.set(x, "addNewByName", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddNewFromTitles(value: (CellRangeAddress, Border) => Unit): Self = StObject.set(x, "addNewFromTitles", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOutputList(value: CellAddress => Unit): Self = StObject.set(x, "outputList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveByName(value: String => Unit): Self = StObject.set(x, "removeByName", js.Any.fromFunction1(value))
  }
}
