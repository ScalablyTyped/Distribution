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

object SchemaParser {
  @scala.inline
  def apply(
    InputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    acquire: () => scala.Unit,
    getInputStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readComponent: activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XSchemaHandler => scala.Unit,
    readSchema: activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XSchemaHandler => scala.Unit,
    readTemplates: activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XSchemaHandler => scala.Unit,
    release: () => scala.Unit,
    setInputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream => scala.Unit
  ): SchemaParser = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), readComponent = js.Any.fromFunction1(readComponent), readSchema = js.Any.fromFunction1(readSchema), readTemplates = js.Any.fromFunction1(readTemplates), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream))
  
    __obj.asInstanceOf[SchemaParser]
  }
}

