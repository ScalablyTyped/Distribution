package typings.antDesignReactNative

import typings.antDesignReactNative.anon.CameraPickerProps
import typings.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageRollMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", JSImport.Default)
  @js.native
  class default () extends ImageRoll
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", "default.defaultProps")
    @js.native
    def defaultProps: CameraPickerProps = js.native
    @scala.inline
    def defaultProps_=(x: CameraPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ImageRoll
    extends Component[ImageRollProps, js.Any, js.Any] {
    
    def onSelected(images: js.Array[_], _underscore: js.Any): Unit = js.native
  }
  
  @js.native
  trait ImageRollProps extends ImageRollTexts {
    
    var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.native
    
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
      def setCameraPickerProps(value: CameraRollPickerProps): Self = StObject.set(x, "cameraPickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraPickerPropsUndefined: Self = StObject.set(x, "cameraPickerProps", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelected(value: js.Object => Unit): Self = StObject.set(x, "onSelected", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ImageRollTexts extends StObject {
    
    var cancelText: js.UndefOr[ReactNode] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object ImageRollTexts {
    
    @scala.inline
    def apply(): ImageRollTexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageRollTexts]
    }
    
    @scala.inline
    implicit class ImageRollTextsMutableBuilder[Self <: ImageRollTexts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: ReactNode): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
