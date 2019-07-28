package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to access, add, and remove the {@link Shapes} in a collection.
  * @see DrawPage
  * @see MasterPage
  * @see DrawingDocumentDrawView
  */
trait XShapes extends XIndexAccess {
  /**
    * inserts a {@link Shape} into this collection.
    * @param xShape a {@link Shape} that will be inserted.
    */
  def add(xShape: XShape): Unit
  /**
    * removes a {@link Shape} from this collection.
    * @param xShape the {@link Shape} will be removed from the collection and disposed.
    */
  def remove(xShape: XShape): Unit
}

object XShapes {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    add: XShape => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XShape => Unit
  ): XShapes = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[XShapes]
  }
}

