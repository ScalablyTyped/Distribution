package typings.antdMobile

import typings.antdMobile.anon.Direction
import typings.antdMobile.stepsPropsTypeMod.StepsPropsType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod {
  
  @JSImport("antd-mobile/lib/steps", JSImport.Default)
  @js.native
  class default () extends Steps
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/steps", "default.Step")
    @js.native
    def Step: js.Any = js.native
    inline def Step_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/steps", "default.defaultProps")
    @js.native
    def defaultProps: Direction = js.native
    inline def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Steps
    extends Component[StepsProps, js.Any, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MSteps(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSteps(): Unit = js.native
    
    var stepRefs: js.Array[js.Any] = js.native
    
    var stepsRef: js.Any = js.native
  }
  
  trait StepsProps
    extends StObject
       with StepsPropsType {
    
    var direction: js.UndefOr[String] = js.undefined
    
    var iconPrefix: js.UndefOr[String] = js.undefined
    
    var labelPlacement: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object StepsProps {
    
    inline def apply(children: js.Array[js.Any]): StepsProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    extension [Self <: StepsProps](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      inline def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      inline def setLabelPlacement(value: String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
