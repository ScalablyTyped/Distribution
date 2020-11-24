package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * applies updates to a configuration layer.
  *
  * The configuration layer data is read from a {@link XLayer} and the changed layer is provided as {@link XLayer} again or described to a {@link
  * XLayerHandler} .
  * @see com.sun.star.configuration.backend.UpdatableLayer Service describes a layer and accepts a changed layer..
  * @since OOo 1.1.2
  */
@js.native
trait LayerUpdateMerger
  extends XUpdateHandler
     with XInitialization
object LayerUpdateMerger {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addOrReplaceNode: (String, Double) => Unit,
    addOrReplaceNodeFromTemplate: (String, Double, TemplateIdentifier) => Unit,
    addOrReplaceProperty: (String, Double, `type`) => Unit,
    addOrReplacePropertyWithValue: (String, Double, js.Any) => Unit,
    endNode: () => Unit,
    endProperty: () => Unit,
    endUpdate: () => Unit,
    initialize: SeqEquiv[_] => Unit,
    modifyNode: (String, Double, Double, Boolean) => Unit,
    modifyProperty: (String, Double, Double, `type`) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeNode: String => Unit,
    removeProperty: String => Unit,
    resetProperty: String => Unit,
    resetPropertyValue: () => Unit,
    resetPropertyValueForLocale: String => Unit,
    setPropertyValue: js.Any => Unit,
    setPropertyValueForLocale: (js.Any, String) => Unit,
    startUpdate: () => Unit
  ): LayerUpdateMerger = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addOrReplaceNode = js.Any.fromFunction2(addOrReplaceNode), addOrReplaceNodeFromTemplate = js.Any.fromFunction3(addOrReplaceNodeFromTemplate), addOrReplaceProperty = js.Any.fromFunction3(addOrReplaceProperty), addOrReplacePropertyWithValue = js.Any.fromFunction3(addOrReplacePropertyWithValue), endNode = js.Any.fromFunction0(endNode), endProperty = js.Any.fromFunction0(endProperty), endUpdate = js.Any.fromFunction0(endUpdate), initialize = js.Any.fromFunction1(initialize), modifyNode = js.Any.fromFunction4(modifyNode), modifyProperty = js.Any.fromFunction4(modifyProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeNode = js.Any.fromFunction1(removeNode), removeProperty = js.Any.fromFunction1(removeProperty), resetProperty = js.Any.fromFunction1(resetProperty), resetPropertyValue = js.Any.fromFunction0(resetPropertyValue), resetPropertyValueForLocale = js.Any.fromFunction1(resetPropertyValueForLocale), setPropertyValue = js.Any.fromFunction1(setPropertyValue), setPropertyValueForLocale = js.Any.fromFunction2(setPropertyValueForLocale), startUpdate = js.Any.fromFunction0(startUpdate))
    __obj.asInstanceOf[LayerUpdateMerger]
  }
}
