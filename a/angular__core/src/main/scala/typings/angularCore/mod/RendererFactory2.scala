package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "RendererFactory2")
@js.native
open class RendererFactory2 () extends StObject {
  
  /**
    * A callback invoked when rendering has begun.
    */
  var begin: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Creates and initializes a custom renderer for a host DOM element.
    * @param hostElement The element to render.
    * @param type The base class to implement.
    * @returns The new custom renderer instance.
    */
  def createRenderer(hostElement: Any): Renderer2 = js.native
  def createRenderer(hostElement: Any, `type`: RendererType2): Renderer2 = js.native
  
  /**
    * A callback invoked when rendering has completed.
    */
  var end: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Use with animations test-only mode. Notifies the test when rendering has completed.
    * @returns The asynchronous result of the developer-defined function.
    */
  var whenRenderingDone: js.UndefOr[js.Function0[js.Promise[Any]]] = js.native
}
