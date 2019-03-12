package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface makes it possible to access and manage the Layers of a document.
  * @see LayerManager
  */
trait XLayerManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * attaches a {@link Shape} to the given {@link Layer} .
    * @param xShape this is the {@link Shape} that will be attached to a {@link Layer}
    * @param xLayer this is the {@link Layer} that will be attached to a {@link Shape}
    */
  def attachShapeToLayer(xShape: XShape, xLayer: XLayer): scala.Unit
  /**
    * queries the {@link Layer} that a {@link Shape} is attached to
    * @param xShape specifies the {@link Shape} for which the layer is requested.
    * @returns the {@link Layer} to which the {@link Shape} is attached.
    */
  def getLayerForShape(xShape: XShape): XLayer
  /**
    * creates a new {@link Layer}
    * @param nIndex the index at which the new layer is inserted
    * @returns the new created {@link Layer}
    */
  def insertNewByIndex(nIndex: scala.Double): XLayer
  /**
    * removes a {@link Layer} and all {@link Shapes} on this {@link Layer} .
    * @param xLayer this {@link Layer} will be removed and disposed
    */
  def remove(xLayer: XLayer): scala.Unit
}

object XLayerManager {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    attachShapeToLayer: (XShape, XLayer) => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getLayerForShape: XShape => XLayer,
    hasElements: () => scala.Boolean,
    insertNewByIndex: scala.Double => XLayer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: XLayer => scala.Unit
  ): XLayerManager = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), attachShapeToLayer = js.Any.fromFunction2(attachShapeToLayer), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getLayerForShape = js.Any.fromFunction1(getLayerForShape), hasElements = js.Any.fromFunction0(hasElements), insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[XLayerManager]
  }
}

