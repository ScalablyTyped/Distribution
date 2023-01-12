package typings.antd

import typings.antd.anon.Cancel
import typings.antd.libConfigProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.std.AnimationEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilWaveMod {
  
  @JSImport("antd/lib/_util/wave", JSImport.Default)
  @js.native
  open class default () extends Wave
  object default {
    
    @JSImport("antd/lib/_util/wave", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd/lib/_util/wave", "default.contextType")
    @js.native
    def contextType: Context[ConfigConsumerProps] = js.native
    inline def contextType_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Wave
    extends Component[WaveProps, js.Object, Any] {
    
    /* private */ var animationStart: Any = js.native
    
    /* private */ var animationStartId: Any = js.native
    
    def bindAnimationEvent(): js.UndefOr[Cancel] = js.native
    def bindAnimationEvent(node: HTMLElement): js.UndefOr[Cancel] = js.native
    
    /* private */ var clickWaveTimeoutId: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MWave(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MWave(): Unit = js.native
    
    /* private */ var containerRef: Any = js.native
    
    @JSName("context")
    var context_Wave: ConfigConsumerProps = js.native
    
    /* private */ var csp: Any = js.native
    
    /* private */ var destroyed: Any = js.native
    
    /* private */ var extraNode: Any = js.native
    
    def getAttributeName(): String = js.native
    
    /* private */ var instance: Any = js.native
    
    def onClick(node: HTMLElement, waveColor: String): Unit = js.native
    
    def onTransitionEnd(e: AnimationEvent): Unit = js.native
    
    def onTransitionStart(e: AnimationEvent): Unit = js.native
    
    def renderWave(param0: ConfigConsumerProps): js.UndefOr[String | Double | Boolean | ReactFragment | ReactElement | Null] = js.native
    
    def resetEffect(node: HTMLElement): Unit = js.native
  }
  
  trait WaveProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var insertExtraNode: js.UndefOr[Boolean] = js.undefined
  }
  object WaveProps {
    
    inline def apply(): WaveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaveProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaveProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInsertExtraNode(value: Boolean): Self = StObject.set(x, "insertExtraNode", value.asInstanceOf[js.Any])
      
      inline def setInsertExtraNodeUndefined: Self = StObject.set(x, "insertExtraNode", js.undefined)
    }
  }
}
