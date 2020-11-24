package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a collection of collections of equal-formatted cell ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
@js.native
trait XUniqueCellFormatRangesSupplier extends XInterface {
  
  /**
    * returns a collection of equal-formatted cell range collections.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    *
    * All equal-formatted ranges are consolidated into one collection. These collections are the members contained in a {@link UniqueCellFormatRanges}
    * collection.
    * @returns the collection of equal-formatted cell range collections.
    * @see com.sun.star.sheet.UniqueCellFormatRanges
    */
  val UniqueCellFormatRanges: XIndexAccess = js.native
  
  /**
    * returns a collection of equal-formatted cell range collections.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    *
    * All equal-formatted ranges are consolidated into one collection. These collections are the members contained in a {@link UniqueCellFormatRanges}
    * collection.
    * @returns the collection of equal-formatted cell range collections.
    * @see com.sun.star.sheet.UniqueCellFormatRanges
    */
  def getUniqueCellFormatRanges(): XIndexAccess = js.native
}
object XUniqueCellFormatRangesSupplier {
  
  @scala.inline
  def apply(
    UniqueCellFormatRanges: XIndexAccess,
    acquire: () => Unit,
    getUniqueCellFormatRanges: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUniqueCellFormatRangesSupplier = {
    val __obj = js.Dynamic.literal(UniqueCellFormatRanges = UniqueCellFormatRanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getUniqueCellFormatRanges = js.Any.fromFunction0(getUniqueCellFormatRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUniqueCellFormatRangesSupplier]
  }
  
  @scala.inline
  implicit class XUniqueCellFormatRangesSupplierOps[Self <: XUniqueCellFormatRangesSupplier] (val x: Self) extends AnyVal {
    
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
    def setUniqueCellFormatRanges(value: XIndexAccess): Self = this.set("UniqueCellFormatRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUniqueCellFormatRanges(value: () => XIndexAccess): Self = this.set("getUniqueCellFormatRanges", js.Any.fromFunction0(value))
  }
}
