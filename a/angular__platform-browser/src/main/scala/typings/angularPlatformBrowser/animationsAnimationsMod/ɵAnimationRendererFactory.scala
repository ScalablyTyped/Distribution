package typings.angularPlatformBrowser.animationsAnimationsMod

import typings.angularAnimations.browserBrowserMod.ɵAnimationEngine
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.RendererFactory2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser/animations/animations", "\u0275AnimationRendererFactory")
@js.native
class ɵAnimationRendererFactory protected () extends RendererFactory2 {
  def this(delegate: RendererFactory2, engine: ɵAnimationEngine, _zone: NgZone) = this()
  var _animationCallbacksBuffer: js.Any = js.native
  var _cdRecurDepth: js.Any = js.native
  var _currentId: js.Any = js.native
  var _microtaskId: js.Any = js.native
  var _rendererCache: js.Any = js.native
  var _scheduleCountTask: js.Any = js.native
  var _zone: js.Any = js.native
  var delegate: js.Any = js.native
  var engine: js.Any = js.native
  var promise: js.Any = js.native
  @JSName("begin")
  def begin_MɵAnimationRendererFactory(): Unit = js.native
  @JSName("end")
  def end_MɵAnimationRendererFactory(): Unit = js.native
  @JSName("whenRenderingDone")
  def whenRenderingDone_MɵAnimationRendererFactory(): js.Promise[_] = js.native
}

