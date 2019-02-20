package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * can be used to parse a stream of configuration layer XML.
  *
  * The configuration layer data described to a {@link com.sun.star.configuration.backend.XLayerHandler} is written to a stream as OOR {@link Update} XML.
  * @see com.sun.star.configuration.backend.xml.LayerParser Service that parses configuration layer XML.
  * @since OOo 1.1.2
  */
trait LayerWriter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XLayerHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XActiveDataSource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

