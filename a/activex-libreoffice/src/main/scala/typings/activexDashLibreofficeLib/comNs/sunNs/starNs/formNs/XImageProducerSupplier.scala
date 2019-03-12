package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the access to an image producer.
  * @see com.sun.star.awt.XImageProducer
  */
trait XImageProducerSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  val ImageProducer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XImageProducer
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  def getImageProducer(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XImageProducer
}

object XImageProducerSupplier {
  @scala.inline
  def apply(
    ImageProducer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XImageProducer,
    acquire: () => scala.Unit,
    getImageProducer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XImageProducer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XImageProducerSupplier = {
    val __obj = js.Dynamic.literal(ImageProducer = ImageProducer, acquire = js.Any.fromFunction0(acquire), getImageProducer = js.Any.fromFunction0(getImageProducer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XImageProducerSupplier]
  }
}

