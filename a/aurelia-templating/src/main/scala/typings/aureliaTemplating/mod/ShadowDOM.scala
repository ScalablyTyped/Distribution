package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ShadowDOM")
@js.native
class ShadowDOM () extends js.Object

/* static members */
@JSImport("aurelia-templating", "ShadowDOM")
@js.native
object ShadowDOM extends js.Object {
  var defaultSlotKey: js.Any = js.native
  /**
    * Distrbiute nodes of a projected view based on
    * @param {View} view
    * @param {Node[]} nodes
    * @param {Record<string, PassThroughSlot | ShadowSlot>} slots
    * @param {ViewSlot} projectionSource
    * @param {number} index
    * @param {string} destinationOverride
    */
  def distributeNodes(
    view: js.UndefOr[js.Any],
    nodes: js.UndefOr[js.Any],
    slots: js.UndefOr[js.Any],
    projectionSource: js.UndefOr[js.Any],
    index: js.UndefOr[js.Any],
    destinationOverride: js.UndefOr[js.Any]
  ): js.Any = js.native
  /**
    * @param {View} view
    * @param {Record<string, PassThroughSlot | ShadowSlot>} slots
    * @param {ViewSlot} projectionSource
    * @param {number} index
    * @param {string} destinationOverride
    */
  def distributeView(): js.Any = js.native
  def distributeView(view: js.Any): js.Any = js.native
  def distributeView(view: js.Any, slots: js.Any): js.Any = js.native
  def distributeView(view: js.Any, slots: js.Any, projectionSource: js.Any): js.Any = js.native
  def distributeView(view: js.Any, slots: js.Any, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def distributeView(view: js.Any, slots: js.Any, projectionSource: js.Any, index: js.Any, destinationOverride: js.Any): js.Any = js.native
  def getSlotName(): js.Any = js.native
  def getSlotName(node: js.Any): js.Any = js.native
  /**
    * @param {Record<string, ShadowSlot | PassThroughSlot>} slots
    * @param {ViewSlot} projectionSource
    */
  def undistributeAll(): js.Any = js.native
  def undistributeAll(slots: js.Any): js.Any = js.native
  def undistributeAll(slots: js.Any, projectionSource: js.Any): js.Any = js.native
  /**
    * @param {View} view
    * @param {Record<string, PassThroughSlot | ShadowSlot>} slots
    * @param {ViewSlot} projectionSource
    */
  def undistributeView(): js.Any = js.native
  def undistributeView(view: js.Any): js.Any = js.native
  def undistributeView(view: js.Any, slots: js.Any): js.Any = js.native
  def undistributeView(view: js.Any, slots: js.Any, projectionSource: js.Any): js.Any = js.native
}

