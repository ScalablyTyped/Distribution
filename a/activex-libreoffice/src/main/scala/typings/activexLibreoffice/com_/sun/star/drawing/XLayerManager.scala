package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface makes it possible to access and manage the Layers of a document.
  * @see LayerManager
  */
@js.native
trait XLayerManager extends XIndexAccess {
  /**
    * attaches a {@link Shape} to the given {@link Layer} .
    * @param xShape this is the {@link Shape} that will be attached to a {@link Layer}
    * @param xLayer this is the {@link Layer} that will be attached to a {@link Shape}
    */
  def attachShapeToLayer(xShape: XShape, xLayer: XLayer): Unit = js.native
  /**
    * queries the {@link Layer} that a {@link Shape} is attached to
    * @param xShape specifies the {@link Shape} for which the layer is requested.
    * @returns the {@link Layer} to which the {@link Shape} is attached.
    */
  def getLayerForShape(xShape: XShape): XLayer = js.native
  /**
    * creates a new {@link Layer}
    * @param nIndex the index at which the new layer is inserted
    * @returns the new created {@link Layer}
    */
  def insertNewByIndex(nIndex: Double): XLayer = js.native
  /**
    * removes a {@link Layer} and all {@link Shapes} on this {@link Layer} .
    * @param xLayer this {@link Layer} will be removed and disposed
    */
  def remove(xLayer: XLayer): Unit = js.native
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
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), attachShapeToLayer = js.Any.fromFunction2(attachShapeToLayer), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getLayerForShape = js.Any.fromFunction1(getLayerForShape), hasElements = js.Any.fromFunction0(hasElements), insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[XLayerManager]
  }
  @scala.inline
  implicit class XLayerManagerOps[Self <: XLayerManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachShapeToLayer(value: (XShape, XLayer) => Unit): Self = this.set("attachShapeToLayer", js.Any.fromFunction2(value))
    @scala.inline
    def setGetLayerForShape(value: XShape => XLayer): Self = this.set("getLayerForShape", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertNewByIndex(value: Double => XLayer): Self = this.set("insertNewByIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: XLayer => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

