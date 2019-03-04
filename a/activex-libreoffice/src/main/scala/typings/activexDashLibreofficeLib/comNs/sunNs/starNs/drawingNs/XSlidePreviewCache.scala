package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

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
  def addPreviewCreationNotifyListener(xListener: XSlidePreviewCacheListener): scala.Unit
  /**
    * Return a preview for the given slide index. The returned bitmap may be the requested preview, a preview of the preview, i.e. a scaled up or down
    * version, or an empty reference when the preview is not yet present.
    *
    * This call may lead to the asynchronous creation of the requested preview. In that case all registered listeners are notified when the preview has been
    * created.
    */
  def getSlidePreview(
    nSlideIndex: scala.Double,
    xCanvas: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
  /** Stop the asynchronous creation of previews temporarily. Call {@link resume()} to restart it. */
  def pause(): scala.Unit
  /** Remove a previously registered listener for preview creations. */
  def removePreviewCreationNotifyListener(xListener: XSlidePreviewCacheListener): scala.Unit
  /** Resume the asynchronous creation of slide previews. */
  def resume(): scala.Unit
  /**
    * Set the set of slides for which the cache will provide the previews. All slides in the given XIndexAccess are required to come from the given model.
    * @param xSlides The set of slides for which the called cache will provide the previews. This container defines the indices that are used to look up slides.
    * @param xDocument The model that contains the slides reference by the xSlides argument.
    */
  def setDocumentSlides(
    xSlides: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    xDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): scala.Unit
  /** Define the size of the previews that are managed by the called cache. */
  def setPreviewSize(aSize: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D): scala.Unit
  /**
    * Define which slides are currently visible on the screen and which are not. This information is used for give preview creation for visible slides a
    * higher priority than for those slides that are not visible.
    */
  def setVisibleRange(nFirstVisibleSlideIndex: scala.Double, nLastVisibleSlideIndex: scala.Double): scala.Unit
}

object XSlidePreviewCache {
  @scala.inline
  def apply(
    addPreviewCreationNotifyListener: js.Function1[XSlidePreviewCacheListener, scala.Unit],
    getSlidePreview: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
    ],
    pause: js.Function0[scala.Unit],
    removePreviewCreationNotifyListener: js.Function1[XSlidePreviewCacheListener, scala.Unit],
    resume: js.Function0[scala.Unit],
    setDocumentSlides: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      scala.Unit
    ],
    setPreviewSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D, scala.Unit],
    setVisibleRange: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XSlidePreviewCache = {
    val __obj = js.Dynamic.literal(addPreviewCreationNotifyListener = addPreviewCreationNotifyListener, getSlidePreview = getSlidePreview, pause = pause, removePreviewCreationNotifyListener = removePreviewCreationNotifyListener, resume = resume, setDocumentSlides = setDocumentSlides, setPreviewSize = setPreviewSize, setVisibleRange = setVisibleRange)
  
    __obj.asInstanceOf[XSlidePreviewCache]
  }
}

