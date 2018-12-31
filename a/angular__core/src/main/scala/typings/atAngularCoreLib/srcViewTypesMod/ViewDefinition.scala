package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDefinition extends Definition[ViewDefinitionFactory] {
  var bindingCount: scala.Double = js.native
  var flags: ViewFlags = js.native
  @JSName("handleEvent")
  var handleEvent_Original: ViewHandleEventFn = js.native
  var lastRenderRootNode: NodeDef | scala.Null = js.native
  /** aggregated NodeFlags for all nodes **/
  var nodeFlags: NodeFlags = js.native
  /**
    * Binary or of all query ids that are matched by one of the nodes.
    * This includes query ids from templates as well.
    * Used as a bloom filter.
    */
  var nodeMatchedQueries: scala.Double = js.native
  /**
    * Order: Depth first.
    * Especially providers are before elements / anchors.
    */
  var nodes: js.Array[NodeDef] = js.native
  var outputCount: scala.Double = js.native
  var rootNodeFlags: NodeFlags = js.native
  @JSName("updateDirectives")
  var updateDirectives_Original: ViewUpdateFn = js.native
  @JSName("updateRenderer")
  var updateRenderer_Original: ViewUpdateFn = js.native
  def handleEvent(view: ViewData, nodeIndex: scala.Double, eventName: java.lang.String, event: js.Any): scala.Boolean = js.native
  def updateDirectives(check: NodeCheckFn, view: ViewData): scala.Unit = js.native
  def updateRenderer(check: NodeCheckFn, view: ViewData): scala.Unit = js.native
}

