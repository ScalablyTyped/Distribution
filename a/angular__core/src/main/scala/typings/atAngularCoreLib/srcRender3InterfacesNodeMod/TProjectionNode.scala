package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TProjectionNode extends TNode {
  /** Index in the data[] array */
  @JSName("child")
  var child_TProjectionNode: scala.Null
  /**
       * Projection nodes will have parents unless they are the first node of a component
       * or embedded view (which means their parent is in a different view and must be
       * retrieved using LView.node).
       */
  @JSName("parent")
  var parent_TProjectionNode: TElementNode | TElementContainerNode | scala.Null
  /** Index of the projection node. (See TNode.projection for more info.) */
  @JSName("projection")
  var projection_TProjectionNode: scala.Double
  @JSName("tViews")
  var tViews_TProjectionNode: scala.Null
}

