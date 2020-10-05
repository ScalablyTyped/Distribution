package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "RendererFactory2")
@js.native
abstract class RendererFactory2 () extends js.Object {
  /**
    * A callback invoked when rendering has begun.
    */
  var begin: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A callback invoked when rendering has completed.
    */
  var end: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Use with animations test-only mode. Notifies the test when rendering has completed.
    * @returns The asynchronous result of the developer-defined function.
    */
  var whenRenderingDone: js.UndefOr[js.Function0[js.Promise[_]]] = js.native
  /**
    * Creates and initializes a custom renderer for a host DOM element.
    * @param hostElement The element to render.
    * @param type The base class to implement.
    * @returns The new custom renderer instance.
    */
  def createRenderer(hostElement: js.Any): Renderer2 = js.native
  def createRenderer(hostElement: js.Any, `type`: RendererType2): Renderer2 = js.native
}

