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
    acquire: js.Function0[scala.Unit],
    attachShapeToLayer: js.Function2[XShape, XLayer, scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getLayerForShape: js.Function1[XShape, XLayer],
    hasElements: js.Function0[scala.Boolean],
    insertNewByIndex: js.Function1[scala.Double, XLayer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[XLayer, scala.Unit]
  ): XLayerManager = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, attachShapeToLayer = attachShapeToLayer, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getLayerForShape = getLayerForShape, hasElements = hasElements, insertNewByIndex = insertNewByIndex, queryInterface = queryInterface, release = release, remove = remove)
  
    __obj.asInstanceOf[XLayerManager]
  }
}

