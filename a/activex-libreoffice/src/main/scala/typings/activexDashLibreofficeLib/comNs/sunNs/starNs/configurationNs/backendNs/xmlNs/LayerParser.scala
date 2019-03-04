package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a configuration data layer that is stored in a stream in OOR {@link Update} XML format.
  *
  * The configuration layer XML from a given stream is parsed and fed to a {@link com.sun.star.configuration.backend.XLayerHandler} .
  * @see com.sun.star.configuration.backend.xml.SchemaParser Service that represents a configuration schema stored in XML.
  * @see com.sun.star.configuration.backend.xml.LayerWriter Service that writes OOR Update XML for data described via com.sun.star.configuration.backend.X
  * @since OOo 1.1.2
  */
trait LayerParser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XLayer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XActiveDataSink
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object LayerParser {
  @scala.inline
  def apply(
    InputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    acquire: js.Function0[scala.Unit],
    getInputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readData: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XLayerHandler, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    setInputStream: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Unit]
  ): LayerParser = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, acquire = acquire, getInputStream = getInputStream, initialize = initialize, queryInterface = queryInterface, readData = readData, release = release, setInputStream = setInputStream)
  
    __obj.asInstanceOf[LayerParser]
  }
}

