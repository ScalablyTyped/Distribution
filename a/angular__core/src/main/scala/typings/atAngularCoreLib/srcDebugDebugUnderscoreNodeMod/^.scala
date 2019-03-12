package typings
package atAngularCoreLib.srcDebugDebugUnderscoreNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/debug/debug_node", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DebugElement: atAngularCoreLib.Anon_Args = js.native
  val DebugNode: atAngularCoreLib.Anon_ArgsAny = js.native
  def asNativeElements(debugEls: js.Array[DebugElement]): js.Any = js.native
  def getAllDebugNodes(): js.Array[DebugNode] = js.native
  def getDebugNode(nativeNode: js.Any): DebugNode | scala.Null = js.native
  def getDebugNode__POST_R3__(): scala.Null = js.native
  def getDebugNode__POST_R3__(nativeNode: stdLib.Element): DebugElement__POST_R3__ = js.native
  def getDebugNode__POST_R3__(nativeNode: stdLib.Node): DebugNode__POST_R3__ = js.native
  def indexDebugNode(node: DebugNode): scala.Unit = js.native
  def removeDebugNodeFromIndex(node: DebugNode): scala.Unit = js.native
}

