package typings
package atAntDashDesignReactDashNativeLib.libImageDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atAntDashDesignReactDashNativeLib.libStyleMod.WithThemeStyles because var conflicts: styles. Inlined  */ trait ImagePickerProps
  extends atAntDashDesignReactDashNativeLib.libImageDashPickerPropsTypeMod.ImagePickerPropTypes
     with atAntDashDesignReactDashNativeLib.libImageDashPickerImageRollMod.ImageRollTexts {
  var cameraPickerProps: js.UndefOr[
    atAntDashDesignReactDashNativeLib.libImageDashPickerCameraRollPickerMod.CameraRollPickerProps
  ] = js.undefined
}

object ImagePickerProps {
  @scala.inline
  def apply(
    cameraPickerProps: atAntDashDesignReactDashNativeLib.libImageDashPickerCameraRollPickerMod.CameraRollPickerProps = null,
    cancelText: reactLib.reactMod.ReactNode = null,
    files: js.Array[js.Object] = null,
    onAddImageClick: () => scala.Unit = null,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ java.lang.String, /* index */ js.UndefOr[scala.Double]) => scala.Unit = null,
    onFail: /* msg */ java.lang.String => scala.Unit = null,
    onImageClick: (/* index */ js.UndefOr[scala.Double], /* files */ js.UndefOr[js.Array[js.Object]]) => scala.Unit = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.libImageDashPickerStyleMod.ImagePickerStyle] = null,
    title: reactLib.reactMod.ReactNode = null
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

