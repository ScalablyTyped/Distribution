package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Files
import typings.antDesignReactNative.libImagePickerCameraRollPickerMod.CameraRollPickerProps
import typings.antDesignReactNative.libImagePickerImageRollMod.ImageRollTexts
import typings.antDesignReactNative.libImagePickerPropsTypeMod.ImagePickerPropTypes
import typings.antDesignReactNative.libImagePickerStyleMod.ImagePickerStyle
import typings.react.mod.Component
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImagePickerMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker", JSImport.Default)
  @js.native
  open class default protected () extends ImagePicker {
    def this(props: ImagePickerProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/image-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/image-picker", "default.defaultProps")
    @js.native
    def defaultProps: Files = js.native
    inline def defaultProps_=(x: Files): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ImagePicker extends Component[ImagePickerProps, Any, Any] {
    
    def addImage(imageObj: Any): Unit = js.native
    
    def hideImageRoll(): Unit = js.native
    
    def onImageClick(index: Double): Unit = js.native
    
    def onPressIn(styles: ReturnType[js.Function0[ImagePickerStyle]]): js.Function0[Unit] = js.native
    
    def onPressOut(styles: ReturnType[js.Function0[ImagePickerStyle]]): js.Function0[Unit] = js.native
    
    var plusText: Any = js.native
    
    var plusWrap: Any = js.native
    
    def removeImage(idx: Double): Unit = js.native
    
    def showPicker(): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antDesignReactNative.libStyleMod.WithThemeStyles because var conflicts: styles. Inlined  */ trait ImagePickerProps
    extends StObject
       with ImagePickerPropTypes
       with ImageRollTexts {
    
    var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.undefined
  }
  object ImagePickerProps {
    
    inline def apply(): ImagePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImagePickerProps]
    }
    
    extension [Self <: ImagePickerProps](x: Self) {
      
      inline def setCameraPickerProps(value: CameraRollPickerProps): Self = StObject.set(x, "cameraPickerProps", value.asInstanceOf[js.Any])
      
      inline def setCameraPickerPropsUndefined: Self = StObject.set(x, "cameraPickerProps", js.undefined)
    }
  }
}
