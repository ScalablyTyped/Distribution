package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a container of {@link DrawPages} and makes it possible for you to manipulate them.
  * @see XDrawPagesSupplier
  * @see DrawingDocument
  */
trait DrawPages
  extends XDrawPages
     with XDrawPageSummarizer
     with XDrawPageExpander

object DrawPages {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    expand: XDrawPage => XDrawPages,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    insertNewByIndex: scala.Double => XDrawPage,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: XDrawPage => scala.Unit,
    summarize: XDrawPages => XDrawPage
  ): DrawPages = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), expand = js.Any.fromFunction1(expand), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), summarize = js.Any.fromFunction1(summarize))
  
    __obj.asInstanceOf[DrawPages]
  }
}

