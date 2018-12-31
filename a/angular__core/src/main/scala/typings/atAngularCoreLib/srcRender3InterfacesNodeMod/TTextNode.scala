package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TTextNode extends TNode {
  @JSName("child")
  var child_TTextNode: scala.Null
  /**
    * Text nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using LView.node).
    */
  @JSName("parent")
  var parent_TTextNode: TElementNode | TElementContainerNode | scala.Null
  @JSName("projection")
  var projection_TTextNode: scala.Null
  @JSName("tViews")
  var tViews_TTextNode: scala.Null
}

