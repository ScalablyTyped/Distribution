package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugNode extends js.Object {
  val componentInstance: js.Any = js.native
  val context: js.Any = js.native
  val injector: Injector = js.native
  val listeners: js.Array[DebugEventListener] = js.native
  val nativeNode: js.Any = js.native
  val parent: DebugElement | Null = js.native
  val providerTokens: js.Array[_] = js.native
  val references: StringDictionary[js.Any] = js.native
}

@JSImport("@angular/core", "DebugNode")
@js.native
object DebugNode
  extends Instantiable1[/* args (repeated) */ js.Any, DebugNode]

