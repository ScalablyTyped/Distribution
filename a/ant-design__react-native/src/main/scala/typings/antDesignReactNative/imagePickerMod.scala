package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Files
import typings.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typings.antDesignReactNative.imagePickerPropsTypeMod.ImagePickerPropTypes
import typings.antDesignReactNative.imagePickerStyleMod.ImagePickerStyle
import typings.antDesignReactNative.imageRollMod.ImageRollTexts
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePickerMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker", JSImport.Default)
  @js.native
  class default protected () extends ImagePicker {
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
    @scala.inline
    def defaultProps_=(x: Files): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ImagePicker
    extends Component[ImagePickerProps, js.Any, js.Any] {
    
    def addImage(imageObj: js.Any): Unit = js.native
    
    def hideImageRoll(): Unit = js.native
    
    def onImageClick(index: Double): Unit = js.native
    
    def onPressIn(styles: ImagePickerStyle): js.Function0[Unit] = js.native
    
    def onPressOut(styles: ImagePickerStyle): js.Function0[Unit] = js.native
    
    var plusText: js.Any = js.native
    
    var plusWrap: js.Any = js.native
    
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
    
    @scala.inline
    def apply(): ImagePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImagePickerProps]
    }
    
    @scala.inline
    implicit class ImagePickerPropsMutableBuilder[Self <: ImagePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCameraPickerProps(value: CameraRollPickerProps): Self = StObject.set(x, "cameraPickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraPickerPropsUndefined: Self = StObject.set(x, "cameraPickerProps", js.undefined)
    }
  }
}
