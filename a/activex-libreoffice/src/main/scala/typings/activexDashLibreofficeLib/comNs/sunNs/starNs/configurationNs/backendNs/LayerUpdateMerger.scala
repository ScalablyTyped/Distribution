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
    acquire: js.Function0[scala.Unit],
    addOrReplaceNode: js.Function2[java.lang.String, scala.Double, scala.Unit],
    addOrReplaceNodeFromTemplate: js.Function3[java.lang.String, scala.Double, TemplateIdentifier, scala.Unit],
    addOrReplaceProperty: js.Function3[java.lang.String, scala.Double, activexDashLibreofficeLib.`type`, scala.Unit],
    addOrReplacePropertyWithValue: js.Function3[java.lang.String, scala.Double, js.Any, scala.Unit],
    endNode: js.Function0[scala.Unit],
    endProperty: js.Function0[scala.Unit],
    endUpdate: js.Function0[scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    modifyNode: js.Function4[java.lang.String, scala.Double, scala.Double, scala.Boolean, scala.Unit],
    modifyProperty: js.Function4[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.`type`, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeNode: js.Function1[java.lang.String, scala.Unit],
    removeProperty: js.Function1[java.lang.String, scala.Unit],
    resetProperty: js.Function1[java.lang.String, scala.Unit],
    resetPropertyValue: js.Function0[scala.Unit],
    resetPropertyValueForLocale: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function1[js.Any, scala.Unit],
    setPropertyValueForLocale: js.Function2[js.Any, java.lang.String, scala.Unit],
    startUpdate: js.Function0[scala.Unit]
  ): LayerUpdateMerger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addOrReplaceNode")(addOrReplaceNode)
    __obj.updateDynamic("addOrReplaceNodeFromTemplate")(addOrReplaceNodeFromTemplate)
    __obj.updateDynamic("addOrReplaceProperty")(addOrReplaceProperty)
    __obj.updateDynamic("addOrReplacePropertyWithValue")(addOrReplacePropertyWithValue)
    __obj.updateDynamic("endNode")(endNode)
    __obj.updateDynamic("endProperty")(endProperty)
    __obj.updateDynamic("endUpdate")(endUpdate)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("modifyNode")(modifyNode)
    __obj.updateDynamic("modifyProperty")(modifyProperty)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeNode")(removeNode)
    __obj.updateDynamic("removeProperty")(removeProperty)
    __obj.updateDynamic("resetProperty")(resetProperty)
    __obj.updateDynamic("resetPropertyValue")(resetPropertyValue)
    __obj.updateDynamic("resetPropertyValueForLocale")(resetPropertyValueForLocale)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValueForLocale")(setPropertyValueForLocale)
    __obj.updateDynamic("startUpdate")(startUpdate)
    __obj.asInstanceOf[LayerUpdateMerger]
  }
}

