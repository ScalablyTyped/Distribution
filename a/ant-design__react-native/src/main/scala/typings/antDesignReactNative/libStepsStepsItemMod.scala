package typings.antDesignReactNative

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsStepsItemMod {
  
  @JSImport("@ant-design/react-native/lib/steps/StepsItem", JSImport.Default)
  @js.native
  open class default () extends StepsItem
  
  trait RenderIconParams extends StObject {
    
    var error: Boolean
    
    var starting: Boolean
    
    var waiting: Boolean
  }
  object RenderIconParams {
    
    inline def apply(error: Boolean, starting: Boolean, waiting: Boolean): RenderIconParams = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], starting = starting.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderIconParams]
    }
    
    extension [Self <: RenderIconParams](x: Self) {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setStarting(value: Boolean): Self = StObject.set(x, "starting", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: Boolean): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StepsItem extends Component[StepsItemProps, Any, Any]
  
  trait StepsItemProps extends StObject {
    
    var current: js.UndefOr[Double] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var errorTail: js.UndefOr[Double] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var last: js.UndefOr[Boolean] = js.undefined
    
    var renderIcon: js.UndefOr[js.Function1[/* params */ RenderIconParams, ReactNode]] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object StepsItemProps {
    
    inline def apply(): StepsItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepsItemProps]
    }
    
    extension [Self <: StepsItemProps](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setErrorTail(value: Double): Self = StObject.set(x, "errorTail", value.asInstanceOf[js.Any])
      
      inline def setErrorTailUndefined: Self = StObject.set(x, "errorTail", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setRenderIcon(value: /* params */ RenderIconParams => ReactNode): Self = StObject.set(x, "renderIcon", js.Any.fromFunction1(value))
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
