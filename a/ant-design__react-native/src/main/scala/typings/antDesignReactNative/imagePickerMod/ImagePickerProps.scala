package typings.antDesignReactNative.imagePickerMod

import typings.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typings.antDesignReactNative.imagePickerPropsTypeMod.ImagePickerPropTypes
import typings.antDesignReactNative.imageRollMod.ImageRollTexts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.antDesignReactNative.libStyleMod.WithThemeStyles because var conflicts: styles. Inlined  */ @js.native
trait ImagePickerProps
  extends ImagePickerPropTypes
     with ImageRollTexts {
  var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.native
}

object ImagePickerProps {
  @scala.inline
  def apply(): ImagePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePickerProps]
  }
  @scala.inline
  implicit class ImagePickerPropsOps[Self <: ImagePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCameraPickerProps(value: CameraRollPickerProps): Self = this.set("cameraPickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraPickerProps: Self = this.set("cameraPickerProps", js.undefined)
  }
  
}

