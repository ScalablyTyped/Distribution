package typings.antDesignReactNative

import typings.antDesignReactNative.anon.CameraPickerProps
import typings.antDesignReactNative.libImagePickerCameraRollPickerMod.CameraRollPickerProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImagePickerImageRollMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", JSImport.Default)
  @js.native
  open class default () extends ImageRoll
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", "default.defaultProps")
    @js.native
    def defaultProps: CameraPickerProps = js.native
    inline def defaultProps_=(x: CameraPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ImageRoll extends Component[ImageRollProps, Any, Any] {
    
    def onSelected(images: js.Array[Any], _underscore: Any): Unit = js.native
  }
  
  trait ImageRollProps
    extends StObject
       with ImageRollTexts {
    
    var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.undefined
    
    def onCancel(): Unit
    
    def onSelected(imgObj: js.Object): Unit
  }
  object ImageRollProps {
    
    inline def apply(onCancel: () => Unit, onSelected: js.Object => Unit): ImageRollProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
      __obj.asInstanceOf[ImageRollProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageRollProps] (val x: Self) extends AnyVal {
      
      inline def setCameraPickerProps(value: CameraRollPickerProps): Self = StObject.set(x, "cameraPickerProps", value.asInstanceOf[js.Any])
      
      inline def setCameraPickerPropsUndefined: Self = StObject.set(x, "cameraPickerProps", js.undefined)
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnSelected(value: js.Object => Unit): Self = StObject.set(x, "onSelected", js.Any.fromFunction1(value))
    }
  }
  
  trait ImageRollTexts extends StObject {
    
    var cancelText: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ImageRollTexts {
    
    inline def apply(): ImageRollTexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageRollTexts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageRollTexts] (val x: Self) extends AnyVal {
      
      inline def setCancelText(value: ReactNode): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
