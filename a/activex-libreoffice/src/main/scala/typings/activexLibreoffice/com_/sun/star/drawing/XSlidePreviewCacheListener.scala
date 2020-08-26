package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Listener for asynchronous preview creations. Called when a slide preview has been created that was previously requested via a call to {@link
  * XSlidePreviewCache.getSlidePreview()} . The implementor may then call getSlidePreview() a second time to get the up-to-date version of the preview.
  */
@js.native
trait XSlidePreviewCacheListener extends js.Object {
  /**
    * Called by a {@link XSlidePreviewCache} object when a preview has been created for the slide with the given index.
    * @param nSlideIndex The index of the slide for which a new preview has been created.
    */
  def notifyPreviewCreation(nSlideIndex: Double): Unit = js.native
}

object XSlidePreviewCacheListener {
  @scala.inline
  def apply(notifyPreviewCreation: Double => Unit): XSlidePreviewCacheListener = {
    val __obj = js.Dynamic.literal(notifyPreviewCreation = js.Any.fromFunction1(notifyPreviewCreation))
    __obj.asInstanceOf[XSlidePreviewCacheListener]
  }
  @scala.inline
  implicit class XSlidePreviewCacheListenerOps[Self <: XSlidePreviewCacheListener] (val x: Self) extends AnyVal {
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
    def setNotifyPreviewCreation(value: Double => Unit): Self = this.set("notifyPreviewCreation", js.Any.fromFunction1(value))
  }
  
}

