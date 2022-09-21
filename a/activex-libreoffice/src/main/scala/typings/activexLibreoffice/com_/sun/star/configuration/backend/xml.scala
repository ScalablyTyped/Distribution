package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataSink
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataSource
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xml {
  
  /**
    * represents a configuration data layer that is stored in a stream in OOR {@link Update} XML format.
    *
    * The configuration layer XML from a given stream is parsed and fed to a {@link com.sun.star.configuration.backend.XLayerHandler} .
    * @see com.sun.star.configuration.backend.xml.SchemaParser Service that represents a configuration schema stored in XML.
    * @see com.sun.star.configuration.backend.xml.LayerWriter Service that writes OOR Update XML for data described via com.sun.star.configuration.backend.X
    * @since OOo 1.1.2
    */
  trait LayerParser
    extends StObject
       with XLayer
       with XActiveDataSink
       with XInitialization
  object LayerParser {
    
    inline def apply(
      InputStream: XInputStream,
      acquire: () => Unit,
      getInputStream: () => XInputStream,
      initialize: SeqEquiv[Any] => Unit,
      queryInterface: `type` => Any,
      readData: XLayerHandler => Unit,
      release: () => Unit,
      setInputStream: XInputStream => Unit
    ): LayerParser = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream))
      __obj.asInstanceOf[LayerParser]
    }
  }
  
  /**
    * can be used to parse a stream of configuration layer XML.
    *
    * The configuration layer data described to a {@link com.sun.star.configuration.backend.XLayerHandler} is written to a stream as OOR {@link Update} XML.
    * @see com.sun.star.configuration.backend.xml.LayerParser Service that parses configuration layer XML.
    * @since OOo 1.1.2
    */
  trait LayerWriter
    extends StObject
       with XLayerHandler
       with XActiveDataSource
       with XInitialization
  object LayerWriter {
    
    inline def apply(
      OutputStream: XOutputStream,
      acquire: () => Unit,
      addOrReplaceNode: (String, Double) => Unit,
      addOrReplaceNodeFromTemplate: (String, TemplateIdentifier, Double) => Unit,
      addProperty: (String, Double, `type`) => Unit,
      addPropertyWithValue: (String, Double, Any) => Unit,
      dropNode: String => Unit,
      endLayer: () => Unit,
      endNode: () => Unit,
      endProperty: () => Unit,
      getOutputStream: () => XOutputStream,
      initialize: SeqEquiv[Any] => Unit,
      overrideNode: (String, Double, Boolean) => Unit,
      overrideProperty: (String, Double, `type`, Boolean) => Unit,
      queryInterface: `type` => Any,
      release: () => Unit,
      setOutputStream: XOutputStream => Unit,
      setPropertyValue: Any => Unit,
      setPropertyValueForLocale: (Any, String) => Unit,
      startLayer: () => Unit
    ): LayerWriter = {
      val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addOrReplaceNode = js.Any.fromFunction2(addOrReplaceNode), addOrReplaceNodeFromTemplate = js.Any.fromFunction3(addOrReplaceNodeFromTemplate), addProperty = js.Any.fromFunction3(addProperty), addPropertyWithValue = js.Any.fromFunction3(addPropertyWithValue), dropNode = js.Any.fromFunction1(dropNode), endLayer = js.Any.fromFunction0(endLayer), endNode = js.Any.fromFunction0(endNode), endProperty = js.Any.fromFunction0(endProperty), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), overrideNode = js.Any.fromFunction3(overrideNode), overrideProperty = js.Any.fromFunction4(overrideProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream), setPropertyValue = js.Any.fromFunction1(setPropertyValue), setPropertyValueForLocale = js.Any.fromFunction2(setPropertyValueForLocale), startLayer = js.Any.fromFunction0(startLayer))
      __obj.asInstanceOf[LayerWriter]
    }
  }
  
  /**
    * represents a configuration schema that is stored in a stream in OOR {@link Schema} XML format.
    *
    * The configuration schema XML from a given stream is parsed and fed to a {@link com.sun.star.configuration.backend.XSchemaHandler} .
    * @see com.sun.star.configuration.backend.xml.LayerParser Service that parses configuration layer XML.
    * @since OOo 1.1.2
    */
  trait SchemaParser
    extends StObject
       with XSchema
       with XActiveDataSink
       with XInitialization
  object SchemaParser {
    
    inline def apply(
      InputStream: XInputStream,
      acquire: () => Unit,
      getInputStream: () => XInputStream,
      initialize: SeqEquiv[Any] => Unit,
      queryInterface: `type` => Any,
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
}
