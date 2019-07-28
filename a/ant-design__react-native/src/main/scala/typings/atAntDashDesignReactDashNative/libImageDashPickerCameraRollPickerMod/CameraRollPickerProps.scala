package typings.atAntDashDesignReactDashNative.libImageDashPickerCameraRollPickerMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNative.reactDashNativeMod.CameraRollAssetType
import typings.reactDashNative.reactDashNativeMod.CameraRollGroupType
import typings.reactDashNative.reactDashNativeMod.GetPhotosParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollPickerProps extends GetPhotosParamType {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var imageMargin: Double
  var imagesPerRow: Double
  var maximum: Double
  var selectSingleItem: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[js.Array[_]] = js.undefined
  var selectedMarker: js.UndefOr[Element] = js.undefined
}

object CameraRollPickerProps {
  @scala.inline
  def apply(
    first: Double,
    imageMargin: Double,
    imagesPerRow: Double,
    maximum: Double,
    after: String = null,
    assetType: CameraRollAssetType = null,
    backgroundColor: String = null,
    callback: /* repeated */ js.Any => _ = null,
    containerWidth: Int | Double = null,
    groupName: String = null,
    groupTypes: CameraRollGroupType = null,
    mimeTypes: js.Array[String] = null,
    selectSingleItem: js.UndefOr[Boolean] = js.undefined,
    selected: js.Array[_] = null,
    selectedMarker: Element = null
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

