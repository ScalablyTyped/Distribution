package typings.angularAnimations.browserBrowserMod

import typings.angularAnimations.mod.AnimationPlayer
import typings.angularAnimations.mod.AnimationTriggerMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/animations/browser/browser", "\u0275AnimationEngine")
@js.native
class ɵAnimationEngine protected () extends js.Object {
  def this(bodyNode: js.Any, _driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer) = this()
  
  var _driver: js.Any = js.native
  
  var _timelineEngine: js.Any = js.native
  
  var _transitionEngine: js.Any = js.native
  
  var _triggerCache: js.Any = js.native
  
  var bodyNode: js.Any = js.native
  
  def destroy(namespaceId: String, context: js.Any): Unit = js.native
  
  def disableAnimations(element: js.Any, disable: Boolean): Unit = js.native
  
  def flush(): Unit = js.native
  def flush(microtaskId: Double): Unit = js.native
  
  def listen(
    namespaceId: String,
    element: js.Any,
    eventName: String,
    eventPhase: String,
    callback: js.Function1[/* event */ js.Any, _]
  ): js.Function0[_] = js.native
  
  def onInsert(namespaceId: String, element: js.Any, parent: js.Any, insertBefore: Boolean): Unit = js.native
  
  def onRemovalComplete(element: js.Any, context: js.Any): Unit = js.native
  
  def onRemove(namespaceId: String, element: js.Any, context: js.Any): Unit = js.native
  def onRemove(namespaceId: String, element: js.Any, context: js.Any, isHostElement: Boolean): Unit = js.native
  
  def players: js.Array[AnimationPlayer] = js.native
  
  def process(namespaceId: String, element: js.Any, property: String, value: js.Any): Unit = js.native
  
  def register(namespaceId: String, hostElement: js.Any): Unit = js.native
  
  def registerTrigger(
    componentId: String,
    namespaceId: String,
    hostElement: js.Any,
    name: String,
    metadata: AnimationTriggerMetadata
  ): Unit = js.native
  
  def whenRenderingDone(): js.Promise[_] = js.native
}
