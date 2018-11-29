package typings
package atAngularCoreLib.srcRender3InterfacesRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNode extends js.Object {
  var nextSibling: RNode | scala.Null = js.native
  var parentNode: RNode | scala.Null = js.native
  /**
       * Append a child node.
       *
       * Used exclusively for building up DOM which are static (ie not View roots)
       */
  def appendChild(newChild: RNode): RNode = js.native
  /**
       * Insert a child node.
       *
       * Used exclusively for adding View root nodes into ViewAnchor location.
       */
  def insertBefore(newChild: RNode, refChild: RNode, isViewRoot: scala.Boolean): scala.Unit = js.native
  /**
       * Insert a child node.
       *
       * Used exclusively for adding View root nodes into ViewAnchor location.
       */
  def insertBefore(newChild: RNode, refChild: scala.Null, isViewRoot: scala.Boolean): scala.Unit = js.native
  def removeChild(oldChild: RNode): scala.Unit = js.native
}

