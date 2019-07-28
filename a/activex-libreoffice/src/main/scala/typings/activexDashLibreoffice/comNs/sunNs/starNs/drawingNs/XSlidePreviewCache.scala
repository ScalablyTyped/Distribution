package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.IntegerSize2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs.XBitmap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs.XCanvas
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A cache of preview bitmaps for the slides of one Impress or Draw document in one size. There may be more than one cache for one document. These are
  * internally connected and for missing previews one cache may take it from another cache and scale it to the desired size. When a preview is not present
  * then it is created asynchronously. On creation all registered listeners are notified.
  *
  * Slides are referenced via their index in an XIndexAccess container in order to allow multiple references to a single slide (custom presentations).
  */
trait XSlidePreviewCache extends js.Object {
  /** Register a listener that is called when a preview has been created asynchronously. */
  def addPreviewCreationNotifyListener(xListener: XSlidePreviewCacheListener): Unit
  /**
    * Return a preview for the given slide index. The returned bitmap may be the requested preview, a preview of the preview, i.e. a scaled up or down
    * version, or an empty reference when the preview is not yet present.
    *
    * This call may lead to the asynchronous creation of the requested preview. In that case all registered listeners are notified when the preview has been
    * created.
    */
  def getSlidePreview(nSlideIndex: Double, xCanvas: XCanvas): XBitmap
  /** Stop the asynchronous creation of previews temporarily. Call {@link resume()} to restart it. */
  def pause(): Unit
  /** Remove a previously registered listener for preview creations. */
  def removePreviewCreationNotifyListener(xListener: XSlidePreviewCacheListener): Unit
  /** Resume the asynchronous creation of slide previews. */
  def resume(): Unit
  /**
    * Set the set of slides for which the cache will provide the previews. All slides in the given XIndexAccess are required to come from the given model.
    * @param xSlides The set of slides for which the called cache will provide the previews. This container defines the indices that are used to look up slides.
    * @param xDocument The model that contains the slides reference by the xSlides argument.
    */
  def setDocumentSlides(xSlides: XIndexAccess, xDocument: XInterface): Unit
  /** Define the size of the previews that are managed by the called cache. */
  def setPreviewSize(aSize: IntegerSize2D): Unit
  /**
    * Define which slides are currently visible on the screen and which are not. This information is used for give preview creation for visible slides a
    * higher priority than for those slides that are not visible.
    */
  def setVisibleRange(nFirstVisibleSlideIndex: Double, nLastVisibleSlideIndex: Double): Unit
}

object XSlidePreviewCache {
  @scala.inline
  def apply(
    addPreviewCreationNotifyListener: XSlidePreviewCacheListener => Unit,
    getSlidePreview: (Double, XCanvas) => XBitmap,
    pause: () => Unit,
    removePreviewCreationNotifyListener: XSlidePreviewCacheListener => Unit,
    resume: () => Unit,
    setDocumentSlides: (XIndexAccess, XInterface) => Unit,
    setPreviewSize: IntegerSize2D => Unit,
    setVisibleRange: (Double, Double) => Unit
  ): XSlidePreviewCache = {
    val __obj = js.Dynamic.literal(addPreviewCreationNotifyListener = js.Any.fromFunction1(addPreviewCreationNotifyListener), getSlidePreview = js.Any.fromFunction2(getSlidePreview), pause = js.Any.fromFunction0(pause), removePreviewCreationNotifyListener = js.Any.fromFunction1(removePreviewCreationNotifyListener), resume = js.Any.fromFunction0(resume), setDocumentSlides = js.Any.fromFunction2(setDocumentSlides), setPreviewSize = js.Any.fromFunction1(setPreviewSize), setVisibleRange = js.Any.fromFunction2(setVisibleRange))
  
    __obj.asInstanceOf[XSlidePreviewCache]
  }
}

