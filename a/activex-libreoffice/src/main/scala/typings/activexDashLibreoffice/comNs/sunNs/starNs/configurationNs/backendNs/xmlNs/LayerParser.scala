package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs.backendNs.XLayer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs.backendNs.XLayerHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XActiveDataSink
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
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
  extends XLayer
     with XActiveDataSink
     with XInitialization

object LayerParser {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    readData: XLayerHandler => Unit,
    release: () => Unit,
    setInputStream: XInputStream => Unit
  ): LayerParser = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream))
  
    __obj.asInstanceOf[LayerParser]
  }
}

