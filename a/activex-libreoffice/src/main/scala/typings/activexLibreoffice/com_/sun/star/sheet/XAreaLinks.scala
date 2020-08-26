package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access via index to a collection of area links and inserting and removing area links.
  * @see com.sun.star.sheet.CellAreaLinks
  * @see com.sun.star.sheet.CellAreaLink
  */
@js.native
trait XAreaLinks extends XIndexAccess {
  /**
    * creates an area link and adds it to the collection.
    * @param aDestPos the address of the first cell of the range inside the current document.
    * @param aFileName the URL of the source document.
    * @param aSourceArea the name of the range in the source document.  This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of
    * @param aFilter the name of the filter used to load the source document.
    * @param aFilterOptions optional filter options for the specified filter.
    */
  def insertAtPosition(
    aDestPos: CellAddress,
    aFileName: String,
    aSourceArea: String,
    aFilter: String,
    aFilterOptions: String
  ): Unit = js.native
  /** removes an area link from the collection. */
  def removeByIndex(nIndex: Double): Unit = js.native
}

object XAreaLinks {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertAtPosition: (CellAddress, String, String, String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit
  ): XAreaLinks = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertAtPosition = js.Any.fromFunction5(insertAtPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex))
    __obj.asInstanceOf[XAreaLinks]
  }
  @scala.inline
  implicit class XAreaLinksOps[Self <: XAreaLinks] (val x: Self) extends AnyVal {
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
    def setInsertAtPosition(value: (CellAddress, String, String, String, String) => Unit): Self = this.set("insertAtPosition", js.Any.fromFunction5(value))
    @scala.inline
    def setRemoveByIndex(value: Double => Unit): Self = this.set("removeByIndex", js.Any.fromFunction1(value))
  }
  
}

