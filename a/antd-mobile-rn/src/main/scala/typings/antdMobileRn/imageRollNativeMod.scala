package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageRollNativeMod {
  
  @JSImport("antd-mobile-rn/lib/image-picker/ImageRoll.native", JSImport.Default)
  @js.native
  open class default () extends ImageRoll
  
  @js.native
  trait ImageRoll extends Component[ImageRollProps, Any, Any] {
    
    def onSelected(images: js.Array[Any], _underscore: Any): Unit = js.native
  }
  
  trait ImageRollProps extends StObject {
    
    def onCancel(): Unit
    
    def onSelected(imgObj: js.Object): Unit
  }
  object ImageRollProps {
    
    inline def apply(onCancel: () => Unit, onSelected: js.Object => Unit): ImageRollProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
      __obj.asInstanceOf[ImageRollProps]
    }
    
    extension [Self <: ImageRollProps](x: Self) {
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnSelected(value: js.Object => Unit): Self = StObject.set(x, "onSelected", js.Any.fromFunction1(value))
    }
  }
}
