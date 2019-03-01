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
    acquire: js.Function0[scala.Unit],
    getImageProducer: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XImageProducer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XImageProducerSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ImageProducer")(ImageProducer)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getImageProducer")(getImageProducer)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XImageProducerSupplier]
  }
}

