package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is provided by documents to support Layers.
  * @see DrawingDocument
  */
trait LayerManager
  extends XLayerManager
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess

object LayerManager {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    attachShapeToLayer: js.Function2[XShape, XLayer, scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getCount: js.Function0[scala.Double],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getLayerForShape: js.Function1[XShape, XLayer],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertNewByIndex: js.Function1[scala.Double, XLayer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[XLayer, scala.Unit]
  ): LayerManager = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, attachShapeToLayer = attachShapeToLayer, getByIndex = getByIndex, getByName = getByName, getCount = getCount, getElementNames = getElementNames, getElementType = getElementType, getLayerForShape = getLayerForShape, hasByName = hasByName, hasElements = hasElements, insertNewByIndex = insertNewByIndex, queryInterface = queryInterface, release = release, remove = remove)
  
    __obj.asInstanceOf[LayerManager]
  }
}

