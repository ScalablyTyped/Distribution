package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageRollNativeMod {
  
  @JSImport("antd-mobile-rn/lib/image-picker/ImageRoll.native", JSImport.Default)
  @js.native
  class default () extends ImageRoll
  
  @js.native
  trait ImageRoll
    extends Component[ImageRollProps, js.Any, js.Any] {
    
    def onSelected(images: js.Array[_], _underscore: js.Any): Unit = js.native
  }
  
  @js.native
  trait ImageRollProps extends StObject {
    
    def onCancel(): Unit = js.native
    
    def onSelected(imgObj: js.Object): Unit = js.native
  }
  object ImageRollProps {
    
    @scala.inline
    def apply(onCancel: () => Unit, onSelected: js.Object => Unit): ImageRollProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
      __obj.asInstanceOf[ImageRollProps]
    }
    
    @scala.inline
    implicit class ImageRollPropsMutableBuilder[Self <: ImageRollProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelected(value: js.Object => Unit): Self = StObject.set(x, "onSelected", js.Any.fromFunction1(value))
    }
  }
}
