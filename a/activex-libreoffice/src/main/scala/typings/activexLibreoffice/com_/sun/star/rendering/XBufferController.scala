package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface providing access to double/multi-buffer facilities of screen devices.
  *
  * This interface provides methods to enable and control double/multi-buffering facilities on screen devices.
  * @since OOo 2.0
  */
@js.native
trait XBufferController extends XInterface {
  
  /**
    * Create the given number of background buffers.
    *
    * There's one buffer implicitly available, which is the canvas surface itself. Thus, calling `createBuffers(1)` creates a double-buffered object.
    * @param nBuffers The number of background<buffers requested. Must be greater than 0.
    * @returns the number of actually generated buffers, which might be between 0 (no double-buffering available) and nBuffers.
    * @throws com::sun::star::lang::IllegalArgumentException if nBuffers is smaller than one.
    */
  def createBuffers(nBuffers: Double): Double = js.native
  
  /** Destroy all buffers generated via this object. */
  def destroyBuffers(): Unit = js.native
  
  /**
    * Switch the display to show the specified buffer.
    *
    * The method returns, when the switch is performed and the selected buffer is shown on screen, or immediately when an error occurs. If the switch was
    * successful, subsequent render operations will be directed to the new backbuffer.
    *
    * Use this method if you need your screen display to be in sync with other things, e.g. sound playback.
    * @param bUpdateAll When `TRUE` , update the whole screen. When `FALSE` , implementation is permitted to restrict update to areas the canvas itself change
    * @returns whether the switch was performed successfully.
    * @throws com::sun::star::lang::IllegalArgumentException if nBuffer is outside the permissible range.
    */
  def showBuffer(bUpdateAll: Boolean): Boolean = js.native
  
  /**
    * Schedule the display of the specified buffer.
    *
    * The method returns, when the switching of the buffer is successfully scheduled, or immediately when an error occurs. If the switch was successful,
    * subsequent render operations will be directed to the new backbuffer. Note that, if the buffer switching is exceedingly slow, or the frequency of
    * {@link switchBuffer()} is exceedingly high, the buffer scheduled for display here might become the current render target **before** it is fully
    * displayed on screen. In this case, any rendering operation to this buffer will block, until it is safe to perform the operation without visible
    * cluttering.
    *
    * Use this method if you favor maximal render speed, but don't necessarily require your screen display to be in sync with other things, e.g. sound
    * playback.
    * @param bUpdateAll When `TRUE` , update the whole screen. When `FALSE` , implementation is permitted to restrict update to areas the canvas itself change
    * @returns whether the switch was performed successfully.
    */
  def switchBuffer(bUpdateAll: Boolean): Boolean = js.native
}
object XBufferController {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createBuffers: Double => Double,
    destroyBuffers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    showBuffer: Boolean => Boolean,
    switchBuffer: Boolean => Boolean
  ): XBufferController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createBuffers = js.Any.fromFunction1(createBuffers), destroyBuffers = js.Any.fromFunction0(destroyBuffers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showBuffer = js.Any.fromFunction1(showBuffer), switchBuffer = js.Any.fromFunction1(switchBuffer))
    __obj.asInstanceOf[XBufferController]
  }
  
  @scala.inline
  implicit class XBufferControllerOps[Self <: XBufferController] (val x: Self) extends AnyVal {
    
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
    def setCreateBuffers(value: Double => Double): Self = this.set("createBuffers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyBuffers(value: () => Unit): Self = this.set("destroyBuffers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowBuffer(value: Boolean => Boolean): Self = this.set("showBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchBuffer(value: Boolean => Boolean): Self = this.set("switchBuffer", js.Any.fromFunction1(value))
  }
}
