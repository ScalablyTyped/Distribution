package typings.aureliaTemplating.mod

import typings.aureliaTemplating.aureliaTemplatingStrings.`__au-default-slot-key__`
import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ShadowDOM")
@js.native
open class ShadowDOM () extends StObject
/* static members */
object ShadowDOM {
  
  @JSImport("aurelia-templating", "ShadowDOM")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aurelia-templating", "ShadowDOM.defaultSlotKey")
  @js.native
  def defaultSlotKey: `__au-default-slot-key__` = js.native
  inline def defaultSlotKey_=(x: `__au-default-slot-key__`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSlotKey")(x.asInstanceOf[js.Any])
  
  /**
  	 * Distrbiute nodes of a projected view based on the given slots
  	 * @param view
  	 * @param nodes
  	 * @param slots
  	 * @param projectionSource
  	 * @param index
  	 * @param destinationOverride
  	 */
  inline def distributeNodes(view: View_, nodes: js.Array[Node], slots: Record[String, PassThroughSlot | ShadowSlot]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: Unit,
    index: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: Unit,
    index: Double,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: Unit,
    index: Unit,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ShadowSlot
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ShadowSlot,
    index: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ShadowSlot,
    index: Double,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ShadowSlot,
    index: Unit,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ViewSlot
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ViewSlot,
    index: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ViewSlot,
    index: Double,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeNodes(
    view: View_,
    nodes: js.Array[Node],
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ViewSlot,
    index: Unit,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeNodes")(view.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
  	 * Project the nodes of a view to a record of slots
  	 * @param destinationOverride the override name of the slot to distribute to
  	 */
  inline def distributeView(view: View_, slots: Record[String, PassThroughSlot | ShadowSlot]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(
    view: View_,
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: Unit,
    index: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(
    view: View_,
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: Unit,
    index: Double,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(
    view: View_,
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: Unit,
    index: Unit,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(view: View_, slots: Record[String, PassThroughSlot | ShadowSlot], projectionSource: ShadowSlot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(
    view: View_,
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ShadowSlot,
    index: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(
    view: View_,
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ShadowSlot,
    index: Double,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(
    view: View_,
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ShadowSlot,
    index: Unit,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(view: View_, slots: Record[String, PassThroughSlot | ShadowSlot], projectionSource: ViewSlot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(
    view: View_,
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ViewSlot,
    index: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(
    view: View_,
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ViewSlot,
    index: Double,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def distributeView(
    view: View_,
    slots: Record[String, PassThroughSlot | ShadowSlot],
    projectionSource: ViewSlot,
    index: Unit,
    destinationOverride: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any], index.asInstanceOf[js.Any], destinationOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSlotName(node: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotName")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def undistributeAll(slots: Record[String, ShadowSlot | PassThroughSlot], projectionSource: ShadowSlot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeAll")(slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
  	 * @param {Record<string, ShadowSlot | PassThroughSlot>} slots
  	 * @param {ViewSlot} projectionSource
  	 */
  inline def undistributeAll(slots: Record[String, ShadowSlot | PassThroughSlot], projectionSource: ViewSlot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeAll")(slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def undistributeView(view: View_, slots: Record[String, PassThroughSlot | ShadowSlot], projectionSource: ShadowSlot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def undistributeView(view: View_, slots: Record[String, PassThroughSlot | ShadowSlot], projectionSource: ViewSlot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistributeView")(view.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], projectionSource.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
