package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TElementNode extends TNode {
  @JSName("child")
  var child_TElementNode: TElementNode | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | scala.Null
  /**
       * Element nodes will have parents unless they are the first node of a component or
       * embedded view (which means their parent is in a different view and must be
       * retrieved using viewData[HOST_NODE]).
       */
  @JSName("parent")
  var parent_TElementNode: TElementNode | TElementContainerNode | scala.Null
  /**
       * If this is a component TNode with projection, this will be an array of projected
       * TNodes (see TNode.projection for more info). If it's a regular element node or a
       * component without projection, it will be null.
       */
  @JSName("projection")
  var projection_TElementNode: (js.Array[TNode | scala.Null]) | scala.Null
  @JSName("tViews")
  var tViews_TElementNode: scala.Null
}

