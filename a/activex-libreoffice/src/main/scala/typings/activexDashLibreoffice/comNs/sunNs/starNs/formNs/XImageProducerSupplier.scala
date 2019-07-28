package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XImageProducer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the access to an image producer.
  * @see com.sun.star.awt.XImageProducer
  */
trait XImageProducerSupplier extends XInterface {
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  val ImageProducer: XImageProducer
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  def getImageProducer(): XImageProducer
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
    val __obj = js.Dynamic.literal(ImageProducer = ImageProducer, acquire = js.Any.fromFunction0(acquire), getImageProducer = js.Any.fromFunction0(getImageProducer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XImageProducerSupplier]
  }
}

