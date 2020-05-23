package typings.activexLibreoffice.com_.sun.star.configuration.backend.xml

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.configuration.backend.TemplateIdentifier
import typings.activexLibreoffice.com_.sun.star.configuration.backend.XLayerHandler
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataSource
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
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
  extends XLayerHandler
     with XActiveDataSource
     with XInitialization

object LayerWriter {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    acquire: () => Unit,
    addOrReplaceNode: (String, Double) => Unit,
    addOrReplaceNodeFromTemplate: (String, TemplateIdentifier, Double) => Unit,
    addProperty: (String, Double, `type`) => Unit,
    addPropertyWithValue: (String, Double, js.Any) => Unit,
    dropNode: String => Unit,
    endLayer: () => Unit,
    endNode: () => Unit,
    endProperty: () => Unit,
    getOutputStream: () => XOutputStream,
    initialize: SeqEquiv[_] => Unit,
    overrideNode: (String, Double, Boolean) => Unit,
    overrideProperty: (String, Double, `type`, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setOutputStream: XOutputStream => Unit,
    setPropertyValue: js.Any => Unit,
    setPropertyValueForLocale: (js.Any, String) => Unit,
    startLayer: () => Unit
  ): LayerWriter = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addOrReplaceNode = js.Any.fromFunction2(addOrReplaceNode), addOrReplaceNodeFromTemplate = js.Any.fromFunction3(addOrReplaceNodeFromTemplate), addProperty = js.Any.fromFunction3(addProperty), addPropertyWithValue = js.Any.fromFunction3(addPropertyWithValue), dropNode = js.Any.fromFunction1(dropNode), endLayer = js.Any.fromFunction0(endLayer), endNode = js.Any.fromFunction0(endNode), endProperty = js.Any.fromFunction0(endProperty), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), overrideNode = js.Any.fromFunction3(overrideNode), overrideProperty = js.Any.fromFunction4(overrideProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream), setPropertyValue = js.Any.fromFunction1(setPropertyValue), setPropertyValueForLocale = js.Any.fromFunction2(setPropertyValueForLocale), startLayer = js.Any.fromFunction0(startLayer))
    __obj.asInstanceOf[LayerWriter]
  }
}

