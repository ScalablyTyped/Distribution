package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TContainerNode extends TNode {
  @JSName("child")
  var child_TContainerNode: scala.Null
  /**
       * Container nodes will have parents unless:
       *
       * - They are the first node of a component or embedded view
       * - They are dynamically created
       */
  @JSName("parent")
  var parent_TContainerNode: TElementNode | TElementContainerNode | scala.Null
  @JSName("projection")
  var projection_TContainerNode: scala.Null
}

