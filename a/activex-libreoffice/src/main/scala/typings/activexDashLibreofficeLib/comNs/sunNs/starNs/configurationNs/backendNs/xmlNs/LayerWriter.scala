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
    acquire: js.Function0[scala.Unit],
    addOrReplaceNode: js.Function2[java.lang.String, scala.Double, scala.Unit],
    addOrReplaceNodeFromTemplate: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.TemplateIdentifier, 
      scala.Double, 
      scala.Unit
    ],
    addProperty: js.Function3[java.lang.String, scala.Double, activexDashLibreofficeLib.`type`, scala.Unit],
    addPropertyWithValue: js.Function3[java.lang.String, scala.Double, js.Any, scala.Unit],
    dropNode: js.Function1[java.lang.String, scala.Unit],
    endLayer: js.Function0[scala.Unit],
    endNode: js.Function0[scala.Unit],
    endProperty: js.Function0[scala.Unit],
    getOutputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    overrideNode: js.Function3[java.lang.String, scala.Double, scala.Boolean, scala.Unit],
    overrideProperty: js.Function4[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.`type`, 
      scala.Boolean, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setOutputStream: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream, scala.Unit],
    setPropertyValue: js.Function1[js.Any, scala.Unit],
    setPropertyValueForLocale: js.Function2[js.Any, java.lang.String, scala.Unit],
    startLayer: js.Function0[scala.Unit]
  ): LayerWriter = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = acquire, addOrReplaceNode = addOrReplaceNode, addOrReplaceNodeFromTemplate = addOrReplaceNodeFromTemplate, addProperty = addProperty, addPropertyWithValue = addPropertyWithValue, dropNode = dropNode, endLayer = endLayer, endNode = endNode, endProperty = endProperty, getOutputStream = getOutputStream, initialize = initialize, overrideNode = overrideNode, overrideProperty = overrideProperty, queryInterface = queryInterface, release = release, setOutputStream = setOutputStream, setPropertyValue = setPropertyValue, setPropertyValueForLocale = setPropertyValueForLocale, startLayer = startLayer)
  
    __obj.asInstanceOf[LayerWriter]
  }
}

