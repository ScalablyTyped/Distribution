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

