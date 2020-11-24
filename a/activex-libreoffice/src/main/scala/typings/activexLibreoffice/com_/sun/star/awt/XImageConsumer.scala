package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a data sink for an image.
  *
  * An image consumer is a component which wants to display or just receive an image from an image producer.
  * @see XImageProducer
  */
@js.native
trait XImageConsumer extends XInterface {
  
  /**
    * is called for the notification of the degree to which the image is delivered.
    *
    * The complete method is called when the image producer has finished delivering all of the pixels that the source image contains, or when a single frame
    * of a multi-frame animation has been completed, or when an error in loading or producing the image has occurred. The image consumer should remove
    * itself from the list of consumers registered with the image producer at this time, unless it is interested in successive frames.
    */
  def complete(Status: Double, xProducer: XImageProducer): Unit = js.native
  
  /** initializes the consumer with image dimensions. */
  def init(Width: Double, Height: Double): Unit = js.native
  
  /** changes color model for next pixels typically called once after initialization. */
  def setColorModel(
    BitCount: Double,
    RGBAPal: SeqEquiv[Double],
    RedMask: Double,
    GreenMask: Double,
    BlueMask: Double,
    AlphaMask: Double
  ): Unit = js.native
  
  /**
    * delivers a chunk of pixels as `long` values.
    *
    * The pixels of the image are delivered using one or more calls to this method. Each call specifies the location and size of the rectangle of source
    * pixels that are contained in the array of pixels. The specified color model object should be used to convert the pixels into their corresponding color
    * and alpha components. Pixel (m,n) is stored in the pixels array at index (n * **nScanSize**m + nOffset).
    */
  def setPixelsByBytes(
    nX: Double,
    nY: Double,
    nWidth: Double,
    nHeight: Double,
    aProducerData: SeqEquiv[Double],
    nOffset: Double,
    nScanSize: Double
  ): Unit = js.native
  
  /**
    * delivers a chunk of pixels as `byte` values.
    *
    * The pixels of the image are delivered using one or more calls to this method. Each call specifies the location and size of the rectangle of source
    * pixels that are contained in the array of pixels. The specified color model object should be used to convert the pixels into their corresponding color
    * and alpha components. Pixel (m,n) is stored in the pixels array at index (n * **nScanSize**m + nOffset).
    */
  def setPixelsByLongs(
    nX: Double,
    nY: Double,
    nWidth: Double,
    nHeight: Double,
    aProducerData: SeqEquiv[Double],
    nOffset: Double,
    nScanSize: Double
  ): Unit = js.native
}
object XImageConsumer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    complete: (Double, XImageProducer) => Unit,
    init: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setColorModel: (Double, SeqEquiv[Double], Double, Double, Double, Double) => Unit,
    setPixelsByBytes: (Double, Double, Double, Double, SeqEquiv[Double], Double, Double) => Unit,
    setPixelsByLongs: (Double, Double, Double, Double, SeqEquiv[Double], Double, Double) => Unit
  ): XImageConsumer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), complete = js.Any.fromFunction2(complete), init = js.Any.fromFunction2(init), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setColorModel = js.Any.fromFunction6(setColorModel), setPixelsByBytes = js.Any.fromFunction7(setPixelsByBytes), setPixelsByLongs = js.Any.fromFunction7(setPixelsByLongs))
    __obj.asInstanceOf[XImageConsumer]
  }
  
  @scala.inline
  implicit class XImageConsumerOps[Self <: XImageConsumer] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: (Double, XImageProducer) => Unit): Self = this.set("complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInit(value: (Double, Double) => Unit): Self = this.set("init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetColorModel(value: (Double, SeqEquiv[Double], Double, Double, Double, Double) => Unit): Self = this.set("setColorModel", js.Any.fromFunction6(value))
    
    @scala.inline
    def setSetPixelsByBytes(value: (Double, Double, Double, Double, SeqEquiv[Double], Double, Double) => Unit): Self = this.set("setPixelsByBytes", js.Any.fromFunction7(value))
    
    @scala.inline
    def setSetPixelsByLongs(value: (Double, Double, Double, Double, SeqEquiv[Double], Double, Double) => Unit): Self = this.set("setPixelsByLongs", js.Any.fromFunction7(value))
  }
}
