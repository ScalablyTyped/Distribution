package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * applies updates to a configuration layer.
  *
  * The configuration layer data is read from a {@link XLayer} and the changed layer is provided as {@link XLayer} again or described to a {@link
  * XLayerHandler} .
  * @see com.sun.star.configuration.backend.UpdatableLayer Service describes a layer and accepts a changed layer..
  * @since OOo 1.1.2
  */
trait LayerUpdateMerger
  extends XUpdateHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object LayerUpdateMerger {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addOrReplaceNode: (java.lang.String, scala.Double) => scala.Unit,
    addOrReplaceNodeFromTemplate: (java.lang.String, scala.Double, TemplateIdentifier) => scala.Unit,
    addOrReplaceProperty: (java.lang.String, scala.Double, activexDashLibreofficeLib.`type`) => scala.Unit,
    addOrReplacePropertyWithValue: (java.lang.String, scala.Double, js.Any) => scala.Unit,
    endNode: () => scala.Unit,
    endProperty: () => scala.Unit,
    endUpdate: () => scala.Unit,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    modifyNode: (java.lang.String, scala.Double, scala.Double, scala.Boolean) => scala.Unit,
    modifyProperty: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.`type`) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeNode: java.lang.String => scala.Unit,
    removeProperty: java.lang.String => scala.Unit,
    resetProperty: java.lang.String => scala.Unit,
    resetPropertyValue: () => scala.Unit,
    resetPropertyValueForLocale: java.lang.String => scala.Unit,
    setPropertyValue: js.Any => scala.Unit,
    setPropertyValueForLocale: (js.Any, java.lang.String) => scala.Unit,
    startUpdate: () => scala.Unit
  ): LayerUpdateMerger = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addOrReplaceNode = js.Any.fromFunction2(addOrReplaceNode), addOrReplaceNodeFromTemplate = js.Any.fromFunction3(addOrReplaceNodeFromTemplate), addOrReplaceProperty = js.Any.fromFunction3(addOrReplaceProperty), addOrReplacePropertyWithValue = js.Any.fromFunction3(addOrReplacePropertyWithValue), endNode = js.Any.fromFunction0(endNode), endProperty = js.Any.fromFunction0(endProperty), endUpdate = js.Any.fromFunction0(endUpdate), initialize = js.Any.fromFunction1(initialize), modifyNode = js.Any.fromFunction4(modifyNode), modifyProperty = js.Any.fromFunction4(modifyProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeNode = js.Any.fromFunction1(removeNode), removeProperty = js.Any.fromFunction1(removeProperty), resetProperty = js.Any.fromFunction1(resetProperty), resetPropertyValue = js.Any.fromFunction0(resetPropertyValue), resetPropertyValueForLocale = js.Any.fromFunction1(resetPropertyValueForLocale), setPropertyValue = js.Any.fromFunction1(setPropertyValue), setPropertyValueForLocale = js.Any.fromFunction2(setPropertyValueForLocale), startUpdate = js.Any.fromFunction0(startUpdate))
  
    __obj.asInstanceOf[LayerUpdateMerger]
  }
}

