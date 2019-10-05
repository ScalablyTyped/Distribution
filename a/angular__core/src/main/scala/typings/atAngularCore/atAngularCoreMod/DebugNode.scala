package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugNode extends js.Object {
  val componentInstance: js.Any
  val context: js.Any
  val injector: Injector
  val listeners: js.Array[DebugEventListener]
  val nativeNode: js.Any
  val parent: DebugElement | Null
  val providerTokens: js.Array[_]
  val references: StringDictionary[js.Any]
}

@JSImport("@angular/core", "DebugNode")
@js.native
object DebugNode
  extends Instantiable1[/* args (repeated) */ js.Any, DebugNode]

