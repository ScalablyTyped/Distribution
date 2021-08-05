package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ShadowDOM")
@js.native
class ShadowDOM () extends StObject
/* static members */
object ShadowDOM {
  
  @JSImport("aurelia-templating", "ShadowDOM")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aurelia-templating", "ShadowDOM.defaultSlotKey")
  @js.native
  def defaultSlotKey: js.Any = js.native
  inline def defaultSlotKey_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSlotKey")(x.asInstanceOf[js.Any])
  
  /**
    * Distrbiute nodes of a projected view based on
    * @param {View} view
    * @param {Node[]} nodes
    * @param {Record<string, PassThroughSlot | ShadowSlot>} slots
    * @param {ViewSlot} projectionSource
    * @param {number} index
    * @param {string} destinationOverride
    */
  inline def distributeNodes(
    view: js.UndefOr[js.Any],
    nodes: js.UndefOr[js.Any],
    slots: js.UndefOr[js.Any],
    projectionSource: js.UndefOr[js.Any],
    index: js.UndefOr[js.Any],
    destinationOverride: js.UndefOr[js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * @param {View} view
    * @param {Record<string, PassThroughSlot | ShadowSlot>} slots
    * @param {ViewSlot} projectionSource
    * @param {number} index
    * @param {string} destinationOverride
    */
  inline def distributeView(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")().asInstanceOf[js.Any]
  inline def distributeView(view: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: js.Any, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: js.Any, projectionSource: js.Any, index: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: js.Any, projectionSource: js.Any, index: js.Any, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: js.Any, projectionSource: js.Any, index: Unit, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: js.Any, projectionSource: Unit, index: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: js.Any, projectionSource: Unit, index: js.Any, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: js.Any, projectionSource: Unit, index: Unit, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: Unit, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: Unit, projectionSource: js.Any, index: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: Unit, projectionSource: js.Any, index: js.Any, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: Unit, projectionSource: js.Any, index: Unit, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: Unit, projectionSource: Unit, index: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: Unit, projectionSource: Unit, index: js.Any, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: js.Any, slots: Unit, projectionSource: Unit, index: Unit, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: js.Any, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: js.Any, projectionSource: js.Any, index: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: js.Any, projectionSource: js.Any, index: js.Any, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: js.Any, projectionSource: js.Any, index: Unit, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: js.Any, projectionSource: Unit, index: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: js.Any, projectionSource: Unit, index: js.Any, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: js.Any, projectionSource: Unit, index: Unit, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: Unit, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: Unit, projectionSource: js.Any, index: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: Unit, projectionSource: js.Any, index: js.Any, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: Unit, projectionSource: js.Any, index: Unit, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: Unit, projectionSource: Unit, index: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: Unit, projectionSource: Unit, index: js.Any, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distributeView(view: Unit, slots: Unit, projectionSource: Unit, index: Unit, destinationOverride: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getSlotName(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotName")().asInstanceOf[js.Any]
  inline def getSlotName(node: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotName")(node.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * @param {Record<string, ShadowSlot | PassThroughSlot>} slots
    * @param {ViewSlot} projectionSource
    */
  inline def undistributeAll(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("undistributeAll")().asInstanceOf[js.Any]
  inline def undistributeAll(slots: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("undistributeAll")(slots.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def undistributeAll(slots: js.Any, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeAll")(slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def undistributeAll(slots: Unit, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeAll")(slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * @param {View} view
    * @param {Record<string, PassThroughSlot | ShadowSlot>} slots
    * @param {ViewSlot} projectionSource
    */
  inline def undistributeView(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")().asInstanceOf[js.Any]
  inline def undistributeView(view: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")(view.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def undistributeView(view: js.Any, slots: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def undistributeView(view: js.Any, slots: js.Any, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def undistributeView(view: js.Any, slots: Unit, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def undistributeView(view: Unit, slots: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def undistributeView(view: Unit, slots: js.Any, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def undistributeView(view: Unit, slots: Unit, projectionSource: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
