package typings.atAntDashDesignReactDashNative.libImageDashPickerMod

import typings.atAntDashDesignReactDashNative.libImageDashPickerCameraRollPickerMod.CameraRollPickerProps
import typings.atAntDashDesignReactDashNative.libImageDashPickerImageRollMod.ImageRollTexts
import typings.atAntDashDesignReactDashNative.libImageDashPickerPropsTypeMod.ImagePickerPropTypes
import typings.atAntDashDesignReactDashNative.libImageDashPickerStyleMod.ImagePickerStyle
import typings.react.reactMod.ReactNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles because var conflicts: styles. Inlined  */ trait ImagePickerProps
  extends ImagePickerPropTypes
     with ImageRollTexts {
  var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.undefined
}

object ImagePickerProps {
  @scala.inline
  def apply(
    cameraPickerProps: CameraRollPickerProps = null,
    cancelText: ReactNode = null,
    files: js.Array[js.Object] = null,
    onAddImageClick: () => Unit = null,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit = null,
    onFail: /* msg */ String => Unit = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    styles: Partial[ImagePickerStyle] = null,
    title: ReactNode = null
  ): ImagePickerProps = {
    val __obj = js.Dynamic.literal()
    if (cameraPickerProps != null) __obj.updateDynamic("cameraPickerProps")(cameraPickerProps)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files)
    if (onAddImageClick != null) __obj.updateDynamic("onAddImageClick")(js.Any.fromFunction0(onAddImageClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2(onImageClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePickerProps]
  }
}

