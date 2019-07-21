package typings
package atAntDashDesignReactDashNativeLib.esImageDashPickerCameraRollPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollPickerProps
  extends reactDashNativeLib.reactDashNativeMod.GetPhotosParamType {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var containerWidth: js.UndefOr[scala.Double] = js.undefined
  var imageMargin: scala.Double
  var imagesPerRow: scala.Double
  var maximum: scala.Double
  var selectSingleItem: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[js.Array[_]] = js.undefined
  var selectedMarker: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
}

object CameraRollPickerProps {
  @scala.inline
  def apply(
    first: scala.Double,
    imageMargin: scala.Double,
    imagesPerRow: scala.Double,
    maximum: scala.Double,
    after: java.lang.String = null,
    assetType: reactDashNativeLib.reactDashNativeMod.CameraRollAssetType = null,
    backgroundColor: java.lang.String = null,
    callback: /* repeated */ js.Any => _ = null,
    containerWidth: scala.Int | scala.Double = null,
    groupName: java.lang.String = null,
    groupTypes: reactDashNativeLib.reactDashNativeMod.CameraRollGroupType = null,
    mimeTypes: js.Array[java.lang.String] = null,
    selectSingleItem: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.Array[_] = null,
    selectedMarker: reactLib.reactMod.Global.JSXNs.Element = null
  ): CameraRollPickerProps = {
    val __obj = js.Dynamic.literal(first = first, imageMargin = imageMargin, imagesPerRow = imagesPerRow, maximum = maximum)
    if (after != null) __obj.updateDynamic("after")(after)
    if (assetType != null) __obj.updateDynamic("assetType")(assetType)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (groupTypes != null) __obj.updateDynamic("groupTypes")(groupTypes)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    if (!js.isUndefined(selectSingleItem)) __obj.updateDynamic("selectSingleItem")(selectSingleItem)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (selectedMarker != null) __obj.updateDynamic("selectedMarker")(selectedMarker)
    __obj.asInstanceOf[CameraRollPickerProps]
  }
}

