package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to access, add, and remove the {@link Shapes} in a collection.
  * @see DrawPage
  * @see MasterPage
  * @see DrawingDocumentDrawView
  */
trait XShapes
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * inserts a {@link Shape} into this collection.
    * @param xShape a {@link Shape} that will be inserted.
    */
  def add(xShape: XShape): scala.Unit
  /**
    * removes a {@link Shape} from this collection.
    * @param xShape the {@link Shape} will be removed from the collection and disposed.
    */
  def remove(xShape: XShape): scala.Unit
}

object XShapes {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    add: js.Function1[XShape, scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[XShape, scala.Unit]
  ): XShapes = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, add = add, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release, remove = remove)
  
    __obj.asInstanceOf[XShapes]
  }
}

