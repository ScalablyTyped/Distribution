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
    acquire: js.Function0[scala.Unit],
    expand: js.Function1[XDrawPage, XDrawPages],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    insertNewByIndex: js.Function1[scala.Double, XDrawPage],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[XDrawPage, scala.Unit],
    summarize: js.Function1[XDrawPages, XDrawPage]
  ): DrawPages = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, expand = expand, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, insertNewByIndex = insertNewByIndex, queryInterface = queryInterface, release = release, remove = remove, summarize = summarize)
  
    __obj.asInstanceOf[DrawPages]
  }
}

