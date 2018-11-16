package typings
package atAngularRouterLib.srcUtilsTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/utils/tree", "TreeNode")
@js.native
class TreeNode[T] protected () extends js.Object {
  def this(value: T, children: js.Array[TreeNode[T]]) = this()
  var children: js.Array[TreeNode[T]] = js.native
  var value: T = js.native
}

