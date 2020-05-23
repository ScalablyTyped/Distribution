package typings.activexLibreoffice.com_.sun.star.configuration.backend.xml

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.configuration.backend.XSchema
import typings.activexLibreoffice.com_.sun.star.configuration.backend.XSchemaHandler
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataSink
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
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
  extends XSchema
     with XActiveDataSink
     with XInitialization

object SchemaParser {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    readComponent: XSchemaHandler => Unit,
    readSchema: XSchemaHandler => Unit,
    readTemplates: XSchemaHandler => Unit,
    release: () => Unit,
    setInputStream: XInputStream => Unit
  ): SchemaParser = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), readComponent = js.Any.fromFunction1(readComponent), readSchema = js.Any.fromFunction1(readSchema), readTemplates = js.Any.fromFunction1(readTemplates), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream))
    __obj.asInstanceOf[SchemaParser]
  }
}

