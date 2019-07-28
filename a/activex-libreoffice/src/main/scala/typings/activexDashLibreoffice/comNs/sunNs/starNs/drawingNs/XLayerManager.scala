package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface makes it possible to access and manage the Layers of a document.
  * @see LayerManager
  */
trait XLayerManager extends XIndexAccess {
  /**
    * attaches a {@link Shape} to the given {@link Layer} .
    * @param xShape this is the {@link Shape} that will be attached to a {@link Layer}
    * @param xLayer this is the {@link Layer} that will be attached to a {@link Shape}
    */
  def attachShapeToLayer(xShape: XShape, xLayer: XLayer): Unit
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
  def insertNewByIndex(nIndex: Double): XLayer
  /**
    * removes a {@link Layer} and all {@link Shapes} on this {@link Layer} .
    * @param xLayer this {@link Layer} will be removed and disposed
    */
  def remove(xLayer: XLayer): Unit
}

object XLayerManager {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    attachShapeToLayer: (XShape, XLayer) => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getLayerForShape: XShape => XLayer,
    hasElements: () => Boolean,
    insertNewByIndex: Double => XLayer,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XLayer => Unit
  ): XLayerManager = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), attachShapeToLayer = js.Any.fromFunction2(attachShapeToLayer), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getLayerForShape = js.Any.fromFunction1(getLayerForShape), hasElements = js.Any.fromFunction0(hasElements), insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[XLayerManager]
  }
}

