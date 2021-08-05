package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typings.activexLibreoffice.com_.sun.star.rendering.XBitmap
import typings.activexLibreoffice.com_.sun.star.rendering.XCanvas
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A cache of preview bitmaps for the slides of one Impress or Draw document in one size. There may be more than one cache for one document. These are
  * internally connected and for missing previews one cache may take it from another cache and scale it to the desired size. When a preview is not present
  * then it is created asynchronously. On creation all registered listeners are notified.
  *
  * Slides are referenced via their index in an XIndexAccess container in order to allow multiple references to a single slide (custom presentations).
  */
trait XSlidePreviewCache extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: XSlidePreviewCache](x: Self) {
    
    inline def setAddPreviewCreationNotifyListener(value: XSlidePreviewCacheListener => Unit): Self = StObject.set(x, "addPreviewCreationNotifyListener", js.Any.fromFunction1(value))
    
    inline def setGetSlidePreview(value: (Double, XCanvas) => XBitmap): Self = StObject.set(x, "getSlidePreview", js.Any.fromFunction2(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setRemovePreviewCreationNotifyListener(value: XSlidePreviewCacheListener => Unit): Self = StObject.set(x, "removePreviewCreationNotifyListener", js.Any.fromFunction1(value))
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setSetDocumentSlides(value: (XIndexAccess, XInterface) => Unit): Self = StObject.set(x, "setDocumentSlides", js.Any.fromFunction2(value))
    
    inline def setSetPreviewSize(value: IntegerSize2D => Unit): Self = StObject.set(x, "setPreviewSize", js.Any.fromFunction1(value))
    
    inline def setSetVisibleRange(value: (Double, Double) => Unit): Self = StObject.set(x, "setVisibleRange", js.Any.fromFunction2(value))
  }
}
