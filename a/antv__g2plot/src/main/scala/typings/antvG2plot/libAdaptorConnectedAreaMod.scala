package typings.antvG2plot

import typings.antvG2.mod.Element
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.antvG2plotStrings.click
import typings.antvG2plot.antvG2plotStrings.hover
import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorConnectedAreaMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/connected-area", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectedArea[O /* <: OptionWithConnectedArea */](): js.Function1[/* params */ Params[O], Params[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedArea")().asInstanceOf[js.Function1[/* params */ Params[O], Params[O]]]
  inline def connectedArea[O /* <: OptionWithConnectedArea */](disable: Boolean): js.Function1[/* params */ Params[O], Params[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedArea")(disable.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Params[O], Params[O]]]
  
  trait ConnectedAreaOptions extends StObject {
    
    /** 自定义样式 */
    var style: js.UndefOr[
        ShapeAttrs | (js.Function2[/* style */ ShapeAttrs, /* element */ Element, ShapeAttrs])
      ] = js.undefined
    
    /** 触发方式, 默认 hover */
    var trigger: js.UndefOr[hover | click] = js.undefined
  }
  object ConnectedAreaOptions {
    
    inline def apply(): ConnectedAreaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectedAreaOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectedAreaOptions] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: ShapeAttrs | (js.Function2[/* style */ ShapeAttrs, /* element */ Element, ShapeAttrs])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(value: (/* style */ ShapeAttrs, /* element */ Element) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTrigger(value: hover | click): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  trait OptionWithConnectedArea extends StObject {
    
    var connectedArea: js.UndefOr[ConnectedAreaOptions | `false`] = js.undefined
  }
  object OptionWithConnectedArea {
    
    inline def apply(): OptionWithConnectedArea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionWithConnectedArea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionWithConnectedArea] (val x: Self) extends AnyVal {
      
      inline def setConnectedArea(value: ConnectedAreaOptions | `false`): Self = StObject.set(x, "connectedArea", value.asInstanceOf[js.Any])
      
      inline def setConnectedAreaUndefined: Self = StObject.set(x, "connectedArea", js.undefined)
    }
  }
}
