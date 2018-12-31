package typings
package atAngularCoreLib.srcViewServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/services", "DebugRenderer2")
@js.native
class DebugRenderer2 protected ()
  extends atAngularCoreLib.srcRenderApiMod.Renderer2 {
  def this(delegate: atAngularCoreLib.srcRenderApiMod.Renderer2) = this()
  var createDebugContext: js.Any = js.native
  var delegate: js.Any = js.native
  /**
    * Factory function used to create a `DebugContext` when a node is created.
    *
    * The `DebugContext` allows to retrieve information about the nodes that are useful in tests.
    *
    * The factory is configurable so that the `DebugRenderer2` could instantiate either a View Engine
    * or a Render context.
    */
  def debugContextFactory(): atAngularCoreLib.srcViewTypesMod.DebugContext | scala.Null = js.native
  def debugContextFactory(nativeElement: js.Any): atAngularCoreLib.srcViewTypesMod.DebugContext | scala.Null = js.native
  @JSName("destroyNode")
  def destroyNode_MDebugRenderer2(node: js.Any): scala.Unit = js.native
  @JSName("listen")
  def listen_windows(
    target: atAngularCoreLib.atAngularCoreLibStrings.windows,
    eventName: java.lang.String,
    callback: js.Function1[/* event */ js.Any, scala.Boolean]
  ): js.Function0[scala.Unit] = js.native
}

