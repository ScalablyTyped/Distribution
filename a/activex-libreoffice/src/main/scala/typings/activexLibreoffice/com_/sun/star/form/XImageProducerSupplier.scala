package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XImageProducer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the access to an image producer.
  * @see com.sun.star.awt.XImageProducer
  */
@js.native
trait XImageProducerSupplier extends XInterface {
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  val ImageProducer: XImageProducer = js.native
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  def getImageProducer(): XImageProducer = js.native
}

object XImageProducerSupplier {
  @scala.inline
  def apply(
    ImageProducer: XImageProducer,
    acquire: () => Unit,
    getImageProducer: () => XImageProducer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XImageProducerSupplier = {
    val __obj = js.Dynamic.literal(ImageProducer = ImageProducer.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getImageProducer = js.Any.fromFunction0(getImageProducer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XImageProducerSupplier]
  }
  @scala.inline
  implicit class XImageProducerSupplierOps[Self <: XImageProducerSupplier] (val x: Self) extends AnyVal {
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
    def setImageProducer(value: XImageProducer): Self = this.set("ImageProducer", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetImageProducer(value: () => XImageProducer): Self = this.set("getImageProducer", js.Any.fromFunction0(value))
  }
  
}

