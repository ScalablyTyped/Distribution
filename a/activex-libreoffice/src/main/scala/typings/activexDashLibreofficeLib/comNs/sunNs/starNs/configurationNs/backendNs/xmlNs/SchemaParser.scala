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
    acquire: js.Function0[scala.Unit],
    getInputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readComponent: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XSchemaHandler, 
      scala.Unit
    ],
    readSchema: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XSchemaHandler, 
      scala.Unit
    ],
    readTemplates: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.XSchemaHandler, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    setInputStream: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Unit]
  ): SchemaParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InputStream")(InputStream)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getInputStream")(getInputStream)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("readComponent")(readComponent)
    __obj.updateDynamic("readSchema")(readSchema)
    __obj.updateDynamic("readTemplates")(readTemplates)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setInputStream")(setInputStream)
    __obj.asInstanceOf[SchemaParser]
  }
}

