package typings
package atAngularCoreLib.srcDebugDebugUnderscoreNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/debug/debug_node", "DebugNode")
@js.native
class DebugNode protected () extends js.Object {
  def this(nativeNode: js.Any, parent: DebugNode, _debugContext: atAngularCoreLib.srcViewMod.DebugContext) = this()
  def this(nativeNode: js.Any, parent: scala.Null, _debugContext: atAngularCoreLib.srcViewMod.DebugContext) = this()
  var _debugContext: js.Any = js.native
  val componentInstance: js.Any = js.native
  val context: js.Any = js.native
  val injector: atAngularCoreLib.srcDiMod.Injector = js.native
  var listeners: js.Array[EventListener] = js.native
  var nativeNode: js.Any = js.native
  var parent: DebugElement | scala.Null = js.native
  val providerTokens: js.Array[_] = js.native
  val references: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

