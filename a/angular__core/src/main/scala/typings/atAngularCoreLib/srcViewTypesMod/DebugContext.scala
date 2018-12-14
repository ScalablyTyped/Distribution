package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/types", "DebugContext")
@js.native
abstract class DebugContext () extends js.Object {
  val component: js.Any = js.native
  val componentRenderElement: js.Any = js.native
  val context: js.Any = js.native
  val injector: atAngularCoreLib.srcDiMod.Injector = js.native
  val nodeIndex: scala.Double | scala.Null = js.native
  val providerTokens: js.Array[_] = js.native
  val references: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  val renderNode: js.Any = js.native
  val view: ViewData = js.native
  def logError(console: nodeLib.Console, values: js.Any*): scala.Unit = js.native
}

