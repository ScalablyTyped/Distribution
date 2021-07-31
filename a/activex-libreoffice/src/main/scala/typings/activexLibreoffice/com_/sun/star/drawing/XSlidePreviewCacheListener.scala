package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Listener for asynchronous preview creations. Called when a slide preview has been created that was previously requested via a call to {@link
  * XSlidePreviewCache.getSlidePreview()} . The implementor may then call getSlidePreview() a second time to get the up-to-date version of the preview.
  */
trait XSlidePreviewCacheListener extends StObject {
  
  /**
    * Called by a {@link XSlidePreviewCache} object when a preview has been created for the slide with the given index.
    * @param nSlideIndex The index of the slide for which a new preview has been created.
    */
  def notifyPreviewCreation(nSlideIndex: Double): Unit
}
object XSlidePreviewCacheListener {
  
  @scala.inline
  def apply(notifyPreviewCreation: Double => Unit): XSlidePreviewCacheListener = {
    val __obj = js.Dynamic.literal(notifyPreviewCreation = js.Any.fromFunction1(notifyPreviewCreation))
    __obj.asInstanceOf[XSlidePreviewCacheListener]
  }
  
  @scala.inline
  implicit class XSlidePreviewCacheListenerMutableBuilder[Self <: XSlidePreviewCacheListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyPreviewCreation(value: Double => Unit): Self = StObject.set(x, "notifyPreviewCreation", js.Any.fromFunction1(value))
  }
}
