package typings.antdMobileRn.mod

import typings.antdMobileRn.anon.Files
import typings.antdMobileRn.libImagePickerIndexDotnativeMod.ImagePickerNativeProps
import typings.antdMobileRn.libImagePickerIndexDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "ImagePicker")
@js.native
open class ImagePicker protected () extends default {
  def this(props: ImagePickerNativeProps) = this()
}
/* static members */
object ImagePicker {
  
  @JSImport("antd-mobile-rn", "ImagePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "ImagePicker.defaultProps")
  @js.native
  def defaultProps: Files = js.native
  inline def defaultProps_=(x: Files): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
