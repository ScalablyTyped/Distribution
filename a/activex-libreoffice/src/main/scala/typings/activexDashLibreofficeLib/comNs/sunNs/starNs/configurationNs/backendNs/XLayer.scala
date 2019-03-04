package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read access to the data contained in a layer.
  * @since OOo 1.1.2
  */
trait XLayer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * describes the contents of the layer to an {@link XLayerHandler} .
    * @param aHandler Handler object that will receive calls describing the contents of the layer
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XLayerHandler} .
    */
  def readData(aHandler: XLayerHandler): scala.Unit
}

object XLayer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readData: js.Function1[XLayerHandler, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XLayer = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, readData = readData, release = release)
  
    __obj.asInstanceOf[XLayer]
  }
}

