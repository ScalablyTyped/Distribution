package typings.antdMobile

import typings.antdMobile.anon.CSSPropertiesPartialRecorAlignmentBaseline
import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.center
import typings.antdMobile.antdMobileStrings.fail
import typings.antdMobile.antdMobileStrings.loading
import typings.antdMobile.antdMobileStrings.success
import typings.antdMobile.antdMobileStrings.top
import typings.antdMobile.renderToContainerMod.GetContainer
import typings.antdMobile.withStopPropagationMod.PropagationEvent
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastToastMod {
  
  @JSImport("antd-mobile/es/components/toast/toast", "InternalToast")
  @js.native
  val InternalToast: FC[ToastProps] = js.native
  
  trait ToastProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var getContainer: js.UndefOr[GetContainer] = js.undefined
    
    var icon: js.UndefOr[success | fail | loading | ReactNode] = js.undefined
    
    var maskClassName: js.UndefOr[String] = js.undefined
    
    var maskClickable: js.UndefOr[Boolean] = js.undefined
    
    var maskStyle: js.UndefOr[CSSPropertiesPartialRecorAlignmentBaseline] = js.undefined
    
    var position: js.UndefOr[top | bottom | center] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Array[PropagationEvent]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ToastProps {
    
    inline def apply(): ToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProps]
    }
    
    extension [Self <: ToastProps](x: Self) {
      
      inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setIcon(value: success | fail | loading | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      inline def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      inline def setMaskClickable(value: Boolean): Self = StObject.set(x, "maskClickable", value.asInstanceOf[js.Any])
      
      inline def setMaskClickableUndefined: Self = StObject.set(x, "maskClickable", js.undefined)
      
      inline def setMaskStyle(value: CSSPropertiesPartialRecorAlignmentBaseline): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setPosition(value: top | bottom | center): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStopPropagation(value: js.Array[PropagationEvent]): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setStopPropagationVarargs(value: PropagationEvent*): Self = StObject.set(x, "stopPropagation", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
