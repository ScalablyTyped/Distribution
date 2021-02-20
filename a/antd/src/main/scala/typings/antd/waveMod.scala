package typings.antd

import typings.antd.anon.Cancel
import typings.antd.anon.InsertExtraNode
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.Context
import typings.std.AnimationEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waveMod {
  
  @JSImport("antd/lib/_util/wave", JSImport.Default)
  @js.native
  class default () extends Wave
  /* static members */
  object default {
    
    @JSImport("antd/lib/_util/wave", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/_util/wave", "default.contextType")
    @js.native
    def contextType: Context[ConfigConsumerProps] = js.native
    @scala.inline
    def contextType_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Wave
    extends Component[InsertExtraNode, js.Object, js.Any] {
    
    var animationStart: js.Any = js.native
    
    var animationStartId: js.Any = js.native
    
    def bindAnimationEvent(node: HTMLElement): js.UndefOr[Cancel] = js.native
    
    var clickWaveTimeoutId: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MWave(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MWave(): Unit = js.native
    
    var containerRef: js.Any = js.native
    
    @JSName("context")
    var context_Wave: ConfigConsumerProps = js.native
    
    var csp: js.Any = js.native
    
    var destroyed: js.Any = js.native
    
    var extraNode: js.Any = js.native
    
    def getAttributeName(): String = js.native
    
    var instance: js.Any = js.native
    
    def onClick(node: HTMLElement, waveColor: String): Unit = js.native
    
    def onTransitionEnd(e: AnimationEvent): Unit = js.native
    
    def onTransitionStart(e: AnimationEvent): Unit = js.native
    
    def renderWave(hasCsp: ConfigConsumerProps): js.UndefOr[js.Object | Null] = js.native
    
    def resetEffect(node: HTMLElement): Unit = js.native
  }
}
