package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is provided by documents to support Layers.
  * @see DrawingDocument
  */
@js.native
trait LayerManager
  extends XLayerManager
     with XNameAccess

object LayerManager {
  @scala.inline
  def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    attachShapeToLayer: (XShape, XLayer) => Unit,
    getByIndex: Double => js.Any,
    getByName: String => js.Any,
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getLayerForShape: XShape => XLayer,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertNewByIndex: Double => XLayer,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XLayer => Unit
  ): LayerManager = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), attachShapeToLayer = js.Any.fromFunction2(attachShapeToLayer), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLayerForShape = js.Any.fromFunction1(getLayerForShape), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[LayerManager]
  }
}

