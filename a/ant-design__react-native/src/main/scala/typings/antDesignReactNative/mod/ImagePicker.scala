package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.Files
import typings.antDesignReactNative.libImagePickerMod.ImagePickerProps
import typings.antDesignReactNative.libImagePickerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "ImagePicker")
@js.native
open class ImagePicker protected () extends default {
  def this(props: ImagePickerProps) = this()
}
/* static members */
object ImagePicker {
  
  @JSImport("@ant-design/react-native", "ImagePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "ImagePicker.defaultProps")
  @js.native
  def defaultProps: Files = js.native
  inline def defaultProps_=(x: Files): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
