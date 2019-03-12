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
    acquire: () => scala.Unit,
    getInputStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readData: activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XLayerHandler => scala.Unit,
    release: () => scala.Unit,
    setInputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream => scala.Unit
  ): LayerParser = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream))
  
    __obj.asInstanceOf[LayerParser]
  }
}

