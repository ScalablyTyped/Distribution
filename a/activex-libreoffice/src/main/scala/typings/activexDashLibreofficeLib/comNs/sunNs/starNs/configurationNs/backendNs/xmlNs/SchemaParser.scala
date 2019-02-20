package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a configuration schema that is stored in a stream in OOR {@link Schema} XML format.
  *
  * The configuration schema XML from a given stream is parsed and fed to a {@link com.sun.star.configuration.backend.XSchemaHandler} .
  * @see com.sun.star.configuration.backend.xml.LayerParser Service that parses configuration layer XML.
  * @since OOo 1.1.2
  */
trait SchemaParser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XSchema
     with activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XActiveDataSink
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

