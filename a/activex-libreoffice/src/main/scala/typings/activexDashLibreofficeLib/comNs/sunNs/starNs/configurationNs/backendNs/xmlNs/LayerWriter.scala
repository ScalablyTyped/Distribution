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

object LayerWriter {
  @scala.inline
  def apply(
    OutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    acquire: () => scala.Unit,
    addOrReplaceNode: (java.lang.String, scala.Double) => scala.Unit,
    addOrReplaceNodeFromTemplate: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.TemplateIdentifier, scala.Double) => scala.Unit,
    addProperty: (java.lang.String, scala.Double, activexDashLibreofficeLib.`type`) => scala.Unit,
    addPropertyWithValue: (java.lang.String, scala.Double, js.Any) => scala.Unit,
    dropNode: java.lang.String => scala.Unit,
    endLayer: () => scala.Unit,
    endNode: () => scala.Unit,
    endProperty: () => scala.Unit,
    getOutputStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    overrideNode: (java.lang.String, scala.Double, scala.Boolean) => scala.Unit,
    overrideProperty: (java.lang.String, scala.Double, activexDashLibreofficeLib.`type`, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setOutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream => scala.Unit,
    setPropertyValue: js.Any => scala.Unit,
    setPropertyValueForLocale: (js.Any, java.lang.String) => scala.Unit,
    startLayer: () => scala.Unit
  ): LayerWriter = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = js.Any.fromFunction0(acquire), addOrReplaceNode = js.Any.fromFunction2(addOrReplaceNode), addOrReplaceNodeFromTemplate = js.Any.fromFunction3(addOrReplaceNodeFromTemplate), addProperty = js.Any.fromFunction3(addProperty), addPropertyWithValue = js.Any.fromFunction3(addPropertyWithValue), dropNode = js.Any.fromFunction1(dropNode), endLayer = js.Any.fromFunction0(endLayer), endNode = js.Any.fromFunction0(endNode), endProperty = js.Any.fromFunction0(endProperty), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), overrideNode = js.Any.fromFunction3(overrideNode), overrideProperty = js.Any.fromFunction4(overrideProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream), setPropertyValue = js.Any.fromFunction1(setPropertyValue), setPropertyValueForLocale = js.Any.fromFunction2(setPropertyValueForLocale), startLayer = js.Any.fromFunction0(startLayer))
  
    __obj.asInstanceOf[LayerWriter]
  }
}

