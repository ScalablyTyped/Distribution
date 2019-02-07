package typings
package astDashTypesLib.libPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path[V] extends js.Object {
  var __childCache: js.Object | scala.Null = js.native
  var name: js.Any = js.native
  var parentPath: js.Any = js.native
  var value: V = js.native
  def each(callback: js.Any, context: js.Any): js.Any = js.native
  def filter(callback: js.Any, context: js.Any): js.Any = js.native
  def get(names: js.Any*): js.Any = js.native
  def getValueProperty(name: js.Any): js.Any = js.native
  def insertAfter(args: js.Any*): js.Any = js.native
  def insertAt(index: scala.Double, args: js.Any*): js.Any = js.native
  def insertBefore(args: js.Any*): js.Any = js.native
  def map(callback: js.Any, context: js.Any): js.Any = js.native
  def pop(): js.Any = js.native
  def push(args: js.Any*): js.Any = js.native
  def replace(): js.Any = js.native
  def replace(replacement: astDashTypesLib.libTypesMod.ASTNode, args: astDashTypesLib.libTypesMod.ASTNode*): js.Any = js.native
  def shift(): js.Any = js.native
  def unshift(args: js.Any*): js.Any = js.native
}

