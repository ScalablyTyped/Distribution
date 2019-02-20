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

