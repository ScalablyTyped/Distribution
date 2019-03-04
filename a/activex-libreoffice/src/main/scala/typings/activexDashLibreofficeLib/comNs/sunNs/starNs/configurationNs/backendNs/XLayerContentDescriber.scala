package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describe the contents of a layer to an {@link XLayerHandler} object. The contents of the layer is contained in the sequence of {@link PropertyInfo}
  * structures
  * @see PropertyInfo
  */
trait XLayerContentDescriber
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * describes the contents of the layer to an {@link XLayerHandler} .
    * @param aHandler Handler object that will receive calls describing the contents of the layer
    * @param aPropertyInfos sequence of {@link PropertyInfo} structs contained all required property information
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XLayerHandler} .
    */
  def describeLayer(
    aHandler: XLayerHandler,
    aPropertyInfos: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyInfo]
  ): scala.Unit
}

object XLayerContentDescriber {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    describeLayer: js.Function2[
      XLayerHandler, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyInfo], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLayerContentDescriber = {
    val __obj = js.Dynamic.literal(acquire = acquire, describeLayer = describeLayer, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XLayerContentDescriber]
  }
}

