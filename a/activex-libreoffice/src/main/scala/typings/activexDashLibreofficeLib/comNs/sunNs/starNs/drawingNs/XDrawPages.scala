package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to a container of {@link DrawPages} or {@link MasterPages} .
  *
  * The pages are stored in an index container. The order is determined by the index.
  *
  * You usually get this interface if you use the {@link XDrawPagesSupplier} or the {@link XMasterPagesSupplier} at a model that contains {@link
  * DrawPages} or {@link MasterPages}
  */
trait XDrawPages
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * creates and inserts a new {@link DrawPage} or {@link MasterPage} into this container
    * @param nIndex the index at which the newly created {@link DrawPage} or {@link MasterPage} will be inserted.
    * @returns the newly created and already inserted {@link DrawPage} or {@link MasterPage} .
    */
  def insertNewByIndex(nIndex: scala.Double): XDrawPage
  /**
    * removes a {@link DrawPage} or {@link MasterPage} from this container.
    * @param xPage this {@link DrawPage} or {@link MasterPage} must be contained and will be removed from this container. It will also be disposed and shouldn
    */
  def remove(xPage: XDrawPage): scala.Unit
}

object XDrawPages {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    insertNewByIndex: scala.Double => XDrawPage,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: XDrawPage => scala.Unit
  ): XDrawPages = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[XDrawPages]
  }
}

